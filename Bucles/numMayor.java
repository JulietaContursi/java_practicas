package Bucles;
import java.util.Scanner;

public class numMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("ingrese el tercer numero: ");
        int num3 = sc.nextInt();
        
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("el numero mayor es: " + mayor);
    }
}