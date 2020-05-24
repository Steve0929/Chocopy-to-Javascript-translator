import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class Translator extends chocogrammarBaseListener{

    private ExpresionsVisitor visitor= new ExpresionsVisitor();

    @Override
    public void enterGlobal_decl(chocogrammarParser.Global_declContext ctx) {
        System.out.println("global."+ctx.ID());
    }

    @Override
    public void enterNonlocal_decl(chocogrammarParser.Nonlocal_declContext ctx) {
        System.out.println("var "+ctx.ID());
    }

    @Override
    public void enterVar_def(chocogrammarParser.Var_defContext ctx) {
        System.out.print("var "+ctx.typed_var().ID().getText()+" = "+translateLiteral(ctx.literal().getText()));

    }

    @Override
    public void enterTyped_var(chocogrammarParser.Typed_varContext ctx) {

        //System.out.println(ctx.parent.getText());
        //System.out.println(ctx.ID().getText());
    }

    public String translateLiteral(String literal) {
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
        return literal;
    }

    @Override
    public void exitVar_def(chocogrammarParser.Var_defContext ctx) {
        System.out.println();
    }

    //gets arguments of a function
    public String getFunctionArgs(chocogrammarParser.Func_defContext ctx)
    {
        StringBuilder builder = new StringBuilder();
        for(chocogrammarParser.Typed_varContext var:ctx.typed_var())
        {
            builder.append(var.ID().getText()).append(", ");
        }
        String arguments = builder.toString();
        try {
            return arguments.substring(0,arguments.length()-2);
        } catch (Exception e)
        {
            //enters if arguments is empty
            return arguments;
        }

    }
    @Override
    public void enterFunc_def(chocogrammarParser.Func_defContext ctx) {
        System.out.print( "function "+ctx.ID().getText()+"("+ getFunctionArgs(ctx) +")");
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
            System.out.print("console.log("+translateLiteral(visitor.visitExpr(ctx.expr())));

        }catch (Exception e)
        {
            //semantic error, print must have expr.cexpr i think
        }
    }

    @Override
    public void exitPrint(chocogrammarParser.PrintContext ctx) {
        System.out.println(");");
    }


    @Override
    public void enterAsig_stmt(chocogrammarParser.Asig_stmtContext ctx) {
        System.out.println();
        System.out.println(visitor.visitAsig_stmt(ctx));

    }
    @Override
    public void enterFor_expr(chocogrammarParser.For_exprContext ctx){
        System.out.println("for ( "+ctx.ID()+" of "+visitor.visitExpr(ctx.expr())+" ){");// if it doesnt, put it

    }
    @Override
    public void exitFor_expr(chocogrammarParser.For_exprContext ctx){
        System.out.println("}");
    }
    @Override
    public void enterIf_expr(chocogrammarParser.If_exprContext ctx) {
        if(ctx.getChild(1).getText().charAt(0)=='(') //if it has ( dont put another one
            System.out.print( "if"+ visitor.visitExpr(ctx.expr()) + "{" );
        else
            System.out.print( "if("+ visitor.visitExpr(ctx.expr())+") {" );// if it doesnt, put it
        System.out.println(); //empty line

    }

    @Override
    public void enterElif_expr(chocogrammarParser.Elif_exprContext ctx) {
        if(ctx.getChild(1).getText().charAt(0)=='(') //if it has ( dont put another one
            System.out.print( "}else if"+ visitor.visitExpr(ctx.expr())+"{" );
        else
            System.out.print( "}else if("+ visitor.visitExpr(ctx.expr())+") {" );// if it doesnt, put it
        System.out.println(); //empty line
    }

    @Override
    public void exitElif_expr(chocogrammarParser.Elif_exprContext ctx) {
        System.out.println(); //empty line

    }

    @Override
    public void enterElse_expr(chocogrammarParser.Else_exprContext ctx) {
        System.out.println();
        System.out.println("}else{");

    }

    @Override public void exitIf_expr(chocogrammarParser.If_exprContext ctx) {
        System.out.println(); //empty line
        System.out.println("}");


    }

    @Override
    public void enterWhile_expr(chocogrammarParser.While_exprContext ctx) {
        //super.enterWhile_expr(ctx);
        if(ctx.getChild(1).getText().charAt(0)=='(') //if it has ( dont put another one
            System.out.println("while "+visitor.visitExpr(ctx.expr())+"){");
        else
            System.out.println("while ("+visitor.visitExpr(ctx.expr())+"){");
    }

    @Override
    public void exitWhile_expr(chocogrammarParser.While_exprContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterReturn_st(chocogrammarParser.Return_stContext ctx) {
            if(ctx.expr()!=null)
            {

                System.out.print("return "+visitor.visitExpr(ctx.expr()));
            }
            else
                System.out.print("return ");

            //maybe if print is found there is a semantic error

    }

   /*@Override
    public void enterArray_lenght(chocogrammarParser.Array_lenghtContext ctx) {
        System.out.println(ctx.expr().getText()+".length");
    }

    */
}