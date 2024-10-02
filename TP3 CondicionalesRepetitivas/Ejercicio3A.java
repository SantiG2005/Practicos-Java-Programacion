package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, n;

        System.out.println("Ingrese cantidad de elementos para la serie: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a);
            int suma = (a+b);
            a = b;
            b = suma;
        }
    }
}
