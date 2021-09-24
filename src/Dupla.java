import java.util.Objects;

public class Dupla<X,Y> {

    private X primero;
    private Y segundo;

    public Dupla(X primero , Y segundo){
        this.primero=primero;
        this.segundo=segundo;
    }

    public X getPrimero() {
        return primero;
    }
    public void setPrimero(X primero) {
        this.primero = primero;
    }
    public Y getSegundo() {
        return segundo;
    }
    public void setSegundo(Y segundo) {
        this.segundo = segundo;
    }

    @Override
    public boolean equals(Object o) {
        Dupla retorno = (Dupla) o;
        return this.segundo.equals(retorno.getSegundo());
    }

}
