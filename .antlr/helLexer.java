// Generated from c:/Users/liviu/Desktop/Work/hel.language/hel.g4 by ANTLR 4.13.1

package com.hel.language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class helLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, WORD=21, NUMBER=22, TIME=23, STRING=24, IF=25, 
		EVERY=26, REMEMBER=27, USE=28, FAILS=29, NOTIFY=30, AT=31, FOR=32, TO=33, 
		ME=34, MORNING=35, AM=36, PM=37, AND=38, OR=39, NOT=40, CREATE=41, READ=42, 
		UPDATE=43, DELETE=44, WITH=45, HAVING=46, FUNCTION=47, LIST=48, DICT=49, 
		LET=50, WHILE=51, TIME_SPEC=52, ATTRIBUTE=53, VARIABLE=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "WS", "WORD", "NUMBER", "TIME", "STRING", "IF", "EVERY", 
			"REMEMBER", "USE", "FAILS", "NOTIFY", "AT", "FOR", "TO", "ME", "MORNING", 
			"AM", "PM", "AND", "OR", "NOT", "CREATE", "READ", "UPDATE", "DELETE", 
			"WITH", "HAVING", "FUNCTION", "LIST", "DICT", "LET", "WHILE", "TIME_SPEC", 
			"ATTRIBUTE", "VARIABLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'='", "'('", "';'", "')'", "'{'", "'}'", "'minutes'", 
			"'hours'", "':'", "'-'", "'Define'", "'Execute'", "'User:'", "'Agent:'", 
			"'?'", "'['", "']'", null, null, null, null, null, "'If'", "'Every'", 
			"'Remember'", "'Use'", "'If fails, notify'", "'notify'", "'at'", "'for'", 
			"'to'", "'me'", "'morning'", "'AM'", "'PM'", "'AND'", "'OR'", "'NOT'", 
			"'Create'", "'Read'", "'Update'", "'Delete'", "'with'", "'having'", "'function'", 
			"'List'", "'Dict'", "'let'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "WORD", "NUMBER", 
			"TIME", "STRING", "IF", "EVERY", "REMEMBER", "USE", "FAILS", "NOTIFY", 
			"AT", "FOR", "TO", "ME", "MORNING", "AM", "PM", "AND", "OR", "NOT", "CREATE", 
			"READ", "UPDATE", "DELETE", "WITH", "HAVING", "FUNCTION", "LIST", "DICT", 
			"LET", "WHILE", "TIME_SPEC", "ATTRIBUTE", "VARIABLE"
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


	public helLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hel.g4"; }

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
		"\u0004\u00006\u0179\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013"+
		"\u00b3\b\u0013\u000b\u0013\f\u0013\u00b4\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014\u00ba\b\u0014\u000b\u0014\f\u0014\u00bb\u0001\u0015"+
		"\u0004\u0015\u00bf\b\u0015\u000b\u0015\f\u0015\u00c0\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00c6\b\u0016\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00ca\b\u0017\n\u0017\f\u0017\u00cd\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00033\u016b\b3\u00013\u00013\u00013\u00013\u00033\u0171\b3\u00014\u0001"+
		"4\u00034\u0175\b4\u00015\u00015\u00015\u0000\u00006\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/"+
		"_0a1c2e3g4i5k6\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0002\u0000AZa"+
		"z\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0181\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000"+
		"\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000"+
		"i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0001m\u0001"+
		"\u0000\u0000\u0000\u0003o\u0001\u0000\u0000\u0000\u0005q\u0001\u0000\u0000"+
		"\u0000\u0007s\u0001\u0000\u0000\u0000\tu\u0001\u0000\u0000\u0000\u000b"+
		"w\u0001\u0000\u0000\u0000\ry\u0001\u0000\u0000\u0000\u000f{\u0001\u0000"+
		"\u0000\u0000\u0011}\u0001\u0000\u0000\u0000\u0013\u0085\u0001\u0000\u0000"+
		"\u0000\u0015\u008b\u0001\u0000\u0000\u0000\u0017\u008d\u0001\u0000\u0000"+
		"\u0000\u0019\u008f\u0001\u0000\u0000\u0000\u001b\u0096\u0001\u0000\u0000"+
		"\u0000\u001d\u009e\u0001\u0000\u0000\u0000\u001f\u00a4\u0001\u0000\u0000"+
		"\u0000!\u00ab\u0001\u0000\u0000\u0000#\u00ad\u0001\u0000\u0000\u0000%"+
		"\u00af\u0001\u0000\u0000\u0000\'\u00b2\u0001\u0000\u0000\u0000)\u00b9"+
		"\u0001\u0000\u0000\u0000+\u00be\u0001\u0000\u0000\u0000-\u00c2\u0001\u0000"+
		"\u0000\u0000/\u00c7\u0001\u0000\u0000\u00001\u00d0\u0001\u0000\u0000\u0000"+
		"3\u00d3\u0001\u0000\u0000\u00005\u00d9\u0001\u0000\u0000\u00007\u00e2"+
		"\u0001\u0000\u0000\u00009\u00e6\u0001\u0000\u0000\u0000;\u00f7\u0001\u0000"+
		"\u0000\u0000=\u00fe\u0001\u0000\u0000\u0000?\u0101\u0001\u0000\u0000\u0000"+
		"A\u0105\u0001\u0000\u0000\u0000C\u0108\u0001\u0000\u0000\u0000E\u010b"+
		"\u0001\u0000\u0000\u0000G\u0113\u0001\u0000\u0000\u0000I\u0116\u0001\u0000"+
		"\u0000\u0000K\u0119\u0001\u0000\u0000\u0000M\u011d\u0001\u0000\u0000\u0000"+
		"O\u0120\u0001\u0000\u0000\u0000Q\u0124\u0001\u0000\u0000\u0000S\u012b"+
		"\u0001\u0000\u0000\u0000U\u0130\u0001\u0000\u0000\u0000W\u0137\u0001\u0000"+
		"\u0000\u0000Y\u013e\u0001\u0000\u0000\u0000[\u0143\u0001\u0000\u0000\u0000"+
		"]\u014a\u0001\u0000\u0000\u0000_\u0153\u0001\u0000\u0000\u0000a\u0158"+
		"\u0001\u0000\u0000\u0000c\u015d\u0001\u0000\u0000\u0000e\u0161\u0001\u0000"+
		"\u0000\u0000g\u0167\u0001\u0000\u0000\u0000i\u0174\u0001\u0000\u0000\u0000"+
		"k\u0176\u0001\u0000\u0000\u0000mn\u0005.\u0000\u0000n\u0002\u0001\u0000"+
		"\u0000\u0000op\u0005,\u0000\u0000p\u0004\u0001\u0000\u0000\u0000qr\u0005"+
		"=\u0000\u0000r\u0006\u0001\u0000\u0000\u0000st\u0005(\u0000\u0000t\b\u0001"+
		"\u0000\u0000\u0000uv\u0005;\u0000\u0000v\n\u0001\u0000\u0000\u0000wx\u0005"+
		")\u0000\u0000x\f\u0001\u0000\u0000\u0000yz\u0005{\u0000\u0000z\u000e\u0001"+
		"\u0000\u0000\u0000{|\u0005}\u0000\u0000|\u0010\u0001\u0000\u0000\u0000"+
		"}~\u0005m\u0000\u0000~\u007f\u0005i\u0000\u0000\u007f\u0080\u0005n\u0000"+
		"\u0000\u0080\u0081\u0005u\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082"+
		"\u0083\u0005e\u0000\u0000\u0083\u0084\u0005s\u0000\u0000\u0084\u0012\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005h\u0000\u0000\u0086\u0087\u0005o\u0000"+
		"\u0000\u0087\u0088\u0005u\u0000\u0000\u0088\u0089\u0005r\u0000\u0000\u0089"+
		"\u008a\u0005s\u0000\u0000\u008a\u0014\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005:\u0000\u0000\u008c\u0016\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"-\u0000\u0000\u008e\u0018\u0001\u0000\u0000\u0000\u008f\u0090\u0005D\u0000"+
		"\u0000\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005f\u0000\u0000\u0092"+
		"\u0093\u0005i\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\u0095\u0005"+
		"e\u0000\u0000\u0095\u001a\u0001\u0000\u0000\u0000\u0096\u0097\u0005E\u0000"+
		"\u0000\u0097\u0098\u0005x\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099"+
		"\u009a\u0005c\u0000\u0000\u009a\u009b\u0005u\u0000\u0000\u009b\u009c\u0005"+
		"t\u0000\u0000\u009c\u009d\u0005e\u0000\u0000\u009d\u001c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005U\u0000\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0"+
		"\u00a1\u0005e\u0000\u0000\u00a1\u00a2\u0005r\u0000\u0000\u00a2\u00a3\u0005"+
		":\u0000\u0000\u00a3\u001e\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005A\u0000"+
		"\u0000\u00a5\u00a6\u0005g\u0000\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7"+
		"\u00a8\u0005n\u0000\u0000\u00a8\u00a9\u0005t\u0000\u0000\u00a9\u00aa\u0005"+
		":\u0000\u0000\u00aa \u0001\u0000\u0000\u0000\u00ab\u00ac\u0005?\u0000"+
		"\u0000\u00ac\"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005[\u0000\u0000"+
		"\u00ae$\u0001\u0000\u0000\u0000\u00af\u00b0\u0005]\u0000\u0000\u00b0&"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0007\u0000\u0000\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0013\u0000\u0000\u00b7(\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0007\u0001\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc*\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0007\u0002\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1,\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0003+\u0015\u0000\u00c3\u00c4\u0005:\u0000\u0000\u00c4"+
		"\u00c6\u0003+\u0015\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6.\u0001\u0000\u0000\u0000\u00c7\u00cb\u0005"+
		"\"\u0000\u0000\u00c8\u00ca\b\u0003\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\"\u0000"+
		"\u0000\u00cf0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005I\u0000\u0000\u00d1"+
		"\u00d2\u0005f\u0000\u0000\u00d22\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"E\u0000\u0000\u00d4\u00d5\u0005v\u0000\u0000\u00d5\u00d6\u0005e\u0000"+
		"\u0000\u00d6\u00d7\u0005r\u0000\u0000\u00d7\u00d8\u0005y\u0000\u0000\u00d8"+
		"4\u0001\u0000\u0000\u0000\u00d9\u00da\u0005R\u0000\u0000\u00da\u00db\u0005"+
		"e\u0000\u0000\u00db\u00dc\u0005m\u0000\u0000\u00dc\u00dd\u0005e\u0000"+
		"\u0000\u00dd\u00de\u0005m\u0000\u0000\u00de\u00df\u0005b\u0000\u0000\u00df"+
		"\u00e0\u0005e\u0000\u0000\u00e0\u00e1\u0005r\u0000\u0000\u00e16\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005U\u0000\u0000\u00e3\u00e4\u0005s\u0000"+
		"\u0000\u00e4\u00e5\u0005e\u0000\u0000\u00e58\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005I\u0000\u0000\u00e7\u00e8\u0005f\u0000\u0000\u00e8\u00e9\u0005"+
		" \u0000\u0000\u00e9\u00ea\u0005f\u0000\u0000\u00ea\u00eb\u0005a\u0000"+
		"\u0000\u00eb\u00ec\u0005i\u0000\u0000\u00ec\u00ed\u0005l\u0000\u0000\u00ed"+
		"\u00ee\u0005s\u0000\u0000\u00ee\u00ef\u0005,\u0000\u0000\u00ef\u00f0\u0005"+
		" \u0000\u0000\u00f0\u00f1\u0005n\u0000\u0000\u00f1\u00f2\u0005o\u0000"+
		"\u0000\u00f2\u00f3\u0005t\u0000\u0000\u00f3\u00f4\u0005i\u0000\u0000\u00f4"+
		"\u00f5\u0005f\u0000\u0000\u00f5\u00f6\u0005y\u0000\u0000\u00f6:\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005n\u0000\u0000\u00f8\u00f9\u0005o\u0000"+
		"\u0000\u00f9\u00fa\u0005t\u0000\u0000\u00fa\u00fb\u0005i\u0000\u0000\u00fb"+
		"\u00fc\u0005f\u0000\u0000\u00fc\u00fd\u0005y\u0000\u0000\u00fd<\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005a\u0000\u0000\u00ff\u0100\u0005t\u0000"+
		"\u0000\u0100>\u0001\u0000\u0000\u0000\u0101\u0102\u0005f\u0000\u0000\u0102"+
		"\u0103\u0005o\u0000\u0000\u0103\u0104\u0005r\u0000\u0000\u0104@\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005t\u0000\u0000\u0106\u0107\u0005o\u0000"+
		"\u0000\u0107B\u0001\u0000\u0000\u0000\u0108\u0109\u0005m\u0000\u0000\u0109"+
		"\u010a\u0005e\u0000\u0000\u010aD\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"m\u0000\u0000\u010c\u010d\u0005o\u0000\u0000\u010d\u010e\u0005r\u0000"+
		"\u0000\u010e\u010f\u0005n\u0000\u0000\u010f\u0110\u0005i\u0000\u0000\u0110"+
		"\u0111\u0005n\u0000\u0000\u0111\u0112\u0005g\u0000\u0000\u0112F\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005A\u0000\u0000\u0114\u0115\u0005M\u0000"+
		"\u0000\u0115H\u0001\u0000\u0000\u0000\u0116\u0117\u0005P\u0000\u0000\u0117"+
		"\u0118\u0005M\u0000\u0000\u0118J\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"A\u0000\u0000\u011a\u011b\u0005N\u0000\u0000\u011b\u011c\u0005D\u0000"+
		"\u0000\u011cL\u0001\u0000\u0000\u0000\u011d\u011e\u0005O\u0000\u0000\u011e"+
		"\u011f\u0005R\u0000\u0000\u011fN\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"N\u0000\u0000\u0121\u0122\u0005O\u0000\u0000\u0122\u0123\u0005T\u0000"+
		"\u0000\u0123P\u0001\u0000\u0000\u0000\u0124\u0125\u0005C\u0000\u0000\u0125"+
		"\u0126\u0005r\u0000\u0000\u0126\u0127\u0005e\u0000\u0000\u0127\u0128\u0005"+
		"a\u0000\u0000\u0128\u0129\u0005t\u0000\u0000\u0129\u012a\u0005e\u0000"+
		"\u0000\u012aR\u0001\u0000\u0000\u0000\u012b\u012c\u0005R\u0000\u0000\u012c"+
		"\u012d\u0005e\u0000\u0000\u012d\u012e\u0005a\u0000\u0000\u012e\u012f\u0005"+
		"d\u0000\u0000\u012fT\u0001\u0000\u0000\u0000\u0130\u0131\u0005U\u0000"+
		"\u0000\u0131\u0132\u0005p\u0000\u0000\u0132\u0133\u0005d\u0000\u0000\u0133"+
		"\u0134\u0005a\u0000\u0000\u0134\u0135\u0005t\u0000\u0000\u0135\u0136\u0005"+
		"e\u0000\u0000\u0136V\u0001\u0000\u0000\u0000\u0137\u0138\u0005D\u0000"+
		"\u0000\u0138\u0139\u0005e\u0000\u0000\u0139\u013a\u0005l\u0000\u0000\u013a"+
		"\u013b\u0005e\u0000\u0000\u013b\u013c\u0005t\u0000\u0000\u013c\u013d\u0005"+
		"e\u0000\u0000\u013dX\u0001\u0000\u0000\u0000\u013e\u013f\u0005w\u0000"+
		"\u0000\u013f\u0140\u0005i\u0000\u0000\u0140\u0141\u0005t\u0000\u0000\u0141"+
		"\u0142\u0005h\u0000\u0000\u0142Z\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"h\u0000\u0000\u0144\u0145\u0005a\u0000\u0000\u0145\u0146\u0005v\u0000"+
		"\u0000\u0146\u0147\u0005i\u0000\u0000\u0147\u0148\u0005n\u0000\u0000\u0148"+
		"\u0149\u0005g\u0000\u0000\u0149\\\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005f\u0000\u0000\u014b\u014c\u0005u\u0000\u0000\u014c\u014d\u0005n"+
		"\u0000\u0000\u014d\u014e\u0005c\u0000\u0000\u014e\u014f\u0005t\u0000\u0000"+
		"\u014f\u0150\u0005i\u0000\u0000\u0150\u0151\u0005o\u0000\u0000\u0151\u0152"+
		"\u0005n\u0000\u0000\u0152^\u0001\u0000\u0000\u0000\u0153\u0154\u0005L"+
		"\u0000\u0000\u0154\u0155\u0005i\u0000\u0000\u0155\u0156\u0005s\u0000\u0000"+
		"\u0156\u0157\u0005t\u0000\u0000\u0157`\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005D\u0000\u0000\u0159\u015a\u0005i\u0000\u0000\u015a\u015b\u0005c"+
		"\u0000\u0000\u015b\u015c\u0005t\u0000\u0000\u015cb\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005l\u0000\u0000\u015e\u015f\u0005e\u0000\u0000\u015f\u0160"+
		"\u0005t\u0000\u0000\u0160d\u0001\u0000\u0000\u0000\u0161\u0162\u0005w"+
		"\u0000\u0000\u0162\u0163\u0005h\u0000\u0000\u0163\u0164\u0005i\u0000\u0000"+
		"\u0164\u0165\u0005l\u0000\u0000\u0165\u0166\u0005e\u0000\u0000\u0166f"+
		"\u0001\u0000\u0000\u0000\u0167\u016a\u0003+\u0015\u0000\u0168\u0169\u0005"+
		":\u0000\u0000\u0169\u016b\u0003+\u0015\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0170\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0005A\u0000\u0000\u016d\u0171\u0005M\u0000\u0000\u016e"+
		"\u016f\u0005P\u0000\u0000\u016f\u0171\u0005M\u0000\u0000\u0170\u016c\u0001"+
		"\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171h\u0001\u0000\u0000\u0000\u0172\u0175\u0003Y,"+
		"\u0000\u0173\u0175\u0003[-\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0175j\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0005$\u0000\u0000\u0177\u0178\u0003)\u0014\u0000\u0178l\u0001\u0000"+
		"\u0000\u0000\t\u0000\u00b4\u00bb\u00c0\u00c5\u00cb\u016a\u0170\u0174\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}