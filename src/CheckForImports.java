public class CheckForImports extends chocogrammarBaseListener{
    @Override
    public void enterInput(chocogrammarParser.InputContext ctx) {
        System.out.println("//please run npm i readline-sync if you havent");
        System.out.println("var readlineSync = require('readline-sync');");
    }
}
