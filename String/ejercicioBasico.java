package String;

import java.util.Scanner;

public class ejercicioBasico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][2];

        //se pide al usuario que ingrese los valores para llenar la matriz
           for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
         // Copiar los valores de la matriz a un nuevo arreglo de vectores
         int[][] vectores = new int[4][2];
         for (int i = 0; i < matriz.length; i++) {
             vectores[i][0] = matriz[i][0];
             vectores[i][1] = matriz[i][1];
         }
         // Imprimir los valores del arreglo de vectores
        for (int i = 0; i < vectores.length; i++) {
            System.out.print(i);
            for (int j = 0; j < vectores[0].length; j++) {
                System.out.print(vectores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
  