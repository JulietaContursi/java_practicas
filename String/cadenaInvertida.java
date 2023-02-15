//Escribe un programa que solicite al usuario que ingrese una frase y luego imprima la frase invertida.  

package String;
import java.util.Scanner;

public class cadenaInvertida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine();

        for(int i=frase.length() - 1; i>=0; i--){
            System.out.print(frase.charAt(i)); 
        }
}
}