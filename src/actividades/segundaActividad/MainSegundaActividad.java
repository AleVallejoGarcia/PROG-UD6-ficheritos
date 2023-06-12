import java.io.BufferedReader;
import java.io.FileReader;

public class MainSegundaActividad {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("src/ficheros/actividad2.txt");
        BufferedReader br = new BufferedReader(reader);
        String textoFichero = br.readLine();
        String textoFormateado = "";

    
        for (int i = 0; i < textoFichero.length(); i++) {
            textoFormateado += textoFichero.charAt(i) + "_" + (int) textoFichero.charAt(i) + ",";
        }

        reader.close();
        System.out.println(textoFormateado);
    }
}
