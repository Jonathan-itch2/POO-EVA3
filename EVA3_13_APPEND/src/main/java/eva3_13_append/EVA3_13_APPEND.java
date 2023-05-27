package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class EVA3_13_APPEND {
    
    public static void main(String[] args) {
        final String RUTA = "C:\\PruebaAppend\\";
        
        try {
            writeUsingBufferedWriter(RUTA + "Prueba.txt", "Pruebita UwU");
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo");
        }
        
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 10; i++) {
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
    }
    
}


