/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg5.teoria;

/**
 *
 * @author alumno
 */
public class coche {
    // atributos: caracteristicas. nunca se inicializan aqui
    private String ruedas;
    private String suspension;
    private int espejos;
    
    //constructores: permiten construir un objeto de este tipo.
    //inicializan los atributos
    //2.1 constructor por defecto
    public coche() {
        this.ruedas = "";
        this.suspension = "";
        this.espejos = 0;
    }
    // 2.2 constructor parametrizado (sobrecarga de metodos y autorreferencia this)
    public coche(String ruedas, String suspension, int espejos) {
        this.ruedas = ruedas;
        this.suspension = suspension;
        this.espejos = espejos;
    }
    //3.0 metodos
    //3.1 getters y setters: devuelven y establecen el valor de los atributos
    public String getRuedas() {
        return this.ruedas;
    }
    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
        
    }
    // hacemos el get y set de los distintos componentes
    public String getSuspension() {
        return this.suspension;
    }
    public void setSuspension(String suspension) {
        this.suspension = suspension;
        
    }
    //espejos
    public int getEspejos() {
        return this.espejos;
    }
    public void setEspejos(int espejos) {
        this.espejos = espejos;
        
    }
    //3.2 otros metodos (comportamientos)
    public void acelerar (){
        System.out.println("Acelerando coche...");
    }
    public void frenar (){
        System.out.println("Frenando coche...");
    }
    public void girar (){
        System.out.println("Girando coche...");
    }
    
    //4 to string: devuelve un string con los datos del objeto
    @Override
    public String toString() {
        return "mi coche tiene ruedas" + this.ruedas +  ", suspension " + this.suspension + ", y espejos " + this.espejos ;
    }
}

