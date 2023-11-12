/*
    Problema-9
        Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 */
package PROBLEMAS;
import java.util.Scanner;
public class Problema_9 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        num1 = dato.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = dato.nextInt();
        System.out.println("Ingrese tercer numero");
        num3 = dato.nextInt();
        if (num1>num3) {
            if (num1>num2) {
                if (num2>num3) {
                    System.out.println(num3+" "+num2+" "+num1);
                }
                else
                    System.out.println(num2+" "+num3+" "+num1);
            }
            else
                System.out.println(num3+" "+num1+" "+num2);
        }
        else
            if (num3>num2) {
                if (num2>num1) {
                    System.out.println(num1+" "+num2+" "+num3);
                }
                else
                    System.out.println(num2+" "+num1+" "+num3);           
        }
            
            else
                System.out.println(num1+" "+num3+" "+num2);
    }
}
