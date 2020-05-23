import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class ReplaceLiteral extends chocogrammarBaseListener{
    private TokenStreamRewriter rewriter;

    public ReplaceLiteral(CommonTokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterLiteral(chocogrammarParser.LiteralContext ctx) {
        rewriter.replace(ctx.start,ctx.stop,new EvaluateLiteral().visit(ctx));
        System.out.println(ctx.getText());
    }
    public String getReplacedCode() {
        return rewriter.getText();
    }
}
