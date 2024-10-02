package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caloriasTotales = 0;
        int calorias;
        String continuar;

        do {
            System.out.print("Ingresa las calorías consumidas en un alimento: ");
            calorias = scanner.nextInt();
            caloriasTotales += calorias;

            System.out.print("¿Deseas ingresar otro alimento? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Calorías totales consumidas en el día: " + caloriasTotales);
        evaluarSaludable(caloriasTotales);

        scanner.close();
    }

    private static void evaluarSaludable(int calorias) {
        if (calorias < 200) {
            System.out.println("Estás por debajo del rango saludable.");
        } else if (calorias <= 250) {
            System.out.println("Estás dentro del rango saludable.");
        } else {
            System.out.println("Estás por encima del rango saludable.");
        }
    }
}