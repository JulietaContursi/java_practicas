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
    comparacionVectores(vectorPar, vectorImpar);

    //recorre ambos vectores cargandolos con numeros aleatorios del 11 al 20 
    Random rnd = new Random();
    for (int i = 0; i < maxtam; i++) {
      vectorPar[i] = 11 + rnd.nextInt(10);
      vectorImpar[i] = 11 + rnd.nextInt(10);
    }

    System.out.println(Arrays.toString(vectorPar));
    System.out.println(Arrays.toString(vectorImpar));
  }

  ArrayList<Integer> even = new ArrayList<>();
  ArrayList<Integer> odd = new ArrayList<>();

  public static void comparacionVectores(int[]vectorPar, int []vectorImpar) {
  int PARES =0;
  int IMPARES =0;
  for(int i= 0; i < vectorPar.length; i++){
    for(int j =0; j< vectorImpar.length; j++){
    if(vectorPar[i] %2 ==0){
      if(vectorImpar[j]%2 ==0){
        IMPARES++;
      }
      PARES++;
    }
  }
 }
 System.out.println("en este vector hay tantos numeros pares " + PARES);
System.out.println("en este vector hay tantos numeros impares " + IMPARES);
}
}