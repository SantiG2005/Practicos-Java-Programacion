package PracticoCondicionalesRepetitivas;
import java.util.Scanner;
public class Ejercicio8B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioVivienda;
        double porcentajePagoInicial;
        double tasaInteresAnual;
        int meses;

        System.out.print("Ingrese el precio de la vivienda: ");
        precioVivienda = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de pago inicial (por ejemplo, 20 para 20%): ");
        porcentajePagoInicial = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (por ejemplo, 5 para 5%): ");
        tasaInteresAnual = scanner.nextDouble();

        System.out.print("Ingrese el número de meses para el préstamo: ");
        meses = scanner.nextInt();

        double pagoInicial = (porcentajePagoInicial / 100) * precioVivienda;
        double montoFinanciado = precioVivienda - pagoInicial;
        double tasaInteresMensual = (tasaInteresAnual / 100) / 12;

        double cuotaMensual = (montoFinanciado * tasaInteresMensual) /
                (1 - Math.pow(1 + tasaInteresMensual, -meses));

        System.out.println("\n--- Plan de Pagos ---");
        System.out.printf("Precio de la vivienda: $%.2f%n", precioVivienda);
        System.out.printf("Pago inicial: $%.2f%n", pagoInicial);
        System.out.printf("Monto financiado: $%.2f%n", montoFinanciado);
        System.out.printf("Cuota mensual: $%.2f%n", cuotaMensual);

        double totalPagos = cuotaMensual * meses;
        System.out.printf("Total a pagar en %d meses: $%.2f%n", meses, totalPagos);

        scanner.close();
    }
}
