package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba aqui la cadena de texto ha desarrollar: ");
        String word = sc.nextLine();

        System.out.println("Desde que caracter te gustaria obtener la subcadena? ");
        int parametro1 = sc.nextInt();
        System.out.println("Hasta que caracter te gustaria obtener la subcadena? ");
        int parametro2 = sc.nextInt();

        String subWord = word.substring(parametro1, parametro2);

        System.out.println("La subcadena sustraida de la cadena texto ingresada es " + subWord);
    }
}
