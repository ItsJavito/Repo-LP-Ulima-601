// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/AppTODOs\appTODOs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link appTODOsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface appTODOsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link appTODOsParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(appTODOsParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link appTODOsParser#tarea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarea(appTODOsParser.TareaContext ctx);
	/**
	 * Visit a parse tree produced by {@link appTODOsParser#indicador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndicador(appTODOsParser.IndicadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link appTODOsParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(appTODOsParser.TipoContext ctx);
}