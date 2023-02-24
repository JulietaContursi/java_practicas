import java.util.Random;
import java.util.Scanner;

public class candyCrush {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];  
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(4) + 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int maxAzules = 0;  
        int maxCantidadAzules = 0;  

        //buscamos la columna con mas azules
        for (int j = 0; j < 5; j++) {
            int cantidad = 0;
            for (int i = 0; i < 5; i++) {
                if (matriz[i][j] == 1) {
                    cantidad++;
                }
            }
            if (cantidad > maxCantidadAzules) {  
                maxCantidadAzules = cantidad;
                maxAzules = j;
            }
        }
        System.out.println("La columna con más azules es la: " + maxAzules);

        //buscamos si en la primer fila hay verdes o no
          boolean hayNumero4 = false;
          for (int j = 0; j < 5; j++) {
              if (matriz[0][j] == 4) {
                  hayNumero4 = true;
                  break;
              }
          }
          if (hayNumero4) {
              System.out.println("Hay color verde en la fila 1");
          } else {
              System.out.println("No hay ningun color verde en la fila 1");
          }
      }
  }