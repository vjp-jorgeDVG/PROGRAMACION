/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclistas {

    float potencia;
    float fuerza;

    //constructores de clase ciclistas y propios
    public CiclistaEscalador() {
        super();
        this.potencia = 0;
        this.fuerza = 0;
    }

    public CiclistaEscalador(float potencia, float fuerza, String nombre, int energia, String escapa, float km, int bidones, float velocidad, int hidratacion) {
        super();
        this.potencia = potencia;
        this.fuerza = fuerza;
    }
//getters y setters

    public float getPotencia() {
        return potencia;
    }

    public float getFuerza() {
        return fuerza;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }
// metodos abstractos importados de ciclistas

    @Override
    public void Comer() {
        System.out.println("aumenta su energia en 25");
    }

    @Override
    public void Beber() {
        System.out.println("aumenta el nivel de hidratacion en  5");
    }

}
