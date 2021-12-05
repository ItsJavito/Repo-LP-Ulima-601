// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/AppTODOs\appTODOs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link appTODOsParser}.
 */
public interface appTODOsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link appTODOsParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(appTODOsParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link appTODOsParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(appTODOsParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link appTODOsParser#tarea}.
	 * @param ctx the parse tree
	 */
	void enterTarea(appTODOsParser.TareaContext ctx);
	/**
	 * Exit a parse tree produced by {@link appTODOsParser#tarea}.
	 * @param ctx the parse tree
	 */
	void exitTarea(appTODOsParser.TareaContext ctx);
	/**
	 * Enter a parse tree produced by {@link appTODOsParser#indicador}.
	 * @param ctx the parse tree
	 */
	void enterIndicador(appTODOsParser.IndicadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link appTODOsParser#indicador}.
	 * @param ctx the parse tree
	 */
	void exitIndicador(appTODOsParser.IndicadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link appTODOsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(appTODOsParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link appTODOsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(appTODOsParser.TipoContext ctx);
}