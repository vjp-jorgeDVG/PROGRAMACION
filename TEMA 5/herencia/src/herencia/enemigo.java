/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class enemigo extends personaje {
    //ATRIBUTOS
    private String arma;
    //constructores
    public enemigo () {
        super();
        this.arma = "";
    }
    public enemigo (int vida, String arma) {
        super(vida);
        this.arma = arma;
    }
    //getters y setters
    public String getArma() {
        return this.arma;
    }
    public void setArma ( String arma) {
        this.arma = arma;
    }
    //metodo
    public void crearSoldados() {
        System.out.println("creando soldados");
    }
    //to string
    @Override
    public String toString() {
        return "el enemigo tiene" + super.getVida + " % de vida y el arma " + this.arma;
    }
}

