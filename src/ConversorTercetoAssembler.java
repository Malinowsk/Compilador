import java.util.ArrayList;
import java.util.HashMap;

public class ConversorTercetoAssembler {

    private ArrayList<Terceto> tercetos;
    private TablaSimbolo tablaDeSimbolos;

    private StringBuilder code;

    public ConversorTercetoAssembler(ArrayList<Terceto> tercetos , TablaSimbolo tablaDeSimbolos ) {
        this.tercetos = tercetos;
        this.tablaDeSimbolos = tablaDeSimbolos;
    }


    public String getConversionAssembler()
    {
        StringBuilder assembler = new StringBuilder();
        assembler.append(this.getEncabezadoAssembler());
        assembler.append("\n");

        String zonaCodigo = this.getZonaCodigoAssembler();
        String zonaDatos = this.getZonaDatosAssembler();

        assembler.append(zonaDatos);
        assembler.append("\n");
        assembler.append(zonaCodigo);
        assembler.append("\n");
        return assembler.toString();
    }

    private String getEncabezadoAssembler()
    {
        StringBuilder encabezado = new StringBuilder();
        encabezado.append(".386");
        encabezado.append("\n");
        encabezado.append(".model flat, stdcall ; Indica el tamaño de programa");
        encabezado.append("\n");
        encabezado.append(".STACK 200h ; Inicializa Stacken dir.indicada");
        encabezado.append("\n");
        encabezado.append("option casemap :none");
        encabezado.append("\n");
        encabezado.append("include \\masm32\\include\\windows.inc");
        encabezado.append("\n");
        encabezado.append("include \\masm32\\include\\kernel32.inc");
        encabezado.append("\n");
        encabezado.append("include \\masm32\\include\\user32.inc");
        encabezado.append("\n");
        encabezado.append("includelib \\masm32\\lib\\kernel32.lib");
        encabezado.append("\n");
        encabezado.append("includelib \\masm32\\lib\\user32.lib");
        encabezado.append("\n");
        encabezado.append("include \\masm32\\include\\masm32rt.inc");
        encabezado.append("\n");
        encabezado.append("dll_dllcrt0 PROTO C");
        encabezado.append("\n");
        encabezado.append("printf PROTO C :VARARG");
        encabezado.append("\n");
        return encabezado.toString();
    }

    private String getZonaDatosAssembler()
    {
        return "";
    }

    private String getZonaCodigoAssembler()
    {
        this.code.append(".code");
        this.code.append("\n");
        this.code.append("START:");
        this.code.append("\n");
        Terceto tercetoActual;
        int contadorAuxiliar=0;
        for(int i = 0; i < this.tercetos.size(); i++) // por cada uno de los tecetos vamos generando el codigo
        {
            tercetoActual = tercetos.get(i);
            String operador = tablaDeSimbolos.obtenerValor(tercetoActual.getT1().ival);
            switch (operador){

                case "+": {
                    //SUMA ENTRE ENTEROS
                    String operando1="";
                    if(tercetoActual.getT2().ival!=0) {//t2 apunta a tabla -> Siendo una variable o constante
                        operando1 =tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival);
                        if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getUso()!=null) //Significa que es una variable y no una constante
                            operando1 = "_" + operando1; // le agrego el guíon adelante por ser variable
                    }else//t2 apunta a auxiliar -> Siendo un puntero a otro terceto
                        operando1 = tercetos.get(tercetoActual.getT2().ival).getAuxiliar();
                    this.code.append("MOV R1, "+operando1);

                    String operando2="";
                    if(tercetoActual.getT3().ival!=0) {//t3 apunta a tabla  -> Siendo una variable o constante
                        operando2 = tablaDeSimbolos.obtenerValor(tercetoActual.getT3().ival);
                        if (tablaDeSimbolos.obtenerToken(tercetoActual.getT3().ival).getUso() != null) //Significa que es una variable y no una constante
                            operando2 = "_" + operando2; // le agrego el guíon adelante por ser variable
                    }else//t3 apunta a auxiliar -> Siendo un puntero a otro terceto
                        operando2 =tercetos.get(tercetoActual.getT3().ival).getAuxiliar();
                    this.code.append("ADD R1, "+operando2);

                    this.code.append("MOV @aux"+ contadorAuxiliar +", R1");
                    tercetos.get(i).setAuxiliar("@aux"+contadorAuxiliar);
                    contadorAuxiliar++;
                    break;
                }

                case "*": case "-": case ":=": case "<": case ">": case "<=": case ">=": case "==":

                    break;

                case "/":

                    break;

                case "BF":

                    break;

                case "BI":

                    break;

                case "BT":

                    break;

                case "CALL":

                    break;

                case "DOBLE":

                    break;

                case "PRINT":

                    break;

                default:

            }

        }




        return "";
    }

}
