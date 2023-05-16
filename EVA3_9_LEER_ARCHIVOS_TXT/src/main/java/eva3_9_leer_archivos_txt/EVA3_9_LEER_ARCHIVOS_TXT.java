package eva3_9_leer_archivos_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
    
    final static String RUTA = "C:\\ArchivoPrueba\\Prueba.txt";

    public static void main(String[] args) {
        
        try{
            
            readUsingFiles(RUTA); //LEE UN ARCHIVO COMPLETO
            readingUsingBufferedReader(RUTA); //MEJOR OPCION PARA LEER TEXTO
            readingUsingFileReader(RUTA); //HIBRIDO CON BUFFERE, PERO INEFICIENTE
            readingUsingScanner(RUTA); //HERRAMIENTA PARA PROCESAR INPUTS (COMO EL TECLADO)
            
        } catch(IOException ex){
           ex.printStackTrace();
        }
        
        
        
    }
    
    //Permite procesar archivos ma grandes, ya que los lee por partes
    //En el caso de texto, nos permite leerlo linea por linea.
    //Es un mecanismo adecuado para trabajar con multitareas (hilos)
    
    public static void readUsingFiles(String ruta) throws IOException{
        // Construimos la ruta en base a la cadena de texto
        Path path = Paths.get(ruta);
        /*
        List<String> todasLineas =  Files.readAllLines(path);
        System.out.println("Resultado: ");
        //System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas.get(i)); 
        }
        */
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
    
    
    public static void readingUsingBufferedReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON BUFFERED READER");
        File file = new File(ruta);
        FileInputStream fileInputStream = new FileInputStream(file);
        //LO INTERPRETA COMO BYTES
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //LO PROCESA COMO TEXTO
        BufferedReader bufReader = new BufferedReader(inputStreamReader);
        
        String linea;
        while((linea = bufReader.readLine()) != null){
            System.out.println(linea);
        }
        bufReader.close(); //Cerrar el buffered
    }
    
    /*
    No es la mejor opcion para leer archivos de texto
    */
    
    public static void readingUsingFileReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON FILE READER");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        
        String linea;
        while((linea = bufReader.readLine()) != null){
            System.out.println(linea);
        }
        bufReader.close(); //Cerrar el buffered
        fileReader.close(); //cerrar el filereader
    }
    
    public static void readingUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON SCANNER");
        Path path = Paths.get(ruta);
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            String linea = scanner.nextLine();
            System.out.println(linea);
        }
        scanner.close();
    }
}
