import java.util.HashMap;

//Clase que hace de la tabla de simbolos
public class TablaSimbolo {

    private final int MIN_ID = 280;
    private HashMap<Integer,Dupla<Integer,String>> tablaDeSimbolo;
    private Integer autoincrementador;


    public TablaSimbolo(){
        this.tablaDeSimbolo = new HashMap<>();
        this.cargarIdentificadoresUnicos();
        autoincrementador = MIN_ID;
    }

    private void cargarIdentificadoresUnicos(){

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

        tablaDeSimbolo.put(256,new Dupla<Integer, String>(256,"IF"));
        tablaDeSimbolo.put(257,new Dupla<Integer, String>(257,"THEN"));
        tablaDeSimbolo.put(258,new Dupla<Integer, String>(258,"ELSE"));
        tablaDeSimbolo.put(259,new Dupla<Integer, String>(259,"ENDIF"));
        tablaDeSimbolo.put(260,new Dupla<Integer, String>(260,"PRINT"));
        tablaDeSimbolo.put(261,new Dupla<Integer, String>(261,"FUNC"));
        tablaDeSimbolo.put(262,new Dupla<Integer, String>(262,"RETURN"));
        tablaDeSimbolo.put(263,new Dupla<Integer, String>(263,"BEGIN"));
        tablaDeSimbolo.put(264,new Dupla<Integer, String>(264,"END"));
        tablaDeSimbolo.put(265,new Dupla<Integer, String>(265,"BREAK"));
        tablaDeSimbolo.put(266,new Dupla<Integer, String>(266,"ULONG"));
        tablaDeSimbolo.put(267,new Dupla<Integer, String>(267,"DOBLE"));
        tablaDeSimbolo.put(268,new Dupla<Integer, String>(268,"WHILE"));
        tablaDeSimbolo.put(269,new Dupla<Integer, String>(269,"DO"));
        tablaDeSimbolo.put(270,new Dupla<Integer, String>(270,">="));
        tablaDeSimbolo.put(271,new Dupla<Integer, String>(271,"<="));
        tablaDeSimbolo.put(272,new Dupla<Integer, String>(272,":="));
        tablaDeSimbolo.put(273,new Dupla<Integer, String>(273,"=="));
        tablaDeSimbolo.put(274,new Dupla<Integer, String>(274,"&&"));
        tablaDeSimbolo.put(275,new Dupla<Integer, String>(275,"||"));

    }


    public void agregarToken(String s, int i){
        tablaDeSimbolo.put(autoincrementador++,new Dupla<Integer, String>(i,s));
    }

    public boolean existeToken(String s){
        return tablaDeSimbolo.containsValue(new Dupla<Integer,String>(null,s));
    }

}
