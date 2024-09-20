package Practico2Secuenciales;

import java.util.Scanner;

public class Ejercicio6 { public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba su nombre completo: ");
            String nombreCompleto = sc.nextLine();

            String[] palabras = nombreCompleto.split(" ");

            StringBuilder iniciales = new StringBuilder();

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    iniciales.append(Character.toUpperCase(palabra.charAt(0)));
                }
            }

            System.out.println("Sus iniciales son: " + iniciales);
        }
    }

