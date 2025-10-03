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
        
        float programacion, marcas, datos, desarrollo, informaticos, laboral, notaMedia;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("introduce la nota de programacion");
        
        programacion = entrada.nextFloat();
        
        System.out.println("nota de lenguaje de marcas");
        
        marcas = entrada.nextFloat();
        
        System.out.println("nota de base de datos");
        
        datos = entrada.nextFloat();
        
        System.out.println("nota entorno de desarrollo");
        
        desarrollo = entrada.nextFloat();
        
        System.out.println("nota sistemas informaticos");
        
        informaticos = entrada.nextFloat();
        
        System.out.println("nota formacion y orientacion laboral");
        
        laboral = entrada.nextFloat();
        
        int asignaturas = 6;
        
        notaMedia = (laboral + informaticos + desarrollo + datos + marcas + programacion) / asignaturas;
        
        System.out.println("Su nota media es de " + notaMedia);
        
        
    }
    
}
