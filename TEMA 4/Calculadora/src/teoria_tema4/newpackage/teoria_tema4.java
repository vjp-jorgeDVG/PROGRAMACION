/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculadora;

/**
 *
 * @author alumno
 */
public class teoria_tema4 {
// metodo que imprime un saludo --> tipo void
    public static void saludo() {
        System.out.println("Hola mundo");
    }
    
// metodo que imprime un mensaje con un dato que recive por parametro --> tipo void
    public static void saludoConParametro(int num) {
        System.out.println("Hola mundo " + num);
    }
// metodo que muestra la suma de dos numeros que recive por parametros --> tipo void
    public static void suma(int num1,int num2) {
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1+num2));
    }
//metodo que devueve la suma de dos numeros que recibe por paramtro --> tipo int
    public static int sumaQueDevuvelElResultado (int num1, int num2) {
    return num1 + num2;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // como llamar al metodo
       saludo();
       saludoConParametro(5);
       suma(5,6);
       sumaQueDevuvelElResultado(5,6);
    }
    
}

