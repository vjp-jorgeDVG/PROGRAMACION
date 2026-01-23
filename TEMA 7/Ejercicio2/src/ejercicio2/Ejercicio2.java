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
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Por favor, introduzca un numero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = entrada.nextInt();
        
        // Lógica según la fuente: si el primero > 10 se multiplican, sino se suman
        if (num1 > 10) {
            int producto = num1 * num2;
            System.out.println("La operación que se realizó es producto y el resultado es " + producto);
        } else {
            int suma = num1 + num2;
            System.out.println("La operación que se realizó es suma y el resultado es " + suma);
        }
    }
}
