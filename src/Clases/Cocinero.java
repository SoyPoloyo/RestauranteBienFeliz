package Clases;

public class Cocinero extends Empleado{

     int tiempoDeServicio;

    // Constructor
    public Cocinero(int id, String nombre, String apellidos, String dni, String numeroSeguridadSocial, String telefonoFijo, String telefonoMovil, int tiempoDeServicio) {
        super(id, nombre, apellidos, dni, numeroSeguridadSocial, telefonoFijo, telefonoMovil);
        this.tiempoDeServicio = tiempoDeServicio;
    }

    // Getters y Setters
    public int getTiempoDeServicioo() {
        return tiempoDeServicio;
    }
    public void setTiempoDeServicio(int anosDeServicio) {
        this.tiempoDeServicio = anosDeServicio;
    }

    @Override
    public String toString() {
        return "Cocinero{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", numeroSeguridadSocial='" + getNumeroSeguridadSocial() + '\'' +
                ", telefonoFijo='" + getTelefonoFijo() + '\'' +
                ", telefonoMovil='" + getTelefonoMovil() + '\'' +
                ", anosDeServicio=" + tiempoDeServicio +
                '}';
    }

}
