package PracticoCondicionalesRepetitivas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> planEstudio = new HashMap<>();
        String materia;
        int horas;
        String continuar;

        System.out.println("Bienvenido al Planificador de Estudio.");

        do {
            System.out.print("Ingresa el nombre de la materia: ");
            materia = scanner.nextLine();

            System.out.print("Ingresa cuántas horas deseas estudiar para " + materia + ": ");
            horas = scanner.nextInt();
            scanner.nextLine();

            planEstudio.put(materia, horas);

            System.out.print("¿Deseas agregar otra materia? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));


        System.out.println("\nTu plan de estudio es el siguiente:");
        for (Map.Entry<String, Integer> entry : planEstudio.entrySet()) {
            System.out.println("Materia: " + entry.getKey() + " - Horas de estudio: " + entry.getValue());
        }

        System.out.println("¡Buena suerte en tus exámenes!");
        scanner.close();
    }
}

