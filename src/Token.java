public class Token {
    private Integer numero;//numero de token

    private String lexema;//contenido

    private String uso = null;//indica si es variable, parametro, funcion, etc.
    private String tipo = null;//tipo de variable
    private String ambito = null;//ambito de la variable ES NECESARIO?

    Token(Integer n, String l){
        this.numero= n;
        this.lexema= l;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", lexema= " + lexema + ", uso= " + uso + ", tipo= " + tipo + ", ambito= " + ambito;
    }

    @Override
    public boolean equals(Object o) {
        Token t = (Token) o;
        return t.getLexema().equals(this.lexema);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
}
