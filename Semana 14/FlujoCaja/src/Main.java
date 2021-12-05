import javafx.util.converter.CharacterStringConverter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        String codigoFuente = "FlujoCaja.fc";
        try{
            CharStream cs = fromFileName(codigoFuente);
            FlujoCajaLexer lexer = new FlujoCajaLexer(cs);
            CommonTokenStream flujoToken = new CommonTokenStream(lexer);
            FlujoCajaParser parser = new FlujoCajaParser(flujoToken);
            FlujoCajaParser.RootContext arbolSintaxisConcreta = parser.root();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(arbolSintaxisConcreta); // A. semantico

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
