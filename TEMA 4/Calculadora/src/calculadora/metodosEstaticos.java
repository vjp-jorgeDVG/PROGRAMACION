/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import utilidades.utilidades;
package calculadora;
// cuando no funciones los sout tienen que estar dentro del metodo main
/**
 *
 * @author alumno
 */
public class metodosEstaticos {
    public static void main(String[] args) {
        //creamos una calculadora
    //1. pedimos 2 numeros
    num1 = utilidades.pedirNumero();
    num2 = utilidades.pedirNumero();
    
        System.out.println("");(num1 + " - " + num2);
        
    //llamamos a los metodos
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.suma(num1,num2);
    sout    (num1 + " + " + num2 + " = " + resultado);
    
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.resta(num1,num2);
    sout    (num1 + " - " + num2 + " = " + resultado);
    
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.producto(num1,num2);
    sout    (num1 + " * " + num2 + " = " + resultado);
    
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.division(num1,num2);
    sout    (num1 + " / " + num2 + " = " + resultado);
    
    resultado = Calculadora.raizCuadrada(num1);
    sout    ("la raiz cuadrada de num1 " + num1 + " es " + resultado)
    }
    
    //creamos una calculadora
    //1. pedimos 2 numeros
    num1 = utilidades.pedirNumero();
    num2 = utilidades.pedirNumero();
    
    sout     (num1 + " - " + num2);
        
    //llamamos a los metodos
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.suma(num1,num2);
    sout    (num1 + " + " + num2 + " = " + resultado);
    
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.resta(num1,num2);
    sout    (num1 + " - " + num2 + " = " + resultado);
    
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.producto(num1,num2);
    sout    (num1 + " * " + num2 + " = " + resultado);
    
    //guardamos el resultado en una variable
    //mostramos dicha variable
    resultado = Calculadora.division(num1,num2);
    sout    (num1 + " / " + num2 + " = " + resultado);
    
    resultado = Calculadora.raizCuadrada(num1);
    sout    ("la raiz cuadrada de num1 " + num1 + " es " + resultado)
    
    
}
