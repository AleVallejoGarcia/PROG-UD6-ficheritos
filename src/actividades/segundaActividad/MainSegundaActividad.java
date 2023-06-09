import java.io.BufferedReader;
import java.io.FileReader;

public class MainSegundaActividad {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("src/ficheros/actividad2.txt");
        BufferedReader br = new BufferedReader(reader);
        int conteo = 0;
        String textoFichero = br.readLine();
        String textoFormateado = "";

    
        while (conteo < textoFichero.length()) {
            textoFormateado += textoFichero.charAt(conteo) + "_" + (int) textoFichero.charAt(conteo) + ",";
            conteo++;
        }

        reader.close();
        System.out.println(textoFormateado);
    }
}
