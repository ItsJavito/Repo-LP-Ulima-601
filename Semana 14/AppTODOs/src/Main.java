import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        String CodigoFuente = "todos.ul";
        try{
            CharStream cs = fromFileName(CodigoFuente);
            appTODOsLexer lexer = new appTODOsLexer(cs);
            CommonTokenStream flujoToken = new CommonTokenStream(lexer);
            appTODOsParser parser = new appTODOsParser(flujoToken);
            appTODOsParser.RootContext arbolSintaxis = parser.root();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(arbolSintaxis);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
