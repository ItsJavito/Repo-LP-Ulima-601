// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 15/LogFarrik\log.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link logParser}.
 */
public interface logListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link logParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(logParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link logParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(logParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link logParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(logParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link logParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(logParser.SentenciaContext ctx);
}