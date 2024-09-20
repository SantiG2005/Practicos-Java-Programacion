package Practico2Secuenciales;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date;
        System.out.println("Ingrese su fecha de nacimiento (en formato dd/mm/aaaa): ");
        date = sc.nextLine();
        String digitosFecha = date.replaceAll("/","");
        int sumadigitos = 0;
        for (int i = 0 ; i < digitosFecha.length(); i++) {
            char digitoChar = digitosFecha.charAt(i);
            int digitoInt = Character.getNumericValue(digitoChar);
            sumadigitos += digitoInt;
            System.out.println("Dígito" + (i+1) + ":" + digitoInt);
        }
        int firstDigito = (sumadigitos / 10);
        int secondDigito = (sumadigitos % 10);
        int luckynumber = (firstDigito + secondDigito);

        System.out.println("Su numero de la suerte es: " + luckynumber);


    }
}
