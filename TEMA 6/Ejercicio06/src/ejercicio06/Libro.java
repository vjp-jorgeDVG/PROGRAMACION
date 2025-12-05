/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author jorge
 */
import java.util.Arrays;
import java.util.List;

public class Libro implements Transformable {
    private String titulo;
    private String autor;
    private String genero;

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    // Método de utilidad para obtener todos los Strings juntos para el procesamiento
    private List<String> obtenerStrings() {
        return Arrays.asList(titulo, autor, genero);
    }

    // Implementación de la interfaz Transformable
    
    @Override
    public String concatenarTodo() {
        return String.join("#", obtenerStrings());
    }

    @Override
    public String obtenerIniciales() {
        StringBuilder iniciales = new StringBuilder();
        for (String s : obtenerStrings()) {
            if (s != null && !s.isEmpty()) {
                iniciales.append(s.charAt(0));
            }
        }
        return iniciales.toString();
    }

    @Override
    public void contarVocales() {
        int contador = 0;
        String vocales = "aeiouáéíóú";
        
        for (String s : obtenerStrings()) {
            if (s != null) {
                String lowerCase = s.toLowerCase();
                for (char c : lowerCase.toCharArray()) {
                    if (vocales.indexOf(c) != -1) {
                        contador++;
                    }
                }
            }
        }
        System.out.println("El número total de vocales en el Libro es: " + contador);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = "";
        for (String s : obtenerStrings()) {
            if (s != null && s.length() > masLarga.length()) {
                masLarga = s;
            }
        }
        return masLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        for (String s : obtenerStrings()) {
            // Utilizamos equalsIgnoreCase para una búsqueda más flexible (opcional)
            if (s != null && s.equalsIgnoreCase(cadena)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Género: " + genero + "]";
    }
}
