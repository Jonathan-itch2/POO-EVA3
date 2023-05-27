package eva3_12_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class EVA3_12_SERIALIZABLE {

    public static void main(String[] args) {
            Persona perso = new Persona("Jonathan", "Salazar", 19);
        try {
            guardarObj(perso);
            Persona res = leerObj();
            System.out.println(res.getNombre());
            System.out.println(res.getApellido());
            System.out.println(res.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void guardarObj(Persona perso) throws IOException{
        FileOutputStream abrirArchivo = new FileOutputStream("C:\\PruebaSerializable\\personas.per");
        ObjectOutputStream ouStream = new ObjectOutputStream(abrirArchivo);
        ouStream.writeObject(perso);
        ouStream.close();
    }
    
    public static Persona leerObj() throws IOException, ClassNotFoundException{
        Persona perso = null;
        FileInputStream abrirArchivo = new FileInputStream("C:\\PruebaSerializable\\personas.per");
        ObjectInputStream oiStream = new ObjectInputStream(abrirArchivo);
        //casting 
        perso = (Persona) oiStream.readObject();
        return perso;
    }
    
}

class Persona implements Serializable{
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    public Persona(){
        this.Nombre = " ";
        this.Apellido = " ";
        this.Edad = 0;
    }
    
    public Persona(String Nombre, String Apellido, int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
