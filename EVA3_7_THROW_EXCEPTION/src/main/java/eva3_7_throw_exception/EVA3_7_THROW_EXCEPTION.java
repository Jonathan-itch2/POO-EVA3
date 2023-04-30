package eva3_7_throw_exception;

import java.util.Scanner;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        Prueba obj = new Prueba();
        try{
            //cheked: es forzoso resolverlas
            //unhecekd: errores de logica, no es forzoso resolverlas
            //int resu = 5/0
            obj.capturaMayorcero(-1);
            System.out.println("Introduce un valor: ");
            Scanner input = new Scanner(System.in);
            int valor = input.nextInt();
        } catch(Exception ex){
            //NO ES BUENO USAR EXCEPTION YA QUE
            //ES LA SUPERCLASE DE LAS EXCEPCIONES
            System.out.println(ex.getMessage());
        }
        
        obj.Division(5, 0);
    }
}

class Prueba{
    public void capturaMayorcero(int valor)throws Exception{
        if(valor <= 0){ //Voy agenerar una excepcion
            throw new Exception(valor + " es negativo, solo se aceptan valores positivos");
        }
        System.out.println("El valor es: " + valor);
    }
    
    public int Division(int x, int y)throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("El valor del divisor es cero, y es invalido");
        }
        return x/y;              
    }
}
