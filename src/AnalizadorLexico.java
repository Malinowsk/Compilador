import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//clase que hace de analizador lexico, primero genera todos los tokens de determinado codigo,
//luego se le puede solicitar token por token
public class AnalizadorLexico {

    private Automata automata;
    private TablaSimbolo tablaDeSimbolo;

    private ArrayList<String> codigo;//Lista que se usara para guardar cada linea del codigo leido
    private ArrayList< Dupla<Integer, Integer> > tokens; //Lista donde se guardaran los tokens obtenidos del codigo, <Id de token, Referencia de tabla>
    private ArrayList< Integer > nroLineas; //Lista donde se guardaran los nro de lineas correspondiente a cada token generado
    private ArrayList< String > errores; //Lista donde se guardaran los errores lexicos

    private int estadoActual;//Estado del automata en el que se encuentra el lexico
    private int nroLinea;//Linea del codigo en el que se encuentra el lexico
    private int charActual;//Char del codigo en el que se encuentra el lexico


    //Constructor
    public AnalizadorLexico() {
        this.automata = new Automata();
        this.tablaDeSimbolo = new TablaSimbolo();
        this.codigo = new ArrayList<String>();
        this.tokens = new ArrayList< Dupla<Integer, Integer> >();
        this.nroLineas = new ArrayList<Integer>();
        //this.indiceToken = 0;
        this.errores = new ArrayList< String >();
    }

    //Metodo que lee un codigo para generar la lista de tokens respectiva
    public void leerNuevoArchivo(String path) throws FileNotFoundException {
        Scanner scannan = new Scanner(new File(path));
        while(scannan.hasNext()){
            this.codigo.add(scannan.nextLine());
        }

        this.estadoActual = 0; //Comienza en el estado inicial
        this.nroLinea = 1; //no comienza en 0 porque el codigo debe tener las lineas enumeradas desde 0
        this.charActual= 0;
    }

    public Dupla<Integer, Integer> nextToken() {
        for (int l = this.nroLinea - 1; l < this.codigo.size(); l++) {
            String linea = this.codigo.get(l);
            for (int i = this.charActual; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                int proximoEstado = this.automata.getProximoEstado(this.estadoActual, caracter);
                if (proximoEstado == -1) {
                    this.errores.add("Linea " + this.nroLinea + ", caracter invalido:" + caracter);
                    while ((caracter != ';') && (i != linea.length())) //avanza de caracteres hasta llegar al punto y coma o hasta el final de la linea y poder seguir leyendo las siguientes lineas
                        caracter = linea.charAt(i++);
                } else {
                    boolean reutilizarCaracter; //booleano que indica si el caracter se debe seguir utilizando
                    int cantidadTokens= this.tokens.size();
                    reutilizarCaracter = this.ejecutarAS(this.automata.getAccionSemantica(this.estadoActual, caracter), caracter);
                    this.estadoActual = proximoEstado;
                    if(this.tokens.size()>cantidadTokens) {//Si se agrego un nuevo token
                        if(!reutilizarCaracter)
                            this.charActual=i+1;//como no se reutiliza el caracter se precisa pasar al siguiente
                        else
                            this.charActual=i;//como se reutiliza el caracter se precisa quedarse en el actual
                        return this.tokens.get(this.tokens.size()-1);
                    }
                    if (reutilizarCaracter)
                        i--;//se resta uno para que el for sume uno y vuelva a utilizar el caracter
                }
                this.charActual=i;//se avanza de char en la linea
            }
            this.charActual=0;//se reinicia porque avanza de linea
            //Al terminar cada linea se tiene el caracter nl (nueva linea), el cual lo detectamos "manualmente"
            char nl = 10;
            int proximoEstado = this.automata.getProximoEstado(this.estadoActual, nl);
            if (proximoEstado == -1) {
                this.errores.add("Linea " + this.nroLinea + ", caracter invalido:" + nl);
                return new Dupla<Integer, Integer>(0, null); // se devuelve 0 porque se termino el codigo
            } else {
                int cantidadTokens= tokens.size();
                this.ejecutarAS(this.automata.getAccionSemantica(this.estadoActual, nl), nl);
                this.estadoActual = proximoEstado;
                if(this.tokens.size()>cantidadTokens) {//Si se agrego un nuevo token
                    this.nroLinea++;//se avanza de linea
                    return this.tokens.get(this.tokens.size()-1);
                }
            }
            this.nroLinea++;//se avanza de linea
        }
        return new Dupla<Integer, Integer>(0, null); // se devuelve 0 porque se termino el codigo
    }

