// Generated from Hel.g4 by ANTLR 4.13.1
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
		T__17=18, T__18=19, WS=20, WORD=21, NUMBER=22, TIME=23, STRING=24, IF=25, 
		EVERY=26, REMEMBER=27, USE=28, FAILS=29, NOTIFY=30, AT=31, FOR=32, TO=33, 
		ME=34, MORNING=35, AM=36, PM=37, AND=38, OR=39, NOT=40, CREATE=41, READ=42, 
		UPDATE=43, DELETE=44, WITH=45, HAVING=46, FUNCTION=47, LIST=48, DICT=49, 
		LET=50, WHILE=51, TIME_SPEC=52, ATTRIBUTE=53, VARIABLE=54;
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
		RULE_keyValuePair = 35;
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
			"keyValuePair"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4395852019851264L) != 0) );
			setState(77);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				basicCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				conditionalCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				loopCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				rememberCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				errorHandlingCommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				interactiveCommand();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				complexTask();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				contextAwareCommand();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				modularTaskDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				modularTaskExecution();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				crudCommand();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(90);
				functionDefinition();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(91);
				listDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(92);
				dictionaryDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(93);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterBasicCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitBasicCommand(this);
		}
	}

	public final BasicCommandContext basicCommand() throws RecognitionException {
		BasicCommandContext _localctx = new BasicCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basicCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				match(WORD);
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(101);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterConditionalCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitConditionalCommand(this);
		}
	}

	public final ConditionalCommandContext conditionalCommand() throws RecognitionException {
		ConditionalCommandContext _localctx = new ConditionalCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionalCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(104);
			conditionExpr();
			setState(105);
			match(T__1);
			setState(106);
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
		public TerminalNode LET() { return getToken(HelParser.LET, 0); }
		public TerminalNode VARIABLE() { return getToken(HelParser.VARIABLE, 0); }
		public TerminalNode WORD() { return getToken(HelParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(HelParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HelParser.STRING, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LET);
			setState(109);
			match(VARIABLE);
			setState(110);
			match(T__2);
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 23068672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitConditionExpr(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionExpr);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				condition();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(115);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(116);
					condition();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(NOT);
				setState(123);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				match(WORD);
				}
				}
				setState(129); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterLoopCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitLoopCommand(this);
		}
	}

	public final LoopCommandContext loopCommand() throws RecognitionException {
		LoopCommandContext _localctx = new LoopCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopCommand);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(EVERY);
				setState(132);
				interval();
				setState(133);
				match(T__1);
				setState(134);
				basicCommand();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(FOR);
				setState(137);
				match(T__3);
				setState(138);
				variableAssignment();
				setState(139);
				match(T__4);
				setState(140);
				conditionExpr();
				setState(141);
				match(T__4);
				setState(142);
				variableAssignment();
				setState(143);
				match(T__5);
				setState(144);
				match(T__6);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					statement();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4395852019851264L) != 0) );
				setState(150);
				match(T__7);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(WHILE);
				setState(153);
				match(T__3);
				setState(154);
				conditionExpr();
				setState(155);
				match(T__5);
				setState(156);
				match(T__6);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					statement();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4395852019851264L) != 0) );
				setState(162);
				match(T__7);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interval);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(166);
					match(NUMBER);
					}
				}

				setState(169);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(170);
					match(NUMBER);
					}
				}

				setState(173);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterRememberCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitRememberCommand(this);
		}
	}

	public final RememberCommandContext rememberCommand() throws RecognitionException {
		RememberCommandContext _localctx = new RememberCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rememberCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(REMEMBER);
			setState(178);
			thatStatement();
			setState(179);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterErrorHandlingCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitErrorHandlingCommand(this);
		}
	}

	public final ErrorHandlingCommandContext errorHandlingCommand() throws RecognitionException {
		ErrorHandlingCommandContext _localctx = new ErrorHandlingCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_errorHandlingCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			basicCommand();
			setState(182);
			match(FAILS);
			setState(183);
			match(T__1);
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTIFY:
				{
				setState(184);
				match(NOTIFY);
				setState(185);
				match(ME);
				}
				break;
			case WORD:
				{
				setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterCustomErrorHandling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitCustomErrorHandling(this);
		}
	}

	public final CustomErrorHandlingContext customErrorHandling() throws RecognitionException {
		CustomErrorHandlingContext _localctx = new CustomErrorHandlingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_customErrorHandling);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(194);
				match(T__1);
				setState(196); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(195);
						match(WORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(198); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(204);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterInteractiveCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitInteractiveCommand(this);
		}
	}

	public final InteractiveCommandContext interactiveCommand() throws RecognitionException {
		InteractiveCommandContext _localctx = new InteractiveCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interactiveCommand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			dialog();
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(206);
					dialogStep();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterComplexTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitComplexTask(this);
		}
	}

	public final ComplexTaskContext complexTask() throws RecognitionException {
		ComplexTaskContext _localctx = new ComplexTaskContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_complexTask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(WORD);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(216);
			match(T__10);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				subtask();
				}
				}
				setState(220); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterSubtask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitSubtask(this);
		}
	}

	public final SubtaskContext subtask() throws RecognitionException {
		SubtaskContext _localctx = new SubtaskContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subtask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__11);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(WORD);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(228);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterContextAwareCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitContextAwareCommand(this);
		}
	}

	public final ContextAwareCommandContext contextAwareCommand() throws RecognitionException {
		ContextAwareCommandContext _localctx = new ContextAwareCommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_contextAwareCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterModularTaskDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitModularTaskDefinition(this);
		}
	}

	public final ModularTaskDefinitionContext modularTaskDefinition() throws RecognitionException {
		ModularTaskDefinitionContext _localctx = new ModularTaskDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modularTaskDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__12);
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
			match(T__10);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				subtask();
				}
				}
				setState(242); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterModularTaskExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitModularTaskExecution(this);
		}
	}

	public final ModularTaskExecutionContext modularTaskExecution() throws RecognitionException {
		ModularTaskExecutionContext _localctx = new ModularTaskExecutionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modularTaskExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__13);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				match(WORD);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(250);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterTimeSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitTimeSpecification(this);
		}
	}

	public final TimeSpecificationContext timeSpecification() throws RecognitionException {
		TimeSpecificationContext _localctx = new TimeSpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_timeSpecification);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(MORNING);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIME) {
					{
					setState(253);
					match(TIME);
					}
				}

				setState(256);
				match(AM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(NUMBER);
				setState(258);
				match(AM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(NUMBER);
				setState(260);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterThatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitThatStatement(this);
		}
	}

	public final ThatStatementContext thatStatement() throws RecognitionException {
		ThatStatementContext _localctx = new ThatStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_thatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				match(WORD);
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(268);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterDialog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitDialog(this);
		}
	}

	public final DialogContext dialog() throws RecognitionException {
		DialogContext _localctx = new DialogContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dialog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__14);
			setState(271);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterDialogStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitDialogStep(this);
		}
	}

	public final DialogStepContext dialogStep() throws RecognitionException {
		DialogStepContext _localctx = new DialogStepContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dialogStep);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__15);
				setState(274);
				agentCommand();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__14);
				setState(276);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterContextCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitContextCommand(this);
		}
	}

	public final ContextCommandContext contextCommand() throws RecognitionException {
		ContextCommandContext _localctx = new ContextCommandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_contextCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				match(WORD);
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(284);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterUserCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitUserCommand(this);
		}
	}

	public final UserCommandContext userCommand() throws RecognitionException {
		UserCommandContext _localctx = new UserCommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_userCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(286);
				match(WORD);
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(291);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterAgentCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitAgentCommand(this);
		}
	}

	public final AgentCommandContext agentCommand() throws RecognitionException {
		AgentCommandContext _localctx = new AgentCommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_agentCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				match(WORD);
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(298);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterCrudCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitCrudCommand(this);
		}
	}

	public final CrudCommandContext crudCommand() throws RecognitionException {
		CrudCommandContext _localctx = new CrudCommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_crudCommand);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(CREATE);
				setState(301);
				entity();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(READ);
				setState(303);
				entity();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(UPDATE);
				setState(305);
				entity();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(DELETE);
				setState(307);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_entity);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(310);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTRIBUTE) {
				{
				{
				setState(315);
				match(ATTRIBUTE);
				setState(316);
				match(STRING);
				}
				}
				setState(321);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FUNCTION);
			setState(323);
			match(WORD);
			setState(324);
			match(T__3);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(325);
				parameter();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(326);
					match(T__1);
					setState(327);
					parameter();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(335);
			match(T__5);
			setState(336);
			match(T__6);
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(337);
				statement();
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4395852019851264L) != 0) );
			setState(342);
			match(T__7);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(WORD);
			setState(345);
			match(T__3);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23068672L) != 0)) {
				{
				setState(346);
				argument();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(347);
					match(T__1);
					setState(348);
					argument();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(356);
			match(T__5);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitListDeclaration(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LIST);
			setState(369);
			match(VARIABLE);
			setState(370);
			match(T__2);
			setState(371);
			match(T__17);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23068672L) != 0)) {
				{
				setState(372);
				element();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(373);
					match(T__1);
					setState(374);
					element();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(382);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterDictionaryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitDictionaryDeclaration(this);
		}
	}

	public final DictionaryDeclarationContext dictionaryDeclaration() throws RecognitionException {
		DictionaryDeclarationContext _localctx = new DictionaryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dictionaryDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(DICT);
			setState(385);
			match(VARIABLE);
			setState(386);
			match(T__2);
			setState(387);
			match(T__6);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(388);
				keyValuePair();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(389);
					match(T__1);
					setState(390);
					keyValuePair();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(398);
			match(T__7);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelListener ) ((HelListener)listener).exitKeyValuePair(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(STRING);
			setState(403);
			match(T__10);
			setState(404);
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

	public static final String _serializedATN =
		"\u0004\u00016\u0197\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0001\u0000\u0004\u0000J\b\u0000\u000b\u0000\f\u0000K\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001"+
		"\u0001\u0002\u0004\u0002b\b\u0002\u000b\u0002\f\u0002c\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0006\u0004"+
		"\u0006\u0080\b\u0006\u000b\u0006\f\u0006\u0081\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u0093\b\u0007\u000b\u0007\f\u0007\u0094\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u009f\b\u0007\u000b\u0007\f\u0007\u00a0"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\b\u0003\b\u00a8"+
		"\b\b\u0001\b\u0001\b\u0003\b\u00ac\b\b\u0001\b\u0001\b\u0003\b\u00b0\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00bc\b\n\u0001\u000b\u0004\u000b\u00bf\b\u000b\u000b"+
		"\u000b\f\u000b\u00c0\u0001\u000b\u0001\u000b\u0004\u000b\u00c5\b\u000b"+
		"\u000b\u000b\f\u000b\u00c6\u0005\u000b\u00c9\b\u000b\n\u000b\f\u000b\u00cc"+
		"\t\u000b\u0001\f\u0001\f\u0004\f\u00d0\b\f\u000b\f\f\f\u00d1\u0001\r\u0004"+
		"\r\u00d5\b\r\u000b\r\f\r\u00d6\u0001\r\u0001\r\u0004\r\u00db\b\r\u000b"+
		"\r\f\r\u00dc\u0001\u000e\u0001\u000e\u0004\u000e\u00e1\b\u000e\u000b\u000e"+
		"\f\u000e\u00e2\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00eb\b\u0010\u000b\u0010\f\u0010\u00ec\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u00f1\b\u0010\u000b\u0010\f\u0010\u00f2"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u00f7\b\u0011\u000b\u0011\f\u0011"+
		"\u00f8\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00ff"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0106\b\u0012\u0001\u0013\u0004\u0013\u0109\b\u0013\u000b\u0013"+
		"\f\u0013\u010a\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0116\b\u0015"+
		"\u0001\u0016\u0004\u0016\u0119\b\u0016\u000b\u0016\f\u0016\u011a\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u0120\b\u0017\u000b\u0017\f"+
		"\u0017\u0121\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0127\b\u0018"+
		"\u000b\u0018\f\u0018\u0128\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0135\b\u0019\u0001\u001a\u0004\u001a\u0138\b\u001a\u000b"+
		"\u001a\f\u001a\u0139\u0001\u001a\u0001\u001a\u0005\u001a\u013e\b\u001a"+
		"\n\u001a\f\u001a\u0141\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0149\b\u001b\n\u001b\f\u001b"+
		"\u014c\t\u001b\u0003\u001b\u014e\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u0153\b\u001b\u000b\u001b\f\u001b\u0154\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u015e\b\u001c\n\u001c\f\u001c\u0161\t\u001c\u0003\u001c\u0163"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u016f"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0178"+
		"\b \n \f \u017b\t \u0003 \u017d\b \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0005!\u0188\b!\n!\f!\u018b\t!\u0003!\u018d"+
		"\b!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0000"+
		"\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0002\u0002\u0000\u0015"+
		"\u0016\u0018\u0018\u0001\u0000&\'\u01b1\u0000I\u0001\u0000\u0000\u0000"+
		"\u0002^\u0001\u0000\u0000\u0000\u0004a\u0001\u0000\u0000\u0000\u0006g"+
		"\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000"+
		"\u0000\f\u007f\u0001\u0000\u0000\u0000\u000e\u00a4\u0001\u0000\u0000\u0000"+
		"\u0010\u00af\u0001\u0000\u0000\u0000\u0012\u00b1\u0001\u0000\u0000\u0000"+
		"\u0014\u00b5\u0001\u0000\u0000\u0000\u0016\u00be\u0001\u0000\u0000\u0000"+
		"\u0018\u00cd\u0001\u0000\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000"+
		"\u001c\u00de\u0001\u0000\u0000\u0000\u001e\u00e6\u0001\u0000\u0000\u0000"+
		" \u00e8\u0001\u0000\u0000\u0000\"\u00f4\u0001\u0000\u0000\u0000$\u0105"+
		"\u0001\u0000\u0000\u0000&\u0108\u0001\u0000\u0000\u0000(\u010e\u0001\u0000"+
		"\u0000\u0000*\u0115\u0001\u0000\u0000\u0000,\u0118\u0001\u0000\u0000\u0000"+
		".\u011f\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000\u00002\u0134"+
		"\u0001\u0000\u0000\u00004\u0137\u0001\u0000\u0000\u00006\u0142\u0001\u0000"+
		"\u0000\u00008\u0158\u0001\u0000\u0000\u0000:\u0166\u0001\u0000\u0000\u0000"+
		"<\u0168\u0001\u0000\u0000\u0000>\u016e\u0001\u0000\u0000\u0000@\u0170"+
		"\u0001\u0000\u0000\u0000B\u0180\u0001\u0000\u0000\u0000D\u0190\u0001\u0000"+
		"\u0000\u0000F\u0192\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000"+
		"IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005\u0000"+
		"\u0000\u0001N\u0001\u0001\u0000\u0000\u0000O_\u0003\u0004\u0002\u0000"+
		"P_\u0003\u0006\u0003\u0000Q_\u0003\u000e\u0007\u0000R_\u0003\u0012\t\u0000"+
		"S_\u0003\u0014\n\u0000T_\u0003\u0018\f\u0000U_\u0003\u001a\r\u0000V_\u0003"+
		"\u001e\u000f\u0000W_\u0003 \u0010\u0000X_\u0003\"\u0011\u0000Y_\u0003"+
		"2\u0019\u0000Z_\u00036\u001b\u0000[_\u0003@ \u0000\\_\u0003B!\u0000]_"+
		"\u0003\b\u0004\u0000^O\u0001\u0000\u0000\u0000^P\u0001\u0000\u0000\u0000"+
		"^Q\u0001\u0000\u0000\u0000^R\u0001\u0000\u0000\u0000^S\u0001\u0000\u0000"+
		"\u0000^T\u0001\u0000\u0000\u0000^U\u0001\u0000\u0000\u0000^V\u0001\u0000"+
		"\u0000\u0000^W\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000^Y\u0001"+
		"\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0003\u0001\u0000"+
		"\u0000\u0000`b\u0005\u0015\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0005\u0001\u0000\u0000f\u0005\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0019\u0000\u0000hi\u0003\n\u0005\u0000ij\u0005\u0002"+
		"\u0000\u0000jk\u0003\u0004\u0002\u0000k\u0007\u0001\u0000\u0000\u0000"+
		"lm\u00052\u0000\u0000mn\u00056\u0000\u0000no\u0005\u0003\u0000\u0000o"+
		"p\u0007\u0000\u0000\u0000pq\u0005\u0001\u0000\u0000q\t\u0001\u0000\u0000"+
		"\u0000rw\u0003\f\u0006\u0000st\u0007\u0001\u0000\u0000tv\u0003\f\u0006"+
		"\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x}\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005(\u0000\u0000{}\u0003\f\u0006\u0000|r\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u000b\u0001\u0000\u0000"+
		"\u0000~\u0080\u0005\u0015\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u001a\u0000\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085\u0086\u0005"+
		"\u0002\u0000\u0000\u0086\u0087\u0003\u0004\u0002\u0000\u0087\u00a5\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0005\u0004"+
		"\u0000\u0000\u008a\u008b\u0003\b\u0004\u0000\u008b\u008c\u0005\u0005\u0000"+
		"\u0000\u008c\u008d\u0003\n\u0005\u0000\u008d\u008e\u0005\u0005\u0000\u0000"+
		"\u008e\u008f\u0003\b\u0004\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090"+
		"\u0092\u0005\u0007\u0000\u0000\u0091\u0093\u0003\u0002\u0001\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\b\u0000\u0000\u0097\u00a5"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u00053\u0000\u0000\u0099\u009a\u0005"+
		"\u0004\u0000\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u009c\u0005\u0006"+
		"\u0000\u0000\u009c\u009e\u0005\u0007\u0000\u0000\u009d\u009f\u0003\u0002"+
		"\u0001\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\b\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u0083\u0001\u0000\u0000"+
		"\u0000\u00a4\u0088\u0001\u0000\u0000\u0000\u00a4\u0098\u0001\u0000\u0000"+
		"\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0016\u0000"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b0\u0005\t\u0000\u0000"+
		"\u00aa\u00ac\u0005\u0016\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0005\n\u0000\u0000\u00ae\u00b0\u00054\u0000\u0000\u00af"+
		"\u00a7\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\u001b\u0000\u0000\u00b2\u00b3\u0003&\u0013\u0000\u00b3\u00b4"+
		"\u0005\u0001\u0000\u0000\u00b4\u0013\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0003\u0004\u0002\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00bb"+
		"\u0005\u0002\u0000\u0000\u00b8\u00b9\u0005\u001e\u0000\u0000\u00b9\u00bc"+
		"\u0005\"\u0000\u0000\u00ba\u00bc\u0003\u0016\u000b\u0000\u00bb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u0015\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0005\u0015\u0000\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0005\u0002\u0000\u0000\u00c3\u00c5\u0005"+
		"\u0015\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0017\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003"+
		"(\u0014\u0000\u00ce\u00d0\u0003*\u0015\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u0019\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u0005\u0015\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00da\u0005\u000b\u0000\u0000\u00d9\u00db\u0003\u001c\u000e"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u001b\u0001\u0000\u0000\u0000\u00de\u00e0\u0005\f\u0000\u0000"+
		"\u00df\u00e1\u0005\u0015\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0001\u0000\u0000\u00e5\u001d\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0003,\u0016\u0000\u00e7\u001f\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ea\u0005\r\u0000\u0000\u00e9\u00eb\u0005\u0015\u0000\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005\u000b\u0000\u0000\u00ef\u00f1"+
		"\u0003\u001c\u000e\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3!\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005"+
		"\u000e\u0000\u0000\u00f5\u00f7\u0005\u0015\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\u0001\u0000\u0000\u00fb#\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0005#\u0000\u0000\u00fd\u00ff\u0005\u0017\u0000"+
		"\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0106\u0005$\u0000\u0000"+
		"\u0101\u0102\u0005\u0016\u0000\u0000\u0102\u0106\u0005$\u0000\u0000\u0103"+
		"\u0104\u0005\u0016\u0000\u0000\u0104\u0106\u0005%\u0000\u0000\u0105\u00fc"+
		"\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106%\u0001\u0000\u0000\u0000\u0107\u0109\u0005"+
		"\u0015\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"\u0018\u0000\u0000\u010d\'\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u000f"+
		"\u0000\u0000\u010f\u0110\u0003.\u0017\u0000\u0110)\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0010\u0000\u0000\u0112\u0116\u00030\u0018\u0000\u0113"+
		"\u0114\u0005\u000f\u0000\u0000\u0114\u0116\u0003.\u0017\u0000\u0115\u0111"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116+\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0005\u0015\u0000\u0000\u0118\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005\u0001\u0000\u0000\u011d-\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0005\u0015\u0000\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0005\u0001\u0000\u0000\u0124/\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0005\u0015\u0000\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u0011\u0000\u0000\u012b1\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005)\u0000\u0000\u012d\u0135\u00034\u001a\u0000\u012e\u012f"+
		"\u0005*\u0000\u0000\u012f\u0135\u00034\u001a\u0000\u0130\u0131\u0005+"+
		"\u0000\u0000\u0131\u0135\u00034\u001a\u0000\u0132\u0133\u0005,\u0000\u0000"+
		"\u0133\u0135\u00034\u001a\u0000\u0134\u012c\u0001\u0000\u0000\u0000\u0134"+
		"\u012e\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u01353\u0001\u0000\u0000\u0000\u0136\u0138"+
		"\u0005\u0015\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013f\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u00055\u0000\u0000\u013c\u013e\u0005\u0018\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u01405\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0005/\u0000"+
		"\u0000\u0143\u0144\u0005\u0015\u0000\u0000\u0144\u014d\u0005\u0004\u0000"+
		"\u0000\u0145\u014a\u0003:\u001d\u0000\u0146\u0147\u0005\u0002\u0000\u0000"+
		"\u0147\u0149\u0003:\u001d\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149"+
		"\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014d\u0145\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\u0006\u0000\u0000\u0150\u0152\u0005\u0007\u0000\u0000\u0151"+
		"\u0153\u0003\u0002\u0001\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0005\b\u0000\u0000\u01577\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005\u0015\u0000\u0000\u0159\u0162\u0005\u0004\u0000\u0000\u015a\u015f"+
		"\u0003<\u001e\u0000\u015b\u015c\u0005\u0002\u0000\u0000\u015c\u015e\u0003"+
		"<\u001e\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0162\u015a\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0006"+
		"\u0000\u0000\u01659\u0001\u0000\u0000\u0000\u0166\u0167\u00056\u0000\u0000"+
		"\u0167;\u0001\u0000\u0000\u0000\u0168\u0169\u0003>\u001f\u0000\u0169="+
		"\u0001\u0000\u0000\u0000\u016a\u016f\u0005\u0015\u0000\u0000\u016b\u016f"+
		"\u0005\u0016\u0000\u0000\u016c\u016f\u0005\u0018\u0000\u0000\u016d\u016f"+
		"\u00038\u001c\u0000\u016e\u016a\u0001\u0000\u0000\u0000\u016e\u016b\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016d\u0001"+
		"\u0000\u0000\u0000\u016f?\u0001\u0000\u0000\u0000\u0170\u0171\u00050\u0000"+
		"\u0000\u0171\u0172\u00056\u0000\u0000\u0172\u0173\u0005\u0003\u0000\u0000"+
		"\u0173\u017c\u0005\u0012\u0000\u0000\u0174\u0179\u0003D\"\u0000\u0175"+
		"\u0176\u0005\u0002\u0000\u0000\u0176\u0178\u0003D\"\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017d"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0174"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0013\u0000\u0000\u017fA\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u00051\u0000\u0000\u0181\u0182\u00056\u0000"+
		"\u0000\u0182\u0183\u0005\u0003\u0000\u0000\u0183\u018c\u0005\u0007\u0000"+
		"\u0000\u0184\u0189\u0003F#\u0000\u0185\u0186\u0005\u0002\u0000\u0000\u0186"+
		"\u0188\u0003F#\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018b\u0001"+
		"\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001"+
		"\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018c\u0184\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"\b\u0000\u0000\u018fC\u0001\u0000\u0000\u0000\u0190\u0191\u0003>\u001f"+
		"\u0000\u0191E\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u0018\u0000\u0000"+
		"\u0193\u0194\u0005\u000b\u0000\u0000\u0194\u0195\u0003>\u001f\u0000\u0195"+
		"G\u0001\u0000\u0000\u0000+K^cw|\u0081\u0094\u00a0\u00a4\u00a7\u00ab\u00af"+
		"\u00bb\u00c0\u00c6\u00ca\u00d1\u00d6\u00dc\u00e2\u00ec\u00f2\u00f8\u00fe"+
		"\u0105\u010a\u0115\u011a\u0121\u0128\u0134\u0139\u013f\u014a\u014d\u0154"+
		"\u015f\u0162\u016e\u0179\u017c\u0189\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}