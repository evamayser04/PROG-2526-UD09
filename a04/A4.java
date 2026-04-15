package a04;

import java.io.*;

public class A4 {
static final String RUTA ="D:\\NumerosReales.txt";
    public static void main(String[] args) {

        BufferedReader br = null;
        double suma = 0;
        int contador = 0;

        try {
            br = new BufferedReader(new FileReader(RUTA));
            String linea = br.readLine();

            while(linea != null){

                // Separar números de la línea
                String[] numerosEnLinea = linea.split(" ");

                // Recorrer cada número
                for (String numStr : numerosEnLinea) {
                    if (!numStr.isEmpty()) { // evitar errores por espacios
                        Double numero = Double.valueOf(numStr);
                        suma += numero;
                        contador++;
                    }
                }

                linea = br.readLine();
            }

        } 
        catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                } 
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        double media = suma / contador;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
