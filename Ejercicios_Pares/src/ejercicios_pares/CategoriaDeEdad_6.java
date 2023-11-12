/*
    Problema-6
Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
*/
package ejercicios;

import java.util.Scanner;

public class CategoriaDeEdad_6 {

    public static void main(String[] args) {
        int edad;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");
        edad = tecla.nextInt();
        System.out.println("-------------------------------");
        if (edad < 11) {
            System.out.println("Es ninio");
        } else {
            if (edad < 18) {
                System.out.println("Es adolescente");
            } else {
                System.out.println("Es adulto");
            }
        }
    }
}
