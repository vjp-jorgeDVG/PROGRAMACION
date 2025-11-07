/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg5.teoria;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Tema5Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. instancio
        //1.1 con constructor parametrizado y estableciendo valores con setters
        Scanner entrada = new Scanner (System.in);
        
        coche miCoche = new coche();
        
        System.out.println(miCoche.toString());
        
        miCoche.setEspejos(5);
        
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        //1.2. con constructor parametrizado, inicializando los atributos
        coche tuCoche = new coche ("michelin","baja",3);
        System.out.println(tuCoche.toString());
        
        //esto hace lo mismo que la linea anterior, porque detecta el tostring automaticamente
        System.out.println(tuCoche);
        System.out.println(tuCoche.getRuedas());
        
        
        
        
        
    }
    
}
