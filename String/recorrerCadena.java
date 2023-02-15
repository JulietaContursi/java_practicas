/*Dado un string, imprime cada uno de los caracteres en una línea separada. */

package String;

import java.util.Scanner;

public class recorrerCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa una palabra: ");
        String palabra = sc.nextLine();

        for(int i=0; i< palabra.length(); i++){
            char caracteres = palabra.charAt(i);
            System.out.println(caracteres);
        }
}
}
