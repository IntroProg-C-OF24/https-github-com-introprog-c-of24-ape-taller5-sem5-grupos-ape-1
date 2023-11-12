/*
    Problema-8
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona 
y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
*/
package ejercicios;

import java.util.Scanner;

public class CalculadoraIMC_8 {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese el peso del usuario (kilogramos): ");
        peso = tecla.nextDouble();
        System.out.println("Ingrese la altura del usuario (metros): ");
        altura = tecla.nextDouble();
        System.out.println("-----------------------------------------");
        imc = peso / (Math.pow(altura, 2));
        System.out.println("Su indice de masa corporal es: " + imc);
        System.out.println("-----------------------------------");
        if (imc > 29) {
            System.out.println("Esta con obesidad");
        } else {
            if (imc > 24) {
                System.out.println("Esta con sobrepeso");
            } else {
                if (imc > 18) {
                    System.out.println("Su peso es saludable");
                } else {
                    System.out.println("Esta con bajo peso");
                }
            }
        }
    }
}
