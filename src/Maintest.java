
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.Token;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import java.io.IOException;

public class Maintest {

    public static void main(String[] args) throws IOException {
        try{
            //Lexer
            chocogrammarLexer lexer = null;
            if(args.length > 0)
                lexer = new chocogrammarLexer(CharStreams.fromFileName(args[0]));

            else
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                boolean validOption = false;
                while (validOption==false)
                {
                    System.out.println("Press 0 if you want to write your code on the console" +
                            ", 1 if you want to use code from file");
                    String option =  reader.readLine();
                    switch (option)
                    {
                        case "0":
                            System.out.println("Write your code! When you are done press ctrl d");
                            System.out.println("-----------------------------------------------");
                            lexer = new chocogrammarLexer(CharStreams.fromStream(System.in));
                            validOption = true;
                            break;
                        case "1":
                            System.out.println("Write the name of your file, your file MUST be inside the Input folder");
                            System.out.println("Example: program.txt");
                            option = reader.readLine();
                            System.out.println("-----------------------------------------------");
                            try{
                                lexer = new chocogrammarLexer(CharStreams.fromFileName("Input/"+option));
                                validOption = true;
                            }catch (Exception e){
                                System.out.println("Enter valid file name");
                                validOption = false;
                            }

                            break;
                        default:
                            System.out.println("Enter valid option");

                    }

                }

            }

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            //Parser
            chocogrammarParser parser = new chocogrammarParser(tokens);
            ParseTree tree = parser.program();
            //Test
            for (int index = 0; index < tokens.size(); index++)
            {
                //System.out.println("Entra al for");
                Token token = tokens.get(index);
                // substitute whatever parser you have
                if (token.getChannel() != 0)
                {

                    String out = "";
                    // Comments will be printed as channel 2 (configured in .g4 grammar file)
                    out += "Channel: " + token.getChannel();
                    out += " Type: " + token.getType();
                    out += " Hidden: ";
                    //List<Token> hiddenTokensToLeft = tokens.getHiddenTokensToLeft(index);
                    /*for (int i = 0; hiddenTokensToLeft != null && i < hiddenTokensToLeft.size(); i++)
                    {
                        if (hiddenTokensToLeft.get(i).getChannel() != 0)
                        {
                            out += "\n\t" + i + ":";
                            out += "\n\tChannel: " + hiddenTokensToLeft.get(i).getChannel() + "  Type: " + hiddenTokensToLeft.get(i).getType();
                            out += hiddenTokensToLeft.get(i).getText().replaceAll("\\s", "");
                        }
                    }*/
                    out += token.getText().replaceAll("#", "//");
                    //System.out.println(out);
                }
            }
            //System.out.println(tokens.getTokens());
            //System.out.println(tree.toStringTree(parser));
            //Walker
            //Create generic parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            //Walk the tree
            walker.walk(new CheckForImports(),tree);
            walker.walk(new Translator(), tree);
            System.out.println();//print ln after translation
        }
       catch(Exception e){
           System.err.println("Error: "+e);
       }

    }
}
