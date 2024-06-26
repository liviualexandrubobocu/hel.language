// Generated from Hel.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelParser}.
 */
public interface HelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#basicCommand}.
	 * @param ctx the parse tree
	 */
	void enterBasicCommand(HelParser.BasicCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#basicCommand}.
	 * @param ctx the parse tree
	 */
	void exitBasicCommand(HelParser.BasicCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#conditionalCommand}.
	 * @param ctx the parse tree
	 */
	void enterConditionalCommand(HelParser.ConditionalCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#conditionalCommand}.
	 * @param ctx the parse tree
	 */
	void exitConditionalCommand(HelParser.ConditionalCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(HelParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(HelParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpr(HelParser.ConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpr(HelParser.ConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HelParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HelParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#loopCommand}.
	 * @param ctx the parse tree
	 */
	void enterLoopCommand(HelParser.LoopCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#loopCommand}.
	 * @param ctx the parse tree
	 */
	void exitLoopCommand(HelParser.LoopCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(HelParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(HelParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#rememberCommand}.
	 * @param ctx the parse tree
	 */
	void enterRememberCommand(HelParser.RememberCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#rememberCommand}.
	 * @param ctx the parse tree
	 */
	void exitRememberCommand(HelParser.RememberCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#errorHandlingCommand}.
	 * @param ctx the parse tree
	 */
	void enterErrorHandlingCommand(HelParser.ErrorHandlingCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#errorHandlingCommand}.
	 * @param ctx the parse tree
	 */
	void exitErrorHandlingCommand(HelParser.ErrorHandlingCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#customErrorHandling}.
	 * @param ctx the parse tree
	 */
	void enterCustomErrorHandling(HelParser.CustomErrorHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#customErrorHandling}.
	 * @param ctx the parse tree
	 */
	void exitCustomErrorHandling(HelParser.CustomErrorHandlingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#interactiveCommand}.
	 * @param ctx the parse tree
	 */
	void enterInteractiveCommand(HelParser.InteractiveCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#interactiveCommand}.
	 * @param ctx the parse tree
	 */
	void exitInteractiveCommand(HelParser.InteractiveCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#complexTask}.
	 * @param ctx the parse tree
	 */
	void enterComplexTask(HelParser.ComplexTaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#complexTask}.
	 * @param ctx the parse tree
	 */
	void exitComplexTask(HelParser.ComplexTaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#subtask}.
	 * @param ctx the parse tree
	 */
	void enterSubtask(HelParser.SubtaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#subtask}.
	 * @param ctx the parse tree
	 */
	void exitSubtask(HelParser.SubtaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#contextAwareCommand}.
	 * @param ctx the parse tree
	 */
	void enterContextAwareCommand(HelParser.ContextAwareCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#contextAwareCommand}.
	 * @param ctx the parse tree
	 */
	void exitContextAwareCommand(HelParser.ContextAwareCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#modularTaskDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModularTaskDefinition(HelParser.ModularTaskDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#modularTaskDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModularTaskDefinition(HelParser.ModularTaskDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#modularTaskExecution}.
	 * @param ctx the parse tree
	 */
	void enterModularTaskExecution(HelParser.ModularTaskExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#modularTaskExecution}.
	 * @param ctx the parse tree
	 */
	void exitModularTaskExecution(HelParser.ModularTaskExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#timeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterTimeSpecification(HelParser.TimeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#timeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitTimeSpecification(HelParser.TimeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#thatStatement}.
	 * @param ctx the parse tree
	 */
	void enterThatStatement(HelParser.ThatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#thatStatement}.
	 * @param ctx the parse tree
	 */
	void exitThatStatement(HelParser.ThatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#dialog}.
	 * @param ctx the parse tree
	 */
	void enterDialog(HelParser.DialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#dialog}.
	 * @param ctx the parse tree
	 */
	void exitDialog(HelParser.DialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#dialogStep}.
	 * @param ctx the parse tree
	 */
	void enterDialogStep(HelParser.DialogStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#dialogStep}.
	 * @param ctx the parse tree
	 */
	void exitDialogStep(HelParser.DialogStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#contextCommand}.
	 * @param ctx the parse tree
	 */
	void enterContextCommand(HelParser.ContextCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#contextCommand}.
	 * @param ctx the parse tree
	 */
	void exitContextCommand(HelParser.ContextCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#userCommand}.
	 * @param ctx the parse tree
	 */
	void enterUserCommand(HelParser.UserCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#userCommand}.
	 * @param ctx the parse tree
	 */
	void exitUserCommand(HelParser.UserCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#agentCommand}.
	 * @param ctx the parse tree
	 */
	void enterAgentCommand(HelParser.AgentCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#agentCommand}.
	 * @param ctx the parse tree
	 */
	void exitAgentCommand(HelParser.AgentCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#crudCommand}.
	 * @param ctx the parse tree
	 */
	void enterCrudCommand(HelParser.CrudCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#crudCommand}.
	 * @param ctx the parse tree
	 */
	void exitCrudCommand(HelParser.CrudCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(HelParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(HelParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(HelParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(HelParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HelParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HelParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(HelParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(HelParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(HelParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(HelParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(HelParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(HelParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#dictionaryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryDeclaration(HelParser.DictionaryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#dictionaryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryDeclaration(HelParser.DictionaryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HelParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HelParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(HelParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(HelParser.KeyValuePairContext ctx);
}