    //Metodo que ejecuta la accion semantica indicada por el parametro y el cual indicará si el token debe ser reutilizado
    private boolean ejecutarAS(int AS, char caracter){
        if (AS==1) return AccionSemantica.accion1(this.tokens, this.tablaDeSimbolo, this.nroLineas, this.nroLinea, this.errores);
        if (AS==2) return AccionSemantica.accion2(caracter);
        if (AS==3) return AccionSemantica.accion3(caracter);
        if (AS==4) return AccionSemantica.accion4(this.tokens, caracter, this.nroLineas, this.nroLinea);
        if (AS==5) return AccionSemantica.accion5(this.tokens, this.tablaDeSimbolo, this.nroLineas, this.nroLinea, this.errores);
        if (AS==6) return AccionSemantica.accion6(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==7) return AccionSemantica.accion7(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==8) return AccionSemantica.accion8(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==9) return AccionSemantica.accion9(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==10) return AccionSemantica.accion10(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==11) return AccionSemantica.accion11(this.tokens, caracter, this.nroLineas, this.nroLinea);
        if (AS==12) return AccionSemantica.accion12(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==13) return AccionSemantica.accion13(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==14) return AccionSemantica.accion14(this.tokens, this.nroLineas, this.nroLinea);
        if (AS==15) return AccionSemantica.accion15(this.tokens, this.tablaDeSimbolo, this.nroLineas, this.nroLinea, this.errores);
        if (AS==16) return AccionSemantica.accion16(caracter);
        if (AS==17) return AccionSemantica.accion17(this.tokens, this.tablaDeSimbolo, this.nroLineas, this.nroLinea);
        if (AS==18) return AccionSemantica.accion18(this.tokens, this.tablaDeSimbolo, this.nroLineas, this.nroLinea);
        if (AS==19) return AccionSemantica.accion19(this.tokens, this.nroLineas, this.nroLinea);
        return false;
    }



    //Metodo para obtener el nro de linea del token actual
    public int getNroLineaToken() {return this.nroLinea;}

    //Metodo utilizado por el Main para imprimir el codigo junto a al nro de linea correspondiente
    public void imprimirCodigo(){
        System.out.println("Se detectaron " + this.codigo.size() + " lineas de codigo");
        for(int i=0; i<this.codigo.size(); i++){
            System.out.println((i+1) + ". " + this.codigo.get(i));
        }
    }

    //Metodo utilizado por el Main para imprimir los tokens generados
    public void imprimirTokens(){
        System.out.println("Se detectaron " + this.tokens.size() + " tokens en el codigo");
        for(int i=0; i < this.tokens.size(); i++){
            if (this.tokens.get(i).getSegundo()!=null)
                System.out.println("En la linea " + this.nroLineas.get(i) + ", token nro= " +this.tokens.get(i).getPrimero() + ", ref= " + this.tokens.get(i).getSegundo() + ", lexema= " + this.tablaDeSimbolo.obtenerValor(this.tokens.get(i).getSegundo()));
            else
                System.out.println("En la linea " + this.nroLineas.get(i) + ", token nro= " +this.tokens.get(i).getPrimero() + ", ref= " + this.tokens.get(i).getSegundo() + ", lexema= " + this.tablaDeSimbolo.obtenerValor(this.tokens.get(i).getPrimero()));
        }
    }

    //Metodo utilizado por el Main para imprimir los errores lexicos detectados
    public void imprimirErroresLexicos(){
        System.out.println("Se detectaron " + this.errores.size() + " errores lexicos en el codigo");
        for(String e: this.errores){
            System.out.println(" - " + e);
        }
    }

    public boolean hayError(){
        return (this.errores.size() > 0);
    }

    //Metodo para obtener la tabla de simbolo generada por el lexico
    public TablaSimbolo getTablaSimbolo(){
        return this.tablaDeSimbolo;
    }

}