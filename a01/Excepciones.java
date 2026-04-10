package a01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Integer n = leerEntero();
        System.out.println("El numero introducido es el: " + n);
    }

    static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        Integer resultado = null;
        
        while (resultado == null) {
            System.out.print("Introducir entero: ");
            try {
                resultado = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
                sc.next();
            }
        }
        
        return resultado;
    }
}