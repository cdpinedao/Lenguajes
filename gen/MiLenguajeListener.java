// Generated from C:/Users/ASUS/Desktop/Lenguajes de programacion/Lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MiLenguajeParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MiLenguajeParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funcion_principal}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_principal(MiLenguajeParser.Funcion_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funcion_principal}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_principal(MiLenguajeParser.Funcion_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(MiLenguajeParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(MiLenguajeParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(MiLenguajeParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(MiLenguajeParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(MiLenguajeParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(MiLenguajeParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(MiLenguajeParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(MiLenguajeParser.CaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declarar_instancia}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_instancia(MiLenguajeParser.Declarar_instanciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declarar_instancia}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_instancia(MiLenguajeParser.Declarar_instanciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instanciar}.
	 * @param ctx the parse tree
	 */
	void enterInstanciar(MiLenguajeParser.InstanciarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instanciar}.
	 * @param ctx the parse tree
	 */
	void exitInstanciar(MiLenguajeParser.InstanciarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(MiLenguajeParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(MiLenguajeParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(MiLenguajeParser.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(MiLenguajeParser.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(MiLenguajeParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(MiLenguajeParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(MiLenguajeParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(MiLenguajeParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(MiLenguajeParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(MiLenguajeParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(MiLenguajeParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(MiLenguajeParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#cond_si}.
	 * @param ctx the parse tree
	 */
	void enterCond_si(MiLenguajeParser.Cond_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#cond_si}.
	 * @param ctx the parse tree
	 */
	void exitCond_si(MiLenguajeParser.Cond_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(MiLenguajeParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(MiLenguajeParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(MiLenguajeParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(MiLenguajeParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#hacer_mientras}.
	 * @param ctx the parse tree
	 */
	void enterHacer_mientras(MiLenguajeParser.Hacer_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#hacer_mientras}.
	 * @param ctx the parse tree
	 */
	void exitHacer_mientras(MiLenguajeParser.Hacer_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar(MiLenguajeParser.SeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar(MiLenguajeParser.SeleccionarContext ctx);
}