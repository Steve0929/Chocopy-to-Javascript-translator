public class ExpresionsVisitor extends chocogrammarBaseVisitor<String> {
    @Override
    public String visitExpr(chocogrammarParser.ExprContext ctx) {
        StringBuilder builder= new StringBuilder();
        if(ctx.cexpr()!=null)
        {
            builder.append(visitCexpr(ctx.cexpr()));
        }else if(ctx.not_expr()!=null)
        {
            //not_expr
            builder.append("!").append(visitExpr(ctx.expr(0)));
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
        if(ctx.literal()!=null)
        {
            return visitLiteral(ctx.literal());
        }
        else if(ctx.array_lenght()!=null)
        {
            return  visitArray_lenght(ctx.array_lenght());
        }else if(ctx.print()!=null)
        {
            return visitPrint(ctx.print());
            //semantic error i think
        }
        return "";
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
