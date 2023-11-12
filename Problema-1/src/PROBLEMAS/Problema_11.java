/*
    Problema 11
        Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package PROBLEMAS;
import java.util.Scanner;
public class Problema_11 {
    public static void main(String[] args) {
        double costoklv,klvconsumido,total;
        int edad;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese el costo por kilovatio");
        costoklv = dato.nextDouble();
        System.out.println("Ingrese el consumo de kilovatio");
        klvconsumido = dato.nextDouble();
        System.out.println("edad");
        edad = dato.nextInt();
        total=costoklv*klvconsumido;
        if (edad>=65) {
            double descuento=total*0.15;
            total=total - descuento;
            System.out.println("El valor a pagar es de: "+total);
        }
        else
            System.out.println("El valor a pagar es de: "+total);
    }
}
