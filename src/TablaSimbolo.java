import java.util.*;

//Clase que hace de la tabla de simbolos
public class TablaSimbolo {

    private final int MIN_ID = 286; //este sera el numero inicial para las referencias a la tabla
    private HashMap<Integer,Token> tablaDeSimbolo;
    private Integer autoincrementador;

    public TablaSimbolo(){
        this.tablaDeSimbolo = new HashMap<>();
        this.cargarIdentificadoresUnicos();
        autoincrementador = MIN_ID;
    }

    //Metodo que carga la tabla de simbolos con los valores ascii utilizados, las palabras reservedas y tokens de doble caracter
    private void cargarIdentificadoresUnicos(){
        //cada tupla de la tabla estara formada de la sig manera: (nroRefTabla, <IdToken, Lexema>)
        tablaDeSimbolo.put(40,new Token(40,"("));
        tablaDeSimbolo.put(41,new Token(41,")"));
        tablaDeSimbolo.put(42,new Token(42,"*"));
        tablaDeSimbolo.put(43,new Token(43,"+"));
        tablaDeSimbolo.put(44,new Token(44,","));
        tablaDeSimbolo.put(45,new Token(45,"-"));
        tablaDeSimbolo.put(47,new Token(47,"/"));
        tablaDeSimbolo.put(59,new Token(59,";"));
        tablaDeSimbolo.put(60,new Token(60,"<"));
        tablaDeSimbolo.put(62,new Token(62,">"));
        tablaDeSimbolo.put(58,new Token(58,":"));

        tablaDeSimbolo.put(257,new Token(257,"IF"));
        tablaDeSimbolo.put(258,new Token(258,"THEN"));
        tablaDeSimbolo.put(259,new Token(259,"ELSE"));
        tablaDeSimbolo.put(260,new Token(260,"ENDIF"));
        tablaDeSimbolo.put(261,new Token(261,"PRINT"));
        tablaDeSimbolo.put(262,new Token(262,"FUNC"));
        tablaDeSimbolo.put(263,new Token(263,"RETURN"));
        tablaDeSimbolo.put(264,new Token(264,"BEGIN"));
        tablaDeSimbolo.put(265,new Token(265,"END"));
        tablaDeSimbolo.put(266,new Token(266,"BREAK"));
        tablaDeSimbolo.put(267,new Token(267,"ULONG"));
        tablaDeSimbolo.put(268,new Token(268,"DOUBLE"));
        tablaDeSimbolo.put(269,new Token(269,"WHILE"));
        tablaDeSimbolo.put(270,new Token(270,"DO"));

        tablaDeSimbolo.put(271,new Token(271,">="));
        tablaDeSimbolo.put(272,new Token(272,"<="));
        tablaDeSimbolo.put(273,new Token(273,":="));
        tablaDeSimbolo.put(274,new Token(274,"=="));
        tablaDeSimbolo.put(275,new Token(275,"&&"));
        tablaDeSimbolo.put(276,new Token(276,"||"));

        //identificadores con clave = 277
        //constantes con clave = 278
        //double con clave = 279
        //cadena con clave = 280

        tablaDeSimbolo.put(281,new Token(281,"POST"));
        tablaDeSimbolo.put(282,new Token(282,"TRY"));
        tablaDeSimbolo.put(283,new Token(283,"CATCH"));
        tablaDeSimbolo.put(284,new Token(284,"<>"));
        tablaDeSimbolo.put(285,new Token(285,"CALL"));
    }

    public void agregarToken(String s, int i){
        tablaDeSimbolo.put(autoincrementador++,new Token(i,s));
    }

    public boolean existeToken(String s){
        return tablaDeSimbolo.containsValue(new Token(null,s));
    }

    //Obtiene la referencia a la tabla del string enviada por parametro
    public int obtenerReferenciaTabla(String s){
        Set<Integer> claves =tablaDeSimbolo.keySet();
        for(Integer clave: claves){
            if(tablaDeSimbolo.get(clave).getLexema().equals(s)){
                return clave;
            }
        }
        return -1;
    }

    //Metodo que obtiene el valor para una referencia a la tabla
    public String obtenerValor(Integer i){
        if (tablaDeSimbolo.get(i)!=null)
            return tablaDeSimbolo.get(i).getLexema();
        return null;
    }

    public Token obtenerToken(Integer i){
        if (tablaDeSimbolo.get(i)!=null)
            return tablaDeSimbolo.get(i);
        return null;
    }

    public void imprimirTabla(){
        Set<Integer> claves =tablaDeSimbolo.keySet();
        ArrayList<Integer> aux = new ArrayList<Integer>();
        for (Integer clave: claves){
            aux.add(clave);
        }
        Collections.sort(aux);
        for(Integer clave: aux){
            System.out.println("Referencia en tabla= "+clave+ ", token= "+ tablaDeSimbolo.get(clave));
        }
    }

}
