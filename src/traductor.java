import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class traductor extends MiLenguajeBaseListener{

    @Override
    public void enterInicio(MiLenguajeParser.InicioContext ctx) {

    }

    @Override
    public void exitInicio(MiLenguajeParser.InicioContext ctx) {

    }

    @Override
    public void enterFuncion(MiLenguajeParser.FuncionContext ctx) {

    }

    @Override
    public void exitFuncion(MiLenguajeParser.FuncionContext ctx) {

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
        System.out.println("public class " + ctx.ID(0) + "{");
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
        super.enterDeclarar_instancia(ctx);
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
            if (ctx.getChild(i).toString().equals(",")){
                System.out.print("+");
            }else{
                System.out.print(ctx.getChild(i));
            }
        }
        System.out.println("");
    }

    @Override
    public void exitImprimir(MiLenguajeParser.ImprimirContext ctx) {
        super.exitImprimir(ctx);
    }

    @Override
    public void enterCond_si(MiLenguajeParser.Cond_siContext ctx) {
        System.out.print("\tif ");

        //System.out.println(ctx.children.toString());

        //enterImprimir((MiLenguajeParser.ImprimirContext) ctx.getChild(15));

        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i).toString().equals("fin_si")) {

            }else if(ctx.getChild(i).toString().equals("entonces")) {
                System.out.print("{");
            }else if(ctx.getChild(i).toString().equals("si_no")){
                System.out.print("}else{");
            }else{
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
