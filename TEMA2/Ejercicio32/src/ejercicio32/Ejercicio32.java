/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca una cantidad de dinero");
        
        
        int total = entrada.nextInt();
        
        
        int billetes50 = total / 50; 
        int restante = total % 50; 
        
        int billetes20 = restante / 20;   
        restante = restante % 20;
        
        int billetes10 = restante / 10;
        restante = restante % 10;
        
        int billete5 = restante / 5;
        restante = restante % 5;
        
        int monedas2 = restante / 2;
        restante = restante % 2;
        
        int monedas1 = restante /1;
       
        
        
        System.out.println("tienes: " + billetes50 + " billetes de 50 euros");
        System.out.println("tienes: " + billetes20 + " billetes de 20 euros");
        System.out.println("tienes: " + billetes10 + " billetes de 10 euros");
        System.out.println("tienes: " + billete5 + " billetes de 5 euros");
        System.out.println("tienes: " + monedas2 + " monedas de 2 euros");
        System.out.println("tienes: " + monedas1 + " monedas de 1 euro");
        
        
        
    }
    
}
