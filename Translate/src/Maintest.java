import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Maintest {

    public static void main(String[] args) throws IOException {
        try{
            //Lexer
            chocogrammarLexer lexer;
            if(args.length > 0)
                lexer = new chocogrammarLexer(CharStreams.fromFileName(args[0]));

            else
                lexer = new chocogrammarLexer(CharStreams.fromStream(System.in));

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            //Parser
            chocogrammarParser parser = new chocogrammarParser(tokens);
            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree(parser));
            //Walker
            //Create generic parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            //Walk the tree
            walker.walk(new Translator(), tree);
            System.out.println();//print ln after translation
        }
       catch(Exception e){
           System.err.println("Error: "+e);
       }

    }
}
