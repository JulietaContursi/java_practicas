import java.util.Scanner;

public class tecnicoEmpresa {

    public static void main(String[] args) {
        boolean salir = false;
        do {
            mostrarMenu();
            Scanner sc = new Scanner(System.in);
            System.out.print("¿Desea regresar al menú principal? (si / no) ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("         Menú     ");
        System.out.println("1.      Opción 1  ");
        System.out.println("2.      Opción 2 .");
        System.out.println("3.      Salir     ");
        System.out.println("4.      Salir     ");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("aca ingresarias la lista ");
            mostrarMenu();
        } else 
        if (opcion == 2) {
            System.out.println("aca verias las comisiones");
            mostrarMenu();
        } else 
        if (opcion == 3) {
            System.out.println("aca verias el servicio estrella");
        } else 
        if {
            System.out.println("Opción no válida. Introduce una opción válida.");
            mostrarMenu();
        }
    }
}



