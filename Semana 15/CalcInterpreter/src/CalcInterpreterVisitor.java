// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 15/CalcInterpreter\CalcInterpreter.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcInterpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcInterpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcInterpreterParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(CalcInterpreterParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcInterpreterParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(CalcInterpreterParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcInterpreterParser#sentencia_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_print(CalcInterpreterParser.Sentencia_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcInterpreterParser#sentencia_calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_calc(CalcInterpreterParser.Sentencia_calcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcInterpreterParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(CalcInterpreterParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcInterpreterParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(CalcInterpreterParser.OperacionContext ctx);
}