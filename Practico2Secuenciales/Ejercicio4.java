package Practico2Secuenciales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double v1, v2, d, time;
        Scanner vistas = new Scanner(System.in);

        System.out.println("Ingrese la distancia entre ambos vehiculos");
        d = vistas.nextDouble();
        System.out.println("Ingrese la velocidad, en kmh, del primer auto");
        v1 = vistas.nextDouble();
        System.out.println("Ingrese la velocidad, en kmh, del segundo auto");
        v2 = vistas.nextDouble();

        time = d/(v2 - v1);
        System.out.println("El tiempo es: "+ time*60 + " minutos");

    }
}
