package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Presione la tecla Enter para conocer el resultado de la operacion ");
        String comienzo = sc.nextLine();
        int suma = 0;

        for (int i = 2; i <= 100; i += 2) {
                suma += i;
                System.out.print(i + " ");
        }

        System.out.println("\nLa suma de todos los numeros pares entre 1 y 100 es: " + suma);
    }
}

