/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author jorge
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 130;

        int billetes50 = total / 50;      // Cantidad máxima de billetes de 50
        int restante = total % 50;        // Lo que queda después de usar billetes de 50
        int billetes10 = restante / 10;   // Billetes de 10 para completar el total

        System.out.println("Billetes de 50 euros: " + billetes50);
        System.out.println("Billetes de 10 euros: " + billetes10);
    }
    
}
