import java.util.Random;
import java.util.Scanner;

public class desafioImca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al usuario el tamaño de los vectores
        int tamano = pedirTamano(scanner);

        // Crear los vectores y llenarlos con números aleatorios
        int[] pares = crearVector(tamano, random);
        int[] impares = crearVector(tamano, random);

        // Imprimir los vectores
        imprimirVector("PARES: ", pares);
        imprimirVector("IMPARES: ", impares);

        // Comparar los elementos de ambos vectores de manera posicional
        intercambiarValores(pares, impares);

        // Imprimir los vectores intercambiados (si corresponde)
        imprimirVector("PARES: ", pares);
        imprimirVector("IMPARES: ", impares);
    }

    public static int pedirTamano(Scanner scanner) {
        System.out.print("Ingrese el tamaño de los vectores: ");
        return scanner.nextInt();
    }

    public static int[] crearVector(int tamano, Random random) {
        int[] vector = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            vector[i] = random.nextInt(10) + 11;
        }

        return vector;
    }

    public static void imprimirVector(String mensaje, int[] vector) {
        System.out.print(mensaje);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ,");
        }
        System.out.println();
    }

    public static void intercambiarValores(int[] pares, int[] impares) {
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0 && impares[i] % 2 != 0) {
                // Si en PARES existe un PAR y en IMPARES un IMPAR, no se hace nada
            } else if (pares[i] % 2 != 0 && impares[i] % 2 == 0) {
                // Si en PARES existe un IMPAR y en IMPARES un PAR, se intercambian
                int temp = pares[i];
                pares[i] = impares[i];
                impares[i] = temp;
            } else if (pares[i] % 2 == 0 && impares[i] % 2 == 0) {
                // Si en PARES existe un PAR y en IMPARES un PAR, se coloca 0 en IMPARES
                impares[i] = 0;
            } else if (pares[i] % 2 != 0 && impares[i] % 2 != 0) {
                // Si en PARES existe un IMPAR y en IMPARES un IMPAR, se coloca 0 en PARES
                pares[i] = 0;
            }
        }
    }
}
