package a03;
import java.io.*;

public class A3 {
    static final String RUTA ="D:\\PROGRAMACIÓN\\UD08\\src\\a05\\Main.java";
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
    }
}
