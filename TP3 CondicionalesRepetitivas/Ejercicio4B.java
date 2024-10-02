package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto del prestamo: ");
        double montoPrestamo = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en %): ");
        double tasaInteresAnual = sc.nextDouble();

        System.out.print("Ingrese el número de años para el pago: ");
        int anosPago = sc.nextInt();

        double tasaInteresMensual = tasaInteresAnual / 100 / 12;

        int numeroPagos = anosPago * 12;

        double pagoMensual = montoPrestamo * tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));

        System.out.printf("Pago mensual: %.2f\n", pagoMensual);
        System.out.println("Plan de pagos:");

        double saldoPendiente = montoPrestamo;
        for (int i = 1; i <= numeroPagos; i++) {
            double interes = saldoPendiente * tasaInteresMensual;
            double principal = pagoMensual - interes;
            saldoPendiente -= principal;

            System.out.printf("Pago %d: Interés = %.2f, Principal = %.2f, Saldo restante = %.2f\n",
                    i, interes, principal, saldoPendiente);
        }

        sc.close();
    }
}
