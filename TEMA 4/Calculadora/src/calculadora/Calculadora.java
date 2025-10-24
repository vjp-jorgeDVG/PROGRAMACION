/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class Calculadora {
    /**
     * Método que devuelve la suma de dos números
     * pasados por parámetro.
     * @param num1
     * @param num2
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Método que resta dos números pasados por parámetro     
     * @param num1
     * @param num2     
     * @return la resta de los dos números
     */
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
     
    /**
     * Método que divide dos números pasados por parámetro     
     * @param num1
     * @param num2     
     * @return la division de los dos números
     */
    public static int division (int num1, int num2) {
        return num1 / num2;
    }
    
    /**
     * Método que hace el producto de dos números pasados por parámetro     
     * @param num1
     * @param num2     
     * @return el producto de los dos números
     */
    public static int producto (int num1, int num2) {
        return num1 * num2;
    }
    
    /**
     * metodo que calcula la raiz cuadrada
     * @param num1
     * @return la raiz cuadrada 
     */
    public static double raizCuadrada (int num1) {
        return Math.sqrt(num1);
    }
}
