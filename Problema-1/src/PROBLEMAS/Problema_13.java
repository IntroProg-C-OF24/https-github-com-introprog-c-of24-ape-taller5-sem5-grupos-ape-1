/*
    Problema 13
        Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
package PROBLEMAS;
import java.util.Scanner;
public class Problema_13 {
    public static void main(String[] args) {
        double total, impuesto;
        String pais;
        String marca;
        String origen;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la marca del automovil");
        marca = dato.nextLine();
        System.out.println("Ingrese la origen del automovil");
        origen = dato.nextLine();
        System.out.println("Ingrese uno de los siguientes paises: Alemania-Japon-Italia-USA");
        pais = dato.nextLine();
        System.out.println("Ingrese la costo del automovil");
        total = dato.nextDouble();
        switch (pais) {
            case "Alemania " -> {
                impuesto = 0.2;
                impuesto = total * impuesto;
                impuesto = total + impuesto;
                System.out.println("El valor del vehiculo con la marca (" + marca + ") y origen (" + origen + ") es de: " + total + " mas impuesto da un total de: " + impuesto);
            }
            case "Japon" -> {
                impuesto = 0.3;
                impuesto = total * impuesto;
                impuesto = total + impuesto;
                System.out.println("El valor del vehiculo con la marca (" + marca + ") y origen (" + origen + ") es de: " + total + " mas impuesto da un total de: " + impuesto);
            }
            case "Italia" -> {
                impuesto = 0.15;
                impuesto = total * impuesto;
                impuesto = total + impuesto;
                System.out.println("El valor del vehiculo con la marca (" + marca + ") y origen (" + origen + ") es de: " + total + " mas impuesto da un total de: " + impuesto);
            }
            case "USA" -> {
                impuesto = 0.08;
                impuesto = total * impuesto;
                impuesto = total + impuesto;
                System.out.println("El valor del vehiculo con la marca (" + marca + ") y origen (" + origen + ") es de: " + total + " mas impuesto da un total de: " + impuesto);
            }
        }

    }
}
