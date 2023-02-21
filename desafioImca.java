import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class desafioImca {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el tamaño de ambos vectores: ");
    int maxtam = sc.nextInt();
    int[] vectorPar = new int[maxtam];
    int[] vectorImpar = new int[maxtam];

    //recorre ambos vectores cargandolos con numeros aleatorios del 11 al 20 
    Random rnd = new Random();
    for (int i = 0; i < maxtam; i++) {
      vectorPar[i] = 11 + rnd.nextInt(10);
      vectorImpar[i] = 11 + rnd.nextInt(10);
    }

    System.out.println("Vector par: " + Arrays.toString(vectorPar));
    System.out.println("Vector impar: " + Arrays.toString(vectorImpar));
    
    for (int i = 0; i < maxtam; i++) {
      // Si hay un número par en vectorPar, lo deja. Si hay un número impar en vectorPar,
      // busca si hay un número par en la misma posición en vectorImpar y lo cambia por 0.
      if (vectorPar[i] % 2 != 0) {
        for (int j = i; j < maxtam; j++) {
          if (vectorImpar[j] % 2 == 0) {
            vectorImpar[j] = 0;
            break;
          }
        }
      }
      // Si hay un número impar en vectorImpar, lo deja. Si hay un número par en vectorImpar,
      // busca si hay un número impar en la misma posición en vectorPar y lo cambia por 0.
      if (vectorImpar[i] % 2 == 0) {
        for (int j = i; j < maxtam; j++) {
          if (vectorPar[j] % 2 != 0) {
            vectorPar[j] = 0;
            break;
          }
        }
      }
    }
    
    System.out.println("Vector par con las condiciones: " + Arrays.toString(vectorPar));
    System.out.println("Vector impar con las condiciones: " + Arrays.toString(vectorImpar));
  }
}

//tengo que revisarlo y rehacerlo