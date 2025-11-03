/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejercicio03 {
public static void main(String[] args) {
    
    int num1, num2, num3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero ");
        
        num1 = entrada.nextInt();

        System.out.println("introduce otro numero ");
        
        num2 = entrada.nextInt();

        System.out.println("introduce el ultimo numero ");
        
        num3 = entrada.nextInt();
        
        prueba.elMayor(num1, num2, num3, num3);
    }
}