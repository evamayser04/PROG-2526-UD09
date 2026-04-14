package a02;
import java.io.*;

public class A2 {
    static final String RUTA ="D:\\PROGRAMACIÓN\\UD08\\src\\a05\\Main.java";
    public static void main(String[] args) {
        String texto = "";
        FileReader fr = null;

        try {
            
            fr = new FileReader(RUTA);
            int c = fr.read();
            while(c != -1){
                texto = texto + (char) c;
                c = fr.read();
            }
        } 
        catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        finally {
            if(fr != null) {
                try {
                    fr.close();
                    System.out.println("He terminado -> Cierro el fichero.");
                } 
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
                System.out.println(texto);
    }
}
