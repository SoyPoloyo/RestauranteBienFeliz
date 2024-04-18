package Clases;

public class Estante {
    private String codigo;
    private String dimensiones;

    public Estante(String codigo, String dimensiones) {
        this.codigo = codigo;
        this.dimensiones = dimensiones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        return "Estante{" +
                "codigo='" + codigo + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                '}';
    }
}
