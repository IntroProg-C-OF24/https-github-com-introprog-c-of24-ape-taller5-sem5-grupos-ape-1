/*
    Problema-5
       Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 */
package PROBLEMAS;
import java.util.Scanner;
public class Problema_5 {
    public static void main(String[] args) {
        int anio;
        Scanner dato = new Scanner(System.in);
        System.out.println("Incerte el año");
        anio = dato.nextInt();
        if (anio % 4 == 0) {
            if (anio % 400 == 0 & anio % 100 == 0) {
                System.out.println("Es bisiesto");
            } else {
                if (anio % 400 != 0 & anio % 100 != 0) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            }
        } else {
            System.out.println("No es bisiesto");
        }

    }
}
