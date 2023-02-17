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

        nombreUsuario(estudiante);

        System.out.println("Perfecto! Ahora ingrese su numero de DNI separado por puntos: ");
        String dniEstudiante = sc.nextLine();
       }

     public static void nombreUsuario(String estudiante){

        String[] partes = estudiante.split(" ");
        String[] nombre = new String[partes.length/2];
        String[] apellido = new String[partes.length - nombre.length];

        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = partes[i]; //nombres toma el valor que le ingreso el usuario
        }
        for (int i = 0; i < apellido.length; i++) {
            apellido[i] = partes[nombre.length + i]; 
            apellido[i] = apellido[i].toLowerCase(); // convierte el apellido actual a minúsculas
        }
        for (int i = 0; i < nombre.length; i++) {
            String usuario = nombre[i].substring(0, 1); 
            usuario = usuario.toLowerCase(); // convierte la primera letra del nombre actual a minúsculas
            String correo = usuario + apellido[i] + "@frsf.utn.edu.ar"; // crea el correo electrónico
            System.out.println(correo); // imprime el correo electrónico
        }
    }
    }



