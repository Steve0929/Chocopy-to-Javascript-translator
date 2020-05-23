// Generated from C:/Users/Mike/IdeaProjects/Chocopy-to-Javascript-translator/Grammar\chocogrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link chocogrammarParser}.
 */
public interface chocogrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(chocogrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(chocogrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(chocogrammarParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(chocogrammarParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(chocogrammarParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(chocogrammarParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(chocogrammarParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(chocogrammarParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(chocogrammarParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(chocogrammarParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void enterTyped_var(chocogrammarParser.Typed_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void exitTyped_var(chocogrammarParser.Typed_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(chocogrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(chocogrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_decl(chocogrammarParser.Global_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_decl(chocogrammarParser.Global_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_decl(chocogrammarParser.Nonlocal_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_decl(chocogrammarParser.Nonlocal_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(chocogrammarParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(chocogrammarParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(chocogrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(chocogrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(chocogrammarParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(chocogrammarParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expr(chocogrammarParser.While_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#while_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expr(chocogrammarParser.While_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void enterFor_expr(chocogrammarParser.For_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#for_expr}.
	 * @param ctx the parse tree
	 */
	void exitFor_expr(chocogrammarParser.For_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(chocogrammarParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(chocogrammarParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#asig_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsig_stmt(chocogrammarParser.Asig_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#asig_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsig_stmt(chocogrammarParser.Asig_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#return_st}.
	 * @param ctx the parse tree
	 */
	void enterReturn_st(chocogrammarParser.Return_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#return_st}.
	 * @param ctx the parse tree
	 */
	void exitReturn_st(chocogrammarParser.Return_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(chocogrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(chocogrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(chocogrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(chocogrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(chocogrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(chocogrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot_expr(chocogrammarParser.Not_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot_expr(chocogrammarParser.Not_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(chocogrammarParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(chocogrammarParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(chocogrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(chocogrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(chocogrammarParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(chocogrammarParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocogrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(chocogrammarParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocogrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(chocogrammarParser.TargetContext ctx);
}