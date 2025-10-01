/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduce la nota de programacion");
        
        Scanner entrada = new Scanner (System.in);
        
        float programacion = entrada.nextFloat();
        
        System.out.println("nota de lenguaje de marcas");
        
        float marcas = entrada.nextFloat();
        
        System.out.println("nota de base de datos");
        
        float datos = entrada.nextFloat();
        
        System.out.println("nota entorno de desarrollo");
        
        float desarrollo = entrada.nextFloat();
        
        System.out.println("nota sistemas informaticos");
        
        float informaticos = entrada.nextFloat();
        
        System.out.println("nota formacion y orientacion laboral");
        
        float laboral = entrada.nextFloat();
        
        int Asignaturas = 6;
        
        float NotaMedia = laboral + informaticos + desarrollo + datos + marcas + programacion / Asignaturas;
        
        System.out.println("Su nota media es de " + NotaMedia);
        
        
    }
    
}
