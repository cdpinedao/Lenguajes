// Generated from C:/Users/ASUS/Desktop/Lenguajes de programacion/Lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MiLenguajeParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funcion_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_principal(MiLenguajeParser.Funcion_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(MiLenguajeParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(MiLenguajeParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(MiLenguajeParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#caracter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracter(MiLenguajeParser.CaracterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declarar_instancia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_instancia(MiLenguajeParser.Declarar_instanciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instanciar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciar(MiLenguajeParser.InstanciarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(MiLenguajeParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(MiLenguajeParser.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(MiLenguajeParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(MiLenguajeParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(MiLenguajeParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(MiLenguajeParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#cond_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_si(MiLenguajeParser.Cond_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(MiLenguajeParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(MiLenguajeParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#hacer_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer_mientras(MiLenguajeParser.Hacer_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#seleccionar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar(MiLenguajeParser.SeleccionarContext ctx);
}