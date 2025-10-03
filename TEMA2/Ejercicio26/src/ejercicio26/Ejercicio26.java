/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;


import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cifras, cifra1, cifra2, cifra3, cifra4;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elabora un numero de cuatro cifras");
        
        cifras = entrada.nextInt();
        
        cifra1 = cifras / 1000;
        cifra2 = cifras % 1000 / 100;
        cifra3 = cifras % 1000 % 100 / 10;
        cifra4 = cifras % 1000 % 100 % 10 / 1;
        
        System.out.println("tu primera cifra es: " + cifra1);
        System.out.println("tu segunda cifra es: " + cifra2);
        System.out.println("tu tercera cifra es: " + cifra3);
        System.out.println("tu cuarta cifra es: " + cifra4);
        
        
        
    }
    
}
