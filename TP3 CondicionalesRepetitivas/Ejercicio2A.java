package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        int contador = 0, i;
        char letra;

        System.out.println("Escriba una palabra o una cadena de texto: ");
        palabra = sc.nextLine();

        for (i = 0; i < palabra.length(); i++) {
            letra = Character.toLowerCase(palabra.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador ++;
            }
        }
            System.out.println("La cantidad de vocales de " + palabra + " son: " + contador );




    }
}