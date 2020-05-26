import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Translator extends chocogrammarBaseListener{

    private ExpresionsVisitor visitor= new ExpresionsVisitor();
    private StringBuilder toFile = new StringBuilder();
    private static void write(String data) {
        try {
            Files.write(Paths.get("Translate/translate.js"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




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
        System.out.print("var "+ctx.typed_var().ID().getText()+" = "+translateLiteral(ctx.literal().getText())+" ");
        toFile.append("var "+ctx.typed_var().ID().getText()+" = "+translateLiteral(ctx.literal().getText())+" ");

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
        toFile.append("\n");
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
        toFile.append( "function "+ctx.ID().getText()+"("+ getFunctionArgs(ctx) +")");
    }
    @Override
    public void exitFunc_def(chocogrammarParser.Func_defContext ctx) {
        System.out.print("}");
        System.out.println();
        toFile.append("}\n");
    }

    @Override
    public void enterFunc_body(chocogrammarParser.Func_bodyContext ctx) {
        System.out.print("{");
        System.out.println();
        toFile.append("{\n");
    }

    @Override
    public void exitFunc_body(chocogrammarParser.Func_bodyContext ctx) {
        System.out.println();
        toFile.append("\n");
    }


    @Override
    public void enterPrint(chocogrammarParser.PrintContext ctx) {
        try {
            System.out.print("console.log("+translateLiteral(visitor.visitExpr(ctx.expr())));
            toFile.append("console.log("+translateLiteral(visitor.visitExpr(ctx.expr())));

        }catch (Exception e)
        {
            //semantic error, print must have expr.cexpr i think
        }
    }

    @Override
    public void exitPrint(chocogrammarParser.PrintContext ctx) {
        System.out.println(");");
        toFile.append(");");
    }


    @Override
    public void enterAsig_stmt(chocogrammarParser.Asig_stmtContext ctx) {
        System.out.println();
        System.out.println(visitor.visitAsig_stmt(ctx));
        toFile.append("\n"+visitor.visitAsig_stmt(ctx));

    }
    @Override
    public void enterFor_expr(chocogrammarParser.For_exprContext ctx){
        System.out.println("for ( "+ctx.ID()+" of "+visitor.visitExpr(ctx.expr())+" ){");// if it doesnt, put it
        toFile.append("for ( "+ctx.ID()+" of "+visitor.visitExpr(ctx.expr())+" ){");

    }
    @Override
    public void exitFor_expr(chocogrammarParser.For_exprContext ctx){
        System.out.println("}");
        toFile.append("}");
    }
    @Override
    public void enterIf_expr(chocogrammarParser.If_exprContext ctx) {
        if(ctx.getChild(1).getText().charAt(0)=='(') //if it has ( dont put another one
        {
            System.out.print( "if"+ visitor.visitExpr(ctx.expr()) + "{" );
            toFile.append( "if"+ visitor.visitExpr(ctx.expr()) + "{" );
        }
        else{
            System.out.print( "if("+ visitor.visitExpr(ctx.expr())+") {" );// if it doesnt, put it
            toFile.append( "if("+ visitor.visitExpr(ctx.expr())+") {" );
        }

        System.out.println(); //empty line
        toFile.append("\n");

    }

    @Override
    public void enterElif_expr(chocogrammarParser.Elif_exprContext ctx) {
        if(ctx.getChild(1).getText().charAt(0)=='(') //if it has ( dont put another one
        {
            System.out.print( "}else if"+ visitor.visitExpr(ctx.expr())+"{" );
            toFile.append( "}else if"+ visitor.visitExpr(ctx.expr())+"{" );
        }
        else
        {
            System.out.print( "}else if("+ visitor.visitExpr(ctx.expr())+") {" );// if it doesnt, put it
            toFile.append( "}else if("+ visitor.visitExpr(ctx.expr())+") {" );// if it doesnt, put it
        }

        System.out.println(); //empty line
        toFile.append("\n");
    }

    @Override
    public void exitElif_expr(chocogrammarParser.Elif_exprContext ctx) {
        System.out.println(); //empty line
        toFile.append("\n");

    }

    @Override
    public void enterElse_expr(chocogrammarParser.Else_exprContext ctx) {
        System.out.println();
        System.out.println("}else{");
        toFile.append("\n}else{");

    }

    @Override public void exitIf_expr(chocogrammarParser.If_exprContext ctx) {
        System.out.println(); //empty line
        System.out.println("}");
        toFile.append("\n}");


    }

    @Override
    public void enterWhile_expr(chocogrammarParser.While_exprContext ctx) {
        //super.enterWhile_expr(ctx);
        if(ctx.getChild(1).getText().charAt(0)=='(') //if it has ( dont put another one
        {
            System.out.println("while "+visitor.visitExpr(ctx.expr())+"){");
            toFile.append("while "+visitor.visitExpr(ctx.expr())+"){");
        }
        else
        {
            System.out.println("while ("+visitor.visitExpr(ctx.expr())+"){");
            toFile.append("while ("+visitor.visitExpr(ctx.expr())+"){");
        }

    }

    @Override
    public void exitWhile_expr(chocogrammarParser.While_exprContext ctx) {
        System.out.println("}");
        toFile.append("}");
    }

    @Override
    public void enterReturn_st(chocogrammarParser.Return_stContext ctx) {
            if(ctx.expr()!=null)
            {

                System.out.println("return "+visitor.visitExpr(ctx.expr()));
                toFile.append("return "+visitor.visitExpr(ctx.expr()));
            }
            else
            {
                System.out.println("return ");
                toFile.append("return ");
            }


            //maybe if print is found there is a semantic error

    }

    @Override
    public void enterPosible_line_comment(chocogrammarParser.Posible_line_commentContext ctx){
        System.out.print("//"+ctx.getText().substring(1)); //Remove # character
        System.out.println();
        toFile.append("//"+ctx.getText().substring(1)+"\n"); //Remove # character

    };

    @Override
    public void enterPosible_comment(chocogrammarParser.Posible_commentContext ctx){
        System.out.print(" //"+ctx.getText().substring(1)); //Remove # character
        toFile.append(" //"+ctx.getText().substring(1)); //Remove # character
    };




   /*@Override
    public void enterArray_lenght(chocogrammarParser.Array_lenghtContext ctx) {
        System.out.println(ctx.expr().getText()+".length");
    }

    */

    @Override
    public void enterClass_def(chocogrammarParser.Class_defContext ctx){

        if(!ctx.ID(1).toString().equals("object")){
        System.out.println("class "+ctx.ID(0)+" extends "+ctx.ID(1)+" {");}
        else{
            System.out.println("class "+ctx.ID(0)+" {");
        }
    }

    @Override
    public void exitClass_def(chocogrammarParser.Class_defContext ctx){

        System.out.println("}");
    }

    @Override
    public void enterClass_body(chocogrammarParser.Class_bodyContext ctx){

        if(ctx.var_def() != null) {
            int i = 0;

            while (i <= ctx.var_def().size() - 1) {
                if (i == 0) {
                    System.out.print("constructor(");
                }
                if (i < ctx.var_def().size() - 1) {
                    System.out.print(ctx.var_def(i).typed_var().ID().getText() + ",");
                } else {
                    System.out.print((ctx.var_def(i).typed_var().ID().getText()));
                }
                i++;
            }
            System.out.println(") {");
            i = 0;
            while (i <= ctx.var_def().size() - 1) {
                System.out.println("this." + ctx.var_def(i).typed_var().ID().getText() + " = " + visitor.visitLiteral(ctx.var_def(i).literal())  + ";");

                i++;
            }
            System.out.println("}");
        }
        if(ctx.func_def() != null){
           /* System.out.println("Funciones");
            System.out.println(ctx.func_def());*/
        }
    }

    @Override
    public void exitProgram(chocogrammarParser.ProgramContext ctx) {
        write(toFile.toString());
    }
}