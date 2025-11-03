/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;
/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class ejercicio02 {

public static void main(String[] args) {
        
    int num1,num2, resultado, multiplicacion, suma;
        
    Scanner entrada = new Scanner(System.in);

    System.out.println("introduce el primer numero");
        
    num1 = entrada.nextInt();

    System.out.println("introduce el segundo número: ");
        
    num2 = entrada.nextInt();

        if (num1 > 10) {
            
        resultado = prueba.multiplicar(num1, num2);
        multiplicacion = resultado;
        } 
        
        else {
            
        resultado = prueba.sumar(num1, num2);
        suma = resultado;
        }
            
        System.out.println("el resultado de tu operacion es " + resultado);
    }
}

