/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclistas {

    float aceleracion;

    //constructores de clase ciclistas y propios
    public CiclistaSprinter() {
        super();
        this.aceleracion = 0;
    }

    public CiclistaSprinter(float aceleracion, String nombre, int energia, String escapa, float km, int bidones, float velocidad, int hidratacion) {
        super();
        this.aceleracion = aceleracion;
    }
//getters y setters

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
// metodos abstractos importados de ciclistas

    @Override
    public void Comer() {
        System.out.println("aumenta su energia en 30");
    }

    @Override
    public void Beber() {
        System.out.println("aumenta su hidratacion en 10");
    }

}
