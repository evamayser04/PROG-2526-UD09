package a01;
import java.util.Scanner;

public class MainThrows {
    public static Integer leerEntero() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        try {
            Integer num = leerEntero();
            System.out.println("Número introducido: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error al introducir número");
        }
    }
}
