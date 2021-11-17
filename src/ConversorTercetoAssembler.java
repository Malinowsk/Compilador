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

    //Metodo utiliado por el main para generar el archivo assembler
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

    //Metodo para generar el encabezado del archivo
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

    //Metodo para generar la zona de datos del archivo
    private String getZonaDatosAssembler()
    {
        StringBuilder datos = new StringBuilder();
        datos.append(".data");
        datos.append("\n");

        for(int i = 287 ; i<= tablaDeSimbolos.refUltimoToken() ;i++){
            String lexema = tablaDeSimbolos.obtenerValor(i);


            if(tablaDeSimbolos.obtenerToken(i)!=null) {

                lexema = lexema.replace('.','_');
                if (tablaDeSimbolos.obtenerToken(i).getUso() == "variable" || tablaDeSimbolos.obtenerToken(i).getUso() == "parametro") {
                    if (tablaDeSimbolos.obtenerToken(i).getTipo() == "ULONG") {
                        datos.append("_" + lexema + " DD ?" + "\n");
                    } else {

                        datos.append("_" + lexema + " DQ ?" + "\n");
                    }
                } else {
                    if (tablaDeSimbolos.obtenerToken(i).getUso() == "cadena") {
                        lexema = lexema.substring(1, lexema.length()-1);//le sacamos los % de inicio y final
                        datos.append(lexema.replace(' ','_') + " DB " + "\"" + lexema + "\"" + " , 0 " + "\n");
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
                    if(t.getT2().sval=="DOUBLE")
                        datos.append(t.getAuxiliar() + " DQ ?" + "\n");
                    else // en este caso el auxiliar corresponde a un boleano
                        datos.append(t.getAuxiliar() + " DD ?" + "\n");
                }
            }
        }

        datos.append("\n");
        return datos.toString();
    }

    //Metodo para generar la zona de codigo del archivo
    private String getZonaCodigoAssembler()
    {
        this.code.append(".code");
        this.code.append("\n");
        this.code.append("START:");
        this.code.append("\n");
        Terceto tercetoActual;
        String retornoFuncion="";
        for(int i = 0; i < this.tercetos.size(); i++) // por cada uno de los tecetos vamos generando el codigo
        {
            tercetoActual = tercetos.get(i);
            String operador = "";
            if(tercetoActual.getT1().ival >= 0){
                operador = tablaDeSimbolos.obtenerValor(tercetoActual.getT1().ival);
                operador = operador.replace('.','_');}
            else{
                if(tercetoActual.getT1().ival == -1)
                    operador = "BF";
                if(tercetoActual.getT1().ival == -2)
                    operador = "BI";
                if(tercetoActual.getT1().ival == -3)
                    operador = "BT";
                if(tercetoActual.getT1().ival == -4)
                    operador = "ENDFUNC";
            }

            switch (operador) {

                case "+": {//TODO: Overflow en sumas de enteros
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica("ADD", tercetoActual);
                    break;
                }

                case "-": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica("SUB", tercetoActual);
                    break;
                }

                case "*": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica_Mul_Div("MUL", tercetoActual);
                    break;
                }

                case "/": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica_Mul_Div("DIV", tercetoActual);
                    break;
                }

                case ":=": {
                    if (tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getTipo() == "ULONG")
                        asignacion(tercetoActual);
                    break;
                }

                case "<":
                case ">":
                case "<=":
                case ">=":
                case "==":
                case "<>":
                case "&&":
                case "||": {
                    this.comparador(operador, tercetoActual);
                    break;
                }

                case "BF": {
                    String operando1 = this.devuelveOperando(tercetoActual.getT2());
                    this.code.append("MOV EAX, " + operando1 + "\n");
                    this.code.append("SUB EAX, 0" + "\n");
                    String auxiliar = String.valueOf(tercetoActual.getT3().dval);
                    String direccion = auxiliar.substring(0, auxiliar.length() - 2);
                    this.code.append("JE label_" + direccion + "\n");
                    this.code.append("\n");
                    break;
                }

                case "BI": {
                    String auxiliar = String.valueOf(tercetoActual.getT2().dval);
                    String direccion = auxiliar.substring(0, auxiliar.length() - 2);
                    this.code.append("JMP label_" + direccion + "\n");
                    this.code.append("\n");
                    break;
                }

                case "BT": {
                    String operando1 = this.devuelveOperando(tercetoActual.getT2());
                    this.code.append("MOV EAX, " + operando1 + "\n");
                    this.code.append("SUB EAX, 0" + "\n");
                    String auxiliar = String.valueOf(tercetoActual.getT3().dval);
                    String direccion = auxiliar.substring(0, auxiliar.length() - 2);
                    this.code.append("JNE label_" + direccion + "\n");
                    this.code.append("\n");
                    break;
                }
                case "DOUBLE": {
                    String referenciaTerceto = String.valueOf(tercetoActual.getT2().dval);
                    referenciaTerceto = referenciaTerceto.substring(0, referenciaTerceto.length() - 2);
                    this.code.append("FLD " + tercetos.get(Integer.valueOf(referenciaTerceto)) + "\n");
                    break;
                }

                case "PRINT": {
                    String lexema = tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival);
                    lexema = lexema.substring(1, lexema.length() - 1);//le sacamos los % de inicio y final
                    lexema = lexema.replace(' ', '_');
                    this.code.append("invoke MessageBox, NULL, addr " + lexema + " , addr " + lexema + " , MB_OK " + "\n");
                    this.code.append("invoke ExitProcess, 0" + "\n");
                    break;
                }

                case "FUNC":{
                    this.code.append(tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival) + ":"+"\n");
                    break;
                }

                case "RETURN": {//Guardo el retorno por si hay una postcondicion
                    retornoFuncion="MOV EAX, "+this.devuelveOperando(tercetoActual.getT2());
                    break;
                }

                case "ENDFUNC": {
                    this.code.append(retornoFuncion);
                    this.code.append("\n"+"ret"+"\n");
                    this.code.append("\n");
                }

                case "CALL": {

                }break;

                default://FUNC, BREAK (TODAVIA NO ESTA)

            }
            if(tercetoActual.getEtiqueta()){
                this.code.append("label_"+(i+1)+":"+"\n");
            }

        }
        this.code.append("END START");
        this.code.append("\n");
        return this.code.toString();
    }

    //Metodo para generar codigo generico de las operaciones aritmeticas
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

    //Metodo para generar codigo generico de las operaciones de multiplicacion y division
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

    //Metodo para generar codigo de la asignacion
    private void asignacion(Terceto terceto){
        String operando2=this.devuelveOperando(terceto.getT3());
        this.code.append("MOV EAX, "+operando2+"\n");

        String operando1 ="_"+tablaDeSimbolos.obtenerValor(terceto.getT2().ival);//El operando 1 (izquierda de la asig) siempre va a ser una variable
        operando1 = operando1.replace(".","_");
        this.code.append("MOV "+operando1+", EAX"+"\n");
        this.code.append("\n");
    }

    //Metodo para generar codigo de las comparaciones y operaciones booleanas
    private void comparador(String operacion, Terceto terceto){

        String operando1=this.devuelveOperando(terceto.getT2());
        this.code.append("MOV EAX, "+operando1+"\n");

        String operando2=this.devuelveOperando(terceto.getT3());

        if (operacion.equals("&&") || operacion.equals("||")){
            if (operacion.equals("&&")){//si ambos operandos no son cero entonces devuelve 1
                this.code.append("AND EAX, " + operando2 + "\n");}
            else{
                this.code.append("OR EAX, " + operando2 + "\n");
            }
        }
        else {
            this.code.append("CMP EAX, " + operando2 + "\n");//primero se realiza la comparacion
            this.code.append("MOV EAX, 0" + "\n");//ponemos 0 en EAX

            switch (operacion) {

                case "<": {//guarda en AH el flag de signo
                    this.code.append("SETS AH" + "\n");
                    break;
                }

                case ">": {//guarda en AH 1 en caso de que tanto el flag de signo como el de cero sean 0
                    this.code.append("MOV EBX, 0" + "\n");
                    this.code.append("SETS AH" + "\n");
                    this.code.append("SETZ BH" + "\n");
                    this.code.append("ADD AH, BH" + "\n");//sumamos ambos flags para ver si da mas de 0
                    this.code.append("SETZ AH" + "\n");//si es 0 entonces ambos eran 0
                    break;
                }

                case "<=": {//guarda en AH 1 en caso de que tanto el flag de signo como el de cero sean 1
                    this.code.append("MOV EBX, 0" + "\n");
                    this.code.append("SETS AH" + "\n");
                    this.code.append("SETZ BH" + "\n");
                    this.code.append("OR AH, BH" + "\n");
                    break;
                }

                case ">=": {//guarda en AH 1 en caso de que el flag de signo sea 0
                    this.code.append("SETS AH" + "\n");
                    this.code.append("CMP AH, 0" + "\n");//compara el flag de signo del anterior con 0 y actualiza flags
                    this.code.append("SETZ AH" + "\n");//si la cmp da 0 entonces se guarda 1
                    break;
                }

                case "==": {//guarda en AH 1 en caso de que el flag de cero sea 1
                    this.code.append("SETZ AH" + "\n");
                    break;
                }

                case "<>": {//guarda en AH 1 en caso de que el flag de cero sea 0
                    this.code.append("SETZ AH" + "\n");
                    this.code.append("ADD AH, 0" + "\n");//suma el flag de cero del anterior con 0 y actualiza flags
                    this.code.append("SETZ AH" + "\n");//entonces nos quedamos con el flag de paridad de la suma anterior
                    break;
                }
            }
        }

        this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");//en el auxiliar se guarda todos 0 en caso de ser falsa la operacion, sino tendra almenos un 1
        this.code.append("\n");
        terceto.setAuxiliar("@aux"+this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }

    //Metodo generico para obtener el operando correspondiente a un termino
    public String devuelveOperando(ParserVal clave){

        String operando="";
        if(clave.ival!=0) {//t2 apunta a tabla -> Siendo una variable o constante
            operando =tablaDeSimbolos.obtenerValor(clave.ival);
            operando = operando.replace(".","_");
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
