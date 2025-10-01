/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduce el primer numero");
        
        Scanner entrada = new Scanner (System.in);
        
        int num1 = entrada.nextInt();
        
        System.out.println("introduce el segundo numero");
        
        int num2 = entrada.nextInt();
        
        System.out.println("introduce el tercer numero");
        
        int num3 = entrada.nextInt();
        
        int suma =  num1 + num2 + num3;
        
        System.out.println("la suma de los numero es: " + suma);
        
        int producto = num1 * num2 * num3;
                
        System.out.println("el producto de los numeros es: " + producto);

    }
    
}
