import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class desafioImca {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el tamaño de ambos vectores: ");
    int maxtam = sc.nextInt();
    int[] vectorPar = new int[maxtam];
    int[] vectorImpar = new int[maxtam];

    Random rnd = new Random();
    for (int i = 0; i < maxtam; i++) {
      vectorPar[i] = 11 + rnd.nextInt(10);
      vectorImpar[i] = 11 + rnd.nextInt(10);
    }

    System.out.println(Arrays.toString(vectorPar));
    System.out.println(Arrays.toString(vectorImpar));

    
  }
}