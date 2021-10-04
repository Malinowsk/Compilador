import java.util.HashMap;
import java.util.Set;

//Clase que hace de la tabla de simbolos
public class TablaSimbolo {

    private final int MIN_ID = 285; //este sera el numero inicial para las referencias a la tabla
    private HashMap<Integer,Dupla<Integer,String>> tablaDeSimbolo;
    private Integer autoincrementador;

    public TablaSimbolo(){
        this.tablaDeSimbolo = new HashMap<>();
        this.cargarIdentificadoresUnicos();
        autoincrementador = MIN_ID;
    }

    //Metodo que carga la tabla de simbolos con los valores ascii utilizados, las palabras reservedas y tokens de doble caracter
    private void cargarIdentificadoresUnicos(){
        //cada tupla de la tabla estara formada de la sig manera: (nroRefTabla, <IdToken, Lexema>)
        tablaDeSimbolo.put(40,new Dupla<Integer, String>(40,"("));
        tablaDeSimbolo.put(41,new Dupla<Integer, String>(41,")"));
        tablaDeSimbolo.put(42,new Dupla<Integer, String>(42,"*"));
        tablaDeSimbolo.put(43,new Dupla<Integer, String>(43,"+"));
        tablaDeSimbolo.put(44,new Dupla<Integer, String>(44,","));
        tablaDeSimbolo.put(45,new Dupla<Integer, String>(45,"-"));
        tablaDeSimbolo.put(47,new Dupla<Integer, String>(47,"/"));
        tablaDeSimbolo.put(59,new Dupla<Integer, String>(59,";"));
        tablaDeSimbolo.put(60,new Dupla<Integer, String>(60,"<"));
        tablaDeSimbolo.put(62,new Dupla<Integer, String>(62,">"));
        tablaDeSimbolo.put(58,new Dupla<Integer, String>(58,":"));

        tablaDeSimbolo.put(257,new Dupla<Integer, String>(257,"IF"));
        tablaDeSimbolo.put(258,new Dupla<Integer, String>(258,"THEN"));
        tablaDeSimbolo.put(259,new Dupla<Integer, String>(259,"ELSE"));
        tablaDeSimbolo.put(260,new Dupla<Integer, String>(260,"ENDIF"));
        tablaDeSimbolo.put(261,new Dupla<Integer, String>(261,"PRINT"));
        tablaDeSimbolo.put(262,new Dupla<Integer, String>(262,"FUNC"));
        tablaDeSimbolo.put(263,new Dupla<Integer, String>(263,"RETURN"));
        tablaDeSimbolo.put(264,new Dupla<Integer, String>(264,"BEGIN"));
        tablaDeSimbolo.put(265,new Dupla<Integer, String>(265,"END"));
        tablaDeSimbolo.put(266,new Dupla<Integer, String>(266,"BREAK"));
        tablaDeSimbolo.put(267,new Dupla<Integer, String>(267,"ULONG"));
        tablaDeSimbolo.put(268,new Dupla<Integer, String>(268,"DOUBLE"));
        tablaDeSimbolo.put(269,new Dupla<Integer, String>(269,"WHILE"));
        tablaDeSimbolo.put(270,new Dupla<Integer, String>(270,"DO"));
        tablaDeSimbolo.put(271,new Dupla<Integer, String>(271,">="));
        tablaDeSimbolo.put(272,new Dupla<Integer, String>(272,"<="));
        tablaDeSimbolo.put(273,new Dupla<Integer, String>(273,":="));
        tablaDeSimbolo.put(274,new Dupla<Integer, String>(274,"=="));
        tablaDeSimbolo.put(275,new Dupla<Integer, String>(275,"&&"));
        tablaDeSimbolo.put(276,new Dupla<Integer, String>(276,"||"));
        //identificadores con clave = 277
        //constantes con clave = 278
        //double con clave = 279
        //cadena con clave = 280
        tablaDeSimbolo.put(281,new Dupla<Integer, String>(281,"POST"));
        tablaDeSimbolo.put(282,new Dupla<Integer, String>(282,"TRY"));
        tablaDeSimbolo.put(283,new Dupla<Integer, String>(283,"CATCH"));
        tablaDeSimbolo.put(284,new Dupla<Integer, String>(284,"<>"));
    }

    public void agregarToken(String s, int i){
        tablaDeSimbolo.put(autoincrementador++,new Dupla<Integer, String>(i,s));
    }

    public boolean existeToken(String s){
        return tablaDeSimbolo.containsValue(new Dupla<Integer,String>(null,s));
    }

    //Obtiene la referencia a la tabla del string enviada por parametro
    public int obtenerReferenciaTabla(String s){
        Set<Integer> claves =tablaDeSimbolo.keySet();
        for(Integer clave: claves){
            if(tablaDeSimbolo.get(clave).getSegundo().equals(s)){
                return clave;
            }
        }
        return -1;
    }

    //Metodo que obtiene el valor para una referencia a la tabla
    public String obtenerValor(Integer i){
        if (tablaDeSimbolo.get(i)!=null)
            return tablaDeSimbolo.get(i).getSegundo();
        return null;
    }


}
