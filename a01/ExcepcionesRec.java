package a01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesRec {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(leerEntero());
    }

    static Integer leerEntero() {
        System.out.print("Introducir entero: ");
        try {
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Tipo erróneo");
            sc.nextLine();
            return leerEntero();
        }
    }
}