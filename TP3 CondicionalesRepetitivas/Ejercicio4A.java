package PracticoCondicionalesRepetitivas;

import java.util.Scanner;

public class Ejercicio4A {
    public static boolean esPalindromo(String word) {
        word = word.toLowerCase();
        word = word.replace(" ", "");
        word = word.replace("á", "a");
        word = word.replace("é", "e");
        word = word.replace("í", "i");
        word = word.replace("ó", "o");
        word = word.replace("ú", "u");

        int a = 0;
        int b = word.length()-1;

        for (int i = 0; i < word.length()-1; i++ ){
             if (word.charAt(a) == word.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }

        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase: ");
        String palabra = sc.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es palindromo");
        }       else {
            System.out.println(palabra + " no es palindromo");
        }

    }
}
