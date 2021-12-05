// Generated from C:/Users/javie/Desktop/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/FlujoCaja\FlujoCaja.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlujoCajaParser}.
 */
public interface FlujoCajaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlujoCajaParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(FlujoCajaParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlujoCajaParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(FlujoCajaParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlujoCajaParser#apertura}.
	 * @param ctx the parse tree
	 */
	void enterApertura(FlujoCajaParser.AperturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlujoCajaParser#apertura}.
	 * @param ctx the parse tree
	 */
	void exitApertura(FlujoCajaParser.AperturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlujoCajaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(FlujoCajaParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlujoCajaParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(FlujoCajaParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlujoCajaParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(FlujoCajaParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlujoCajaParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(FlujoCajaParser.OperadorContext ctx);
}