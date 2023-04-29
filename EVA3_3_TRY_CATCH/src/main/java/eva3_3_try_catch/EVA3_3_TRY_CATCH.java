package eva3_3_try_catch;

public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        try{
           int x = 5, y = 0;
           int resu = x / y;
           System.out.println("Resultado: " + resu);   
        } catch(ArithmeticException e){
            System.out.println("Excepcion: " + e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
