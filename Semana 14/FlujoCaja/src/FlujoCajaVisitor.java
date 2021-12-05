// Generated from C:/Users/javie/Desktop/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/FlujoCaja\FlujoCaja.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlujoCajaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlujoCajaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlujoCajaParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(FlujoCajaParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlujoCajaParser#apertura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApertura(FlujoCajaParser.AperturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlujoCajaParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(FlujoCajaParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlujoCajaParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(FlujoCajaParser.OperadorContext ctx);
}