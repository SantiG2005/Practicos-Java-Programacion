package Practico2Secuenciales;



import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int hh, mm, ss, tiempoEstimado;
        Scanner sc = new Scanner(System.in);

        System.out.println("A continuacion ingrese en horas, minutos y segundos su salida:");
        System.out.println("Cantidad de horas: ");
        hh = sc.nextInt();
        System.out.println("Cantidad de minutos: ");
        mm = sc.nextInt();
        System.out.println("Cantidad de segundos: ");
        ss = sc.nextInt();

        System.out.println("Ingrese, en segundos, cuanto tiempo tardara en llegar a su destino: ");
        tiempoEstimado = sc.nextInt();

            LocalTime horaPartida = LocalTime.of(hh, mm, ss);
            LocalTime horaLlegada = horaPartida.plusSeconds(tiempoEstimado);
            System.out.println("La hora estimada de llegada es: " + horaLlegada);


        }
    }

