/*
Problema 14
En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
Elaborar una solución que pida como datos de entrada el número de días y el precio diario de la habitación y 
luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar. */
package ejercicios;

import java.util.Scanner;

public class HosteriaLoja_14 {

    public static void main(String[] args) {
        int dias;
        double precio, subtotal, descuento, total;
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese el numero de dias: ");
        dias = tecla.nextInt();
        System.out.print("Ingrese el precio diario de la habitacion: ");
        precio = tecla.nextDouble();
        System.out.println("-----------------------------------------");
        subtotal = dias * precio;
        descuento = 0;
        if (dias > 15) {
            descuento = subtotal * 0.2;
        } else {
            if (dias > 10) {
                descuento = subtotal * 0.15;
            } else if (dias > 5) {
                descuento = subtotal * 0.1;
            }
        }
        total = subtotal - descuento;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento:" + descuento);
        System.out.println("El total a pagar es de: " + total);
    }
}
