/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;
/**
 *
 * @author jorge
 */
public class metodos {
/**
 * 
 * @param numero 
 */
 public static void metodo (int numero) {

            if (numero<0) {
                System.out.println("tu numero es negativo");
            }
            else {
                System.out.println("tu numero es positivo");
            }
        
    }
 

/**
 * 
 * @param num1
 * @param num2
 * @return 
 */
public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
}


/**
 * 
 * @param num1
 * @param num2
 * @param num3
 * @param menor
 * @return 
 */

public static int elMenor(int num1, int num2, int num3, int menor) {
    
        menor = num1;

            if (num1 < num2) {
            menor = num2;
        }

            if (num3 < num2) {
            menor = num3;
        }

        System.out.println("el  numero menor de los 3 es" + menor);

        
        
/**
 * 
 * @param nota 
 */ 

public static void nota(int nota) {
        
    if (nota <5) {
        System.out.println("suspenso");
    } 
    if (nota >= 5 && nota <= 6) {
        System.out.println("Bien");
    } 
    if (nota >= 7 && nota <= 8) {
        System.out.println("Notable");
    } 
    if (nota >= 9 && nota <= 10) {
        System.out.println("Sobresaliente");
    } else {
        System.out.println("la nota debe estar entre 0 y 10");
    }
}


