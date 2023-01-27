import java.util.Scanner;

public class factorial_de_numeros {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num = entrada.nextInt();
    int factorial = 1;
for (int i = 1; i <= num; i++) {
    factorial *= i;
}
System.out.println("El factorial de " + num + " es " + factorial);

    }
}

