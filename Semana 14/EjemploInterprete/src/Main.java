import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String codigoFuente = "ejemplo.ul";
            CharStream cs = fromFileName(codigoFuente);
            EjemploInterpreteLexer lexer = new EjemploInterpreteLexer(cs);
//            List<Token> tokens = (List<Token>) lexer.getAllTokens();
//            for(Token token : tokens){
//                System.out.println(token.getText() + ": " + token.getType());
//            }
            CommonTokenStream flujoToken = new CommonTokenStream(lexer);
            EjemploInterpreteParser parser = new EjemploInterpreteParser(flujoToken);
            EjemploInterpreteParser.RootContext arbolSintaxisConcreta = parser.root();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(arbolSintaxisConcreta); // A. semantico


        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
