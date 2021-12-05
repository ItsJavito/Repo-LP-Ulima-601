// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 15/LogFarrik\log.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link logParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface logVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link logParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(logParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link logParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(logParser.SentenciaContext ctx);
}