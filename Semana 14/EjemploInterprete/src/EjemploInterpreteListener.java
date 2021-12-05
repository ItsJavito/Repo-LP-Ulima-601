// Generated from C:/Users/javie/IdeaProjects\EjemploInterprete.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EjemploInterpreteParser}.
 */
public interface EjemploInterpreteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(EjemploInterpreteParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(EjemploInterpreteParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EjemploInterpreteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EjemploInterpreteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(EjemploInterpreteParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(EjemploInterpreteParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#sentencia_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_declaracion(EjemploInterpreteParser.Sentencia_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#sentencia_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_declaracion(EjemploInterpreteParser.Sentencia_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#sentencia_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_asignacion(EjemploInterpreteParser.Sentencia_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#sentencia_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_asignacion(EjemploInterpreteParser.Sentencia_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_visualizacion(EjemploInterpreteParser.Sentencia_visualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_visualizacion(EjemploInterpreteParser.Sentencia_visualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#valor_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterValor_asignacion(EjemploInterpreteParser.Valor_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#valor_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitValor_asignacion(EjemploInterpreteParser.Valor_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EjemploInterpreteParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(EjemploInterpreteParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EjemploInterpreteParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(EjemploInterpreteParser.ExpresionContext ctx);
}