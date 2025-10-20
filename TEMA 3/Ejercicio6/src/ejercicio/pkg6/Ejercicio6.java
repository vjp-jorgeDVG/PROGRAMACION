/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");

        int nota = scanner.nextInt();
        
        if (scanner.hasNextInt()) {
            
            
                if (nota <= 4) {
                    System.out.println("Calificacion: Suspenso");
                } else if (nota <= 6) {
                    System.out.println("Calificacion: Bien");
                } else if(nota <= 8) {
                    System.out.println("Calificacion: Notable");
                } else {
                    System.out.println("Calificacion: Sobresaliente");
                }
            }
        }
    }


