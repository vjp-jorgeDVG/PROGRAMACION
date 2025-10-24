/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 160;
        int contador = 0;
        
        do {
            System.out.print (num1 % 2 != 0);

            contador++;
            
        }
        while (num1<num2);
        
        
        System.out.println("la cantidad de numeros impares es: " + contador);
        
    }
}
