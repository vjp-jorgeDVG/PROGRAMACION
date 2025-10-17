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
        
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca una cantidad de dinero");
        
        int restante = entrada.nextInt();
        
        billetes50 = restante / 50; 
        restante = restante % 50; 
        
        billetes20 = restante / 20;   
        restante = restante % 20;
        
        billetes10 = restante / 10;
        restante = restante % 10;
        
        billetes5 = restante / 5;
        restante = restante % 5;
        
        monedas2 = restante / 2;
        restante = restante % 2;
        
        monedas1 = restante /1;

        System.out.println("tienes: " + billetes50 + " billetes de 50 euros");
        System.out.println("tienes: " + billetes20 + " billetes de 20 euros");
        System.out.println("tienes: " + billetes10 + " billetes de 10 euros");
        System.out.println("tienes: " + billetes5 + " billetes de 5 euros");
        System.out.println("tienes: " + monedas2 + " monedas de 2 euros");
        System.out.println("tienes: " + monedas1 + " monedas de 1 euro");
        
        
        
    }
    
}
