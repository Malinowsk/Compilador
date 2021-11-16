import java.util.ArrayList;
import java.util.HashMap;

public class ConversorTercetoAssembler {

    private ArrayList<Terceto> tercetos;
    private TablaSimbolo tablaDeSimbolos;

    private StringBuilder code;

    private int contadorAuxiliar;

    public ConversorTercetoAssembler(ArrayList<Terceto> tercetos , TablaSimbolo tablaDeSimbolos ) {
        this.tercetos = tercetos;
        this.tablaDeSimbolos = tablaDeSimbolos;
        contadorAuxiliar=0;
        this.code= new StringBuilder();
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
        StringBuilder datos = new StringBuilder();
        datos.append(".data");
        datos.append("\n");

        for(int i = 287 ; i<= tablaDeSimbolos.refUltimoToken() ;i++){
            String lexema = tablaDeSimbolos.obtenerValor(i);
            //System.out.println(tablaDeSimbolos.obtenerToken(i).getUso());
            //System.out.println(" ");
            if(tablaDeSimbolos.obtenerToken(i)!=null) {
                if (tablaDeSimbolos.obtenerToken(i).getUso() == "variable" || tablaDeSimbolos.obtenerToken(i).getUso() == "parametro") {
                    if (tablaDeSimbolos.obtenerToken(i).getTipo() == "ULONG") {
                        datos.append("_" + lexema + " DD ?" + "\n");
                    } else {
                        datos.append("_" + lexema + " DQ ?" + "\n");
                    }
                } else {
                    if (tablaDeSimbolos.obtenerToken(i).getUso() == "cadena") {
                        datos.append(lexema + " DB " + "\"" + lexema + "\"" + " , 0 " + "\n");
                    }
                }
            }
        }

        for(Terceto t : tercetos){
            if(t.getAuxiliar()!=null){
                if(t.getT2().sval=="ULONG"){
                    datos.append(t.getAuxiliar() + " DD ?" + "\n");
                }
                else{
                    datos.append(t.getAuxiliar() + " DQ ?" + "\n");
                }
            }
        }

        datos.append("\n");
        return datos.toString();
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
            String operador = "";
            if(tercetoActual.getT1().ival >= 0)
                operador = tablaDeSimbolos.obtenerValor(tercetoActual.getT1().ival);
            else{
                if(tercetoActual.getT1().ival == -1)
                    operador = "BF";
                if(tercetoActual.getT1().ival == -2)
                    operador = "BI";
                if(tercetoActual.getT1().ival == -3)
                    operador = "BT";
            }

            switch (operador){

                case "+": {//TODO: Overflow en sumas de enteros
                    if(tercetoActual.getT2().sval=="ULONG")
                        operacionAritmetica("ADD", tercetoActual);
                    break;
                }

                case "-": {
                    if(tercetoActual.getT2().sval=="ULONG")
                        operacionAritmetica("SUB", tercetoActual);
                    break;
                }

                case "*": {
                    if(tercetoActual.getT2().sval=="ULONG")
                        operacionAritmetica_Mul_Div("MUL", tercetoActual);
                    break;
                }

                case "/": {
                    if(tercetoActual.getT2().sval=="ULONG")
                        operacionAritmetica_Mul_Div("DIV", tercetoActual);
                    break;
                }

                case ":=": {
                    if(tercetoActual.getT2().sval=="ULONG")
                        asignacion(tercetoActual);
                    break;
                }

                case "<": case ">": case "<=": case ">=": case "==":

                    break;

                case "BF":

                    break;

                case "BI":

                    break;

                case "BT":

                    break;

                case "CALL":

                    break;

                case "DOUBLE": {
                    String referenciaTerceto = String.valueOf(tercetoActual.getT2().dval);
                    referenciaTerceto=referenciaTerceto.substring(0,referenciaTerceto.length()-2);
                    this.code.append("FLD "+tercetos.get(Integer.valueOf(referenciaTerceto))+"\n");
                    break;
                }

                case "PRINT":

                    break;

                default://FUNC, BREAK (TODAVIA NO ESTA)

            }
            if(tercetoActual.getEtiqueta()){
                this.code.append("label_"+i+":"+"\n");
            }

        }
        this.code.append("END START");
        this.code.append("\n");
        return this.code.toString();
    }

    private void operacionAritmetica(String operacion, Terceto terceto){
        String operando1= this.devuelveOperando(terceto.getT2());
        this.code.append("MOV EAX, "+operando1+"\n");

        String operando2= this.devuelveOperando(terceto.getT3());
        this.code.append(operacion +" EAX, "+operando2+"\n");

        this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");
        this.code.append("\n");
        terceto.setAuxiliar("@aux"+this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }

    private void operacionAritmeticaDividir(Terceto terceto){
        String operando1=this.devuelveOperando(terceto.getT2());
        this.code.append("MOV EAX, "+operando1+"\n");
        this.code.append("MOV EDX, 0"+"\n");//Agregamos 0 para que DIV sepa que es positivo

        String operando2=this.devuelveOperando(terceto.getT3());
        if (tablaDeSimbolos.obtenerToken(terceto.getT3().ival).getUso().equals("constante"))
        {
            this.code.append("MOV EBX, "+operando2+"\n");
            operando2 = "EBX";
        }
        this.code.append("DIV "+operando2+"\n");

        this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");
        this.code.append("\n");
        terceto.setAuxiliar("@aux"+this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }


    private void operacionAritmetica_Mul_Div(String operacion , Terceto terceto){
        String operando1=this.devuelveOperando(terceto.getT2());
        this.code.append("MOV EAX, "+operando1+"\n");

        if(operacion.equals("DIV"))
            this.code.append("MOV EDX, 0"+"\n");//Agregamos 0 para que DIV sepa que es positivo

        String operando2=this.devuelveOperando(terceto.getT3());
        if (tablaDeSimbolos.obtenerToken(terceto.getT3().ival).getUso().equals("constante"))
        {
            this.code.append("MOV EBX, "+operando2+"\n");
            operando2 = "EBX";
        }
        this.code.append(operacion +" "+operando2+"\n");

        this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");
        this.code.append("\n");
        terceto.setAuxiliar("@aux"+this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }

    private void asignacion(Terceto terceto){
        String operando2=this.devuelveOperando(terceto.getT3());
        this.code.append("MOV EAX, "+operando2+"\n");

        String operando1 ="_"+tablaDeSimbolos.obtenerValor(terceto.getT2().ival);//El operando 1 (izquierda de la asig) siempre va a ser una variable
        this.code.append("MOV "+operando1+", EAX"+"\n");
        this.code.append("\n");
    }

    /*private void comparador(String operacion, Terceto terceto){
        String operando1="";
        if(terceto.getT2().ival!=0) {//t2 apunta a tabla -> Siendo una variable o constante
            operando1 =tablaDeSimbolos.obtenerValor(terceto.getT2().ival);
            if(tablaDeSimbolos.obtenerToken(terceto.getT2().ival).getUso()!=null) //Significa que es una variable y no una constante
                operando1 = "_" + operando1; // le agrego el guíon adelante por ser variable
        }else {//t2 apunta a auxiliar -> Siendo un puntero a otro terceto
            String srefTerceto = String.valueOf(terceto.getT2().dval);
            int refTerceto = Integer.valueOf(srefTerceto.substring(0, srefTerceto.length()-2));
            operando1 = tercetos.get(refTerceto).getAuxiliar();
        }
        this.code.append("MOV EAX, "+operando1+"\n");

        String operando2="";
        if(terceto.getT3().ival!=0) {//t3 apunta a tabla  -> Siendo una variable o constante
            operando2 = tablaDeSimbolos.obtenerValor(terceto.getT3().ival);
            if (tablaDeSimbolos.obtenerToken(terceto.getT3().ival).getUso() != null) //Significa que es una variable y no una constante
                operando2 = "_" + operando2; // le agrego el guíon adelante por ser variable
        }else {//t3 apunta a auxiliar -> Siendo un puntero a otro terceto
            String srefTerceto = String.valueOf(terceto.getT3().dval);
            int refTerceto = Integer.valueOf(srefTerceto.substring(0, srefTerceto.length()-2));
            operando2 = tercetos.get(refTerceto).getAuxiliar();
        }
        this.code.append("CMP EAX, "+operando2+"\n");

        this.code.append("MOV EAX, 0"+"\n");//ponemos 0 en EAX
        this.code.append("SETS EAX"+"\n");//guarda SF en EAX

        this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");
        this.code.append("\n");
        terceto.setAuxiliar("@aux"+this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }*/

    public String devuelveOperando(ParserVal clave){

        String operando="";
        if(clave.ival!=0) {//t2 apunta a tabla -> Siendo una variable o constante
            operando =tablaDeSimbolos.obtenerValor(clave.ival);
            if(tablaDeSimbolos.obtenerToken(clave.ival).getUso()!="constante") //Significa que es una variable y no una constante
                operando = "_" + operando; // le agrego el guíon adelante por ser variable
        }else {//t2 apunta a auxiliar -> Siendo un puntero a otro terceto
            String srefTerceto = String.valueOf(clave.dval);
            int refTerceto = Integer.valueOf(srefTerceto.substring(0, srefTerceto.length()-2));
            operando = tercetos.get(refTerceto).getAuxiliar();
        }

        return operando;
    }

}
