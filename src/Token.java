public class Token {
    private Integer numero;//numero de token

    private String lexema;//contenido

    private String uso = null;//indica si es variable, parametro, funcion, etc.
    private String tipo = null;//tipo de variable
    private String tipoParametro = null;//tipo del parametro, si el token es una funcion
    private String parametro = null;//En caso de ser una funcion este atributo tendra el id del parametro

    private String nombre = null;//En caso de ser una constante o una cadena se guarda el nombre que se usara para referenciarla en el codigo assembler

    Token(Integer n, String l){
        this.numero= n;
        this.lexema= l;

    }

    @Override
    public String toString() {
        if(nombre != null) {
            return "numero=" + numero + ", lexema= " + lexema + ", uso= " + uso + ", tipo= " + tipo + ", nombre= " + nombre;
        }else {
            if(tipoParametro!=null)
                return "numero=" + numero + ", lexema= " + lexema + ", uso= " + uso + ", tipo= " + tipo + ", tipoParametro= " + tipoParametro + ", parametro= " + parametro;
            return "numero=" + numero + ", lexema= " + lexema + ", uso= " + uso + ", tipo= " + tipo;
        }
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

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
