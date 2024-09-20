package Practico2Secuenciales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double notasParciales, promedio, notaFinal, notaTrabajoFinal, resultado;
        Scanner vista = new Scanner(System.in);

        System.out.println("Ingrese el total de sus tres calificaciones en parciales");
        notasParciales = vista.nextDouble();
        System.out.println("Ingrese su calificación del examen final");
        notaFinal = vista.nextDouble();
        System.out.println("Ingrese la calificación del trabajo final");
        notaTrabajoFinal = vista.nextDouble();
        promedio = ((notasParciales/3)*0.55) + (notaFinal*0.30) + (notaTrabajoFinal*0.15);
        System.out.println("el promedio de las notas es: " + promedio);


    }
}
