import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class MainTerceraActividad {
    public static void main(String[] args) throws Exception {

        File actividad3 = new File("src/ficheros/actividad3.txt");

        FileWriter writer = new FileWriter(actividad3);
        BufferedWriter writerActividad3 = new BufferedWriter(writer);

        FileReader readerActividad1 = new FileReader("src/ficheros/actividad1.txt");
        FileReader readerActividad2 = new FileReader("src/ficheros/actividad2.txt");

        BufferedReader actividad1 = new BufferedReader(readerActividad1);
        BufferedReader actividad2 = new BufferedReader(readerActividad2);

        String textoFichero1 = actividad1.readLine();
        String textoFichero2 = actividad2.readLine();

        String textoFichero3 = ("- Contenido del Fichero Uno: " + textoFichero1 + "\n" + "- Contenido del Fichero Dos: " + textoFichero2 + "\n" + "Seki te mato");
        writerActividad3.write(textoFichero3);

        actividad1.close();
        actividad2.close();
        writerActividad3.close();
    }
}
