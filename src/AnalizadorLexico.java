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
    private int indiceToken; //Indice que servira para recorrer tanto la lista de tokens como la de sus nros de linea
    private ArrayList< String > errores; //Lista donde se guardaran los errores lexicos

    //Constructor
    public AnalizadorLexico() {
        this.automata = new Automata();
        this.tablaDeSimbolo = new TablaSimbolo();
        this.codigo = new ArrayList<String>();
        this.tokens = new ArrayList< Dupla<Integer, Integer> >();
        this.nroLineas = new ArrayList<Integer>();
        this.indiceToken = 0;
        this.errores = new ArrayList< String >();
    }

    //Metodo que lee un codigo para generar la lista de tokens respectiva
    public void leerNuevoArchivo(String path) throws FileNotFoundException {

        Scanner scannan = new Scanner(new File(path));
        while(scannan.hasNext()){
            this.codigo.add(scannan.nextLine());
        }

        int estadoActual = 0; //Comienza en el estado inicial
        int nroLinea = 1;
        for ( String linea : this.codigo ) { //Leo hasta el final del archivo
            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                boolean reutilizarCaracter = true; //booleano que indica si el caracter se debe seguir utilizando
                while (reutilizarCaracter) {
                    int proximoEstado = this.automata.getProximoEstado(estadoActual, caracter);
                    if (proximoEstado == -1) {
                        this.errores.add("Linea " + nroLinea + ", caracter invalido:"+ caracter);
                        while( (caracter != ';') && (i != linea.length()) ) //avanza de caracteres hasta llegar al punto y coma o hasta el final de la linea y poder seguir leyendo las siguientes lineas
                            caracter = linea.charAt(i++);
                        reutilizarCaracter = false;
                    } else {
                        reutilizarCaracter = this.ejecutarAS(this.automata.getAccionSemantica(estadoActual, caracter), caracter, nroLinea);
                        estadoActual = proximoEstado;
                    }
                }
            }
            //Al terminar cada linea se tiene el caracter nl (nueva linea), el cual lo detectamos "manualmente"
            char nl= 10;
            int proximoEstado = this.automata.getProximoEstado(estadoActual, nl);
            if (proximoEstado == -1) {
                this.errores.add("Linea " + nroLinea + ", caracter invalido:"+ nl);
                return;
            } else {
                this.ejecutarAS(this.automata.getAccionSemantica(estadoActual, nl), nl, nroLinea);
                estadoActual = proximoEstado;
            }

            nroLinea++;
        }

    }

    //Metodo que ejecuta la accion semantica indicada por el parametro y el cual indicará si el token debe ser reutilizado
    private boolean ejecutarAS(int AS, char caracter, int nroLinea){
        if (AS==1) return AccionSemantica.accion1(this.tokens, this.tablaDeSimbolo, this.nroLineas, nroLinea, this.errores);
        if (AS==2) return AccionSemantica.accion2(caracter);
        if (AS==3) return AccionSemantica.accion3(caracter);
        if (AS==4) return AccionSemantica.accion4(this.tokens, caracter, this.nroLineas, nroLinea);
        if (AS==5) return AccionSemantica.accion5(this.tokens, this.tablaDeSimbolo, this.nroLineas, nroLinea, this.errores);
        if (AS==6) return AccionSemantica.accion6(this.tokens, this.nroLineas, nroLinea);
        if (AS==7) return AccionSemantica.accion7(this.tokens, this.nroLineas, nroLinea);
        if (AS==8) return AccionSemantica.accion8(this.tokens, this.nroLineas, nroLinea);
        if (AS==9) return AccionSemantica.accion9(this.tokens, this.nroLineas, nroLinea);
        if (AS==10) return AccionSemantica.accion10(this.tokens, this.nroLineas, nroLinea);
        if (AS==11) return AccionSemantica.accion11(this.tokens, caracter, this.nroLineas, nroLinea);
        if (AS==12) return AccionSemantica.accion12(this.tokens, this.nroLineas, nroLinea);
        if (AS==13) return AccionSemantica.accion13(this.tokens, this.nroLineas, nroLinea);
        if (AS==14) return AccionSemantica.accion14(this.tokens, this.nroLineas, nroLinea);
        if (AS==15) return AccionSemantica.accion15(this.tokens, this.tablaDeSimbolo, this.nroLineas, nroLinea, this.errores);
        if (AS==16) return AccionSemantica.accion16(caracter);
        if (AS==17) return AccionSemantica.accion17(this.tokens, this.tablaDeSimbolo, this.nroLineas, nroLinea);
        if (AS==18) return AccionSemantica.accion18(this.tokens, this.tablaDeSimbolo, this.nroLineas, nroLinea);
        if (AS==19) return AccionSemantica.accion19(this.tokens, this.nroLineas, nroLinea);
        return false;
    }

    //Metodo para obtener el token siguiente de la lista
    public Dupla<Integer, Integer> getSiguienteToken(){
        if (this.indiceToken== this.tokens.size())
            return new Dupla<Integer, Integer>(0, null); // se devuelve 0 porque se termino el codigo
        return this.tokens.get(this.indiceToken++);
    }

    //Metodo para obtener el nro de linea del token actual
    public int getNroLineaToken() {return this.nroLineas.get(this.indiceToken-1);} // se usa indice menos 1 ya que previamente se utiliza getSiguienteToken(), el cual suma uno al indice

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

    //Metodo para obtener la tabla de simbolo generada por el lexico
    public TablaSimbolo getTablaSimbolo(){
        return this.tablaDeSimbolo;
    }

}