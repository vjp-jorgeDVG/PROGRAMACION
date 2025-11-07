/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

   

        public static void main(String[] args) {

            int numero1, numero2, numero3, numero4;


            Scanner entrada = new Scanner(System.in);
            System.out.println("introduce el primer numero: ");

            numero1 = entrada.nextInt();

            System.out.println("introduce el segundo numero: ");
            numero2 = entrada.nextInt();

            System.out.println("introduce el tercer numero: ");
            numero3 = entrada.nextInt();

            System.out.println("introduce el cuarto numero: ");
            numero4 = entrada.nextInt();


            Comparador.vasos(numero1, numero2, numero3, numero4, numero4);
        }
    
}
