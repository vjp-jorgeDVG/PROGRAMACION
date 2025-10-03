/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio22 {
final static float RAIZCUADRADADE3 = 1.73205080757f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduce la medida de un lado de un triangulo equilatero");
        
        Scanner entrada = new Scanner (System.in);   
        
        int lado = entrada.nextInt(); 
        
        float area = lado * lado * RAIZCUADRADADE3 / 4;
        int perimetro = 3 * lado;
        
        System.out.println("El area de un triangulo de lado: " + lado + " es: "+ area + " centimetros cuadrados.");
        System.out.println("El perimetro de un triangulo de lado: " + lado + " es: "+ perimetro + " centrimetros.");
        
    }
    
}
