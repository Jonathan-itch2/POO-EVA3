package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x, y;
        int resu;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduzca un nmero (entero) X: ");
                x = input.nextInt();
                System.out.println("Introduzca un nmero (entero) Y: ");
                y = input.nextInt();
                resu = x/y;
                break;
            }catch(InputMismatchException e){
                 System.out.println("La captura es incorrecta: " + e.getMessage());
            }catch(ArithmeticException e){
                System.out.println("No se puede dividir entre cero: " + e.getMessage());
            }
        }while(true);
        System.out.println("La division de " + x + " / " + y + " es: " + resu);
        System.out.println("PROGRAMA TERMINADO CON EXITO");
    }
}
