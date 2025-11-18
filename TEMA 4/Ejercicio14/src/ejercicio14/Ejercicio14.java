/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        int numero;
        
        numero = pedirNumero();
        
        Ejercicio14.primo(numero);
    }

    
    public static int pedirNumero() {
    
        int numero = 1;
        
        do {
            System.out.println("introduce numero distinto de 0 ");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();
        }
        
        while (numero <= 0);
        
        return numero;
      
    }
  public static void primo(int num1) {
    
    int contador=0 ;
    
      for (int i = 1; i <= num1; i++) {
          
          if (i%3==0) {
              System.out.println(i + " divisible por 3");   
              contador++;
          }                                                       
    }
    System.out.println("numeros encontrados :" + contador );
    
    }
}
