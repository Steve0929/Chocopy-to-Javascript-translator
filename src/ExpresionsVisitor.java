public class ExpresionsVisitor extends chocogrammarBaseVisitor<String> {

    public String getListElements(chocogrammarParser.CexprContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (chocogrammarParser.ExprContext expr : ctx.expr()) {
            builder.append(visitExpr(expr)).append(", ");
        }
        String arguments = builder.toString();
        try {
            return arguments.substring(0, arguments.length() - 2);
        } catch (Exception e) {
            //enters if arguments is empty
            return arguments;
        }
    }
    public String getTargets(chocogrammarParser.Asig_stmtContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (chocogrammarParser.TargetContext target : ctx.target()) {
            builder.append(visitTarget(target)).append(" = ");
        }
        String arguments = builder.toString();
        return arguments;
    }
    @Override
    public String visitExpr(chocogrammarParser.ExprContext ctx) {
        StringBuilder builder= new StringBuilder();
        if(ctx.cexpr()!=null)
        {

            builder.append(visitCexpr(ctx.cexpr()));
        }else if(ctx.not_expr()!=null)
        {
            //not_expr
            builder.append(visitNot_expr(ctx.not_expr()));
        }else if(ctx.AND()!=null)
        {
            builder.append(visitExpr(ctx.expr(0))).append(" && ").append(visitExpr(ctx.expr(1)));
        }else if(ctx.OR()!=null)
        {
            builder.append(visitExpr(ctx.expr(0))).append(" || ").append(visitExpr(ctx.expr(1)));
        }
        else if(ctx.IF()!=null)
        {
            //expr IF expr ELSE expr ----> condición ? expr1 : expr2
            builder.append(visitExpr(ctx.expr(1))).append(" ? ").append(visitExpr(ctx.expr(0))).
                    append(" : ").append(visitExpr(ctx.expr(2)));
        }
        return builder.toString().replaceAll("self","this");
    }

    @Override
    public String visitCexpr(chocogrammarParser.CexprContext ctx) {
        StringBuilder builder = new StringBuilder();
        if(ctx.ID()!=null && ctx.TK_PAR_IZQ()==null && ctx.TK_PUNTO()==null)
        {
            return ctx.ID().getText();
        }
        if(ctx.literal()!=null)
        {
            return visitLiteral(ctx.literal());
        }
        if(ctx.TK_COR_IZQ()!=null && ctx.cexpr(0)==null)
        {
            //TK_COR_IZQ (expr (TK_COMMA expr)*)? TK_COR_DER
            return builder.append("[").append(getListElements(ctx)).append("]").toString();
        }
        if(ctx.ID()==null && ctx.TK_PAR_IZQ()!=null)
        {
            //TK_PAR_IZQ expr TK_PAR_DER
            return builder.append("(").append(visitExpr(ctx.expr(0))).append(")").toString();
        }
        if(ctx.cexpr(0)!=null && ctx.TK_PUNTO()!=null && ctx.TK_PAR_IZQ()==null)
        {
            //cexpr TK_PUNTO ID
            
            return builder.append(visitCexpr(ctx.cexpr(0))).append(".").append(ctx.ID().getText()).toString();
        }
        if(ctx.cexpr(0)!=null && ctx.TK_COR_IZQ()!=null)
        {
            //cexpr TK_COR_IZQ expr TK_COR_DER
            return builder.append(visitCexpr(ctx.cexpr(0))).append("[").
                    append(visitExpr(ctx.expr(0))).append("]").toString();
        }
        if(ctx.cexpr(0)!=null && ctx.TK_PUNTO()!=null && ctx.TK_PAR_IZQ()!=null)
        {
            //cexpr TK_PUNTO ID TK_PAR_IZQ (expr (TK_COMMA expr)*)? TK_PAR_DER
            return builder.append(visitCexpr(ctx.cexpr(0))).append(".").
                    append(ctx.ID().getText()).append("(").append(getListElements(ctx))
                    .append(")").toString();
        }
        if(ctx.array_lenght()!=null)
        {
            return  visitArray_lenght(ctx.array_lenght());
        }
        if(ctx.print()!=null)
        {
            return visitPrint(ctx.print());
            //semantic error i think
        }
        if(ctx.input()!=null)
        {
            return visitInput(ctx.input());
        }
        if(ctx.ID()!=null && ctx.TK_PAR_IZQ()!=null && ctx.TK_PUNTO()==null)
        {
            //ID TK_PAR_IZQ (expr (TK_COMMA expr)*)? TK_PAR_DER
            return builder.append(ctx.ID().getText()).append("(").append(getListElements(ctx))
                    .append(")").toString();
        }
        if(ctx.bin_op()!=null)
        {
            //cexpr bin_op cexpr
            if(ctx.bin_op().getText().equals("is"))
            {
                return builder.append("typeof(").append(visitCexpr(ctx.cexpr(0))).append(") ").
                        append("== ").append("typeof(").append(visitCexpr(ctx.cexpr(1))).
                        append(") ").toString();
            }
            if(ctx.bin_op().getText().equals("//"))
            {
                return builder.append(visitCexpr(ctx.cexpr(0))).append(" ").
                        append("/").append(" ").append(visitCexpr(ctx.cexpr(1))).toString();
            }
            return builder.append(visitCexpr(ctx.cexpr(0))).append(" ").
                    append(ctx.bin_op().getText()).append(" ").append(visitCexpr(ctx.cexpr(1))).toString();
        }
        else if(ctx.TK_MENOS()!=null)
        {
            return builder.append("- ").append(visitCexpr(ctx.cexpr(0))).toString();
        }
        else
            return "";
    }

    @Override
    public String visitNot_expr(chocogrammarParser.Not_exprContext ctx) {
        StringBuilder builder= new StringBuilder();
        builder.append("!").append(visitExpr(ctx.expr()));
        return builder.toString();
    }

    @Override
    public String visitLiteral(chocogrammarParser.LiteralContext ctx) {
        String literal = ctx.getText();
        switch(literal) {
            case "True":
                literal = " true ";
                break;
            case "False":
                literal = " false ";
                break;
            case "None":
                literal = " null ";
                break;

            default:
                //
                // code block
        }
        return  literal;
    }
    @Override
    public String visitArray_lenght(chocogrammarParser.Array_lenghtContext ctx) {
        return(ctx.expr().getText()+".length ");
    }

    @Override
    public String visitPrint(chocogrammarParser.PrintContext ctx) {
        //semantic error, i think
        return "";
    }

    @Override
    public String visitInput(chocogrammarParser.InputContext ctx) {
    //INPUT TK_PAR_IZQ  TK_PAR_DER ----> readlineSync.question('May I have your name? ');
        StringBuilder builder  = new StringBuilder();
        return builder.append("readlineSync.question()").toString();
    }



    @Override
    public String visitTarget(chocogrammarParser.TargetContext ctx) {

        StringBuilder builder = new StringBuilder();
        if(ctx.cexpr()==null)
        {
            //ID
            return ctx.ID().getText();
        }
        if(ctx.TK_PUNTO()!=null)
        {
            //cexpr TK_PUNTO ID

            return builder.append(visitCexpr(ctx.cexpr())).append(".").append(ctx.ID().getText()).toString();
        }
        if(ctx.TK_COR_IZQ()!=null)
        {
            //cexpr TK_COR_IZQ expr TK_COR_DER
            return builder.append(visitCexpr(ctx.cexpr())).append("[").append(visitExpr(ctx.expr())).append("]").toString();
        }
        return "";
    }

    @Override
    public String visitAsig_stmt(chocogrammarParser.Asig_stmtContext ctx) {
        StringBuilder builder = new StringBuilder();
        return builder.append(getTargets(ctx)).append(visitExpr(ctx.expr())).toString();
    }

    @Override
    public String visitTyped_var(chocogrammarParser.Typed_varContext ctx){
        StringBuilder builder = new StringBuilder();
        return ctx.ID().getText().replaceAll("self","this").toString();

    }


}
