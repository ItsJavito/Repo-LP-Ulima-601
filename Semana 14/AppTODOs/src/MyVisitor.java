import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor implements appTODOsVisitor{

    @Override
    public Object visitRoot(appTODOsParser.RootContext ctx) {
        return null;
    }

    @Override
    public Object visitTarea(appTODOsParser.TareaContext ctx) {
        return null;
    }

    @Override
    public Object visitIndicador(appTODOsParser.IndicadorContext ctx) {
        return null;
    }

    @Override
    public Object visitTipo(appTODOsParser.TipoContext ctx) {
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
