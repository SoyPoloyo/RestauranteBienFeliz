import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

import Clases.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Cocinero> cocineros = new ArrayList<>();
    static ArrayList<Pinche> pinches = new ArrayList<>();
    static ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    static ArrayList<Estante> estantes = new ArrayList<>();
    static ArrayList<Almacen> almacenes = new ArrayList<>();


    public static void main(String[] args) {
        // Crea instancias iniciales de Cocinero
        cocineros.add(new Cocinero(1, "Carlos", "Gómez", "12345678A", "123456789", "5551234", "600123456", 5));
        cocineros.add(new Cocinero(2, "Ana", "López", "87654321B", "987654321", "5555678", "610123456", 10));
        cocineros.add(new Cocinero(3, "Luis", "Martín", "23456789C", "234567890", "5559012", "620123456", 3));

        // Crea instancias iniciales de Pinche
        pinches.add(new Pinche(4, "María", "Pérez", "43215678D", "432156789", "5553456", "630123456", "1990-05-15"));
        pinches.add(new Pinche(5, "Jorge", "González", "56784321E", "567843210", "5557890", "640123456", "1985-10-25"));
        pinches.add(new Pinche(6, "Carmen", "Ruiz", "67893215F", "678932150", "5550123", "650123456", "1992-03-30"));

        ingredientes.add(new Ingrediente("Tomate", "5"));
        ingredientes.add(new Ingrediente("Cebolla", "3"));
        ingredientes.add(new Ingrediente("Pimiento", "4"));

        estantes.add(new Estante("1", "2x2"));
        estantes.add(new Estante("2", "3x3"));
        estantes.add(new Estante("3", "4x4"));

        almacenes.add(new Almacen("1", "Calle 1", "Para guardar ingredientes frios"));
        almacenes.add(new Almacen("2", "Calle 2", "Para guardar ingredientes calientes"));

        Menu();
    }

    public static void Menu() {
        boolean continuar = true;
        while (continuar) {

            try {
                System.out.println("==========  ========== ========== ========== ========== ========== ========== ");
                System.out.println("Bienvenido al Restaurante BienFeliz, por favor seleccione una opción: ");
                System.out.println("------- Creacion -------");
                System.out.println("1. Registrar Cocinero");
                System.out.println("2. Registrar Pinche");
                System.out.println("3. Registrar Almacen");
                System.out.println("4. Registrar Estantes");
                System.out.println("5. Registrar Ingredientes");
                System.out.println("------- Listado -------");
                System.out.println("6. Listar Cocineros");
                System.out.println("7. Listar Pinches");
                System.out.println("------- Asociaciones -------");
                System.out.println("8. Asignar Pinche a Cocinero");
                System.out.println("9. Salir");
                System.out.println("==========  ========== ========== ========== ========== ========== ========== ");

                System.out.print("Ingrese el numero de la opción que desea: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Importante para consumir el salto de línea restante

                switch (opcion) {
                    case 1:
                        RegistarCocinero();
                        break;

                    case 2:
                        RegistrarPincher();
                        break;

                    case 3:
                        RegistarAlmacen();
                        break;

                    case 4:
                        RegistarEstantes();
                        break;

                    case 5:
                        RegistarIngrediente();
                        break;
                    case 6:
                        ListarCocineros();
                        break;
                    case 7:
                        ListarPinches();
                        break;
                    case 8:
                        AsociarPincheCocinero();
                        break;

                    case 9:
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

    public static void RegistarCocinero() {
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

    public static void RegistrarPincher() {
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

    public static void AsociarPincheCocinero() {

        System.out.println("Ingrese el ID del cocinero a asociar:");
        int idCocinero = scanner.nextInt();
        Cocinero cocinero = buscarCocineroPorId(idCocinero);

        if (cocinero != null) {
            System.out.println("Ingrese el ID del pinche a asociar: ");
            int idPinche = scanner.nextInt();
            Pinche pinche = buscarPinchePorId(idPinche);

            if (pinche != null) {
                cocinero.addPinche(pinche);
                System.out.println("Pinche asociado al cocinero: " + cocinero);
            } else {
                System.out.println("No se encontró un pinche con el ID ingresado.");
            }
        } else {
            System.out.println("No se encontró un cocinero con el ID ingresado.");
        }
    }

    public static Cocinero buscarCocineroPorId(int id) {
        for (Cocinero cocinero : cocineros) {
            if (cocinero.getId() == id) {
                return cocinero;
            }
        }
        return null;
    }

    public static Pinche buscarPinchePorId(int id) {
        for (Pinche pinche : pinches) {
            if (pinche.getId() == id) {
                return pinche;
            }
        }
        return null;
    }

    public static void RegistarAlmacen() {

        System.out.println("Ingrese el codigo del almacen: ");
        String codigoAlmacen = scanner.next();
        System.out.println("Ingrese la direccion del almacen: ");
        String direccionAlmacen = scanner.next();
        System.out.println("Ingrese la descripcion del almacen: ");
        String descripcionAlmacen = scanner.next();

        Almacen almacen = new Almacen(codigoAlmacen, direccionAlmacen, descripcionAlmacen);
        almacenes.add(almacen);
        System.out.println("ALmacen creado: " + almacen);
    }

    public static void RegistarEstantes() {

        System.out.println("Ingrese el codigo del estante: ");
        String codigoEstante = scanner.next();
        System.out.println("Ingrese las dimensiones del estante: ");
        String dimensionesEstante = scanner.next();

        Estante estante = new Estante(codigoEstante, dimensionesEstante);
        estantes.add(estante);

        System.out.println("Estante creado: " + estante);
    }

    public static void RegistarIngrediente() {

        System.out.println("Ingrese el nombre del ingrediente: ");
        String nombreIngrediente = scanner.next();
        System.out.println("Ingrese la cantidad del ingrediente: ");
        String cantidadIngrediente = scanner.next();

        Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente);
        ingredientes.add(ingrediente);

        System.out.println("Ingrediente creado: " + ingrediente);
    }
}

