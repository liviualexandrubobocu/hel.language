// Generated from hel.g4 by ANTLR 4.13.1

package com.hel.language;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helParser}.
 */
public interface helListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(helParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(helParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(helParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(helParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#basicCommand}.
	 * @param ctx the parse tree
	 */
	void enterBasicCommand(helParser.BasicCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#basicCommand}.
	 * @param ctx the parse tree
	 */
	void exitBasicCommand(helParser.BasicCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#conditionalCommand}.
	 * @param ctx the parse tree
	 */
	void enterConditionalCommand(helParser.ConditionalCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#conditionalCommand}.
	 * @param ctx the parse tree
	 */
	void exitConditionalCommand(helParser.ConditionalCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(helParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(helParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpr(helParser.ConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpr(helParser.ConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(helParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(helParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#loopCommand}.
	 * @param ctx the parse tree
	 */
	void enterLoopCommand(helParser.LoopCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#loopCommand}.
	 * @param ctx the parse tree
	 */
	void exitLoopCommand(helParser.LoopCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(helParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(helParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#rememberCommand}.
	 * @param ctx the parse tree
	 */
	void enterRememberCommand(helParser.RememberCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#rememberCommand}.
	 * @param ctx the parse tree
	 */
	void exitRememberCommand(helParser.RememberCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#errorHandlingCommand}.
	 * @param ctx the parse tree
	 */
	void enterErrorHandlingCommand(helParser.ErrorHandlingCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#errorHandlingCommand}.
	 * @param ctx the parse tree
	 */
	void exitErrorHandlingCommand(helParser.ErrorHandlingCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#customErrorHandling}.
	 * @param ctx the parse tree
	 */
	void enterCustomErrorHandling(helParser.CustomErrorHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#customErrorHandling}.
	 * @param ctx the parse tree
	 */
	void exitCustomErrorHandling(helParser.CustomErrorHandlingContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#interactiveCommand}.
	 * @param ctx the parse tree
	 */
	void enterInteractiveCommand(helParser.InteractiveCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#interactiveCommand}.
	 * @param ctx the parse tree
	 */
	void exitInteractiveCommand(helParser.InteractiveCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#complexTask}.
	 * @param ctx the parse tree
	 */
	void enterComplexTask(helParser.ComplexTaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#complexTask}.
	 * @param ctx the parse tree
	 */
	void exitComplexTask(helParser.ComplexTaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#subtask}.
	 * @param ctx the parse tree
	 */
	void enterSubtask(helParser.SubtaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#subtask}.
	 * @param ctx the parse tree
	 */
	void exitSubtask(helParser.SubtaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#contextAwareCommand}.
	 * @param ctx the parse tree
	 */
	void enterContextAwareCommand(helParser.ContextAwareCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#contextAwareCommand}.
	 * @param ctx the parse tree
	 */
	void exitContextAwareCommand(helParser.ContextAwareCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#modularTaskDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModularTaskDefinition(helParser.ModularTaskDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#modularTaskDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModularTaskDefinition(helParser.ModularTaskDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#modularTaskExecution}.
	 * @param ctx the parse tree
	 */
	void enterModularTaskExecution(helParser.ModularTaskExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#modularTaskExecution}.
	 * @param ctx the parse tree
	 */
	void exitModularTaskExecution(helParser.ModularTaskExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#timeSpecification}.
	 * @param ctx the parse tree
	 */
	void enterTimeSpecification(helParser.TimeSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#timeSpecification}.
	 * @param ctx the parse tree
	 */
	void exitTimeSpecification(helParser.TimeSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#thatStatement}.
	 * @param ctx the parse tree
	 */
	void enterThatStatement(helParser.ThatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#thatStatement}.
	 * @param ctx the parse tree
	 */
	void exitThatStatement(helParser.ThatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#dialog}.
	 * @param ctx the parse tree
	 */
	void enterDialog(helParser.DialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#dialog}.
	 * @param ctx the parse tree
	 */
	void exitDialog(helParser.DialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#dialogStep}.
	 * @param ctx the parse tree
	 */
	void enterDialogStep(helParser.DialogStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#dialogStep}.
	 * @param ctx the parse tree
	 */
	void exitDialogStep(helParser.DialogStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#contextCommand}.
	 * @param ctx the parse tree
	 */
	void enterContextCommand(helParser.ContextCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#contextCommand}.
	 * @param ctx the parse tree
	 */
	void exitContextCommand(helParser.ContextCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#userCommand}.
	 * @param ctx the parse tree
	 */
	void enterUserCommand(helParser.UserCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#userCommand}.
	 * @param ctx the parse tree
	 */
	void exitUserCommand(helParser.UserCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#agentCommand}.
	 * @param ctx the parse tree
	 */
	void enterAgentCommand(helParser.AgentCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#agentCommand}.
	 * @param ctx the parse tree
	 */
	void exitAgentCommand(helParser.AgentCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#crudCommand}.
	 * @param ctx the parse tree
	 */
	void enterCrudCommand(helParser.CrudCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#crudCommand}.
	 * @param ctx the parse tree
	 */
	void exitCrudCommand(helParser.CrudCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(helParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(helParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(helParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(helParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(helParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(helParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(helParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(helParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(helParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(helParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(helParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(helParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(helParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(helParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#dictionaryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryDeclaration(helParser.DictionaryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#dictionaryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryDeclaration(helParser.DictionaryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(helParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(helParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link helParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(helParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link helParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(helParser.KeyValuePairContext ctx);
}