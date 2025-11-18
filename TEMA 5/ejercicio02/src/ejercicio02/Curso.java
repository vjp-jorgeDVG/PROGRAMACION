/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author alumno
 */
public class Curso {
    private String curso;
    private int numeroHoras;
    private static int numeroDeCursos;
    //parametrizados
    public Curso () {
        this.curso = "";
        this.numeroHoras= 0;
        this.numeroDeCursos = 0;
    }
    //getters y setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public static int getNumeroDeCursos() {
        return numeroDeCursos;
    }

    public static void setNumeroDeCursos(int numeroDeCursos) {
        Curso.numeroDeCursos = numeroDeCursos;
    }
    //metodos
    public void establecerNombreyHoras (){
        curso = "daw";
        numeroHoras = 190;
        System.out.println("el nombre del curso es: " + curso + " y su numero de horas es " + numeroHoras);
    }
    public String obtenerNombre () {
        return this.curso;
    }
    public int obtenerHoras () {
        return this.numeroHoras;
    }
    public static void sumarCursos () {
        numeroDeCursos++;
    }
    public static int verNumeroDeCursos () {
        return numeroDeCursos;
        
    }          
}

