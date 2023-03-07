import java.util.Arrays;
import java.util.Scanner;

public class desafioYoutubers {
    public static void main(String[] args) {
        // declaro vectores para poder despues llenar las columnas de la matriz con los datos dados
        int[] suscriptores = new int[10];
        int[] reproducciones = new int[10];
        int[] gananciasAnuales = new int[10];
        for(int i = 0; i < 10; i++){
            suscriptores[i] = (int) (Math.random() * (300000 - 1000 + 1) + 1000);
            reproducciones[i] = (int) (Math.random() * (30000000 - 300000 + 1) + 300000);
            gananciasAnuales[i] = (int) (Math.random() * (20000000 - 100000 + 1) + 100000);
        }
        int[][] datos = new int[10][3];
        for(int i = 0; i < 10; i++){
            datos[i][0] = suscriptores[i];
            datos[i][1] = reproducciones[i];
            datos[i][2] = gananciasAnuales[i];
        }
        for(int i = 0; i < 10; i++){
            System.out.print("youtuber " + (i+1) + " ");
            for(int j = 0; j < 3; j++){
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
        
        int filaMaxRentabilidad = youtuberMasRentabilidad(datos);
        System.out.println();
        System.out.println("el youtuber con mayor rentabilidad es: " + (filaMaxRentabilidad + 1));
        System.out.println();
        double promedioReproducciones = promedioReproducciones(datos);
    }
    
    public static int youtuberMasRentabilidad(int[][] datos){
        int filaMaxRentabilidad = 0;
        double maxRentabilidad = Double.NEGATIVE_INFINITY; //representa valor negativo infinito en un dato double para poder calcular luego la mayor rentabilidad
        for(int i = 0; i < 10; i++){
            double rentabilidad = (double) datos[i][2] / (double) datos[i][0];
            if(rentabilidad > maxRentabilidad){
                maxRentabilidad = rentabilidad;
                filaMaxRentabilidad = i;
            }
        }
        return filaMaxRentabilidad;
    }
    public static int promedioReproducciones(int[][] datos){
        int sumReproducciones = 0;
        int countYoutubers = 0;
        for(int i = 0; i < 10; i++){
            if(datos[i][0] > 200000){
                sumReproducciones += datos[i][1];
                countYoutubers++;
                System.out.println("promedio de reproduccion de youtuber " + (i+1) + ": " + Math.toIntExact(Math.round((double) datos[i][1]/(double) datos[i][0])));
            }
        }
        int promedioTotal = Math.toIntExact(Math.round((double) sumReproducciones / (double) countYoutubers));
        return promedioTotal;
    }
}