/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author alumno
 */
/**
 * 
 */
public class metodo {
    /**
     * 
     * @param n    
     * @return 
     */
    public static boolean esPrimo(int n) {
        
        int i=2;
        boolean enc = false;
        
        while (i < n && ! enc) {
            
            if (n % i == 0) {
                enc = true;
            }
            else {
                i++;
            }         
        }
        
        if (!enc) {
            System.out.println("tu numero es primo");
        } else {
            System.out.println("el numero no es primo");
        }
        
        return enc;
    }
}