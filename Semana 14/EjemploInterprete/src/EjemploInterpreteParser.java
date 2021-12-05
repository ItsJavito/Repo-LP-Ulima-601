// Generated from C:/Users/javie/IdeaProjects\EjemploInterprete.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EjemploInterpreteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINT=3, BLOCK_INIT=4, BLOCK_CLOSE=5, END_STATEMENT=6, 
		ASSIGMENT_OPERATOR=7, ARITHMETIC_OPERATOR=8, VARIABLE_NAME=9, NUMBER=10, 
		IGNORED_CHARACTERES=11;
	public static final int
		RULE_root = 0, RULE_block = 1, RULE_sentencia = 2, RULE_sentencia_declaracion = 3, 
		RULE_sentencia_asignacion = 4, RULE_sentencia_visualizacion = 5, RULE_valor_asignacion = 6, 
		RULE_expresion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "block", "sentencia", "sentencia_declaracion", "sentencia_asignacion", 
			"sentencia_visualizacion", "valor_asignacion", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'variable'", "'mostrar'", "'{'", "'}'", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINT", "BLOCK_INIT", "BLOCK_CLOSE", "END_STATEMENT", 
			"ASSIGMENT_OPERATOR", "ARITHMETIC_OPERATOR", "VARIABLE_NAME", "NUMBER", 
			"IGNORED_CHARACTERES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EjemploInterprete.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String , Integer> simbolos = new HashMap<>();
	    Integer operando = 0;

	public EjemploInterpreteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(EjemploInterpreteParser.PROGRAM, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(EjemploInterpreteParser.VARIABLE_NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(PROGRAM);
			setState(17);
			match(VARIABLE_NAME);
			setState(18);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCK_INIT() { return getToken(EjemploInterpreteParser.BLOCK_INIT, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(EjemploInterpreteParser.BLOCK_CLOSE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(BLOCK_INIT);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << VARIABLE_NAME))) != 0)) {
				{
				{
				setState(21);
				sentencia();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			match(BLOCK_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciaContext extends ParserRuleContext {
		public Sentencia_declaracionContext sentencia_declaracion() {
			return getRuleContext(Sentencia_declaracionContext.class,0);
		}
		public Sentencia_asignacionContext sentencia_asignacion() {
			return getRuleContext(Sentencia_asignacionContext.class,0);
		}
		public Sentencia_visualizacionContext sentencia_visualizacion() {
			return getRuleContext(Sentencia_visualizacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				sentencia_declaracion();
				}
				break;
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				sentencia_asignacion();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				sentencia_visualizacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_declaracionContext extends ParserRuleContext {
		public Token VARIABLE_NAME;
		public TerminalNode VAR() { return getToken(EjemploInterpreteParser.VAR, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(EjemploInterpreteParser.VARIABLE_NAME, 0); }
		public TerminalNode END_STATEMENT() { return getToken(EjemploInterpreteParser.END_STATEMENT, 0); }
		public Sentencia_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterSentencia_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitSentencia_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitSentencia_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_declaracionContext sentencia_declaracion() throws RecognitionException {
		Sentencia_declaracionContext _localctx = new Sentencia_declaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(VAR);
			setState(35);
			((Sentencia_declaracionContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);
			setState(36);
			match(END_STATEMENT);

			        simbolos.put((((Sentencia_declaracionContext)_localctx).VARIABLE_NAME!=null?((Sentencia_declaracionContext)_localctx).VARIABLE_NAME.getText():null), 0);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_asignacionContext extends ParserRuleContext {
		public Token VARIABLE_NAME;
		public Valor_asignacionContext valor_asignacion;
		public TerminalNode VARIABLE_NAME() { return getToken(EjemploInterpreteParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGMENT_OPERATOR() { return getToken(EjemploInterpreteParser.ASSIGMENT_OPERATOR, 0); }
		public Valor_asignacionContext valor_asignacion() {
			return getRuleContext(Valor_asignacionContext.class,0);
		}
		public TerminalNode END_STATEMENT() { return getToken(EjemploInterpreteParser.END_STATEMENT, 0); }
		public Sentencia_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterSentencia_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitSentencia_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitSentencia_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_asignacionContext sentencia_asignacion() throws RecognitionException {
		Sentencia_asignacionContext _localctx = new Sentencia_asignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((Sentencia_asignacionContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);
			setState(40);
			match(ASSIGMENT_OPERATOR);
			setState(41);
			((Sentencia_asignacionContext)_localctx).valor_asignacion = valor_asignacion();
			setState(42);
			match(END_STATEMENT);

			        simbolos.put((((Sentencia_asignacionContext)_localctx).VARIABLE_NAME!=null?((Sentencia_asignacionContext)_localctx).VARIABLE_NAME.getText():null) , ((Sentencia_asignacionContext)_localctx).valor_asignacion.valor);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentencia_visualizacionContext extends ParserRuleContext {
		public Token VARIABLE_NAME;
		public TerminalNode PRINT() { return getToken(EjemploInterpreteParser.PRINT, 0); }
		public TerminalNode VARIABLE_NAME() { return getToken(EjemploInterpreteParser.VARIABLE_NAME, 0); }
		public TerminalNode END_STATEMENT() { return getToken(EjemploInterpreteParser.END_STATEMENT, 0); }
		public Sentencia_visualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_visualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterSentencia_visualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitSentencia_visualizacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitSentencia_visualizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_visualizacionContext sentencia_visualizacion() throws RecognitionException {
		Sentencia_visualizacionContext _localctx = new Sentencia_visualizacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia_visualizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PRINT);
			setState(46);
			((Sentencia_visualizacionContext)_localctx).VARIABLE_NAME = match(VARIABLE_NAME);
			setState(47);
			match(END_STATEMENT);

			        Integer valor = simbolos.get((((Sentencia_visualizacionContext)_localctx).VARIABLE_NAME!=null?((Sentencia_visualizacionContext)_localctx).VARIABLE_NAME.getText():null));
			        System.out.println("Valor: " + valor);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_asignacionContext extends ParserRuleContext {
		public Integer valor;
		public Token NUMBER;
		public ExpresionContext expresion;
		public TerminalNode NUMBER() { return getToken(EjemploInterpreteParser.NUMBER, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Valor_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterValor_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitValor_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitValor_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_asignacionContext valor_asignacion() throws RecognitionException {
		Valor_asignacionContext _localctx = new Valor_asignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valor_asignacion);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((Valor_asignacionContext)_localctx).NUMBER = match(NUMBER);

				            ((Valor_asignacionContext)_localctx).valor =  Integer.parseInt((((Valor_asignacionContext)_localctx).NUMBER!=null?((Valor_asignacionContext)_localctx).NUMBER.getText():null));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((Valor_asignacionContext)_localctx).expresion = expresion();

				            ((Valor_asignacionContext)_localctx).valor =  ((Valor_asignacionContext)_localctx).expresion.resultado;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public Integer resultado;
		public Token NUMBER;
		public Token ARITHMETIC_OPERATOR;
		public List<TerminalNode> NUMBER() { return getTokens(EjemploInterpreteParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(EjemploInterpreteParser.NUMBER, i);
		}
		public TerminalNode ARITHMETIC_OPERATOR() { return getToken(EjemploInterpreteParser.ARITHMETIC_OPERATOR, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EjemploInterpreteListener ) ((EjemploInterpreteListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EjemploInterpreteVisitor ) return ((EjemploInterpreteVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((ExpresionContext)_localctx).NUMBER = match(NUMBER);

			            operando = Integer.parseInt((((ExpresionContext)_localctx).NUMBER!=null?((ExpresionContext)_localctx).NUMBER.getText():null));
			        
			setState(59);
			((ExpresionContext)_localctx).ARITHMETIC_OPERATOR = match(ARITHMETIC_OPERATOR);
			setState(60);
			((ExpresionContext)_localctx).NUMBER = match(NUMBER);

			        String tipoOperacion = (((ExpresionContext)_localctx).ARITHMETIC_OPERATOR!=null?((ExpresionContext)_localctx).ARITHMETIC_OPERATOR.getText():null);

			        Integer operando2 = Integer.parseInt((((ExpresionContext)_localctx).NUMBER!=null?((ExpresionContext)_localctx).NUMBER.getText():null));

			        if(tipoOperacion.equals("+")){
			            ((ExpresionContext)_localctx).resultado =  operando + operando2;
			        }else if(tipoOperacion.equals("-")){
			            ((ExpresionContext)_localctx).resultado =  operando - operando2;
			        }
			        else if (tipoOperacion.equals("*")){
			            ((ExpresionContext)_localctx).resultado =  operando * operando2;
			        }
			        else{
			            ((ExpresionContext)_localctx).resultado =  operando / operando2;
			        }


			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rB\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\4\3\4\3\4\5\4#\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\b:\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2"+
		"\2\2=\2\22\3\2\2\2\4\26\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n)\3\2\2\2\f/\3"+
		"\2\2\2\169\3\2\2\2\20;\3\2\2\2\22\23\7\3\2\2\23\24\7\13\2\2\24\25\5\4"+
		"\3\2\25\3\3\2\2\2\26\32\7\6\2\2\27\31\5\6\4\2\30\27\3\2\2\2\31\34\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\7"+
		"\2\2\36\5\3\2\2\2\37#\5\b\5\2 #\5\n\6\2!#\5\f\7\2\"\37\3\2\2\2\" \3\2"+
		"\2\2\"!\3\2\2\2#\7\3\2\2\2$%\7\4\2\2%&\7\13\2\2&\'\7\b\2\2\'(\b\5\1\2"+
		"(\t\3\2\2\2)*\7\13\2\2*+\7\t\2\2+,\5\16\b\2,-\7\b\2\2-.\b\6\1\2.\13\3"+
		"\2\2\2/\60\7\5\2\2\60\61\7\13\2\2\61\62\7\b\2\2\62\63\b\7\1\2\63\r\3\2"+
		"\2\2\64\65\7\f\2\2\65:\b\b\1\2\66\67\5\20\t\2\678\b\b\1\28:\3\2\2\29\64"+
		"\3\2\2\29\66\3\2\2\2:\17\3\2\2\2;<\7\f\2\2<=\b\t\1\2=>\7\n\2\2>?\7\f\2"+
		"\2?@\b\t\1\2@\21\3\2\2\2\5\32\"9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}