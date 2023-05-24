package eva3_10_escribir_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class EVA3_10_ESCRIBIR_ARCHIVOS_TXT {
    
    final static String RUTA = "C:\\ArchivoPruebaEscribir\\";
    
    public static void main(String[] args) {
        
        try {
            writeUsingFiles(RUTA + "ArchivoFiles.txt", "Prueba");
            writeUsingFileWriter(RUTA + "ArchivoFilesWriter.txt", "Prueba");
            writeUsingBufferedWriter(RUTA + "ArchivoBufferedWriter.txt", "Prueba");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }
    
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(datos);
        filewriter.close();
        
    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file);
        BufferedWriter bufwriter = new BufferedWriter(filewriter);
        for (int i = 0; i < 10; i++) {
            bufwriter.write((i+1)  + " " + datos);
            bufwriter.write("\n");
        }
        bufwriter.close();
        filewriter.close();
    }
}
