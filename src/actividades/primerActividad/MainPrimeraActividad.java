package actividades.primerActividad;
import java.io.Console;
import java.io.FileWriter;

public class MainPrimeraActividad {
    public static void main(String[] args) throws Exception {
        Console c = System.console();
        boolean salida = false;

        String texto;
        String textoFormateado = "";
        int caracteresQueFaltan;

        while (!salida) {
            texto = c.readLine("Introduzca un texto de al menos 30 carácteres");


            if (texto.length() < 30) {
                caracteresQueFaltan = 30 - texto.length();
                System.out.println("Vuelva a introducir el texto le faltan " + caracteresQueFaltan + " para ser válido");
            } else {
                textoFormateado = texto.replace(' ', '_').toUpperCase();
                salida = true;
            }

            try {
                FileWriter writer = new FileWriter("src/ficheros/actividad1.txt");
                writer.write(textoFormateado);
                writer.close();
            } catch (Exception e) {
                System.out.println("No sirves ni para escribir una cadena de texto");
            }
    
        }
    }    
}
