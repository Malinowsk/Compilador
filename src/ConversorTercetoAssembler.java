import java.util.ArrayList;
import java.util.Stack;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
        contadorAuxiliar=0;
        this.code= new StringBuilder();

        StringBuilder assembler = new StringBuilder();
        assembler.append(this.getEncabezadoAssembler());
        assembler.append("\n");

        String zonaCodigo = this.getZonaCodigoAssembler();
        String zonaDatos = this.getZonaDatosAssembler();

        assembler.append(zonaDatos);
        assembler.append("\n");
        assembler.append(zonaCodigo);
        assembler.append("\n");
        this.generarArchivoCodigo(assembler.toString());
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

        datos.append("_funcion_actual DD ?" + "\n");
        datos.append("ERROR_EN_EJECUCION DB \"ERROR EN EJECUCION\" , 0 " + "\n");
        datos.append("Division_por_cero DB \"Division por cero\" , 0 " + "\n");
        datos.append("Overflow_en_suma_de_enteros DB \"Overflow en suma de enteros\" , 0 " + "\n");
        datos.append("Recursion_en_una_funcion DB \"Recursion en una funcion\" , 0 " + "\n");
        datos.append("PRINT DB \"Impresion por pantalla\" , 0 " + "\n");
        datos.append("aux_mem_2bytes DW ?" + "\n");
        datos.append("_aux_conversion DD ?" + "\n");

        for(int i = 287 ; i<= tablaDeSimbolos.refUltimoToken() ;i++){
            String lexema = tablaDeSimbolos.obtenerValor(i);


            if(tablaDeSimbolos.obtenerToken(i)!=null) {

                lexema = lexema.replace('.','_');
                if ( (tablaDeSimbolos.obtenerToken(i).getUso() == "variable") || (tablaDeSimbolos.obtenerToken(i).getUso() == "parametro") || (tablaDeSimbolos.obtenerToken(i).getUso() == "funcion designada a variable") ) {
                    if (tablaDeSimbolos.obtenerToken(i).getTipo() == "ULONG"  || (tablaDeSimbolos.obtenerToken(i).getUso() == "funcion designada a variable")) {
                        datos.append("_" + lexema + " DD ?" + "\n");
                    } else {

                        datos.append("_" + lexema + " DQ ?" + "\n");
                    }
                } else {
                    if (tablaDeSimbolos.obtenerToken(i).getUso() == "cadena") {
                        lexema = lexema.substring(1, lexema.length()-1);//le sacamos los % de inicio y final
                        datos.append(tablaDeSimbolos.obtenerToken(i).getNombre() + " DB " + "\"" + lexema + "\"" + " , 0 " + "\n");
                    }
                    if((tablaDeSimbolos.obtenerToken(i).getUso() == "constante") && (tablaDeSimbolos.obtenerToken(i).getTipo() == "DOUBLE")){
                        String valor = tablaDeSimbolos.obtenerValor(i);
                        if(valor.charAt(0)=='.')
                            valor = "0"+valor;
                        datos.append("_" + tablaDeSimbolos.obtenerToken(i).getNombre() + " DQ "+ valor + "\n");
                    }
                }
            }
        }

        for(Terceto t : tercetos){
            if(t.getAuxiliar()!=null){
                String operador = tablaDeSimbolos.obtenerValor(t.getT1().ival);
                if(operador!="DOUBLE") {
                    if(operador=="+" || operador=="-" || operador=="*" || operador=="/" || operador=="CALL") {
                        if (t.getT2().sval == "ULONG") {
                            datos.append(t.getAuxiliar() + " DD ?" + "\n");
                        } else {
                                datos.append(t.getAuxiliar() + " DQ ?" + "\n");
                        }
                    }
                    else {
                        datos.append(t.getAuxiliar() + " DD ?" + "\n"); // en este caso el auxiliar corresponde a un booleano (comparaciones o operaciones booleanas)
                    }
                }else{
                    datos.append(t.getAuxiliar() + " DQ ?" + "\n"); // para la conversion
                }
            }
        }

        datos.append("\n");
        return datos.toString();
    }

    //Metodo para generar la zona de codigo del archivo
    private String getZonaCodigoAssembler()
    {
        this.code.append(".code" + "\n");
        this.code.append("FNINIT" + "\n"+ "\n");

        Terceto tercetoActual= tercetos.get(0);
        String retornoFuncion=""; //variable utilizada para guardar la instruccion de retorno de una funcion temporalmente
        Stack<String> pilaFunciones = new Stack<String>(); //Pila utilizada para las etiquetas de las funciones

        // agregamos codigo assembler para generar metodos comprovacion de errores
        this.funcionErrorDivisonPorCero("ULONG");
        this.funcionErrorDivisonPorCero("DOUBLE");
        this.funcionErrorOverflowSumaEntero();
        this.funcionErrorRecursion();

        if (tablaDeSimbolos.obtenerValor(tercetoActual.getT1().ival)!="FUNC")//inicia en el main
            {
                this.code.append("START:"+ "\n");

                //Una vez declarada la etiqueta cambio la funcion actual en el assembler
                this.code.append("MOV EAX, START" + "\n");
                this.code.append("MOV _funcion_actual, EAX" + "\n" + "\n");
            }
        else//se declaran funciones antes del main
            pilaFunciones.push("START:"+ "\n");

        for(int i = 0; i < this.tercetos.size(); i++) // por cada uno de los tecetos vamos generando el codigo
        {//TODO: AGREGAR COMENTARIOS PARA CADA BLOQUE DE INSTRUCCIONES INDICANDO A QUE TIPO DE TERCETO PERTENECEN

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

                case "+": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica("ADD", tercetoActual);
                    else
                        operacionAritmetica("FADD", tercetoActual);
                    break;
                }

                case "-": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica("SUB", tercetoActual);
                    else
                        operacionAritmetica("FSUB", tercetoActual);
                    break;
                }

                case "*": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica_Mul_Div_Entero("MUL", tercetoActual);
                    else
                        operacionAritmetica("FMUL", tercetoActual);
                    break;
                }

                case "/": {
                    if (tercetoActual.getT2().sval == "ULONG")
                        operacionAritmetica_Mul_Div_Entero("DIV", tercetoActual);
                    else
                        operacionAritmetica("FDIV", tercetoActual);
                    break;
                }

                case ":=": {
                    if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getUso() != "funcion designada a variable") {
                        asignacion(tercetoActual);
                    }else{
                        if(tablaDeSimbolos.obtenerToken(tercetoActual.getT3().ival).getUso()=="funcion")
                            this.code.append("MOV EAX, "+ tablaDeSimbolos.obtenerValor(tercetoActual.getT3().ival).replace(".","_") + "\n");
                        else//sino es variable con funcion designada, le agrego "_"
                            this.code.append("MOV EAX, _"+ tablaDeSimbolos.obtenerValor(tercetoActual.getT3().ival).replace(".","_") + "\n");
                        this.code.append("MOV _"+ tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival).replace(".","_")+ ", EAX" + "\n"+ "\n");
                    }
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

                case "BT":
                case "BF": {
                    String salto = "JE";//Si es BF, salto cuando el booleano es igual 0
                    if(operador=="BT")
                        salto= "JNE";//Si es BT, salto cuando el booleano es distinto a 0
                    String operando1 = this.devuelveOperando(tercetoActual.getT2());
                    this.code.append("MOV EAX, " + operando1 + "\n");
                    this.code.append("SUB EAX, 0" + "\n");
                    String auxiliar = String.valueOf(tercetoActual.getT3().dval);
                    String direccion = auxiliar.substring(0, auxiliar.length() - 2);
                    this.code.append(salto+ " label_" + direccion + "\n");
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

                case "DOUBLE": {
                    String operando = this.devuelveOperando(tercetoActual.getT2());

                    if(tercetoActual.getT2().ival>0)
                        if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getUso()=="constante" && tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getTipo()=="ULONG") {
                            this.code.append("MOV _aux_conversion, 0" + "\n");//Para estar seguros que no queda basura en el auxiliar
                            this.code.append("MOV _aux_conversion, " + operando + "\n"); //usamos el auxiliar como intermediario entre la cte y la pila
                            operando = "_aux_conversion";
                        }

                    this.code.append("FILD " + operando + "\n");
                    this.code.append("FSTP @aux" + this.contadorAuxiliar + "\n");
                    this.code.append("\n");
                    tercetoActual.setAuxiliar("@aux" + this.contadorAuxiliar);
                    this.contadorAuxiliar++;
                    break;
                }

                case "PRINT": {
                    String cadena = tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getNombre();
                    this.code.append("invoke MessageBox, NULL, addr " + cadena + " , addr PRINT , MB_OK " + "\n");
                    break;
                }

                case "FUNC":{
                    if(tablaDeSimbolos.obtenerValor(tercetos.get(i+1).getT1().ival)!="FUNC") {//no hay declaracion de funciones dentro de la funcion
                        //Se pone la etiqueta:
                        this.code.append(tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival).replace(".", "_") + ":" + "\n" + "\n");

                        //Una vez declarada la etiqueta cambio la funcion actual, en el assembler se guarda el parametro
                        String parametroFuncion = "_" + tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getParametro().replace(".","_");//Variable del parametro
                        if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getTipoParametro()=="ULONG")
                            this.code.append("MOV " + parametroFuncion+ ", EAX" + "\n");
                        else
                            this.code.append("FSTP " + parametroFuncion + "\n");

                        //Se actualiza la funcion actual
                        this.code.append("MOV EAX, "+tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival).replace(".", "_")  + "\n");
                        this.code.append("MOV _funcion_actual, EAX" + "\n" + "\n");

                    }else {//hay declaracion de funciones dentro de la funcion, entonces guardamos la etiqueta en la pila
                        pilaFunciones.push(tablaDeSimbolos.obtenerValor(tercetoActual.getT2().ival).replace(".", "_") + ":" + "\n");
                    }break;
                }

                case "RETURN": {//Guardo el retorno por si hay una postcondicion
                    if(tercetoActual.getT2().sval=="ULONG")
                        retornoFuncion="MOV EAX, "+this.devuelveOperando(tercetoActual.getT2());
                    else
                        retornoFuncion="FLD "+this.devuelveOperando(tercetoActual.getT2());
                    break;
                }

                case "ENDFUNC": {
                    this.code.append("\n");
                    //Una terminado el bloque de la funcion, se vuelve a actualizar la funcion
                    this.code.append("MOV EAX, "+ pilaFunciones.peek().substring(0, pilaFunciones.peek().length()-2)  + "\n");
                    this.code.append("MOV _funcion_actual, EAX" + "\n" + "\n");

                    this.code.append(retornoFuncion);
                    this.code.append("\n"+"ret"+"\n");
                    this.code.append("\n");
                    if (tablaDeSimbolos.obtenerValor(tercetos.get(i+1).getT1().ival)!="FUNC") //viene el bloque ejecutable de la funcion que la declaro
                    {
                        String etiqueta = pilaFunciones.pop();
                        this.code.append(etiqueta);//se añade la etiqueta de la funcion madre

                        //Una vez declarada la etiqueta cambio la funcion actual en el assembler
                        this.code.append("MOV EAX, "+ etiqueta.substring(0, etiqueta.length()-2)  + "\n");
                        this.code.append("MOV _funcion_actual, EAX" + "\n" + "\n");
                    }//en el caso que se declare otra funcion en el mismo bloque declarativo no se toca la pila
                    break;
                }

                case "CALL": { //TODO: NO AGREGAR LLAMADO A FUNCION A ERROR EN EL MAIN (por cuestiones de tiempo queda pendiente ya que no genera ningun)

                    String parametro= this.devuelveOperando(tercetoActual.getT3());//parametro con el que se invoca a la func
                    String etiquetaFuncion = tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getLexema().replace(".","_");//nombre de la etiqueta de la func

                    if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getUso()!="funcion")//Sino es una funcion no se tiene la etiqueta sino una variable que apunta a la etiqueta
                        etiquetaFuncion = "_"+etiquetaFuncion;

                    //Llamamos a la funcion que chequea el error por recursion
                    this.code.append("MOV EAX, "+ etiquetaFuncion + "\n");
                    this.code.append("CALL error_recursion"+"\n");

                    //guardamos el parametro con el que se invoca dependiendo del tipo
                    if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getTipoParametro()=="ULONG") {
                        this.code.append("MOV EAX, " + parametro + "\n");
                    }else{
                        this.code.append("FLD, " + parametro + "\n");
                    }

                    //llamamos a la funcion
                    this.code.append("CALL " + etiquetaFuncion + "\n");

                    //obtenemos el retorno de la funcion segun el tipo de retorno
                    if(tablaDeSimbolos.obtenerToken(tercetoActual.getT2().ival).getTipo()=="ULONG")
                        this.code.append("MOV @aux" + this.contadorAuxiliar + ", EAX" + "\n");
                    else
                        this.code.append("FSTP @aux" + this.contadorAuxiliar + "\n");

                    this.code.append("\n");
                    tercetoActual.setAuxiliar("@aux"+this.contadorAuxiliar);
                    this.contadorAuxiliar++;
                    break;
                }

                default:

            }
            if(tercetoActual.getEtiqueta()){
                this.code.append("label_"+(i+1)+":"+"\n");
            }

        }

        this.code.append("fin_ejecucion:" + "\n");
        this.code.append("FNINIT" + "\n");
        this.code.append("invoke ExitProcess, 0" + "\n");
        this.code.append("END START");
        this.code.append("\n");
        return this.code.toString();
    }

    //Metodo para generar codigo generico de las operaciones aritmeticas
    private void operacionAritmetica(String operacion, Terceto terceto){
        String operando1 = this.devuelveOperando(terceto.getT2());
        String operando2 = this.devuelveOperando(terceto.getT3());
        if(terceto.getT2().sval=="ULONG") {///CASO ENTERO
            this.code.append("MOV EAX, " + operando1 +" ; " + "\n");

            this.code.append(operacion + " EAX, " + operando2 + "\n");

            if (operacion == "ADD")
                this.code.append("CALL error_overflow_suma_entero" + "\n");

            this.code.append("MOV @aux" + this.contadorAuxiliar + ", EAX" + "\n");
        }
        else{///CASO FLOTANTE
            if(operacion=="FDIV") {
                this.code.append("FLD" + operando2 + "\n");
                this.code.append("CALL error_division_por_cero_DOUBLE" + "\n");
            }
            this.code.append("FLD " + operando1 + "\n");
            this.code.append("FLD " + operando2 + "\n");

            this.code.append(operacion + "\n");
            this.code.append("FSTP @aux" + this.contadorAuxiliar + "\n");
        }
        this.code.append("\n");
        terceto.setAuxiliar("@aux" + this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }

    //Metodo para generar codigo generico de las operaciones de multiplicacion y division
    private void operacionAritmetica_Mul_Div_Entero(String operacion , Terceto terceto){
        String operando2=this.devuelveOperando(terceto.getT3());
        if(operacion=="DIV") {
            this.code.append("MOV EAX, " + operando2 + "\n");
            this.code.append("CALL error_division_por_cero_ULONG" + "\n");
        }

        String operando1=this.devuelveOperando(terceto.getT2());
        this.code.append("MOV EAX, "+operando1+"\n");

        if(operacion.equals("DIV"))
            this.code.append("MOV EDX, 0"+"\n");//Agregamos 0 para que DIV sepa que es positivo

        if (terceto.getT3().ival!=0)//para el caso que sea referencia a la tabla de simbolo
            if(tablaDeSimbolos.obtenerToken(terceto.getT3().ival).getUso()=="constante")
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
        String operando2 = this.devuelveOperando(terceto.getT3());
        String operando1 = "_" + tablaDeSimbolos.obtenerValor(terceto.getT2().ival);//El operando 1 (izquierda de la asig) siempre va a ser una variable
        operando1 = operando1.replace(".", "_");
        if (tablaDeSimbolos.obtenerToken(terceto.getT2().ival).getTipo() == "ULONG") {
            this.code.append("MOV EAX, " + operando2 + "\n");

            this.code.append("MOV " + operando1 + ", EAX" + "\n");
        }
        else{
            this.code.append("FLD " + operando2 + "\n");

            this.code.append("FSTP " + operando1 + "\n");
        }
        this.code.append("\n");
    }

    //Metodo para generar codigo de las comparaciones y operaciones booleanas
    private void comparador(String operacion, Terceto terceto){
        String operando1=this.devuelveOperando(terceto.getT2());
        String operando2=this.devuelveOperando(terceto.getT3());

        if (operacion.equals("&&") || operacion.equals("||")){
            this.code.append("MOV EAX, "+operando1+"\n");
            if (operacion.equals("&&")){//si ambos operandos no son cero entonces devuelve 1
                this.code.append("AND EAX, " + operando2 + "\n");}
            else{
                this.code.append("OR EAX, " + operando2 + "\n");
            }
            this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");//en el auxiliar se guarda todos 0 en caso de ser falsa la operacion, sino tendra almenos un 1
        }
        else {
            if (terceto.getT2().sval == "ULONG") {
                this.code.append("MOV EAX, "+operando1+"\n");
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
                this.code.append("MOV @aux"+ this.contadorAuxiliar +", EAX"+"\n");//en el auxiliar se guarda todos 0 en caso de ser falsa la operacion, sino tendra almenos un 1
            }
            else{

                this.code.append("FLD " + operando1 + "\n");
                this.code.append("FCOMP " + operando2 + "\n");
                this.code.append("MOV EAX, 0" + "\n");
                this.code.append("FSTSW aux_mem_2bytes" + "\n");  // guarda la palabra de estado
                this.code.append("MOV AX, aux_mem_2bytes" + "\n"); // guarda en un registro
                this.code.append("SAHF" + "\n"); // actualiza los flags
                this.code.append("MOV EBX, 0" + "\n");
                switch (operacion) {

                    case "<": {//guarda en BH el flag de signo
                        this.code.append("SETC BH" + "\n");
                        break;
                    }

                    case ">": {//guarda en BH 1 en caso de que tanto el flag de signo como el de cero sean 0
                        this.code.append("MOV ECX, 0" + "\n");
                        this.code.append("SETC BH" + "\n");
                        this.code.append("SETZ CH" + "\n");
                        this.code.append("ADD BH, CH" + "\n");//sumamos ambos flags para ver si da mas de 0
                        this.code.append("SETZ BH" + "\n");//si es 0 entonces ambos eran 0
                        break;
                    }

                    case "<=": {//guarda en BH 1 en caso de que tanto el flag de signo como el de cero sean 1
                        this.code.append("MOV ECX, 0" + "\n");
                        this.code.append("SETC BH" + "\n");
                        this.code.append("SETZ CH" + "\n");
                        this.code.append("OR BH, CH" + "\n");
                        break;
                    }

                    case ">=": {//guarda en BH 1 en caso de que el flag de signo sea 0
                        this.code.append("SETC BH" + "\n");
                        this.code.append("CMP BH, 0" + "\n");//compara el flag de signo del anterior con 0 y actualiza flags
                        this.code.append("SETZ BH" + "\n");//si la cmp da 0 entonces se guarda 1
                        break;
                    }

                    case "==": {//guarda en BH 1 en caso de que el flag de cero sea 1
                        this.code.append("SETZ BH" + "\n");
                        break;
                    }

                    case "<>": {//guarda en BH 1 en caso de que el flag de cero sea 0
                        this.code.append("SETZ BH" + "\n");
                        this.code.append("ADD BH, 0" + "\n");//suma el flag de cero del anterior con 0 y actualiza flags
                        this.code.append("SETZ BH" + "\n");//entonces nos quedamos con el flag de paridad de la suma anterior
                        break;
                    }
                }
                this.code.append("MOV @aux"+ this.contadorAuxiliar +", EBX"+"\n");
            }
        }

        this.code.append("\n");
        terceto.setAuxiliar("@aux"+this.contadorAuxiliar);
        this.contadorAuxiliar++;
    }

    //Metodo generico para obtener el operando correspondiente a un termino
    public String devuelveOperando(ParserVal clave){

        String operando="";
        if(clave.ival!=0) {//t2 apunta a tabla -> Siendo una variable o constante
            if(tablaDeSimbolos.obtenerToken(clave.ival).getUso()=="constante" && tablaDeSimbolos.obtenerToken(clave.ival).getTipo()=="DOUBLE")
                operando =tablaDeSimbolos.obtenerToken(clave.ival).getNombre();//en cado der ser una cte flotante se obtiene el nombre asignado
            else
                operando =tablaDeSimbolos.obtenerValor(clave.ival);

            operando = operando.replace(".","_");
            if(tablaDeSimbolos.obtenerToken(clave.ival).getUso()!="constante" || tablaDeSimbolos.obtenerToken(clave.ival).getTipo()=="DOUBLE") //Significa que es una variable o una constante double
                operando = "_" + operando; // le agrego el guíon adelante por ser variable
        }else {//t2 apunta a auxiliar -> Siendo un puntero a otro terceto
            String srefTerceto = String.valueOf(clave.dval);
            int refTerceto = Integer.valueOf(srefTerceto.substring(0, srefTerceto.length()-2));
            operando = tercetos.get(refTerceto).getAuxiliar();
        }

        return operando;
    }

    //Metodo para generar la funcion de errores para ULONG y DOUBLE
    private void funcionErrorDivisonPorCero(String tipo){
        String comparacion;
        if(tipo=="ULONG")
            comparacion = "CMP EAX, 0";
        else
            comparacion = "FTST"; // compara con 0

        this.code.append("error_division_por_cero_" + tipo + ":" +"\n");
        this.code.append(comparacion+"\n");
        if(tipo=="DOUBLE")
        {
            this.code.append("MOV EAX, 0" + "\n");
            this.code.append("FSTSW aux_mem_2bytes" + "\n");  // guarda la palabra de estado
            this.code.append("MOV AX , aux_mem_2bytes" + "\n"); // guarda en un registro
            this.code.append("SAHF" + "\n"); // actualiza los flags
        }
        this.code.append("JNE fin_funcion_division_por_cero_" + tipo +"\n");
        this.code.append("invoke MessageBox, NULL, addr " + "Division_por_cero" + " , addr " + "ERROR_EN_EJECUCION" + " , MB_OK " + "\n");
        this.code.append("JMP fin_ejecucion" + "\n");
        this.code.append("fin_funcion_division_por_cero_" + tipo + ":" + "\n");
        this.code.append("ret" + "\n");
        this.code.append("\n");
    }

    //Metodo usado una unica vez para agregar la funcion de error de overflow por suma de enteros
    private void funcionErrorOverflowSumaEntero(){
        this.code.append("error_overflow_suma_entero:"+"\n");
        this.code.append("JNC fin_overflow_suma_entero"+"\n");
        this.code.append("invoke MessageBox, NULL, addr " + "Overflow_en_suma_de_enteros" + " , addr " + "ERROR_EN_EJECUCION" + " , MB_OK " + "\n");
        this.code.append("JMP fin_ejecucion" + "\n");
        this.code.append("fin_overflow_suma_entero:"+"\n");
        this.code.append("ret" + "\n");
        this.code.append("\n");
    }

    //Metodo usado una unica vez para agregar la funcion de error de recursion en una funcion
    private void funcionErrorRecursion(){
        this.code.append("error_recursion:"+"\n");
        this.code.append("CMP EAX, _funcion_actual"+"\n");
        this.code.append("JNE fin_recursion"+"\n");
        this.code.append("invoke MessageBox, NULL, addr " + "Recursion_en_una_funcion" + " , addr " + "ERROR_EN_EJECUCION" + " , MB_OK " + "\n");
        this.code.append("JMP fin_ejecucion" + "\n");
        this.code.append("fin_recursion:"+"\n");
        this.code.append("ret" + "\n");
        this.code.append("\n");
    }

    //Metodo que genera el archivo .ASM
    public void generarArchivoCodigo ( String codigo ) {
        PrintWriter arch = null;
        try {
            arch = new PrintWriter ("Assembler.asm");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        arch.println(codigo);
        arch.close();
    }

}
