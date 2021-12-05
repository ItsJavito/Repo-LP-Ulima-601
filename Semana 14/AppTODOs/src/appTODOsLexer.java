// Generated from C:/UNIVERSIDAD/LenguajesProgramacion/Repo-LP-Ulima-601/Semana 14/AppTODOs\appTODOs.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class appTODOsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KM_CASA=1, KM_UNIVERSIDAD=2, FIN_TAREA=3, TODO_REALIZADO=4, TODO_NO_REALIZADO=5, 
		TAREA=6, IGNORED_CHARACTERS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KM_CASA", "KM_UNIVERSIDAD", "FIN_TAREA", "TODO_REALIZADO", "TODO_NO_REALIZADO", 
			"TAREA", "IGNORED_CHARACTERS"
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


	public appTODOsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "appTODOs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\7\7+\n\7\f\7\16\7.\13\7\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\3\2\4\5\2\"\"\62;C|\5\2\13\f\17\17\"\"\2\65\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\3\21\3\2\2\2\5\26\3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2\13&\3\2"+
		"\2\2\r(\3\2\2\2\17\61\3\2\2\2\21\22\7E\2\2\22\23\7C\2\2\23\24\7U\2\2\24"+
		"\25\7C\2\2\25\4\3\2\2\2\26\27\7W\2\2\27\30\7P\2\2\30\31\7K\2\2\31\32\7"+
		"X\2\2\32\33\7G\2\2\33\34\7T\2\2\34\35\7U\2\2\35\36\7K\2\2\36\37\7F\2\2"+
		"\37 \7C\2\2 !\7F\2\2!\6\3\2\2\2\"#\7=\2\2#\b\3\2\2\2$%\7\63\2\2%\n\3\2"+
		"\2\2&\'\7\62\2\2\'\f\3\2\2\2(,\7$\2\2)+\t\2\2\2*)\3\2\2\2+.\3\2\2\2,*"+
		"\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7$\2\2\60\16\3\2\2\2\61\62"+
		"\t\3\2\2\62\63\3\2\2\2\63\64\b\b\2\2\64\20\3\2\2\2\4\2,\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}