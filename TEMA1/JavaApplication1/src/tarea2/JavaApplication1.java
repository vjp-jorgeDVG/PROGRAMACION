/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

/**
 *
 * @author jorge
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1;
        int dato2, resultado;
        
        dato1 = 20;
        dato2 = 10;
        
        //suma
        resultado = dato1 + dato2;
        System.out.print(dato1 + " + " + dato2 + " = " + resultado);
        
        //resta
        resultado = dato1 - dato2;
        System.out.print(dato1 + " - " + dato2 + " = " + resultado);
        
        //producto
        resultado = dato1 * dato2;
        System.out.print(dato1 + " * " + dato2 + " = " + resultado);
        
        //cociente
        resultado = dato1 / dato2;
        System.out.print(dato1 + " / " + dato2 + " = " + resultado);
    }
    
}
