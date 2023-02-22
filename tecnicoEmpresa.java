 import java.util.Random;
 import java.util.Scanner;
    
    public class tecnicoEmpresa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] costoServicios = {2500, 5000, 10000, 15000};
            int[][] serviciosPrestados = new int[3][4];
            generarMatrizAleatoria(serviciosPrestados);
            int[] costosMatriz = calcularCostos(serviciosPrestados, costoServicios);
            imprimirMatrizYCostos(serviciosPrestados, costosMatriz);
        }
    
        public static void generarMatrizAleatoria(int[][] matriz) {
            Random rnd = new Random();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rnd.nextInt(4);
                }
            }
        }
    
        public static int[] calcularCostos(int[][] matriz, int[] costoServicios) {
            int[] costos = new int[matriz.length * matriz[0].length];
            int index = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    costos[index] = costoServicios[matriz[i][j]];
                    index++;
                }
            }
            return costos;
        }
    
        public static void imprimirMatrizYCostos(int[][] matriz, int[] costos) {
            System.out.println("servicios prestados:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
    
            System.out.println("costos:");
            for (int i = 0; i < costos.length; i++) {
                System.out.print(costos[i] + " ");
            }
            System.out.println();
        }
    }
    