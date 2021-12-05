// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 15/CalcInterpreter\CalcInterpreter.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcInterpreterParser}.
 */
public interface CalcInterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcInterpreterParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CalcInterpreterParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcInterpreterParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CalcInterpreterParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcInterpreterParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(CalcInterpreterParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcInterpreterParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(CalcInterpreterParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcInterpreterParser#sentencia_print}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_print(CalcInterpreterParser.Sentencia_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcInterpreterParser#sentencia_print}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_print(CalcInterpreterParser.Sentencia_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcInterpreterParser#sentencia_calc}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_calc(CalcInterpreterParser.Sentencia_calcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcInterpreterParser#sentencia_calc}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_calc(CalcInterpreterParser.Sentencia_calcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcInterpreterParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(CalcInterpreterParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcInterpreterParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(CalcInterpreterParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcInterpreterParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(CalcInterpreterParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcInterpreterParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(CalcInterpreterParser.OperacionContext ctx);
}