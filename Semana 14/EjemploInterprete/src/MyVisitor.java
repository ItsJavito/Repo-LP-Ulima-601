import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor implements EjemploInterpreteVisitor
{
    @Override
    public Object visitRoot(EjemploInterpreteParser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitBlock(EjemploInterpreteParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia(EjemploInterpreteParser.SentenciaContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_declaracion(EjemploInterpreteParser.Sentencia_declaracionContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_asignacion(EjemploInterpreteParser.Sentencia_asignacionContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_visualizacion(EjemploInterpreteParser.Sentencia_visualizacionContext ctx) {
        return null;
    }

    @Override
    public Object visitValor_asignacion(EjemploInterpreteParser.Valor_asignacionContext ctx) {
        return null;
    }

    @Override
    public Object visitExpresion(EjemploInterpreteParser.ExpresionContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
