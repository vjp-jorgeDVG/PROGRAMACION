/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author jorge
 */
public class Ejercicio08 {
// Método que acepta un objeto de la superclase Vehiculo (Polimorfismo [6, 7])
    public static void procesarVehiculo(Vehiculo vehiculo) {
        System.out.println("\n--- Procesando Vehículo ---");
        // Muestra el movimiento actual del vehículo
        vehiculo.mostrarMovimiento(); 

        // Si el vehículo es un coche, enciende el aire [5]
        if (vehiculo instanceof Coche) {
            // Se requiere un casting explícito a Coche para acceder a encenderAire()
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            // Vuelve a mostrar el movimiento con la velocidad modificada
            coche.mostrarMovimiento();

        // Si el vehículo es una moto, hace un caballito [5]
        } else if (vehiculo instanceof Moto) {
            // Se requiere un casting explícito a Moto para acceder a hacerCaballito()
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            // Vuelve a mostrar el movimiento con la velocidad modificada
            moto.mostrarMovimiento();
        }
    }

    public static void main(String[] args) {
        // Instancia un Vehiculo de cada tipo (Coche y Moto)
        Coche miCoche = new Coche(100);
        Moto miMoto = new Moto(80);

        // Invoca al método procesarVehiculo pasándole ambos objetos
        procesarVehiculo(miCoche);
        procesarVehiculo(miMoto);
        
        // Prueba de nuevo los objetos para ver el estado de los atributos específicos
        System.out.println("\n--- Intentando procesar Coche de nuevo (aire ya encendido) ---");
        procesarVehiculo(miCoche);
        
        System.out.println("\n--- Intentando procesar Moto de nuevo (ya haciendo caballito) ---");
        procesarVehiculo(miMoto);
    }
}

