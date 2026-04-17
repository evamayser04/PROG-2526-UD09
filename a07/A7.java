package a07;

import java.io.*;

public class A7 {
// Ruta del archivo donde se va a escribir el texto
    static final String RUTA = "FICHEROS\\Quijote.txt";
    public static void main(String[] args) {
        
        // Declaramos los objetos de escritura (de momento NO están creados)
        FileWriter fr = null;
        FileWriter fra; // escritura para añadir append
        BufferedWriter br = null;

        try {
            // Abre el archivo Quijote.txt (modo sobrescritura)
            fr = new FileWriter(RUTA);

            // Texto que vamos a escribir carácter por carácter
            String linea1 = "En un lugar de La Mancha,";
            
            // Escribe el texto letra por letra
            for (int i = 0; i < linea1.length(); i++) {
                fr.write(linea1.charAt(i));
            }
            // Se cierra la primera escritura
            fr.close();
            
            // Se abre el archivo en append
            fra = new FileWriter(RUTA, true);
            br = new BufferedWriter(fra);

            br.newLine();
            
            //Escribe nueva frase eliminando lo anterior con el append
            br.write("de cuyo nombre no quiero acordarme");
            // Añade salto de linea
            br.newLine();

        } catch (IOException ex) {
            // Si ocurre cualquier error de escritura/archivo, se muestra
            System.out.println(ex.getMessage());

        } finally {
            try {
                // Cierra FileWriter si existe
                if (fr != null) fr.close();
                // Cierra BufferedWriter (esto también cierra fra automáticamente)  
                if (br != null) br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}