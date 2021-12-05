// Generated from C:/Users/javie/Desktop/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/FlujoCaja\FlujoCaja.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlujoCajaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERADOR_SUMA=1, OPERADOR_RESTA=2, FIN_SENTENCIA=3, MONTO=4, IGNORED_CHARS=5;
	public static final int
		RULE_root = 0, RULE_apertura = 1, RULE_operacion = 2, RULE_operador = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "apertura", "operacion", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERADOR_SUMA", "OPERADOR_RESTA", "FIN_SENTENCIA", "MONTO", "IGNORED_CHARS"
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
	public String getGrammarFileName() { return "FlujoCaja.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int montoCaja = 0;

	public FlujoCajaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public AperturaContext apertura() {
			return getRuleContext(AperturaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FlujoCajaParser.EOF, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlujoCajaVisitor ) return ((FlujoCajaVisitor<? extends T>)visitor).visitRoot(this);
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
			setState(8);
			apertura();
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MONTO) {
				{
				{
				setState(9);
				operacion();
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
			match(EOF);

			        System.out.println("El monto final es : " + montoCaja);
			    
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

	public static class AperturaContext extends ParserRuleContext {
		public Token MONTO;
		public TerminalNode MONTO() { return getToken(FlujoCajaParser.MONTO, 0); }
		public TerminalNode FIN_SENTENCIA() { return getToken(FlujoCajaParser.FIN_SENTENCIA, 0); }
		public AperturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apertura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).enterApertura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).exitApertura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlujoCajaVisitor ) return ((FlujoCajaVisitor<? extends T>)visitor).visitApertura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AperturaContext apertura() throws RecognitionException {
		AperturaContext _localctx = new AperturaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_apertura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((AperturaContext)_localctx).MONTO = match(MONTO);
			setState(19);
			match(FIN_SENTENCIA);

			        montoCaja = Integer.parseInt((((AperturaContext)_localctx).MONTO!=null?((AperturaContext)_localctx).MONTO.getText():null));
			    
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
		public Token MONTO;
		public OperadorContext operador;
		public TerminalNode MONTO() { return getToken(FlujoCajaParser.MONTO, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TerminalNode FIN_SENTENCIA() { return getToken(FlujoCajaParser.FIN_SENTENCIA, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlujoCajaVisitor ) return ((FlujoCajaVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((OperacionContext)_localctx).MONTO = match(MONTO);
			setState(23);
			((OperacionContext)_localctx).operador = operador();
			setState(24);
			match(FIN_SENTENCIA);

			        if(((OperacionContext)_localctx).operador.op.equals('+')){
			            montoCaja += Integer.parseInt((((OperacionContext)_localctx).MONTO!=null?((OperacionContext)_localctx).MONTO.getText():null));
			        }
			        else
			        {
			            montoCaja -= Integer.parseInt((((OperacionContext)_localctx).MONTO!=null?((OperacionContext)_localctx).MONTO.getText():null));
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

	public static class OperadorContext extends ParserRuleContext {
		public String op;
		public TerminalNode OPERADOR_RESTA() { return getToken(FlujoCajaParser.OPERADOR_RESTA, 0); }
		public TerminalNode OPERADOR_SUMA() { return getToken(FlujoCajaParser.OPERADOR_SUMA, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlujoCajaListener ) ((FlujoCajaListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FlujoCajaVisitor ) return ((FlujoCajaVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operador);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR_RESTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(OPERADOR_RESTA);

				            ((OperadorContext)_localctx).op =  "-";
				        
				}
				break;
			case OPERADOR_SUMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(OPERADOR_SUMA);

				            ((OperadorContext)_localctx).op =  "+";
				        
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\"\n\5\3\5\2\2\6\2"+
		"\4\6\b\2\2\2!\2\n\3\2\2\2\4\24\3\2\2\2\6\30\3\2\2\2\b!\3\2\2\2\n\16\5"+
		"\4\3\2\13\r\5\6\4\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\2\2\3\22\23\b\2\1\2\23\3\3\2\2"+
		"\2\24\25\7\6\2\2\25\26\7\5\2\2\26\27\b\3\1\2\27\5\3\2\2\2\30\31\7\6\2"+
		"\2\31\32\5\b\5\2\32\33\7\5\2\2\33\34\b\4\1\2\34\7\3\2\2\2\35\36\7\4\2"+
		"\2\36\"\b\5\1\2\37 \7\3\2\2 \"\b\5\1\2!\35\3\2\2\2!\37\3\2\2\2\"\t\3\2"+
		"\2\2\4\16!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}