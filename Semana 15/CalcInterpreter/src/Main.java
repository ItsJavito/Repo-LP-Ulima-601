import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        String codigo = "CalcInterpreter.ul";
        try {
            CharStream cs = fromFileName(codigo);
            CalcInterpreterLexer lexer = new CalcInterpreterLexer(cs);
            CommonTokenStream flujoToken = new CommonTokenStream(lexer);
            CalcInterpreterParser parser = new CalcInterpreterParser(flujoToken);
            CalcInterpreterParser.RootContext arbolSintax = parser.root();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(arbolSintax);


        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
