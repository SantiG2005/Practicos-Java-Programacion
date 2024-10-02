package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo, gastos, meses;
        System.out.println("Introduzca su periodo laboral, en meses: ");
        meses = sc.nextInt();

        int i = 0;
            int ahorro = 0;
            int contador = 0;

        while (i<meses){
            System.out.println("Introduzca sus ingresos netos: ");
            saldo = sc.nextInt();
            System.out.println("Introduzca sus gastos: ");
            gastos = sc.nextInt();
            ahorro = saldo-gastos;
            contador += ahorro;
            i++;
        }
        System.out.println("El ahorro que tendra segun sus ingresos y gastos, en un periodo de " + meses + " meses, sera de: " + ahorro + " pesos ");
    }
}

