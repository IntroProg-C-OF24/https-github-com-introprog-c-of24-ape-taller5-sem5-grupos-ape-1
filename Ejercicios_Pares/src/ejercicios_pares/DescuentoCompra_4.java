/*
    Problema-4
Descuento en Compras: Calcular el precio final de un producto con un descuento del 10%
si el precio original es mayor de $100; de lo contrario, no hay descuento.
*/
package ejercicios;

import java.util.Scanner;

public class DescuentoCompra_4 {

    public static void main(String[] args) {
        double precioOriginal, descuento, precioFinal;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precioOriginal = tecla.nextDouble();
        System.out.println("--------------------------------");
        if (precioOriginal > 100) {
            descuento = precioOriginal * 0.1;
            precioFinal = precioOriginal - descuento;
            System.out.println("Se aplico un descuento del 10%, el precio final es: " + precioFinal);
            System.out.println("----------------------------------------------------------------");
        } else {
            precioFinal = precioOriginal;
        System.out.println("No se aplico descuento, su precio final es: " + precioFinal);
            System.out.println("-----------------------------------------------------");
        }
    }
}
