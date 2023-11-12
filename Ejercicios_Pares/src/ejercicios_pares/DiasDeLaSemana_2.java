/*
    Problema-2
Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).
*/
package ejercicios;

import java.util.Scanner;

public class DiasDeLaSemana_2 {

    public static void main(String[] args) {
        int dia;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese el numero de dia: ");
        dia = tecla.nextInt();
        if (dia == 1) {
            System.out.println("---------------");
            System.out.println("El dia es Lunes");
        } else if (dia == 2) {
            System.out.println("----------------");
            System.out.println("El dia es martes");
        } else if (dia == 3) {
            System.out.println("-------------------");
            System.out.println("El dia es miercoles");
        } else if (dia == 4) {
            System.out.println("----------------");
            System.out.println("El dia es jueves");
        } else if (dia == 5) {
            System.out.println("-----------------");
            System.out.println("El dia es viernes");
        } else if (dia == 6) {
            System.out.println("----------------");
            System.out.println("El dia es sabado");
        } else if (dia == 7) {
            System.out.println("-----------------");
            System.out.println("El dia es domingo");
        } else if (dia > 7) {
            System.out.println("---------------------------------------------");
            System.out.println("ERROR, ingrese nuevamente un valor del 1 al 7");
        }
    }
}
