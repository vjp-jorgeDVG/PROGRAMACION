/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        
        Scanner entrada = new Scanner (System.in);
        
        float precio = entrada.nextFloat();
        
        System.out.println("Cuantas unidades quiere llevarse:");
        
        float cantidad = entrada.nextFloat();
        
        float resultado = precio * cantidad;
        
        System.out.println("El precio total de su compra es de: " + resultado);
        
        
    }
    
}
