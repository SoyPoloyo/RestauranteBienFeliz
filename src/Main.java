
import java.util.Scanner;
import Clases.Cocinero;
import Clases.Pinche;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      while (true){
          System.out.println("Bienvenido al Restaurante BienFeliz, por favor seleccione una opción: ");
            System.out.println("1. Crear Cocinero");
            System.out.println("2. Crear Pinche");
            System.out.println("3. Salir");

            System.out.print("Ingrese el numero de la opción que desea: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Importante para consumir el salto de línea restante

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el id del cocinero: ");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el nombre del cocinero: ");
                    String nombre = scanner.next();
                    System.out.println("Ingrese los apellidos del cocinero: ");
                    String apellidos = scanner.next();
                    System.out.println("Ingrese el dni del cocinero: ");
                    String dni = scanner.next();
                    System.out.println("Ingrese el numero de seguridad social del cocinero: ");
                    String numeroSeguridadSocial = scanner.next();
                    System.out.println("Ingrese el telefono fijo del cocinero: ");
                    String telefonoFijo = scanner.next();
                    System.out.println("Ingrese el telefono movil del cocinero: ");
                    String telefonoMovil = scanner.next();
                    System.out.println("Ingrese el tiempo de servicio del cocinero: ");
                    int tiempoDeServicio = scanner.nextInt();

                    Cocinero cocinero1 = new Cocinero(id, nombre, apellidos, dni, numeroSeguridadSocial, telefonoFijo, telefonoMovil, tiempoDeServicio);
                    System.out.println(cocinero1);
                    break;


                case 2:
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

                    Pinche pinche1 = new Pinche(idPinche, nombrePinche, apellidosPinche, dniPinche, numeroSeguridadSocialPinche, telefonoFijoPinche, telefonoMovilPinche, fechaNacimiento);
                    System.out.println(pinche1);
                    break;

                case 3:
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
      }



    }
}