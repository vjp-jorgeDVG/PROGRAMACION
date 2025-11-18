/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class notas {
    
// atributos: caracteristicas. nunca se inicializan aqui
    private String nombre;
    private int nota;
    
    //constructores: permiten construir un objeto de este tipo.
    //inicializan los atributos
    //2.1 constructor por defecto
    public notas() {
        this.nombre = "";
        this.nota = 0;
    }
    // 2.2 constructor parametrizado (sobrecarga de metodos y autorreferencia this)
    public notas(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    //3.0 metodos
    //3.1 getters y setters: devuelven y establecen el valor de los atributos
    public String getNombre() {
        return this.nombre;
    }
    public void setRuedas(String nombre) {
        this.nombre = nombre;
        
    }
    // hacemos el get y set de los distintos componentes
    public int getNota() {
        return this.nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    
    //4 to string: devuelve un string con los datos del objeto
    
    @Override
    
    public String toString() {
        return "el alumno con nombre: " + this.nombre +  ", tiene una nota de " + this.nota;
    }
}
