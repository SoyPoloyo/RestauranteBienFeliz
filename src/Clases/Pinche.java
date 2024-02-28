package Clases;



public class Pinche extends Empleado {
    private String fechaNacimiento;

    // Constructor
    public Pinche(int id, String nombre, String apellidos, String dni, String numeroSeguridadSocial, String telefonoFijo, String telefonoMovil, String fechaNacimiento) {
        super(id, nombre, apellidos, dni, numeroSeguridadSocial, telefonoFijo, telefonoMovil);
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Pinche{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", dni='" + getDni() + '\'' +
                ", numeroSeguridadSocial='" + getNumeroSeguridadSocial() + '\'' +
                ", telefonoFijo='" + getTelefonoFijo() + '\'' +
                ", telefonoMovil='" + getTelefonoMovil() + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}