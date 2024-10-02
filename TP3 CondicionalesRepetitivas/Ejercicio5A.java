package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Escriba aqui un numero para verificar la cantidad de digitos: ");
        int num = sc.nextInt();
        int numEscrito = num;

        while(num >= 1){
            contador++;
            num /= 10;
        }

        System.out.println("La cantidad de digitos del numero " + numEscrito + " son: " + contador);
    }
}
