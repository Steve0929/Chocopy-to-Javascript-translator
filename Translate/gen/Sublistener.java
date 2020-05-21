public class Sublistener extends chocogrammarBaseListener{

    @Override
    public void enterVar_def(chocogrammarParser.Var_defContext ctx) {
        System.out.print("var = ");
    }

    @Override
    public void enterLiteral(chocogrammarParser.LiteralContext ctx) {
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
                // code block
        }
        System.out.print(literal);
    }

    @Override
    public void exitVar_def(chocogrammarParser.Var_defContext ctx) {
        System.out.println();
    }

    @Override
    public void enterFunc_def(chocogrammarParser.Func_defContext ctx) {
        System.out.print( "function "+ctx.ID()+"("  );
    }
    @Override
    public void exitFunc_def(chocogrammarParser.Func_defContext ctx) {
        System.out.print("){");
    }

}

