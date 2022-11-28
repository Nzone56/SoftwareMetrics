// Generated from C:/Users/gaenr/IdeaProjects/javascr/grammar\JavaScript.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryStatement0}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement0(JavaScriptParser.TryStatement0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclareStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclareStatement(JavaScriptParser.VariableDeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement0}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement0(JavaScriptParser.BlockStatement0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaScriptParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(JavaScriptParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaScriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(JavaScriptParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelledStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelledStatement(JavaScriptParser.LabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainFunction}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(JavaScriptParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noopStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoopStatement(JavaScriptParser.NoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consoleLogStatement}
	 * labeled alternative in {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLogStatement(JavaScriptParser.ConsoleLogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(JavaScriptParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaScriptParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(JavaScriptParser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaScriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#variableDeclaratorVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorVar(JavaScriptParser.VariableDeclaratorVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaScriptParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression2}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression2(JavaScriptParser.UnaryExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(JavaScriptParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpression2}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression2(JavaScriptParser.PrimaryExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postUpdateExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUpdateExpression(JavaScriptParser.PostUpdateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclarationExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationExpression(JavaScriptParser.FunctionDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexorExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexorExpression(JavaScriptParser.IndexorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseLogicExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseLogicExpression(JavaScriptParser.BitwiseLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitwiseShiftExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseShiftExpression(JavaScriptParser.BitwiseShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndExpression(JavaScriptParser.LogicAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrExpression(JavaScriptParser.LogicOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicEqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicEqualityExpression(JavaScriptParser.LogicEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(JavaScriptParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(JavaScriptParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpression(JavaScriptParser.PropertyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link JavaScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(JavaScriptParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaScriptParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaScriptParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(JavaScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaScriptParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(JavaScriptParser.IdContext ctx);
}