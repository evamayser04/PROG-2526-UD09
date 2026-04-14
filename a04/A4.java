package a04;

import java.io.*;

public class A4 {
static final String RUTA ="D:\\NumerosReales.txt";
    public static void main(String[] args) {
        String texto = "";
        BufferedReader br = null;

        try {
            
            br = new BufferedReader(new FileReader(RUTA));
            String linea = br.readLine();
            while(linea != null){
                texto = texto + linea;
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
                    System.out.println("He terminado -> Cierro el fichero.");
                } 
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
                System.out.println(texto);

        String[] numeros = texto.split(" ");
        double suma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (!numeros[i].isEmpty()) {
                double num = Double.valueOf(String.valueOf(numeros[i]));
                suma += num;
                contador++;
            }
        }

        double media = suma / contador;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
