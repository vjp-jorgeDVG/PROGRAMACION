/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author jorge
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    final static int SEGUNDOSENHORAS = 3600;
    final static int SEGUNDOSENMINUTOS = 60;
    public static void main(String[] args) {
        int tiempo = 10000; // tiempo en segundos

        int horas = tiempo / SEGUNDOSENHORAS; // 1 hora = 3600 segundos
        int minutos = (tiempo % SEGUNDOSENHORAS) / SEGUNDOSENMINUTOS; // segundos restantes convertidos a minutos
        int segundos = tiempo % SEGUNDOSENMINUTOS; // segundos restantes

        System.out.println("Tiempo original en segundos: " + tiempo);
        System.out.println("Equivalente: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }
    
}
