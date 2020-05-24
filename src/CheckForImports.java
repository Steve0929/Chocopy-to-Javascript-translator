public class CheckForImports extends chocogrammarBaseListener{
    private int counter = 0;
    @Override
    public void enterInput(chocogrammarParser.InputContext ctx) {
        counter++;
        if(counter==1)
        {
            System.out.println("//please run npm i readline-sync if you havent");
            System.out.println("var readlineSync = require('readline-sync');");
        }

    }
}
