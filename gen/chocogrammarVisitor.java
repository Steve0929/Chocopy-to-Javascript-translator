// Generated from D:/Documents/Tareas/NOVENA_MATRICULA/Lenguajes_de_programacion/Practicas/Chocopy-to-Javascript-translator/Grammar\chocogrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link chocogrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface chocogrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(chocogrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(chocogrammarParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(chocogrammarParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(chocogrammarParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(chocogrammarParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#typed_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_var(chocogrammarParser.Typed_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(chocogrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#global_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_decl(chocogrammarParser.Global_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_decl(chocogrammarParser.Nonlocal_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(chocogrammarParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(chocogrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#if_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expr(chocogrammarParser.If_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#while_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_expr(chocogrammarParser.While_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#for_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_expr(chocogrammarParser.For_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(chocogrammarParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#asig_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig_stmt(chocogrammarParser.Asig_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass(chocogrammarParser.PassContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#return_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_st(chocogrammarParser.Return_stContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(chocogrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(chocogrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(chocogrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(chocogrammarParser.Not_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpr(chocogrammarParser.CexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(chocogrammarParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocogrammarParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(chocogrammarParser.TargetContext ctx);
}