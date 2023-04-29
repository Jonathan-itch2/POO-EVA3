package eva3_1_uncheked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHEKED_EXCEPTIONS {

    public static void main(String[] args) {
        //SON TODAS DE RUNTIMEEXCEPTION
        
        //ARITHMETIC EXPETION :
        //Division entre cero 
        System.out.println("INICIANDO PROGRAMA");
        int x = 5, y = 0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x / y;
        System.out.println("CALCULANDO LA DIVISION");
        System.out.println("La division es: " + resu);
        
        //INPUTMISMATCH EXCEPTION:
        Scanner input = new Scanner(System.in);
        System.out.println("Introduc un numero: ");
        int numero = input.nextInt();
        System.out.println("Tu numero es: " + numero);
        
        //INDEXOUTOFBOUNDS EXCEPTION:
        int[] arreglo = new int[5]; // 5 - (N-1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //Error de logica, 6 no es posicion valida
        
        //NULLPOINTER EXCEPTION 
        Prueba objprueba = null;
        System.out.println("Valor x: " + objprueba.x);
    }
}

class Prueba {
    public int x;
}