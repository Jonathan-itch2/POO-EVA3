package eva3_6_finally;

public class EVA3_6_FINALLY {

    public static void main(String[] args) {
        
        int x = 9, y = 0;
        try{
            int resu = x/y;
            System.out.println("Resultado: " + resu);
        } catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        } finally{ //obliga a la ejecucion de est seccion de codigo es opcional
            System.out.println("Siempre me voy a ejecutar");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
