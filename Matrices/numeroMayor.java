//escribir un programa en Java que reciba una matriz cuadrada de tamaño 3x3 y la recorra para encontrar y mostrar por pantalla el mayor número contenido en ella
package Matrices;

import java.util.Random;
import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];  
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;

        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
        if (matriz[i][j] > max) { 
            max = matriz[i][j]; 
        }
    }
} 
    System.out.println("El numero mas alto en la matriz es: " + max);
  }
} 