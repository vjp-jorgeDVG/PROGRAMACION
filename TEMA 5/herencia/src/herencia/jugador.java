/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class jugador extends personaje {
    //ATRIBUTOS
    public String inventario;
    
    //CONSTRUCTORES
    public jugador ()  {
            //llamamos al constructor por defecto de personaje
    }
    
    //getters y setters
    public int getVida () {
        return this.vida;
        
    public void setVida (int vida) {
        this.vida = vida; 
    }
    //METODOS
    public void atacar () {
        System.out.println("atacando");
    }
    //TO STRING
    
    @Override
    
    }
}
}
