package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio2B {
    public static void main(String[] args) {
        int num1, num2, num3, num4, totalGastos, ahorro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su presupuesto mensual: ");
        int presupuesto = sc.nextInt();

        System.out.println("\nGastos Alquiler: ");
        num1 = sc.nextInt();
        System.out.println("\nGastos Facturas: ");
        num2 = sc.nextInt();
        System.out.println("\nGastos Transporte: ");
        num3 = sc.nextInt();
        System.out.println("\nGastos Alimentos: ");
        num4 = sc.nextInt();

        totalGastos = (num1+num2+num3+num4);
        ahorro = (presupuesto - totalGastos);

        if (presupuesto > totalGastos){
            System.out.println("Enhorabuena, su presupuesto cubre los gastos mensuales!!!");
            System.out.println("Ademas ahorra un total de:  " + ahorro + " pesos ");
        } else {
            System.out.println("Malas noticias, su presupuesto no cubre los gastos mensuales...");
            System.out.println("Consta de la siguiente cantidad en negativo: " + ahorro + " pesos ");
        }
    }
}
