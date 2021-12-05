import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor implements FlujoCajaVisitor{
    @Override
    public Object visitRoot(FlujoCajaParser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitApertura(FlujoCajaParser.AperturaContext ctx) {
        return null;
    }

    @Override
    public Object visitOperacion(FlujoCajaParser.OperacionContext ctx) {
        return null;
    }

    @Override
    public Object visitOperador(FlujoCajaParser.OperadorContext ctx) {
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
