/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduce el primer numero");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        System.out.println("introduce el segundo numero");
        int num2 = sc.nextInt();
        
        int num3 = num1 * num2;
        int num4 = num1 + num2;
        
        if (num1>10) {
            System.out.println(num3);        
        } else 
            System.out.println(num4);
    }
    
}
