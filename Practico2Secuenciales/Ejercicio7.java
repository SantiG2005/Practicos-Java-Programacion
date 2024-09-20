package Practico2Secuenciales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respsCorrecta, respsIncorrecta, respsBlanco, rdos, puntosTotales;

        System.out.println("Cuantas preguntas respondiste correctamente?: ");
        respsCorrecta = sc.nextInt();
        System.out.println("Cuantas preguntas respondiste incorrectamente?: ");
        respsIncorrecta = sc.nextInt();
        System.out.println("Cuantas preguntas no respondiste?: ");
        respsBlanco = sc.nextInt();
        rdos = (respsCorrecta + respsIncorrecta + respsBlanco);

        puntosTotales = (respsCorrecta * 5) - (respsIncorrecta);

        System.out.println("La nota final obtenida de las " + rdos + " preguntas realizadas, es: " + puntosTotales);
    }
}
