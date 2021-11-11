import java.util.ArrayList;
import java.util.HashMap;

public class ConversorTercetoAssembler {

    private ArrayList<Terceto> tercetos;
    private HashMap<Integer,Token> tablaDeSimbolos;

    private StringBuilder code;

    public ConversorTercetoAssembler(ArrayList<Terceto> tercetos , HashMap<Integer,Token> tablaDeSimbolos ) {
        this.tercetos = tercetos;
        this.tablaDeSimbolos = tablaDeSimbolos;
    }


    public String getConversionAssembler()
    {
        StringBuilder assembler = new StringBuilder();
        assembler.append(this.getEncabezadoAssembler());
        assembler.append("\n");
        assembler.append(this.getZonaDatosAssembler());
        assembler.append("\n");
        assembler.append(this.getZonaCodigoAssembler());
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
        for(int i = 0; i < this.tercetos.size(); i++) // por cada uno de los tecetos vamos generando el codigo
        {
            tercetoActual = tercetos.get(i);
            String operando = String.valueOf(tercetoActual.getT1());
            switch (operando){

                case "+": case "*": case "-": case ":=": case "<": case ">": case "<=": case ">=": case "==":

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
