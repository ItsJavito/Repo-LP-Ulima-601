// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/AppTODOs\appTODOs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class appTODOsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KM_CASA=1, KM_UNIVERSIDAD=2, FIN_TAREA=3, TODO_REALIZADO=4, TODO_NO_REALIZADO=5, 
		TAREA=6, IGNORED_CHARACTERS=7;
	public static final int
		RULE_root = 0, RULE_tarea = 1, RULE_indicador = 2, RULE_tipo = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "tarea", "indicador", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CASA'", "'UNIVERSIDAD'", "';'", "'1'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KM_CASA", "KM_UNIVERSIDAD", "FIN_TAREA", "TODO_REALIZADO", "TODO_NO_REALIZADO", 
			"TAREA", "IGNORED_CHARACTERS"
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
	public String getGrammarFileName() { return "appTODOs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int casaCount = 0;
	    int casaRealizadas = 0;
	    int uniCount = 0;
	    int uniRealizadas = 0;

	public appTODOsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(appTODOsParser.EOF, 0); }
		public List<TareaContext> tarea() {
			return getRuleContexts(TareaContext.class);
		}
		public TareaContext tarea(int i) {
			return getRuleContext(TareaContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof appTODOsVisitor ) return ((appTODOsVisitor<? extends T>)visitor).visitRoot(this);
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				tarea();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TODO_REALIZADO || _la==TODO_NO_REALIZADO );
			setState(13);
			match(EOF);

			    System.out.println("Ratio cumplimiento CASA: " + (casaRealizadas*1.0f/casaCount));
			    System.out.println("Ratio cumplimiento UNIVERSIDAD: " + (uniRealizadas*1.0f/uniCount));

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

	public static class TareaContext extends ParserRuleContext {
		public IndicadorContext indicador;
		public TipoContext tipo;
		public IndicadorContext indicador() {
			return getRuleContext(IndicadorContext.class,0);
		}
		public TerminalNode TAREA() { return getToken(appTODOsParser.TAREA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FIN_TAREA() { return getToken(appTODOsParser.FIN_TAREA, 0); }
		public TareaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tarea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).enterTarea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).exitTarea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof appTODOsVisitor ) return ((appTODOsVisitor<? extends T>)visitor).visitTarea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TareaContext tarea() throws RecognitionException {
		TareaContext _localctx = new TareaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tarea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((TareaContext)_localctx).indicador = indicador();
			setState(17);
			match(TAREA);
			setState(18);
			((TareaContext)_localctx).tipo = tipo();
			setState(19);
			match(FIN_TAREA);

			    if(((TareaContext)_localctx).tipo.type.equals("UNIVERSIDAD")){
			        uniCount++;
			        if(((TareaContext)_localctx).indicador.ind == 1){
			            uniRealizadas++;
			        }
			    }
			    else{
			        casaCount++;
			        if(((TareaContext)_localctx).indicador.ind == 1){
			            casaRealizadas++;
			        }
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

	public static class IndicadorContext extends ParserRuleContext {
		public Integer ind;
		public TerminalNode TODO_REALIZADO() { return getToken(appTODOsParser.TODO_REALIZADO, 0); }
		public TerminalNode TODO_NO_REALIZADO() { return getToken(appTODOsParser.TODO_NO_REALIZADO, 0); }
		public IndicadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indicador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).enterIndicador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).exitIndicador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof appTODOsVisitor ) return ((appTODOsVisitor<? extends T>)visitor).visitIndicador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndicadorContext indicador() throws RecognitionException {
		IndicadorContext _localctx = new IndicadorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_indicador);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TODO_REALIZADO:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(TODO_REALIZADO);
				 ((IndicadorContext)_localctx).ind =  1; 
				}
				break;
			case TODO_NO_REALIZADO:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(TODO_NO_REALIZADO);
				 ((IndicadorContext)_localctx).ind =  0 ;
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

	public static class TipoContext extends ParserRuleContext {
		public String type;
		public TerminalNode KM_UNIVERSIDAD() { return getToken(appTODOsParser.KM_UNIVERSIDAD, 0); }
		public TerminalNode KM_CASA() { return getToken(appTODOsParser.KM_CASA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof appTODOsListener ) ((appTODOsListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof appTODOsVisitor ) return ((appTODOsVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KM_UNIVERSIDAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(KM_UNIVERSIDAD);

				    ((TipoContext)_localctx).type =  "UNIVERSIDAD";

				}
				break;
			case KM_CASA:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(KM_CASA);

				    ((TipoContext)_localctx).type =  "CASA";

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\5\3\5\5\5#\n\5\3\5\2\2"+
		"\6\2\4\6\b\2\2\2#\2\13\3\2\2\2\4\22\3\2\2\2\6\34\3\2\2\2\b\"\3\2\2\2\n"+
		"\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17\3"+
		"\2\2\2\17\20\7\2\2\3\20\21\b\2\1\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\7"+
		"\b\2\2\24\25\5\b\5\2\25\26\7\5\2\2\26\27\b\3\1\2\27\5\3\2\2\2\30\31\7"+
		"\6\2\2\31\35\b\4\1\2\32\33\7\7\2\2\33\35\b\4\1\2\34\30\3\2\2\2\34\32\3"+
		"\2\2\2\35\7\3\2\2\2\36\37\7\4\2\2\37#\b\5\1\2 !\7\3\2\2!#\b\5\1\2\"\36"+
		"\3\2\2\2\" \3\2\2\2#\t\3\2\2\2\5\r\34\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}