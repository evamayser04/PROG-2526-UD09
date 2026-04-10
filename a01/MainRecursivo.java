package a01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRecursivo {
    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");

        try {
            return sc.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("Error: no es un número válido.");
            sc.nextLine();
            return leerEntero(); // se vuelve a llamar
        }
    }
}