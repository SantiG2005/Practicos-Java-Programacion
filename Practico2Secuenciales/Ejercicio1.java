package Practico2Secuenciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int SueldoBase, NroVentas, extra, Resultado;
        Scanner vista = new Scanner(System.in);


        System.out.println("Ingrese su sueldo base");
        SueldoBase = vista.nextInt();
        System.out.println("Ingrese la cantidad de ventas realizadas durante el mes");
        NroVentas = vista.nextInt();
        extra = ((SueldoBase*10)/100);
        Resultado = (SueldoBase+(NroVentas*extra));
        System.out.println("El total, tomando en cuenta su sueldo base y comisiones, es de $"+Resultado);



    }
}
