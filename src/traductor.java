import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class traductor extends MiLenguajeBaseListener{

    @Override
    public void enterInicio(MiLenguajeParser.InicioContext ctx) {
        System.out.println("package Main;");
        System.out.println("import java.util.*;");
        System.out.println("public class Main{");
    }

    @Override
    public void exitInicio(MiLenguajeParser.InicioContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterFuncion(MiLenguajeParser.FuncionContext ctx) {

        System.out.print("\tstatic ");
        for (int i = 1; i < ctx.children.size(); i++) {

            if (ctx.getChild(i).toString().equals("entero")){
                System.out.print("int ");
            }else if(ctx.getChild(i).toString().equals("real")){
                System.out.print("float ");
            }else if(ctx.getChild(i).toString().equals("booleano")) {
                System.out.print("boolean ");
            }else if(ctx.getChild(i).toString().equals("cadena")){
                    System.out.print("String ");
            }else if(ctx.getChild(i).toString().equals("caracter")){
                System.out.print("char ");
            }else if(ctx.getChild(i).toString().equals("hacer")) {
                System.out.println("{");
            }else if(ctx.getChild(i).toString().equals("retornar")){
                    System.out.print("return ");
            }else if(ctx.getChild(i).toString().equals("fin_funcion")){

            }else{
                System.out.print(ctx.getChild(i));
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    @Override
    public void exitFuncion(MiLenguajeParser.FuncionContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterFuncion_principal(MiLenguajeParser.Funcion_principalContext ctx) {


        System.out.println("public static void main(String[] args){");
        System.out.println("Scanner scanner = new Scanner(System.in);");
    }

    @Override
    public void exitFuncion_principal(MiLenguajeParser.Funcion_principalContext ctx) {
        System.out.println("}");

    }

    @Override
    public void enterEstructura(MiLenguajeParser.EstructuraContext ctx) {
        System.out.println("public static class " + ctx.ID() + "{");
    }

    @Override
    public void exitEstructura(MiLenguajeParser.EstructuraContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterEntero(MiLenguajeParser.EnteroContext ctx) {
        System.out.print("\tint ");
        for (int i = 1; i < ctx.children.size(); i++) {
            System.out.print(ctx.getChild(i));
        }
        System.out.println();
    }

    @Override
    public void exitEntero(MiLenguajeParser.EnteroContext ctx) {
        super.exitEntero(ctx);
    }

    @Override
    public void enterReal(MiLenguajeParser.RealContext ctx) {
        System.out.print("\tfloat ");
        for (int i = 1; i < ctx.children.size(); i++) {
            System.out.print(ctx.getChild(i));
        }
        System.out.println();
    }

    @Override
    public void exitReal(MiLenguajeParser.RealContext ctx) {
        super.exitReal(ctx);
    }

    @Override
    public void enterCaracter(MiLenguajeParser.CaracterContext ctx) {
        System.out.print("\tchar ");
        for (int i = 1; i < ctx.children.size(); i++) {
            System.out.print(ctx.getChild(i));
        }
        System.out.println();
    }

    @Override
    public void exitCaracter(MiLenguajeParser.CaracterContext ctx) {
        super.exitCaracter(ctx);
    }

    @Override
    public void enterAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        for (int i = 0; i < ctx.children.size(); i++) {
            System.out.print(ctx.getChild(i));
        }
        System.out.println();
    }

    @Override
    public void exitAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        super.exitAsignacion(ctx);
    }

    @Override
    public void enterDeclarar_instancia(MiLenguajeParser.Declarar_instanciaContext ctx) {
        System.out.print(ctx.getChild(0) + " " + ctx.getChild(1));
        System.out.println(" = new " + ctx.getChild(0) + "();");
    }

    @Override
    public void exitDeclarar_instancia(MiLenguajeParser.Declarar_instanciaContext ctx) {
        super.exitDeclarar_instancia(ctx);
    }

    @Override
    public void enterInstanciar(MiLenguajeParser.InstanciarContext ctx) {
        super.enterInstanciar(ctx);
    }

    @Override
    public void exitInstanciar(MiLenguajeParser.InstanciarContext ctx) {
        super.exitInstanciar(ctx);
    }

    @Override
    public void enterCadena(MiLenguajeParser.CadenaContext ctx) {
        System.out.print("\tString ");
        for (int i = 1; i < ctx.children.size(); i++) {
            System.out.print(ctx.getChild(i));
        }
        System.out.println();
    }

    @Override
    public void exitCadena(MiLenguajeParser.CadenaContext ctx) {
        super.exitCadena(ctx);
    }

    @Override
    public void enterBooleano(MiLenguajeParser.BooleanoContext ctx) {
        System.out.print("\tboolean ");
        for (int i = 1; i < ctx.children.size(); i++) {

            if (ctx.getChild(i).toString().equals("verdadero")){
                System.out.print("true");
            }else if(ctx.getChild(i).toString().equals("falso")){
                System.out.print("false");
            }else{
                System.out.print(ctx.getChild(i));
            }
        }
        System.out.println();
    }

    @Override
    public void exitBooleano(MiLenguajeParser.BooleanoContext ctx) {
        super.exitBooleano(ctx);
    }

    @Override
    public void enterLeer(MiLenguajeParser.LeerContext ctx) {

        System.out.println("Integer "+ctx.getChild(2)+" = scanner.nextLine();");
    }

    @Override
    public void exitLeer(MiLenguajeParser.LeerContext ctx) {
        super.exitLeer(ctx);
    }

    @Override
    public void enterImprimir(MiLenguajeParser.ImprimirContext ctx) {

            System.out.print("\tSystem.out.println");
            for (int i = 1; i < ctx.children.size(); i++) {
                if (ctx.getChild(i).toString().equals(",") ) {
                    System.out.print("+");
                } else {
                    System.out.print(ctx.getChild(i));

                }
            }
            System.out.println("");


    }

    @Override
    public void exitImprimir(MiLenguajeParser.ImprimirContext ctx) {

    }

    @Override
    public void enterCond_si(MiLenguajeParser.Cond_siContext ctx) {
        //System.out.println("CONTEXT: "+ctx.getChild(17).getClass());
        RuleContext rule = new RuleContext();
        //System.out.println(ctx.imprimir());
        //enterImprimir((MiLenguajeParser.ImprimirContext) ctx.getChild(15));
        System.out.print("\tif ");

        ParseTreeWalker walker = new ParseTreeWalker();

        //enterImprimir((MiLenguajeParser.ImprimirContext) ctx.getChild(15));
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i).toString().equals("fin_si")) {
                //System.out.println("\t}");
            }else if(ctx.getChild(i).toString().equals("entonces")) {
                System.out.print("{");
            }else if(ctx.getChild(i).toString().equals("si_no")){
                System.out.println("}else{");
            }else if(ctx.getChild(i).getChildCount()>0) {
                walker.walk(new traductor(), ctx.getChild(i));

            }else
            {
                System.out.print(ctx.getChild(i));
            }
        }
        System.out.println();
    }

    @Override
    public void exitCond_si(MiLenguajeParser.Cond_siContext ctx) {

        System.out.println("\t}");
    }

    @Override
    public void enterMientras(MiLenguajeParser.MientrasContext ctx) {
        System.out.print("\twhile ");
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i).toString().equals("fin_mientras")) {

            } else if (ctx.getChild(i).toString().equals("hacer")) {
                System.out.print("{");
            } else {
                System.out.print(ctx.getChild(i));
            }

        }
        System.out.println();
    }

    @Override
    public void exitMientras(MiLenguajeParser.MientrasContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterPara(MiLenguajeParser.ParaContext ctx) {
        System.out.print("\tfor ");
        int contador = 0;
        boolean forflag = true;
        for (int i = 1; i < ctx.children.size(); i++) {

            if(ctx.getChild(i).toString().equals(";") && forflag) {
                contador++;
                System.out.print(ctx.getChild(i));
            }else if (contador == 1){
                System.out.print(ctx.getChild(3).toString() + '=' + ctx.getChild(3) + '+' + ctx.getChild(i));
                contador = 0;
                forflag = false;
            }else if(ctx.getChild(i).toString().equals("fin_para")) {

            } else if (ctx.getChild(i).toString().equals("hacer")) {
                System.out.print("{");
            } else {
                System.out.print(ctx.getChild(i));
            }

        }
        System.out.println();
    }

    @Override
    public void exitPara(MiLenguajeParser.ParaContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterHacer_mientras(MiLenguajeParser.Hacer_mientrasContext ctx) {
        System.out.print("\tdo{");
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i).toString().equals("mientras")) {
                System.out.print("}while");
            } else if (ctx.getChild(i).toString().equals("hacer")) {

            } else {
                System.out.print(ctx.getChild(i));
            }
        }
        System.out.println();
    }


    @Override
    public void exitHacer_mientras(MiLenguajeParser.Hacer_mientrasContext ctx) {
        super.exitHacer_mientras(ctx);
    }

    @Override
    public void enterSeleccionar(MiLenguajeParser.SeleccionarContext ctx) {
        System.out.print("\tswitch ");
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i).toString().equals("fin_seleccionar")) {

            }else if (ctx.getChild(i).toString().equals("caso")) {
                System.out.print("case ");
            }else if (ctx.getChild(i).toString().equals("romper;")){
                System.out.println("break;");
            }else if (ctx.getChild(i).toString().equals("defecto")){
                System.out.print("default");

            } else if (ctx.getChild(i).toString().equals("entre")) {
                System.out.println("{");
            } else {
                System.out.print(ctx.getChild(i));
            }
        }
        System.out.println();
    }

    @Override
    public void exitSeleccionar(MiLenguajeParser.SeleccionarContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
