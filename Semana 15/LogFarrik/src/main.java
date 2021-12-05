import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class main {
    public static void main(String[] args) {
        String codigo = "log.ul";
        try{
            CharStream cs = fromFileName(codigo);
            logLexer lexer = new logLexer(cs);
            CommonTokenStream flujotoken = new CommonTokenStream(lexer);
            logParser parser = new logParser(flujotoken);
            logParser.RootContext arbolSintaxis = parser.root();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(arbolSintaxis);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
