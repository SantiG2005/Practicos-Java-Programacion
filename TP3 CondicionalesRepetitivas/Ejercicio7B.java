package PracticoCondicionalesRepetitivas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio7B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> actividades = new HashMap<>();
        String actividad;
        String dia;
        String continuar;

        System.out.println("Bienvenido al Planificador de Actividades Deportivas.");

        do {
            System.out.print("Ingresa el nombre de la actividad deportiva: ");
            actividad = scanner.nextLine();

            System.out.print("Ingresa el día de la semana para la actividad (por ejemplo, Lunes, Martes, etc.): ");
            dia = scanner.nextLine();

            actividades.put(actividad, dia);

            System.out.print("¿Deseas agregar otra actividad? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nTu plan de actividades deportivas es el siguiente:");
        for (Map.Entry<String, String> entry : actividades.entrySet()) {
            System.out.println("Actividad: " + entry.getKey() + " - Día: " + entry.getValue());
        }

        System.out.println("¡Disfruta de tus actividades deportivas!");
        scanner.close();
    }
}
