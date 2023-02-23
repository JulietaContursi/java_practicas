//Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la secuencia de números pares desde el 2 hasta el número ingresado
package Bucles;

import java.util.Scanner;

public class enteroPositivoPar {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingrese un numero entero positivo: ");
    int numero = entrada.nextInt();

    int i = 2; 
        
    while (i <= numero) {
        System.out.print(i + " "); 
        i += 2; 
    }
  }
}