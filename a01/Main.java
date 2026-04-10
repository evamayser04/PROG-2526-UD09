package a01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Integer leerEntero() {
    Scanner sc = new Scanner(System.in);
    Integer resultado = null;

    while (resultado == null) {
        System.out.print("Introduce un número entero: ");
        try {
            resultado = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Error: no es un número válido.");
            sc.next();
        }
    }
    return resultado;
    }
}