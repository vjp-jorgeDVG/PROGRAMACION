/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce el primer numero");
        num1 = sc.nextInt();
        System.out.println("introduce el segundo numero");
        num2 =sc.nextInt();
        System.out.println("introduce el tercer numero");
        num3 = sc.nextInt();
        
        if (num1>num2 && num1>num3) {
            System.out.println("tu mayor numero es " + num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println("tu mayor numero es " + num2);
        }else System.out.println("tu mayor numero es " + num3);     
    }
}
    
    

