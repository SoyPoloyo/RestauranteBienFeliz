import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

import Clases.Cocinero;
import Clases.Pinche;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Cocinero> cocineros = new ArrayList<>();
    static ArrayList<Pinche> pinches = new ArrayList<>();


    public static void main(String[] args) {
        // Crea instancias iniciales de Cocinero
        cocineros.add(new Cocinero(1, "Carlos", "Gómez", "12345678A", "123456789", "5551234", "600123456", 5));
        cocineros.add(new Cocinero(2, "Ana", "López", "87654321B", "987654321", "5555678", "610123456", 10));
        cocineros.add(new Cocinero(3, "Luis", "Martín", "23456789C", "234567890", "5559012", "620123456", 3));

        // Crea instancias iniciales de Pinche
        pinches.add(new Pinche(4, "María", "Pérez", "43215678D", "432156789", "5553456", "630123456", "1990-05-15"));
        pinches.add(new Pinche(5, "Jorge", "González", "56784321E", "567843210", "5557890", "640123456", "1985-10-25"));
        pinches.add(new Pinche(6, "Carmen", "Ruiz", "67893215F", "678932150", "5550123", "650123456", "1992-03-30"));

        Menu();
    }

    public static void Menu() {
        boolean continuar = true;
        while (continuar) {

            try {
                System.out.println("==========  ========== ========== ========== ========== ========== ========== ");
                System.out.println("Bienvenido al Restaurante BienFeliz, por favor seleccione una opción: ");
                System.out.println("------- Creacion -------");
                System.out.println("1. Crear Cocinero");
                System.out.println("2. Crear Pinche");
                System.out.println("------- Listado -------");
                System.out.println("3. Listar Cocineros");
                System.out.println("4. Listar Pinches");
                System.out.println("5. Salir");
                System.out.println("==========  ========== ========== ========== ========== ========== ========== ");

                System.out.print("Ingrese el numero de la opción que desea: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Importante para consumir el salto de línea restante

                switch (opcion) {
                    case 1:
                        CrearCocinero();
                        break;

                    case 2:
                        CrearPincher();
                        break;

                    case 3:
                        ListarCocineros();
                        break;

                    case 4:
                        ListarPinches();
                        break;

                    case 5:
                        System.out.println("Gracias por usar el sistema");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no valida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido para seleccionar una opción.");
                scanner.nextLine(); // Consumir el input incorrecto para evitar un bucle infinito
            }
        }
    }

    public static void CrearCocinero() {
        System.out.println("Ingrese el id del cocinero: ");
        int idCocinero = scanner.nextInt();
        System.out.println("Ingrese el nombre del cocinero: ");
        String nombreCocinero = scanner.next();
        System.out.println("Ingrese los apellidos del cocinero: ");
        String apellidosCocinero = scanner.next();
        System.out.println("Ingrese el dni del cocinero: ");
        String dniCocinero = scanner.next();
        System.out.println("Ingrese el numero de seguridad social del cocinero: ");
        String numeroSeguridadSocialCocinero = scanner.next();
        System.out.println("Ingrese el telefono fijo del cocinero: ");
        String telefonoFijoCocinero = scanner.next();
        System.out.println("Ingrese el telefono movil del cocinero: ");
        String telefonoMovilCocinero = scanner.next();
        System.out.println("Ingrese el tiempo de servicio del cocinero: ");
        int tiempoDeServicio = scanner.nextInt();

        Cocinero cocinero = new Cocinero(idCocinero, nombreCocinero, apellidosCocinero, dniCocinero, numeroSeguridadSocialCocinero, telefonoFijoCocinero, telefonoMovilCocinero, tiempoDeServicio);
        cocineros.add(cocinero);
        System.out.println("Cocinero creado: " + cocinero);
    }

    public static void ListarCocineros() {
        System.out.println("Listado de cocineros: ");
        for (Cocinero cocinero : cocineros) {
            System.out.println(cocinero);
        }
    }

    public static void CrearPincher() {
        System.out.println("Ingrese el id del pinche: ");
        int idPinche = scanner.nextInt();
        System.out.println("Ingrese el nombre del pinche: ");
        String nombrePinche = scanner.next();
        System.out.println("Ingrese los apellidos del pinche: ");
        String apellidosPinche = scanner.next();
        System.out.println("Ingrese el dni del pinche: ");
        String dniPinche = scanner.next();
        System.out.println("Ingrese el numero de seguridad social del pinche: ");
        String numeroSeguridadSocialPinche = scanner.next();
        System.out.println("Ingrese el telefono fijo del pinche: ");
        String telefonoFijoPinche = scanner.next();
        System.out.println("Ingrese el telefono movil del pinche: ");
        String telefonoMovilPinche = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento del pinche: ");
        String fechaNacimiento = scanner.next();

        Pinche pinche = new Pinche(idPinche, nombrePinche, apellidosPinche, dniPinche, numeroSeguridadSocialPinche, telefonoFijoPinche, telefonoMovilPinche, fechaNacimiento);
        pinches.add(pinche);
        System.out.println("Pinche creado: " + pinche);
    }

    public static void ListarPinches() {
        System.out.println("Listado de pinches: ");
        for (Pinche pinche : pinches) {
            System.out.println(pinche);
        }
    }


}

