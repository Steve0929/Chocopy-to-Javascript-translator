import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Translator extends chocogrammarBaseListener{

    @Override
    public void enterVar_def(chocogrammarParser.Var_defContext ctx) {
        System.out.print("var "+ctx.typed_var().ID().getText()+" = ");

    }

    @Override
    public void enterTyped_var(chocogrammarParser.Typed_varContext ctx) {

        //System.out.println(ctx.parent.getText());
        //System.out.println(ctx.ID().getText());
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
                //
                // code block
        }
        System.out.print(literal);
    }

    @Override
    public void exitVar_def(chocogrammarParser.Var_defContext ctx) {
        System.out.println();
    }

    //Functions
    @Override
    public void enterFunc_def(chocogrammarParser.Func_defContext ctx) {
        System.out.print( "function "+ctx.ID().getText()+"("  +")");
        //System.out.println(ctx.);

    }
    @Override
    public void exitFunc_def(chocogrammarParser.Func_defContext ctx) {
        System.out.print("}");
        System.out.println();
    }

    @Override
    public void enterFunc_body(chocogrammarParser.Func_bodyContext ctx) {
        System.out.print("{");
        System.out.println();
    }

    @Override
    public void exitFunc_body(chocogrammarParser.Func_bodyContext ctx) {
        System.out.println();
    }


    @Override
    public void enterPrint(chocogrammarParser.PrintContext ctx) {
        try {
            if(ctx.expr().cexpr().literal()==null)
                System.out.print("console.log("+ctx.expr().getText());
            else
                System.out.print("console.log(");
        }catch (Exception e)
        {
            //semantic error, print must have expr.cexpr i think
        }
    }

    @Override
    public void exitPrint(chocogrammarParser.PrintContext ctx) {
        System.out.print(");");
    }

    @Override
    public void enterExpr(chocogrammarParser.ExprContext ctx) {

    }

    @Override
    public void enterAsig_stmt(chocogrammarParser.Asig_stmtContext ctx) {
        System.out.println();
        System.out.println(ctx.getText());

    }

    @Override
    public void enterIf_expr(chocogrammarParser.If_exprContext ctx) {
        System.out.print( "if"+ ctx.expr(0).getText()+"{" );
        System.out.println(); //empty line
    }

    @Override public void exitIf_expr(chocogrammarParser.If_exprContext ctx) {
        System.out.println(); //empty line
        System.out.println("}");
    }




}