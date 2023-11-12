/*
    Problema-7
        Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 */
package PROBLEMAS;
import java.util.Scanner;
public class Problema_7 {
    public static void main(String[] args) {
        String nota;
        Scanner dato = new Scanner(System.in);
        System.out.println("Incerte el rango de notas");
        nota = dato.nextLine();
        switch (nota) {
            case "A"  -> System.out.println("90-100");
            case "a"  -> System.out.println("90-100");
            case "B"  -> System.out.println("80-90");
            case "b"  -> System.out.println("80-90");
            case "C"  -> System.out.println("70-80");
            case "c"  -> System.out.println("70-80");
            case "D"  -> System.out.println("60-70");
            case "d"  -> System.out.println("60-70");
        }
    }
}
