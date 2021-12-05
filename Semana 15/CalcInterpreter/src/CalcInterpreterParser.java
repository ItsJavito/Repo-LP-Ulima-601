// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 15/CalcInterpreter\CalcInterpreter.g4 by ANTLR 4.9.2

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
public class CalcInterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, INIT=2, END=3, ARITHMETIC_OPERATOR=4, VARIABLE=5, NUMBER=6, IGNORED_CHARACTERES=7;
	public static final int
		RULE_root = 0, RULE_sentencia = 1, RULE_sentencia_print = 2, RULE_sentencia_calc = 3, 
		RULE_asignacion = 4, RULE_operacion = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "sentencia", "sentencia_print", "sentencia_calc", "asignacion", 
			"operacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mostrar'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "INIT", "END", "ARITHMETIC_OPERATOR", "VARIABLE", "NUMBER", 
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
	public String getGrammarFileName() { return "CalcInterpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    HashMap<String , Integer> vars = new HashMap<>();
	    Integer operando = 0;

	public CalcInterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalcInterpreterParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcInterpreterVisitor ) return ((CalcInterpreterVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT) {
				{
				{
				setState(12);
				sentencia();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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
		public Sentencia_printContext sentencia_print() {
			return getRuleContext(Sentencia_printContext.class,0);
		}
		public Sentencia_calcContext sentencia_calc() {
			return getRuleContext(Sentencia_calcContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcInterpreterVisitor ) return ((CalcInterpreterVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				sentencia_print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				sentencia_calc();
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

	public static class Sentencia_printContext extends ParserRuleContext {
		public Token VARIABLE;
		public TerminalNode INIT() { return getToken(CalcInterpreterParser.INIT, 0); }
		public TerminalNode PRINT() { return getToken(CalcInterpreterParser.PRINT, 0); }
		public TerminalNode VARIABLE() { return getToken(CalcInterpreterParser.VARIABLE, 0); }
		public TerminalNode END() { return getToken(CalcInterpreterParser.END, 0); }
		public Sentencia_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).enterSentencia_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).exitSentencia_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcInterpreterVisitor ) return ((CalcInterpreterVisitor<? extends T>)visitor).visitSentencia_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_printContext sentencia_print() throws RecognitionException {
		Sentencia_printContext _localctx = new Sentencia_printContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(INIT);
			setState(25);
			match(PRINT);
			setState(26);
			((Sentencia_printContext)_localctx).VARIABLE = match(VARIABLE);
			setState(27);
			match(END);

			    Integer valor = vars.get((((Sentencia_printContext)_localctx).VARIABLE!=null?((Sentencia_printContext)_localctx).VARIABLE.getText():null));
			    System.out.println("el valor de " + (((Sentencia_printContext)_localctx).VARIABLE!=null?((Sentencia_printContext)_localctx).VARIABLE.getText():null) + " es " + valor);

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

	public static class Sentencia_calcContext extends ParserRuleContext {
		public AsignacionContext asignacion;
		public TerminalNode INIT() { return getToken(CalcInterpreterParser.INIT, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode END() { return getToken(CalcInterpreterParser.END, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public Sentencia_calcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).enterSentencia_calc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).exitSentencia_calc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcInterpreterVisitor ) return ((CalcInterpreterVisitor<? extends T>)visitor).visitSentencia_calc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_calcContext sentencia_calc() throws RecognitionException {
		Sentencia_calcContext _localctx = new Sentencia_calcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_calc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(INIT);
			setState(31);
			((Sentencia_calcContext)_localctx).asignacion = asignacion();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(32);
				operacion();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(END);

			    vars.put(((Sentencia_calcContext)_localctx).asignacion.v_name, operando);
			    operando = 0;

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

	public static class AsignacionContext extends ParserRuleContext {
		public String v_name;
		public Token VARIABLE;
		public Token NUMBER;
		public TerminalNode VARIABLE() { return getToken(CalcInterpreterParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(CalcInterpreterParser.NUMBER, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcInterpreterVisitor ) return ((CalcInterpreterVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((AsignacionContext)_localctx).VARIABLE = match(VARIABLE);
			setState(42);
			((AsignacionContext)_localctx).NUMBER = match(NUMBER);

			    ((AsignacionContext)_localctx).v_name =  (((AsignacionContext)_localctx).VARIABLE!=null?((AsignacionContext)_localctx).VARIABLE.getText():null);
			    operando = Integer.parseInt((((AsignacionContext)_localctx).NUMBER!=null?((AsignacionContext)_localctx).NUMBER.getText():null));

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

	public static class OperacionContext extends ParserRuleContext {
		public Token NUMBER;
		public Token ARITHMETIC_OPERATOR;
		public TerminalNode NUMBER() { return getToken(CalcInterpreterParser.NUMBER, 0); }
		public TerminalNode ARITHMETIC_OPERATOR() { return getToken(CalcInterpreterParser.ARITHMETIC_OPERATOR, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcInterpreterListener ) ((CalcInterpreterListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcInterpreterVisitor ) return ((CalcInterpreterVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((OperacionContext)_localctx).NUMBER = match(NUMBER);
			setState(46);
			((OperacionContext)_localctx).ARITHMETIC_OPERATOR = match(ARITHMETIC_OPERATOR);

			    String ope = (((OperacionContext)_localctx).ARITHMETIC_OPERATOR!=null?((OperacionContext)_localctx).ARITHMETIC_OPERATOR.getText():null);
			    Integer numero = Integer.parseInt((((OperacionContext)_localctx).NUMBER!=null?((OperacionContext)_localctx).NUMBER.getText():null));
			    if(ope.equals("+")){
			        operando += numero;
			    }
			    else if(ope.equals("-")){
			        operando -= numero;
			    }
			    else if(ope.equals("*")){
			        operando *= numero;
			    }
			    else {
			        operando /= numero;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3"+
		"\2\3\2\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5$\n\5"+
		"\f\5\16\5\'\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\2\2\60\2\21\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b \3\2\2"+
		"\2\n+\3\2\2\2\f/\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25"+
		"\3\3\2\2\2\26\31\5\6\4\2\27\31\5\b\5\2\30\26\3\2\2\2\30\27\3\2\2\2\31"+
		"\5\3\2\2\2\32\33\7\4\2\2\33\34\7\3\2\2\34\35\7\7\2\2\35\36\7\5\2\2\36"+
		"\37\b\4\1\2\37\7\3\2\2\2 !\7\4\2\2!%\5\n\6\2\"$\5\f\7\2#\"\3\2\2\2$\'"+
		"\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\5\2\2)*\b\5\1\2"+
		"*\t\3\2\2\2+,\7\7\2\2,-\7\b\2\2-.\b\6\1\2.\13\3\2\2\2/\60\7\b\2\2\60\61"+
		"\7\6\2\2\61\62\b\7\1\2\62\r\3\2\2\2\5\21\30%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}