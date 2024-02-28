package Clases;

public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String numeroSeguridadSocial;
    private String telefonoFijo;
    private String telefonoMovil;

    // Constructor
    public Empleado(int id, String nombre, String apellidos, String dni, String numeroSeguridadSocial, String telefonoFijo, String telefonoMovil) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNumeroSeguridadSocial() { return numeroSeguridadSocial; }
    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) { this.numeroSeguridadSocial = numeroSeguridadSocial; }

    public String getTelefonoFijo() { return telefonoFijo; }
    public void setTelefonoFijo(String telefonoFijo) { this.telefonoFijo = telefonoFijo; }

    public String getTelefonoMovil() { return telefonoMovil; }
    public void setTelefonoMovil(String telefonoMovil) { this.telefonoMovil = telefonoMovil; }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", telefonoFijo='" + telefonoFijo + '\'' +
                ", telefonoMovil='" + telefonoMovil + '\'' +
                '}';
    }
}