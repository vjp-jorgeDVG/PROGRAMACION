/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10;

/**
 *
 * @author jorge
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int temp = num1;
        
        num1 = num2;
        num2 = temp;

        System.out.println("num1: " + num1);  // num1: 2
        System.out.println("num2: " + num2);  // num2: 1
    }
    
}
