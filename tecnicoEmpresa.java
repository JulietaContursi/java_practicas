import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class tecnicoEmpresa {

    public static void main(String[] args) {
        boolean salir = false;
        ingresarLista();
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
        }
        if (opcion == 2) {
            System.out.println("aca verias las comisiones");
            mostrarMenu();
        } else 
        if (opcion == 3) {
            System.out.println("aca verias el servicio estrella");
        } else 
        if (opcion == 4){
            System.out.println("No hay nada mas que ver aca");
        }
    }

    public static void ingresarLista(){
    Random rnd = new Random();
    int[][] costoServicio = new int[2][4];
    int[][] servicioPrestado = new int[2][4];{
    //recorre la matroz para llenar los servicios prestados por cada tecnico 
    for (int i = 0; i < 3; i++) {
        for(int j=0;j <3 ; j++){
        costoServicio[i][i] = rnd.nextInt();
        servicioPrestado[j][i] = rnd.nextInt();
        }
      }
    }
}
}