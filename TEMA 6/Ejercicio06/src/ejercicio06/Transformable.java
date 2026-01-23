/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author jorge
 */
public interface Transformable {

    /**
     * Devuelve una cadena resultado de concatenar todas las cadenas 
     * (atributos String) del objeto, separadas con el carácter '#'.
     */
    String concatenarTodo();

    /**
     * Devuelve una cadena resultado de concatenar las iniciales 
     * de todas las cadenas del objeto.
     */
    String obtenerIniciales();

    /**
     * Cuenta todas las vocales de todas las cadenas del objeto y 
     * muestra el resultado por pantalla.
     */
    void contarVocales(); // Muestra el resultado por pantalla según el requisito

    /**
     * Devuelve la cadena más larga de todas las cadenas del objeto.
     */
    String obtenerCadenaMasLarga();

    /**
     * Recibe una cadena por parámetros. Devuelve true si el objeto tiene 
     * una cadena con ese valor y false en caso contrario.
     */
    boolean buscarCadena(String cadena);
}
