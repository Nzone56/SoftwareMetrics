// Generated from C:/Users/gaenr/IdeaProjects/javascr/grammar\JavaScript.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryStatement0}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement0(JavaScriptParser.TryStatement0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tryStatement0}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement0(JavaScriptParser.TryStatement0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclareStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclareStatement(JavaScriptParser.VariableDeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclareStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclareStatement(JavaScriptParser.VariableDeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStatement0}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement0(JavaScriptParser.BlockStatement0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStatement0}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement0(JavaScriptParser.BlockStatement0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(JavaScriptParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(JavaScriptParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(JavaScriptParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(JavaScriptParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelledStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(JavaScriptParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelledStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(JavaScriptParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainFunction}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(JavaScriptParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFunction}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(JavaScriptParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noopStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNoopStatement(JavaScriptParser.NoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noopStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNoopStatement(JavaScriptParser.NoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consoleLogStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLogStatement(JavaScriptParser.ConsoleLogStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consoleLogStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLogStatement(JavaScriptParser.ConsoleLogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JavaScriptParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JavaScriptParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaScriptParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaScriptParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(JavaScriptParser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(JavaScriptParser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableDeclaratorVar}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorVar(JavaScriptParser.VariableDeclaratorVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableDeclaratorVar}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorVar(JavaScriptParser.VariableDeclaratorVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaScriptParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaScriptParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression2}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression2(JavaScriptParser.UnaryExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression2}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression2(JavaScriptParser.UnaryExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpression2}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression2(JavaScriptParser.PrimaryExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpression2}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression2(JavaScriptParser.PrimaryExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postUpdateExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostUpdateExpression(JavaScriptParser.PostUpdateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postUpdateExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostUpdateExpression(JavaScriptParser.PostUpdateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarationExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationExpression(JavaScriptParser.FunctionDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarationExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationExpression(JavaScriptParser.FunctionDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexorExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexorExpression(JavaScriptParser.IndexorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexorExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexorExpression(JavaScriptParser.IndexorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseLogicExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseLogicExpression(JavaScriptParser.BitwiseLogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseLogicExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseLogicExpression(JavaScriptParser.BitwiseLogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseShiftExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseShiftExpression(JavaScriptParser.BitwiseShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseShiftExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseShiftExpression(JavaScriptParser.BitwiseShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExpression(JavaScriptParser.LogicAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExpression(JavaScriptParser.LogicAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrExpression(JavaScriptParser.LogicOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrExpression(JavaScriptParser.LogicOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicEqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicEqualityExpression(JavaScriptParser.LogicEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicEqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicEqualityExpression(JavaScriptParser.LogicEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(JavaScriptParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(JavaScriptParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpression(JavaScriptParser.PropertyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpression(JavaScriptParser.PropertyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(JavaScriptParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(JavaScriptParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaScriptParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaScriptParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaScriptParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaScriptParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(JavaScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(JavaScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(JavaScriptParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(JavaScriptParser.IdContext ctx);
}