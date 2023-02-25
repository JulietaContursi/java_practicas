import java.util.Random;
import java.util.Scanner;

public class desafioImca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tamano = pedirTamano(scanner);
        int[] pares = crearVector(tamano, random);
        int[] impares = crearVector(tamano, random);
        imprimirVector("PARES: ", pares);
        imprimirVector("IMPARES: ", impares);

        intercambiarValores(pares, impares);

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

    public static void imprimirVector(String vectorFinal, int[] vector) {
        System.out.print(vectorFinal);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ,");
        }
        System.out.println();
    }

    public static void intercambiarValores(int[] pares, int[] impares) {
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 == 0 && impares[i] % 2 != 0) {
            } else if (pares[i] % 2 != 0 && impares[i] % 2 == 0) {
                int temp = pares[i];
                pares[i] = impares[i];
                impares[i] = temp;
            } else if (pares[i] % 2 == 0 && impares[i] % 2 == 0) {
                impares[i] = 0;
            } else if (pares[i] % 2 != 0 && impares[i] % 2 != 0) {
                pares[i] = 0;
            }
        }
    }
}
