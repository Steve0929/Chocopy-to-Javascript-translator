import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckForImports extends chocogrammarBaseListener{

    private static void write(String data) {
        try {
            Files.write(Paths.get("Translate/translate.js"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private int counter = 0;
    private StringBuilder toFile = new StringBuilder();
    public String getImports()
    {
        return toFile.toString();
    }
    @Override
    public void enterInput(chocogrammarParser.InputContext ctx) {
        counter++;
        if(counter==1)
        {
            System.out.println("//please run npm i readline-sync if you havent");
            System.out.println("//Try running the code from a console if your IDE is failing to run it");
            System.out.println("var readlineSync = require('readline-sync');");
            toFile.append("//please run npm i readline-sync if you havent\n");
            toFile.append("//Try running the code from a console if your IDE is failing to run it\n");
            toFile.append("var readlineSync = require('readline-sync');\n");
        }

    }

}
