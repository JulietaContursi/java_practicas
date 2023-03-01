//Realizar una función que reciba como parámetro dos matrices de números enteros y devuelva la matriz resultante de multiplicar las dos matrices

package Matrices;

import java.util.Random;

public class multiplicacionMatrcies {
    public static void main(String[] args) {
        int filas = 5; 
        int columnas = 5;

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        Random random = new Random();
        // llena las matrices 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = random.nextInt(50) + 1;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = random.nextInt(50) + 1;
            }
        }
        // imprime las matrices 
        System.out.println("matriz 1: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matriz 2: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matrizResultado = multiplicarMatrices(matriz1, matriz2);

        // Imprimir la matriz resultado
        System.out.println("Matriz Resultado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filasMatriz1 = matriz1.length;
        int columMatriz1 = matriz1[0].length;
        int filasMatriz2 = matriz2.length;
        int columMatriz2 = matriz2[0].length;

        if (columMatriz1 != filasMatriz2) {
            throw new IllegalArgumentException("Las matrices no se pueden multiplicar");
        }

        int[][] resultado = new int[filasMatriz1][columMatriz2];

        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columMatriz2; j++) {
                for (int k = 0; k < columMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }
}