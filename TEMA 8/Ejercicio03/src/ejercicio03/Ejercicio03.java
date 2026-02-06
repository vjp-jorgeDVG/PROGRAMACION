/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Arrays;
/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vectorEnteros [] = new int [30];
        
        
   
        Arrays.fill (vectorEnteros, 0, 10, 0);
        Arrays.fill (vectorEnteros, 10, 20, 1);
        Arrays.fill (vectorEnteros, 20, 30, 5);
        
        System.out.println(Arrays.toString(vectorEnteros));

            
    
        
    }
    
}
