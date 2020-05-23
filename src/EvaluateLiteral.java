public class EvaluateLiteral extends chocogrammarBaseVisitor<String> {
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
}
