package eva3_8_custom_exceptions;

/**
 *
 * @author jonat
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellido("Perez");
        try{
            perso.setEdad(-10);
        } catch(DatoEntradaChekedEx ex){
            System.out.println(ex.getMessage());
        }
    }
}

class Persona{
    private String Nombre;
    private String Apellido;
    private int Edad;

    public Persona() {
        this.Nombre = " ";
        this.Apellido = " ";
        this.Edad = 0;
        
    }

    public Persona(String Nombre, String Apellido, int Edad) {
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

    public void setEdad(int Edad) throws DatoEntradaChekedEx{
       if (Edad < 0){
           throw new DatoEntradaChekedEx();
       } else {
           this.Edad = Edad;
       }
       
    }
}

class DatoEntradaException extends RuntimeException{
    public DatoEntradaException(){
        super("Dato de entrada incorrecto!! el valor debe de ser positivo");
    }
}

class DatoEntradaChekedEx extends Exception{

    public DatoEntradaChekedEx() {
        super("Dato de entrada incorrecto!! el valor debe de ser positivo");
    }
    
}