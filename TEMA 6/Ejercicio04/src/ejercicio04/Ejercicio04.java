/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        animal = new Animal(perro, 0, 0) {
            @Override
            public void sonido() {
                System.out.println("");
            }

            @Override
            public void alimentacion(String carnivoro) {
                System.out.println("carnivoro");
            }

            @Override
            public void habitat(String domestico) {
                System.out.println("");
            }

            @Override
            public void nombreCientifico() {
                System.out.println("");
            }
            
        };
    }
}
