/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio8 {

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

        if (billetes50 > 0)
            System.out.println("Billetes de 50: " + billetes50);
        if (billetes20 > 0)
            System.out.println("Billetes de 20: " + billetes20);
        if (billetes10 > 0)
            System.out.println("Billetes de 10: " + billetes10);
        if (billetes5 > 0)
            System.out.println("Billetes de 5: " + billetes5);
        if (monedas2 > 0)
            System.out.println("Monedas de 2 euros: " + monedas2);
        if (monedas1 > 0)
            System.out.println("Monedas de 1 euro: " + monedas1);
    }
}
