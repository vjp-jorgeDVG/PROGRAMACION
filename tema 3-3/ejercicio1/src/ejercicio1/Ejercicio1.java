/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("introduce un numero");
        Scanner sc = new Scanner(System.in);
        int numero =sc.nextInt();
        
        if (numero <0){
            System.out.println("el numero es negativo");
        } else
            System.out.println("el numero es positivo");
    }
    
}
