/*
    Problema-1
    Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
*/
package PROBLEMAS;
import java.util.Scanner;
public class Problema_1 {
    public static void main(String[] args) {
        int edad;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = dato.nextInt();
        if (edad >= 18) {
            System.out.println("Puede votar");
        }
        else 
            System.out.println("No puede votar");
    }     
}
