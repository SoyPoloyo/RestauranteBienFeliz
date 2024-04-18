package Clases;

import java.util.ArrayList;
import java.util.List;
public class Cocinero extends Empleado{

     int tiempoDeServicio;
     List<Pinche> pinches;

    // Constructor
    public Cocinero(int id, String nombre, String apellidos, String dni, String numeroSeguridadSocial, String telefonoFijo, String telefonoMovil, int tiempoDeServicio) {
        super(id, nombre, apellidos, dni, numeroSeguridadSocial, telefonoFijo, telefonoMovil);
        this.tiempoDeServicio = tiempoDeServicio;
        this.pinches = new ArrayList<>();
    }


    // Getters y Setters
    public int getTiempoDeServicioo() {
        return tiempoDeServicio;
    }
    public void setTiempoDeServicio(int anosDeServicio) {
        this.tiempoDeServicio = anosDeServicio;
    }

    public List<Pinche> getPinches() {
        return pinches;
    }

    public void addPinche(Pinche pinche) {
        this.pinches.add(pinche);
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
                ", pinches=" + pinches +
                '}';
    }

}
