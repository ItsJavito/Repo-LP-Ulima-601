// Generated from C:/Users/javie/IdeaProjects\EjemploInterprete.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EjemploInterpreteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EjemploInterpreteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(EjemploInterpreteParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EjemploInterpreteParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(EjemploInterpreteParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#sentencia_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_declaracion(EjemploInterpreteParser.Sentencia_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#sentencia_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_asignacion(EjemploInterpreteParser.Sentencia_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#sentencia_visualizacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_visualizacion(EjemploInterpreteParser.Sentencia_visualizacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#valor_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_asignacion(EjemploInterpreteParser.Valor_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EjemploInterpreteParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(EjemploInterpreteParser.ExpresionContext ctx);
}