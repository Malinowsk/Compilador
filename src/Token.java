public class Token {
    private Integer numero;//numero de token

    private String lexema;//contenido

    private String uso = null;//indica si es variable, parametro, funcion, etc.
    private String tipo = null;//tipo de variable
    private String tipoParametro = null;//tipo del parametro, si el token es una funcion
    private String funcionReferenciada = null;//funcion a la que se referencia, si el token es una variable con funcion designada
    private String parametro = null;

    Token(Integer n, String l){
        this.numero= n;
        this.lexema= l;
    }

    @Override
    public String toString() {
        if(uso=="funcion designada a variable")
            return "numero=" + numero + ", lexema= " + lexema + ", uso= " + uso + ", tipo= " + tipo + ", funcion designada= " + funcionReferenciada;
        else
            return "numero=" + numero + ", lexema= " + lexema + ", uso= " + uso + ", tipo= " + tipo;
    }

    @Override
    public boolean equals(Object o) {
        Token t = (Token) o;
        return t.getLexema().equals(this.lexema);
    }

    public Integer getNumero() {
        return numero;
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

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    public String getFuncionReferenciada() {
        return funcionReferenciada;
    }

    public void setFuncionReferenciada(String funcionReferenciada) {
        this.funcionReferenciada = funcionReferenciada;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
}
