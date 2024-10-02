package PracticoCondicionalesRepetitivas;
import java.util.Scanner;
public class Ejercicio10B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el costo del vehículo: ");
        double costoVehiculo = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de meses para el plan de pagos: ");
        int meses = scanner.nextInt();

        System.out.print("Ingrese la tasa de interés anual (en %): ");
        double tasaInteres = scanner.nextDouble() / 100;

        // Calcular el interés mensual
        double interesMensual = tasaInteres / 12;

        // Calcular el pago mensual utilizando la fórmula del interés compuesto
        double pagoMensual = (costoVehiculo * interesMensual) / (1 - Math.pow(1 + interesMensual, -meses));

        // Calcular el total a pagar
        double totalAPagar = pagoMensual * meses;

        System.out.printf("Pago mensual: %.2f\n", pagoMensual);
        System.out.printf("Total a pagar: %.2f\n", totalAPagar);

        scanner.close();
    }
}
