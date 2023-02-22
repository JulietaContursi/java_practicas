import java.util.Random;
import java.util.Scanner;

public class tecnicoEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] costoServicios = {2500, 5000, 10000, 15000};
        int[][] serviciosPrestados = new int[3][4];
        generarMatrizAleatoria(serviciosPrestados);
        int[] costosMatriz = calcularCostos(serviciosPrestados, costoServicios);
        imprimirMatrizYCostos(serviciosPrestados, costoServicios);
        calcularMejorFila(serviciosPrestados, costoServicios);
        int totalCostos = calcularTotalCostos(costosMatriz);
        System.out.println(" ");
        System.out.println("Total Recaudación: " + totalCostos);
        int servicioMasRepetido = servicioEstrella(serviciosPrestados);
        System.out.println("Servicio estrella: " + servicioMasRepetido);
        

    }
    
        public static void generarMatrizAleatoria(int[][] matriz) {
            Random rnd = new Random();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rnd.nextInt(4);
                }
            }
        }
    
        public static int[] calcularCostos(int[][] serviciosPrestados, int[] costoServicios) {
            int[] costos = new int[serviciosPrestados.length * serviciosPrestados[0].length];
            int index = 0;
            for (int i = 0; i < serviciosPrestados.length; i++) {
                for (int j = 0; j < serviciosPrestados[i].length; j++) {
                    costos[index] = costoServicios[serviciosPrestados[i][j]];
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
    
          //  System.out.println("costos:");
            for (int i = 0; i < costos.length; i++) {
                //System.out.print(costos[i] + " ");
            }
          //  System.out.println();
        }
        public static int calcularTotalCostos(int[] costosMatriz) {
            int totalCostos = 0;
            for (int i = 0; i < costosMatriz.length; i++) {
                totalCostos += costosMatriz[i];
            }
            return totalCostos;
        }
        public static void calcularMejorFila(int[][] matriz, int[] costoServicios) {
            double[] comisiones = new double[matriz.length];
            for (int i = 0; i < matriz.length; i++) {
                double totalPorcentajeFila = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    int costo = costoServicios[matriz[i][j]];
                    double porcentaje = costo * 0.05;
                    totalPorcentajeFila += porcentaje;
                }
                comisiones[i] = totalPorcentajeFila;
                System.out.printf("T%d: $%.0f\n", i+1, totalPorcentajeFila);
            }
        
            // Encontrar la fila con la mayor comisión
            double mayorComision = comisiones[0];
            int filaMayorComision = 1;
            for (int i = 1; i < comisiones.length; i++) {
                if (comisiones[i] > mayorComision) {
                    mayorComision = comisiones[i];
                    filaMayorComision = i+1;
                }
            }
            System.out.printf("T%d es el tecnico del mes ", filaMayorComision, mayorComision);
        }
        
        public static int servicioEstrella(int[][] matriz) {
            int[] contadores = new int[4];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    contadores[matriz[i][j]]++;
                }
            }
            int servicioEstrella = 0;
            for (int i = 1; i < contadores.length; i++) {
                if (contadores[i] > contadores[servicioEstrella]) {
                    servicioEstrella = i;
                }
            }
            return servicioEstrella;
        }     
    }   
        