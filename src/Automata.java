public class Automata {

    private Dupla<Integer,Integer> [][] transiciones; // Matriz de transiciones
    private final int CANT_ESTADOS = 18;
    private final int CANT_SIMBOLOS = 19;

    public Automata (){
        transiciones= new Dupla[CANT_ESTADOS][CANT_SIMBOLOS];
        // ACA SE VAN A CARGAR LAS TRANSICIONES
    }


}
