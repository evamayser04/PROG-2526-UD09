package a08;

import java.io.*;
import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombre = sc.nextLine();

        String copia = "copia_de_" + nombre;

        try (
            BufferedReader in = new BufferedReader(new FileReader("FICHEROS\\" + nombre));
            BufferedWriter out = new BufferedWriter(new FileWriter("FICHEROS\\" + copia))
        ) {

            String linea = in.readLine();

            while (linea != null) {
                out.write(linea);
                out.newLine();
            }

            System.out.println("Fichero copiado correctamente.");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
