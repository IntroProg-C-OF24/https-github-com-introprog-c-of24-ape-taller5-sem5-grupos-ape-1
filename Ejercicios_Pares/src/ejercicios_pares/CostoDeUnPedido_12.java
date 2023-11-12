/*
    Problema-12
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, 
la cantidad que se requiere y el precio unitario. 
Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package ejercicios;

import java.util.Scanner;

public class CostoDeUnPedido_12 {

    public static void main(String[] args) {
        int cantidad;
        double precioUnitario, costo;
        String descripcion;
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese la descripcion del articulo: ");
        descripcion = tecla.nextLine();
        System.out.print("Ingrese la cantidad requerida: ");
        cantidad = tecla.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        precioUnitario = tecla.nextDouble();
        costo = cantidad * precioUnitario;
        if (cantidad > 50) {
            costo *= 0.85;
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Se ha aplicado un descuento del 15%, el costo final de los " + cantidad + descripcion + " es de " + costo);
        } else {
            System.out.println("-----------------------------------------------------------");
            System.out.println("El costo de los " + cantidad + descripcion + " es de " + costo);
        }
    }
}
