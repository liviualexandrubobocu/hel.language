// Generated from /Users/liviualexandrubobocu/Desktop/Calculator/hel.language/compiler/frontend/Hel.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, WS=23, WORD=24, NUMBER=25, 
		TIME=26, STRING=27, IF=28, EVERY=29, REMEMBER=30, USE=31, FAILS=32, NOTIFY=33, 
		AT=34, FOR=35, TO=36, ME=37, MORNING=38, AM=39, PM=40, AND=41, OR=42, 
		NOT=43, CREATE=44, READ=45, UPDATE=46, DELETE=47, WITH=48, HAVING=49, 
		FUNCTION=50, LIST=51, DICT=52, LET=53, WHILE=54, IMMUTABLE=55, TIME_SPEC=56, 
		ATTRIBUTE=57, VARIABLE=58, TYPE=59, MATCH=60, CASE=61;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_basicCommand = 2, RULE_conditionalCommand = 3, 
		RULE_variableAssignment = 4, RULE_conditionExpr = 5, RULE_condition = 6, 
		RULE_loopCommand = 7, RULE_interval = 8, RULE_rememberCommand = 9, RULE_errorHandlingCommand = 10, 
		RULE_customErrorHandling = 11, RULE_interactiveCommand = 12, RULE_complexTask = 13, 
		RULE_subtask = 14, RULE_contextAwareCommand = 15, RULE_modularTaskDefinition = 16, 
		RULE_modularTaskExecution = 17, RULE_timeSpecification = 18, RULE_thatStatement = 19, 
		RULE_dialog = 20, RULE_dialogStep = 21, RULE_contextCommand = 22, RULE_userCommand = 23, 
		RULE_agentCommand = 24, RULE_crudCommand = 25, RULE_entity = 26, RULE_functionDefinition = 27, 
		RULE_functionCall = 28, RULE_parameter = 29, RULE_argument = 30, RULE_expression = 31, 
		RULE_listDeclaration = 32, RULE_dictionaryDeclaration = 33, RULE_element = 34, 
		RULE_keyValuePair = 35, RULE_genericType = 36, RULE_patternMatching = 37, 
		RULE_patternCase = 38, RULE_pattern = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "basicCommand", "conditionalCommand", "variableAssignment", 
			"conditionExpr", "condition", "loopCommand", "interval", "rememberCommand", 
			"errorHandlingCommand", "customErrorHandling", "interactiveCommand", 
			"complexTask", "subtask", "contextAwareCommand", "modularTaskDefinition", 
			"modularTaskExecution", "timeSpecification", "thatStatement", "dialog", 
			"dialogStep", "contextCommand", "userCommand", "agentCommand", "crudCommand", 
			"entity", "functionDefinition", "functionCall", "parameter", "argument", 
			"expression", "listDeclaration", "dictionaryDeclaration", "element", 
			"keyValuePair", "genericType", "patternMatching", "patternCase", "pattern"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "'='", "'('", "';'", "')'", "'{'", "'}'", 
			"'minutes'", "'hours'", "'-'", "'Define'", "'Execute'", "'User:'", "'Agent:'", 
			"'?'", "'['", "']'", "'<'", "'>'", "'=>'", null, null, null, null, null, 
			"'If'", "'Every'", "'Remember'", "'Use'", "'If fails, notify'", "'notify'", 
			"'at'", "'for'", "'to'", "'me'", "'morning'", "'AM'", "'PM'", "'AND'", 
			"'OR'", "'NOT'", "'Create'", "'Read'", "'Update'", "'Delete'", "'with'", 
			"'having'", "'function'", "'List'", "'Dict'", "'let'", "'while'", "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"WORD", "NUMBER", "TIME", "STRING", "IF", "EVERY", "REMEMBER", "USE", 
			"FAILS", "NOTIFY", "AT", "FOR", "TO", "ME", "MORNING", "AM", "PM", "AND", 
			"OR", "NOT", "CREATE", "READ", "UPDATE", "DELETE", "WITH", "HAVING", 
			"FUNCTION", "LIST", "DICT", "LET", "WHILE", "IMMUTABLE", "TIME_SPEC", 
			"ATTRIBUTE", "VARIABLE", "TYPE", "MATCH", "CASE"
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
	public String getGrammarFileName() { return "Hel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71195613177372672L) != 0) );
			setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BasicCommandContext basicCommand() {
			return getRuleContext(BasicCommandContext.class,0);
		}
		public ConditionalCommandContext conditionalCommand() {
			return getRuleContext(ConditionalCommandContext.class,0);
		}
		public LoopCommandContext loopCommand() {
			return getRuleContext(LoopCommandContext.class,0);
		}
		public RememberCommandContext rememberCommand() {
			return getRuleContext(RememberCommandContext.class,0);
		}
		public ErrorHandlingCommandContext errorHandlingCommand() {
			return getRuleContext(ErrorHandlingCommandContext.class,0);
		}
		public InteractiveCommandContext interactiveCommand() {
			return getRuleContext(InteractiveCommandContext.class,0);
		}
		public ComplexTaskContext complexTask() {
			return getRuleContext(ComplexTaskContext.class,0);
		}
		public ContextAwareCommandContext contextAwareCommand() {
			return getRuleContext(ContextAwareCommandContext.class,0);
		}
		public ModularTaskDefinitionContext modularTaskDefinition() {
			return getRuleContext(ModularTaskDefinitionContext.class,0);
		}
		public ModularTaskExecutionContext modularTaskExecution() {
			return getRuleContext(ModularTaskExecutionContext.class,0);
		}
		public CrudCommandContext crudCommand() {
			return getRuleContext(CrudCommandContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public DictionaryDeclarationContext dictionaryDeclaration() {
			return getRuleContext(DictionaryDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				basicCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				conditionalCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				loopCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				rememberCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				errorHandlingCommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				interactiveCommand();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				complexTask();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				contextAwareCommand();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				modularTaskDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				modularTaskExecution();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				crudCommand();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(98);
				functionDefinition();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(99);
				listDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(100);
				dictionaryDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(101);
				variableAssignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicCommandContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public BasicCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicCommand; }
	}

	public final BasicCommandContext basicCommand() throws RecognitionException {
		BasicCommandContext _localctx = new BasicCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basicCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				match(WORD);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(109);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalCommandContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HelParser.IF, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public BasicCommandContext basicCommand() {
			return getRuleContext(BasicCommandContext.class,0);
		}
		public ConditionalCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCommand; }
	}

	public final ConditionalCommandContext conditionalCommand() throws RecognitionException {
		ConditionalCommandContext _localctx = new ConditionalCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionalCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IF);
			setState(112);
			conditionExpr();
			setState(113);
			match(T__1);
			setState(114);
			basicCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(HelParser.VARIABLE, 0); }
		public TerminalNode TYPE() { return getToken(HelParser.TYPE, 0); }
		public TerminalNode LET() { return getToken(HelParser.LET, 0); }
		public TerminalNode IMMUTABLE() { return getToken(HelParser.IMMUTABLE, 0); }
		public TerminalNode WORD() { return getToken(HelParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(HelParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HelParser.STRING, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==IMMUTABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(VARIABLE);
			setState(118);
			match(T__2);
			setState(119);
			match(TYPE);
			setState(120);
			match(T__3);
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 184549376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExprContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(HelParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(HelParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(HelParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(HelParser.OR, i);
		}
		public TerminalNode NOT() { return getToken(HelParser.NOT, 0); }
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionExpr);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				condition();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(125);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(126);
					condition();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NOT);
				setState(133);
				condition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(WORD);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopCommandContext extends ParserRuleContext {
		public TerminalNode EVERY() { return getToken(HelParser.EVERY, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public BasicCommandContext basicCommand() {
			return getRuleContext(BasicCommandContext.class,0);
		}
		public TerminalNode FOR() { return getToken(HelParser.FOR, 0); }
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(HelParser.WHILE, 0); }
		public LoopCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCommand; }
	}

	public final LoopCommandContext loopCommand() throws RecognitionException {
		LoopCommandContext _localctx = new LoopCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopCommand);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(EVERY);
				setState(142);
				interval();
				setState(143);
				match(T__1);
				setState(144);
				basicCommand();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(FOR);
				setState(147);
				match(T__4);
				setState(148);
				variableAssignment();
				setState(149);
				match(T__5);
				setState(150);
				conditionExpr();
				setState(151);
				match(T__5);
				setState(152);
				variableAssignment();
				setState(153);
				match(T__6);
				setState(154);
				match(T__7);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					statement();
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71195613177372672L) != 0) );
				setState(160);
				match(T__8);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(WHILE);
				setState(163);
				match(T__4);
				setState(164);
				conditionExpr();
				setState(165);
				match(T__6);
				setState(166);
				match(T__7);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					statement();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71195613177372672L) != 0) );
				setState(172);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HelParser.NUMBER, 0); }
		public TerminalNode TIME_SPEC() { return getToken(HelParser.TIME_SPEC, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interval);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(176);
					match(NUMBER);
					}
				}

				setState(179);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(180);
					match(NUMBER);
					}
				}

				setState(183);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(TIME_SPEC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RememberCommandContext extends ParserRuleContext {
		public TerminalNode REMEMBER() { return getToken(HelParser.REMEMBER, 0); }
		public ThatStatementContext thatStatement() {
			return getRuleContext(ThatStatementContext.class,0);
		}
		public RememberCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rememberCommand; }
	}

	public final RememberCommandContext rememberCommand() throws RecognitionException {
		RememberCommandContext _localctx = new RememberCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rememberCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(REMEMBER);
			setState(188);
			thatStatement();
			setState(189);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ErrorHandlingCommandContext extends ParserRuleContext {
		public BasicCommandContext basicCommand() {
			return getRuleContext(BasicCommandContext.class,0);
		}
		public TerminalNode FAILS() { return getToken(HelParser.FAILS, 0); }
		public TerminalNode NOTIFY() { return getToken(HelParser.NOTIFY, 0); }
		public TerminalNode ME() { return getToken(HelParser.ME, 0); }
		public CustomErrorHandlingContext customErrorHandling() {
			return getRuleContext(CustomErrorHandlingContext.class,0);
		}
		public ErrorHandlingCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorHandlingCommand; }
	}

	public final ErrorHandlingCommandContext errorHandlingCommand() throws RecognitionException {
		ErrorHandlingCommandContext _localctx = new ErrorHandlingCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_errorHandlingCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			basicCommand();
			setState(192);
			match(FAILS);
			setState(193);
			match(T__1);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTIFY:
				{
				setState(194);
				match(NOTIFY);
				setState(195);
				match(ME);
				}
				break;
			case WORD:
				{
				setState(196);
				customErrorHandling();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CustomErrorHandlingContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public CustomErrorHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customErrorHandling; }
	}

	public final CustomErrorHandlingContext customErrorHandling() throws RecognitionException {
		CustomErrorHandlingContext _localctx = new CustomErrorHandlingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_customErrorHandling);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(199);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(204);
				match(T__1);
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(205);
						match(WORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InteractiveCommandContext extends ParserRuleContext {
		public DialogContext dialog() {
			return getRuleContext(DialogContext.class,0);
		}
		public List<DialogStepContext> dialogStep() {
			return getRuleContexts(DialogStepContext.class);
		}
		public DialogStepContext dialogStep(int i) {
			return getRuleContext(DialogStepContext.class,i);
		}
		public InteractiveCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interactiveCommand; }
	}

	public final InteractiveCommandContext interactiveCommand() throws RecognitionException {
		InteractiveCommandContext _localctx = new InteractiveCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interactiveCommand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			dialog();
			setState(217); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(216);
					dialogStep();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTaskContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public List<SubtaskContext> subtask() {
			return getRuleContexts(SubtaskContext.class);
		}
		public SubtaskContext subtask(int i) {
			return getRuleContext(SubtaskContext.class,i);
		}
		public ComplexTaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexTask; }
	}

	public final ComplexTaskContext complexTask() throws RecognitionException {
		ComplexTaskContext _localctx = new ComplexTaskContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_complexTask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				match(WORD);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(226);
			match(T__2);
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				subtask();
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubtaskContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public SubtaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtask; }
	}

	public final SubtaskContext subtask() throws RecognitionException {
		SubtaskContext _localctx = new SubtaskContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subtask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__11);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				match(WORD);
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(238);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContextAwareCommandContext extends ParserRuleContext {
		public ContextCommandContext contextCommand() {
			return getRuleContext(ContextCommandContext.class,0);
		}
		public ContextAwareCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextAwareCommand; }
	}

	public final ContextAwareCommandContext contextAwareCommand() throws RecognitionException {
		ContextAwareCommandContext _localctx = new ContextAwareCommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_contextAwareCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			contextCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModularTaskDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public List<SubtaskContext> subtask() {
			return getRuleContexts(SubtaskContext.class);
		}
		public SubtaskContext subtask(int i) {
			return getRuleContext(SubtaskContext.class,i);
		}
		public ModularTaskDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modularTaskDefinition; }
	}

	public final ModularTaskDefinitionContext modularTaskDefinition() throws RecognitionException {
		ModularTaskDefinitionContext _localctx = new ModularTaskDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modularTaskDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__12);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(WORD);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(248);
			match(T__2);
			setState(250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(249);
				subtask();
				}
				}
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModularTaskExecutionContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public ModularTaskExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modularTaskExecution; }
	}

	public final ModularTaskExecutionContext modularTaskExecution() throws RecognitionException {
		ModularTaskExecutionContext _localctx = new ModularTaskExecutionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modularTaskExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__13);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				match(WORD);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(260);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeSpecificationContext extends ParserRuleContext {
		public TerminalNode MORNING() { return getToken(HelParser.MORNING, 0); }
		public TerminalNode AM() { return getToken(HelParser.AM, 0); }
		public TerminalNode TIME() { return getToken(HelParser.TIME, 0); }
		public TerminalNode NUMBER() { return getToken(HelParser.NUMBER, 0); }
		public TerminalNode PM() { return getToken(HelParser.PM, 0); }
		public TimeSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSpecification; }
	}

	public final TimeSpecificationContext timeSpecification() throws RecognitionException {
		TimeSpecificationContext _localctx = new TimeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_timeSpecification);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(MORNING);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIME) {
					{
					setState(263);
					match(TIME);
					}
				}

				setState(266);
				match(AM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(NUMBER);
				setState(268);
				match(AM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(NUMBER);
				setState(270);
				match(PM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThatStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HelParser.STRING, 0); }
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public ThatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thatStatement; }
	}

	public final ThatStatementContext thatStatement() throws RecognitionException {
		ThatStatementContext _localctx = new ThatStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_thatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				match(WORD);
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(278);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DialogContext extends ParserRuleContext {
		public UserCommandContext userCommand() {
			return getRuleContext(UserCommandContext.class,0);
		}
		public DialogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialog; }
	}

	public final DialogContext dialog() throws RecognitionException {
		DialogContext _localctx = new DialogContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dialog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__14);
			setState(281);
			userCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DialogStepContext extends ParserRuleContext {
		public AgentCommandContext agentCommand() {
			return getRuleContext(AgentCommandContext.class,0);
		}
		public UserCommandContext userCommand() {
			return getRuleContext(UserCommandContext.class,0);
		}
		public DialogStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogStep; }
	}

	public final DialogStepContext dialogStep() throws RecognitionException {
		DialogStepContext _localctx = new DialogStepContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dialogStep);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__15);
				setState(284);
				agentCommand();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__14);
				setState(286);
				userCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContextCommandContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public ContextCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextCommand; }
	}

	public final ContextCommandContext contextCommand() throws RecognitionException {
		ContextCommandContext _localctx = new ContextCommandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_contextCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				match(WORD);
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(294);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserCommandContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public UserCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userCommand; }
	}

	public final UserCommandContext userCommand() throws RecognitionException {
		UserCommandContext _localctx = new UserCommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_userCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				match(WORD);
				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(301);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AgentCommandContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public AgentCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentCommand; }
	}

	public final AgentCommandContext agentCommand() throws RecognitionException {
		AgentCommandContext _localctx = new AgentCommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_agentCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				match(WORD);
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(308);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrudCommandContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(HelParser.CREATE, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public TerminalNode READ() { return getToken(HelParser.READ, 0); }
		public TerminalNode UPDATE() { return getToken(HelParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(HelParser.DELETE, 0); }
		public CrudCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crudCommand; }
	}

	public final CrudCommandContext crudCommand() throws RecognitionException {
		CrudCommandContext _localctx = new CrudCommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_crudCommand);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(CREATE);
				setState(311);
				entity();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(READ);
				setState(313);
				entity();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(UPDATE);
				setState(315);
				entity();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(DELETE);
				setState(317);
				entity();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EntityContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(HelParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(HelParser.WORD, i);
		}
		public List<TerminalNode> ATTRIBUTE() { return getTokens(HelParser.ATTRIBUTE); }
		public TerminalNode ATTRIBUTE(int i) {
			return getToken(HelParser.ATTRIBUTE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HelParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HelParser.STRING, i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_entity);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(320);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(323); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE) {
				{
				{
				setState(325);
				match(ATTRIBUTE);
				setState(326);
				match(STRING);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(HelParser.FUNCTION, 0); }
		public TerminalNode WORD() { return getToken(HelParser.WORD, 0); }
		public TerminalNode TYPE() { return getToken(HelParser.TYPE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FUNCTION);
			setState(333);
			match(WORD);
			setState(334);
			match(T__4);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(335);
				parameter();
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(336);
					match(T__1);
					setState(337);
					parameter();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(345);
			match(T__6);
			setState(346);
			match(T__2);
			setState(347);
			match(TYPE);
			setState(348);
			match(T__7);
			setState(350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(349);
				statement();
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71195613177372672L) != 0) );
			setState(354);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(HelParser.WORD, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(WORD);
			setState(357);
			match(T__4);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 184549376L) != 0)) {
				{
				setState(358);
				argument();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(359);
					match(T__1);
					setState(360);
					argument();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(368);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(HelParser.VARIABLE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(VARIABLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(HelParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(HelParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HelParser.STRING, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				functionCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(HelParser.LIST, 0); }
		public TerminalNode VARIABLE() { return getToken(HelParser.VARIABLE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(LIST);
			setState(381);
			match(VARIABLE);
			setState(382);
			match(T__3);
			setState(383);
			match(T__17);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 184549376L) != 0)) {
				{
				setState(384);
				element();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(385);
					match(T__1);
					setState(386);
					element();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(394);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryDeclarationContext extends ParserRuleContext {
		public TerminalNode DICT() { return getToken(HelParser.DICT, 0); }
		public TerminalNode VARIABLE() { return getToken(HelParser.VARIABLE, 0); }
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public DictionaryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryDeclaration; }
	}

	public final DictionaryDeclarationContext dictionaryDeclaration() throws RecognitionException {
		DictionaryDeclarationContext _localctx = new DictionaryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dictionaryDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(DICT);
			setState(397);
			match(VARIABLE);
			setState(398);
			match(T__3);
			setState(399);
			match(T__7);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(400);
				keyValuePair();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(401);
					match(T__1);
					setState(402);
					keyValuePair();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(410);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HelParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(STRING);
			setState(415);
			match(T__2);
			setState(416);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(HelParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(HelParser.TYPE, i);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_genericType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(TYPE);
			setState(419);
			match(T__19);
			setState(420);
			match(TYPE);
			setState(421);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternMatchingContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(HelParser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<PatternCaseContext> patternCase() {
			return getRuleContexts(PatternCaseContext.class);
		}
		public PatternCaseContext patternCase(int i) {
			return getRuleContext(PatternCaseContext.class,i);
		}
		public PatternMatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatching; }
	}

	public final PatternMatchingContext patternMatching() throws RecognitionException {
		PatternMatchingContext _localctx = new PatternMatchingContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_patternMatching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(MATCH);
			setState(424);
			expression();
			setState(425);
			match(T__7);
			setState(427); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(426);
				patternCase();
				}
				}
				setState(429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(431);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(HelParser.CASE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PatternCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternCase; }
	}

	public final PatternCaseContext patternCase() throws RecognitionException {
		PatternCaseContext _localctx = new PatternCaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_patternCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(CASE);
			setState(434);
			pattern();
			setState(435);
			match(T__21);
			setState(436);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(HelParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(HelParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HelParser.STRING, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 184549376L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001=\u01b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0004\u0000R\b\u0000\u000b\u0000\f\u0000S\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0002"+
		"\u0004\u0002j\b\u0002\u000b\u0002\f\u0002k\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0080\b\u0005\n"+
		"\u0005\f\u0005\u0083\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0087"+
		"\b\u0005\u0001\u0006\u0004\u0006\u008a\b\u0006\u000b\u0006\f\u0006\u008b"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u009d\b\u0007\u000b\u0007"+
		"\f\u0007\u009e\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00a9\b\u0007\u000b\u0007"+
		"\f\u0007\u00aa\u0001\u0007\u0001\u0007\u0003\u0007\u00af\b\u0007\u0001"+
		"\b\u0003\b\u00b2\b\b\u0001\b\u0001\b\u0003\b\u00b6\b\b\u0001\b\u0001\b"+
		"\u0003\b\u00ba\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c6\b\n\u0001\u000b\u0004\u000b\u00c9"+
		"\b\u000b\u000b\u000b\f\u000b\u00ca\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00cf\b\u000b\u000b\u000b\f\u000b\u00d0\u0005\u000b\u00d3\b\u000b\n\u000b"+
		"\f\u000b\u00d6\t\u000b\u0001\f\u0001\f\u0004\f\u00da\b\f\u000b\f\f\f\u00db"+
		"\u0001\r\u0004\r\u00df\b\r\u000b\r\f\r\u00e0\u0001\r\u0001\r\u0004\r\u00e5"+
		"\b\r\u000b\r\f\r\u00e6\u0001\u000e\u0001\u000e\u0004\u000e\u00eb\b\u000e"+
		"\u000b\u000e\f\u000e\u00ec\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00f5\b\u0010\u000b\u0010\f\u0010"+
		"\u00f6\u0001\u0010\u0001\u0010\u0004\u0010\u00fb\b\u0010\u000b\u0010\f"+
		"\u0010\u00fc\u0001\u0011\u0001\u0011\u0004\u0011\u0101\b\u0011\u000b\u0011"+
		"\f\u0011\u0102\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0109\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0110\b\u0012\u0001\u0013\u0004\u0013\u0113\b\u0013\u000b"+
		"\u0013\f\u0013\u0114\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0120"+
		"\b\u0015\u0001\u0016\u0004\u0016\u0123\b\u0016\u000b\u0016\f\u0016\u0124"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u012a\b\u0017\u000b\u0017"+
		"\f\u0017\u012b\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0131\b"+
		"\u0018\u000b\u0018\f\u0018\u0132\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u013f\b\u0019\u0001\u001a\u0004\u001a\u0142\b\u001a"+
		"\u000b\u001a\f\u001a\u0143\u0001\u001a\u0001\u001a\u0005\u001a\u0148\b"+
		"\u001a\n\u001a\f\u001a\u014b\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0153\b\u001b\n\u001b"+
		"\f\u001b\u0156\t\u001b\u0003\u001b\u0158\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u015f\b\u001b\u000b\u001b"+
		"\f\u001b\u0160\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u016a\b\u001c\n\u001c\f\u001c\u016d"+
		"\t\u001c\u0003\u001c\u016f\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u017b\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u0184\b \n \f \u0187\t \u0003 \u0189\b \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0194"+
		"\b!\n!\f!\u0197\t!\u0003!\u0199\b!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0004%\u01ac\b%\u000b%\f%\u01ad\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0000\u0000(\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLN\u0000\u0003\u0002\u00005577\u0002\u0000\u0018"+
		"\u0019\u001b\u001b\u0001\u0000)*\u01d0\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0002f\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006o"+
		"\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000\n\u0086\u0001\u0000"+
		"\u0000\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000"+
		"\u0000\u0010\u00b9\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000\u0000"+
		"\u0000\u0014\u00bf\u0001\u0000\u0000\u0000\u0016\u00c8\u0001\u0000\u0000"+
		"\u0000\u0018\u00d7\u0001\u0000\u0000\u0000\u001a\u00de\u0001\u0000\u0000"+
		"\u0000\u001c\u00e8\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000"+
		"\u0000 \u00f2\u0001\u0000\u0000\u0000\"\u00fe\u0001\u0000\u0000\u0000"+
		"$\u010f\u0001\u0000\u0000\u0000&\u0112\u0001\u0000\u0000\u0000(\u0118"+
		"\u0001\u0000\u0000\u0000*\u011f\u0001\u0000\u0000\u0000,\u0122\u0001\u0000"+
		"\u0000\u0000.\u0129\u0001\u0000\u0000\u00000\u0130\u0001\u0000\u0000\u0000"+
		"2\u013e\u0001\u0000\u0000\u00004\u0141\u0001\u0000\u0000\u00006\u014c"+
		"\u0001\u0000\u0000\u00008\u0164\u0001\u0000\u0000\u0000:\u0172\u0001\u0000"+
		"\u0000\u0000<\u0174\u0001\u0000\u0000\u0000>\u017a\u0001\u0000\u0000\u0000"+
		"@\u017c\u0001\u0000\u0000\u0000B\u018c\u0001\u0000\u0000\u0000D\u019c"+
		"\u0001\u0000\u0000\u0000F\u019e\u0001\u0000\u0000\u0000H\u01a2\u0001\u0000"+
		"\u0000\u0000J\u01a7\u0001\u0000\u0000\u0000L\u01b1\u0001\u0000\u0000\u0000"+
		"N\u01b6\u0001\u0000\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u0000\u0000\u0001"+
		"V\u0001\u0001\u0000\u0000\u0000Wg\u0003\u0004\u0002\u0000Xg\u0003\u0006"+
		"\u0003\u0000Yg\u0003\u000e\u0007\u0000Zg\u0003\u0012\t\u0000[g\u0003\u0014"+
		"\n\u0000\\g\u0003\u0018\f\u0000]g\u0003\u001a\r\u0000^g\u0003\u001e\u000f"+
		"\u0000_g\u0003 \u0010\u0000`g\u0003\"\u0011\u0000ag\u00032\u0019\u0000"+
		"bg\u00036\u001b\u0000cg\u0003@ \u0000dg\u0003B!\u0000eg\u0003\b\u0004"+
		"\u0000fW\u0001\u0000\u0000\u0000fX\u0001\u0000\u0000\u0000fY\u0001\u0000"+
		"\u0000\u0000fZ\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000f\\\u0001"+
		"\u0000\u0000\u0000f]\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000"+
		"f_\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000"+
		"\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0003\u0001\u0000\u0000\u0000"+
		"hj\u0005\u0018\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0001\u0000\u0000n\u0005\u0001\u0000\u0000\u0000"+
		"op\u0005\u001c\u0000\u0000pq\u0003\n\u0005\u0000qr\u0005\u0002\u0000\u0000"+
		"rs\u0003\u0004\u0002\u0000s\u0007\u0001\u0000\u0000\u0000tu\u0007\u0000"+
		"\u0000\u0000uv\u0005:\u0000\u0000vw\u0005\u0003\u0000\u0000wx\u0005;\u0000"+
		"\u0000xy\u0005\u0004\u0000\u0000yz\u0007\u0001\u0000\u0000z{\u0005\u0001"+
		"\u0000\u0000{\t\u0001\u0000\u0000\u0000|\u0081\u0003\f\u0006\u0000}~\u0007"+
		"\u0002\u0000\u0000~\u0080\u0003\f\u0006\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0087\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005+\u0000\u0000"+
		"\u0085\u0087\u0003\f\u0006\u0000\u0086|\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0005\u0018\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u001d\u0000\u0000\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090\u0005"+
		"\u0002\u0000\u0000\u0090\u0091\u0003\u0004\u0002\u0000\u0091\u00af\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005#\u0000\u0000\u0093\u0094\u0005\u0005"+
		"\u0000\u0000\u0094\u0095\u0003\b\u0004\u0000\u0095\u0096\u0005\u0006\u0000"+
		"\u0000\u0096\u0097\u0003\n\u0005\u0000\u0097\u0098\u0005\u0006\u0000\u0000"+
		"\u0098\u0099\u0003\b\u0004\u0000\u0099\u009a\u0005\u0007\u0000\u0000\u009a"+
		"\u009c\u0005\b\u0000\u0000\u009b\u009d\u0003\u0002\u0001\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1\u00af\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u00056\u0000\u0000\u00a3\u00a4\u0005\u0005"+
		"\u0000\u0000\u00a4\u00a5\u0003\n\u0005\u0000\u00a5\u00a6\u0005\u0007\u0000"+
		"\u0000\u00a6\u00a8\u0005\b\u0000\u0000\u00a7\u00a9\u0003\u0002\u0001\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\t\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u008d\u0001\u0000\u0000\u0000\u00ae"+
		"\u0092\u0001\u0000\u0000\u0000\u00ae\u00a2\u0001\u0000\u0000\u0000\u00af"+
		"\u000f\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\u0019\u0000\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00ba\u0005\n\u0000\u0000\u00b4\u00b6"+
		"\u0005\u0019\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0005\u000b\u0000\u0000\u00b8\u00ba\u00058\u0000\u0000\u00b9\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u0011\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u001e\u0000\u0000\u00bc\u00bd\u0003&\u0013\u0000\u00bd\u00be\u0005\u0001"+
		"\u0000\u0000\u00be\u0013\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u0004"+
		"\u0002\u0000\u00c0\u00c1\u0005 \u0000\u0000\u00c1\u00c5\u0005\u0002\u0000"+
		"\u0000\u00c2\u00c3\u0005!\u0000\u0000\u00c3\u00c6\u0005%\u0000\u0000\u00c4"+
		"\u00c6\u0003\u0016\u000b\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u0015\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0005\u0018\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d4\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0005\u0002\u0000\u0000\u00cd\u00cf\u0005\u0018\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u0017\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003(\u0014\u0000\u00d8\u00da"+
		"\u0003*\u0015\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u0019\u0001\u0000\u0000\u0000\u00dd\u00df\u0005"+
		"\u0018\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005"+
		"\u0003\u0000\u0000\u00e3\u00e5\u0003\u001c\u000e\u0000\u00e4\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u001b\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0005\f\u0000\u0000\u00e9\u00eb\u0005\u0018"+
		"\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0001"+
		"\u0000\u0000\u00ef\u001d\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003,\u0016"+
		"\u0000\u00f1\u001f\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\r\u0000\u0000"+
		"\u00f3\u00f5\u0005\u0018\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fa\u0005\u0003\u0000\u0000\u00f9\u00fb\u0003\u001c\u000e\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd!\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u000e\u0000\u0000\u00ff"+
		"\u0101\u0005\u0018\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0005\u0001\u0000\u0000\u0105#\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u0005&\u0000\u0000\u0107\u0109\u0005\u001a\u0000\u0000\u0108\u0107\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u0110\u0005\'\u0000\u0000\u010b\u010c\u0005\u0019"+
		"\u0000\u0000\u010c\u0110\u0005\'\u0000\u0000\u010d\u010e\u0005\u0019\u0000"+
		"\u0000\u010e\u0110\u0005(\u0000\u0000\u010f\u0106\u0001\u0000\u0000\u0000"+
		"\u010f\u010b\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110%\u0001\u0000\u0000\u0000\u0111\u0113\u0005\u0018\u0000\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u001b\u0000\u0000\u0117"+
		"\'\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u000f\u0000\u0000\u0119\u011a"+
		"\u0003.\u0017\u0000\u011a)\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0010"+
		"\u0000\u0000\u011c\u0120\u00030\u0018\u0000\u011d\u011e\u0005\u000f\u0000"+
		"\u0000\u011e\u0120\u0003.\u0017\u0000\u011f\u011b\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u0120+\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0005\u0018\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\u0001\u0000\u0000\u0127-\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0005\u0018\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\u0001\u0000\u0000\u012e/\u0001\u0000\u0000\u0000\u012f\u0131\u0005"+
		"\u0018\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u0011\u0000\u0000\u01351\u0001\u0000\u0000\u0000\u0136\u0137\u0005,\u0000"+
		"\u0000\u0137\u013f\u00034\u001a\u0000\u0138\u0139\u0005-\u0000\u0000\u0139"+
		"\u013f\u00034\u001a\u0000\u013a\u013b\u0005.\u0000\u0000\u013b\u013f\u0003"+
		"4\u001a\u0000\u013c\u013d\u0005/\u0000\u0000\u013d\u013f\u00034\u001a"+
		"\u0000\u013e\u0136\u0001\u0000\u0000\u0000\u013e\u0138\u0001\u0000\u0000"+
		"\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000"+
		"\u0000\u013f3\u0001\u0000\u0000\u0000\u0140\u0142\u0005\u0018\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0149\u0001\u0000\u0000\u0000\u0145\u0146\u00059\u0000\u0000\u0146"+
		"\u0148\u0005\u001b\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a5\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u00052\u0000\u0000\u014d\u014e\u0005"+
		"\u0018\u0000\u0000\u014e\u0157\u0005\u0005\u0000\u0000\u014f\u0154\u0003"+
		":\u001d\u0000\u0150\u0151\u0005\u0002\u0000\u0000\u0151\u0153\u0003:\u001d"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000"+
		"\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u014f\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0007\u0000"+
		"\u0000\u015a\u015b\u0005\u0003\u0000\u0000\u015b\u015c\u0005;\u0000\u0000"+
		"\u015c\u015e\u0005\b\u0000\u0000\u015d\u015f\u0003\u0002\u0001\u0000\u015e"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\t\u0000\u0000\u01637"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0018\u0000\u0000\u0165\u016e"+
		"\u0005\u0005\u0000\u0000\u0166\u016b\u0003<\u001e\u0000\u0167\u0168\u0005"+
		"\u0002\u0000\u0000\u0168\u016a\u0003<\u001e\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0166\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0005\u0007\u0000\u0000\u01719\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0005:\u0000\u0000\u0173;\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0003>\u001f\u0000\u0175=\u0001\u0000\u0000\u0000\u0176\u017b\u0005"+
		"\u0018\u0000\u0000\u0177\u017b\u0005\u0019\u0000\u0000\u0178\u017b\u0005"+
		"\u001b\u0000\u0000\u0179\u017b\u00038\u001c\u0000\u017a\u0176\u0001\u0000"+
		"\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b?\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u00053\u0000\u0000\u017d\u017e\u0005:\u0000\u0000\u017e"+
		"\u017f\u0005\u0004\u0000\u0000\u017f\u0188\u0005\u0012\u0000\u0000\u0180"+
		"\u0185\u0003D\"\u0000\u0181\u0182\u0005\u0002\u0000\u0000\u0182\u0184"+
		"\u0003D\"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u0001"+
		"\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005"+
		"\u0013\u0000\u0000\u018bA\u0001\u0000\u0000\u0000\u018c\u018d\u00054\u0000"+
		"\u0000\u018d\u018e\u0005:\u0000\u0000\u018e\u018f\u0005\u0004\u0000\u0000"+
		"\u018f\u0198\u0005\b\u0000\u0000\u0190\u0195\u0003F#\u0000\u0191\u0192"+
		"\u0005\u0002\u0000\u0000\u0192\u0194\u0003F#\u0000\u0193\u0191\u0001\u0000"+
		"\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0190\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0005\t\u0000\u0000\u019bC\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0003>\u001f\u0000\u019dE\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0005\u001b\u0000\u0000\u019f\u01a0\u0005\u0003\u0000\u0000\u01a0"+
		"\u01a1\u0003>\u001f\u0000\u01a1G\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		";\u0000\u0000\u01a3\u01a4\u0005\u0014\u0000\u0000\u01a4\u01a5\u0005;\u0000"+
		"\u0000\u01a5\u01a6\u0005\u0015\u0000\u0000\u01a6I\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0005<\u0000\u0000\u01a8\u01a9\u0003>\u001f\u0000\u01a9\u01ab"+
		"\u0005\b\u0000\u0000\u01aa\u01ac\u0003L&\u0000\u01ab\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0005\t\u0000\u0000\u01b0K\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005=\u0000\u0000\u01b2\u01b3\u0003N\'\u0000\u01b3"+
		"\u01b4\u0005\u0016\u0000\u0000\u01b4\u01b5\u0003\u0002\u0001\u0000\u01b5"+
		"M\u0001\u0000\u0000\u0000\u01b6\u01b7\u0007\u0001\u0000\u0000\u01b7O\u0001"+
		"\u0000\u0000\u0000,Sfk\u0081\u0086\u008b\u009e\u00aa\u00ae\u00b1\u00b5"+
		"\u00b9\u00c5\u00ca\u00d0\u00d4\u00db\u00e0\u00e6\u00ec\u00f6\u00fc\u0102"+
		"\u0108\u010f\u0114\u011f\u0124\u012b\u0132\u013e\u0143\u0149\u0154\u0157"+
		"\u0160\u016b\u016e\u017a\u0185\u0188\u0195\u0198\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}