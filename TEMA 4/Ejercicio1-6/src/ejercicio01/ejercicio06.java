/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;
import ejercicio01.prueba;
/**
 *
 * @author jorge
 */
import java.util.Scanner;

public class ejercicio06 {

public static void main(String[] args) {

    int nota3;
    
    Scanner entrada = new Scanner(System.in);

    System.out.print("introduce tu nota: ");
    
    nota3 = entrada.nextInt();
    
    prueba.nota2(nota3);
    
    }
}