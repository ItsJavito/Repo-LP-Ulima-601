import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor implements CalcInterpreterVisitor{

    @Override
    public Object visitRoot(CalcInterpreterParser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia(CalcInterpreterParser.SentenciaContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_print(CalcInterpreterParser.Sentencia_printContext ctx) {
        return null;
    }

    @Override
    public Object visitSentencia_calc(CalcInterpreterParser.Sentencia_calcContext ctx) {
        return null;
    }

    @Override
    public Object visitAsignacion(CalcInterpreterParser.AsignacionContext ctx) {
        return null;
    }

    @Override
    public Object visitOperacion(CalcInterpreterParser.OperacionContext ctx) {
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
