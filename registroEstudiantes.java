/*Escribir un programa que permita registrar estudiantes al sistema de la Facultad, generando a partir de los datos ingresados un nombre de usuario y una contraseña. 
El estudiante ingresará en primer lugar su nombre y apellido (en una misma línea), y en segundo lugar su número de DNI (con puntos). 
Como resultado, el programa le devolverá:
- Un nombre de usuario compuesto por la primera letra del nombre, seguida del apellido completo, y que finaliza en @frsf.utn.edu.ar
- Una contraseña que se compone de las dos últimas letras del apellido, seguida de las últimas cuatro cifras del DNI en orden inverso. */

import java.util.Scanner;


public class registroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido para registrarse: ");
        String estudiante = sc.nextLine();

        System.out.println("Perfecto! Ahora ingrese su numero de DNI separado por puntos: ");
        String dniEstudiante = sc.nextLine();

        String[] nomUsuario = estudiante.split(" ");

        

}

}

