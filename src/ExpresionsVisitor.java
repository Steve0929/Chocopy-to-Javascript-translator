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
        return builder.toString();
    }

    @Override
    public String visitCexpr(chocogrammarParser.CexprContext ctx) {
        StringBuilder builder = new StringBuilder();
        if(ctx.ID()!=null && ctx.TK_PAR_IZQ()==null)
        {
            return ctx.ID().getText();
        }
        if(ctx.literal()!=null)
        {
            return visitLiteral(ctx.literal());
        }
        if(ctx.TK_COR_IZQ()!=null)
        {
            //TK_COR_IZQ (expr (TK_COMMA expr)*)? TK_COR_DER
            return builder.append("[").append(getListElements(ctx)).append("]").toString();
        }
        if(ctx.ID()==null && ctx.TK_PAR_IZQ()!=null)
        {
            //TK_PAR_IZQ expr TK_PAR_DER
            return builder.append("(").append(visitExpr(ctx.expr(0))).append(")").toString();
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
                literal = "true";
                break;
            case "False":
                literal = "false";
                break;
            case "None":
                literal = "null";
                break;

            default:
                //
                // code block
        }
        return  literal;
    }
    @Override
    public String visitArray_lenght(chocogrammarParser.Array_lenghtContext ctx) {
        return(ctx.expr().getText()+".length");
    }

    @Override
    public String visitPrint(chocogrammarParser.PrintContext ctx) {
        //semantic error, i think
        return "";
    }
}
