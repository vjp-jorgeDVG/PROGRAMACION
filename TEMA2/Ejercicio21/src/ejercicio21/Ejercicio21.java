/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    final static int SEGUNDOSENDIAS = 86400;
    final static int SEGUNDOSENHORAS = 3600;
    final static int SEGUNDOSENMINUTOS = 60;
    public static void main(String[] args) {
        
        System.out.println("introduce un numero en segundos");
        
        Scanner entrada = new Scanner (System.in);
        
        int tiempo = entrada.nextInt(); // AQUI TOMAMOS EL VALOR DE SCANNER COMO UNA VARIABLE
        
        int dias = tiempo / SEGUNDOSENDIAS;
        int horas = tiempo / SEGUNDOSENHORAS; 
        int minutos = (tiempo % SEGUNDOSENHORAS) / SEGUNDOSENMINUTOS; // segundos restantes convertidos a minutos
        int segundos = tiempo % SEGUNDOSENMINUTOS; // segundos restantes
        
        System.out.println("en tiempo indicado son: dias " + dias + horas + " horas " + minutos + " minutos " + segundos + " segundos ");
    }
    
}
