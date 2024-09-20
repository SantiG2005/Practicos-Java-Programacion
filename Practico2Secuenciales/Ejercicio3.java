package Practico2Secuenciales;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int A, B;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor para A");
        A = lectura.nextInt();
        System.out.println("Ingrese el valor para B");
        B = lectura.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Los valores intercambiados son:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
    }
}
