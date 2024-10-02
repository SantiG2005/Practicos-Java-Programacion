package PracticoCondicionalesRepetitivas;
import java.util.Scanner;
public class Ejercicio9B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo total que planea estudiar (en horas): ");
        double tiempoEstudio = scanner.nextDouble();

        System.out.print("Ingrese el número de temas que necesita estudiar: ");
        int numeroTemas = scanner.nextInt();

        double tiempoNecesario =0;

        // Bucle para ingresar el tiempo necesario para cada tema
        for (int i = 1; i <= numeroTemas; i++) {
            System.out.print("Ingrese el tiempo necesario para el tema " + i + " (en horas): ");
            double tiempoTema = scanner.nextDouble();
            tiempoNecesario += tiempoTema; // Acumular el tiempo necesario
        }

        // Determinar si el tiempo disponible es suficiente
        if (tiempoEstudio >= tiempoNecesario) {
            System.out.printf("¡Suficiente tiempo de estudio! Necesita %.2f horas y tiene %.2f horas disponibles.%n", tiempoNecesario, tiempoEstudio);
        } else {
            System.out.printf("No es suficiente tiempo de estudio. Necesita %.2f horas y solo tiene %.2f horas disponibles.%n", tiempoNecesario, tiempoEstudio);
        }

        scanner.close();
    }
}
