public class Registro
{
    private String registro;
    private boolean estado;

    public Registro(String registro, boolean estado)
    {
        this.registro = registro;
        this.estado = estado;
    }

    public String getRegistro()
    {
        return this.registro;
    }

    public void setRegistro(String registro)
    {
        this.registro = registro;
    }

    public boolean estaDisponible()
    {
        return this.estado;
    }

    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }
}