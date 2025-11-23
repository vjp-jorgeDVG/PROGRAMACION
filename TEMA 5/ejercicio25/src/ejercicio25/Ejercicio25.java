/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ejercicio25 {
    
    public class Test {

    private static final Scanner entrada = new Scanner(System.in);

    // --- Métodos Estáticos de Petición y Validación (Para Ordenador) ---

    // Pide un entero simple (RAM)
    public static int pedirRam() {
        System.out.print("Introduce la cantidad de memoria RAM (GB): ");
        if (entrada.hasNextInt()) {
            return entrada.nextInt();
        } else {
            System.out.println("Entrada no válida. Usando 4 GB por defecto.");
            entrada.next(); 
            return 4;
        }
    }

    // Pide la capacidad del disco duro, controlando que sea múltiplo de 5 [2, 3].
    public static int pedirDiscoDuro() {
        int capacidad;
        do {
            System.out.print("Introduce la capacidad del disco duro (GB, debe ser múltiplo de 5): ");
            while (!entrada.hasNextInt()) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                entrada.next();
                System.out.print("Introduce la capacidad del disco duro (GB, debe ser múltiplo de 5): ");
            }
            capacidad = entrada.nextInt();
            if (capacidad % 5 != 0) {
                System.out.println("Error: La capacidad debe ser múltiplo de 5.");
            }
        } while (capacidad % 5 != 0);
        return capacidad;
    }

    // Pide el precio, controlando que sea mayor que 0 [2, 3].
    public static double pedirPrecio() {
        double precio;
        do {
            System.out.print("Introduce el precio (debe ser mayor que 0): ");
            while (!entrada.hasNextDouble()) {
                System.out.println("Entrada no válida. Introduce un número decimal o entero.");
                entrada.next();
                System.out.print("Introduce el precio (debe ser mayor que 0): ");
            }
            precio = entrada.nextDouble();
            if (precio <= 0) {
                System.out.println("Error: El precio debe ser mayor que 0.");
            }
        } while (precio <= 0);
        return precio;
    }

    // Pide el modelo de procesador, permitiendo elegir de una lista [2, 3].
    public static String pedirProcesador() {
        String[] modelos = {"Intel i7", "AMD Ryzen 9", "Intel i5", "AMD Ryzen 5"};
        String procesadorElegido = "";
        boolean valido = false;
        
        System.out.println("Modelos de procesador disponibles:");
        for (int i = 0; i < modelos.length; i++) {
            System.out.println((i + 1) + ". " + modelos[i]);
        }
        
        do {
            System.out.print("Elige el número del modelo de procesador: ");
            if (entrada.hasNextInt()) {
                int opcion = entrada.nextInt();
                if (opcion >= 1 && opcion <= modelos.length) {
                    procesadorElegido = modelos[opcion - 1];
                    valido = true;
                } else {
                    System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Entrada no válida. Introduce un número.");
                entrada.next(); // Consumir la entrada inválida
            }
        } while (!valido);
        entrada.nextLine(); // Consumir el resto de la línea
        return procesadorElegido;
    }

    // Pide el modelo de tarjeta gráfica
    public static String pedirGrafica() {
        System.out.print("Introduce el modelo de tarjeta gráfica: ");
        entrada.nextLine();
        return entrada.nextLine();
    }

    // --- Métodos Estáticos de Petición y Validación (Para Servidor) ---

    // Pide el tamaño del monitor, controlando que sea mayor que 14 (repitiendo si es necesario) [2, 3].
    public static int pedirTamanoMonitorServidor() {
        int tamano;
        do {
            System.out.print("Introduce el tamaño del monitor (pulgadas, debe ser mayor que 14): ");
            while (!entrada.hasNextInt()) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                entrada.next();
                System.out.print("Introduce el tamaño del monitor (pulgadas, debe ser mayor que 14): ");
            }
            tamano = entrada.nextInt();
            if (tamano <= 14) {
                System.out.println("Error: El tamaño del monitor debe ser mayor que 14. Inténtalo de nuevo.");
            }
        } while (tamano <= 14); // Bucle repetitivo hasta que cumpla la condición [2, 3]
        entrada.nextLine(); // Consumir el resto de la línea
        return tamano;
    }

    // Pide modelo de teclado (simple)
    public static String pedirModeloTeclado() {
        System.out.print("Introduce el modelo de teclado: ");
        return entrada.nextLine();
    }

    // Pide modelo de ratón (simple)
    public static String pedirModeloRaton() {
        System.out.print("Introduce el modelo de ratón: ");
        return entrada.nextLine();
    }

    // --- Métodos Estáticos de Petición (Para Portátil) ---

    public static String pedirMarcaPortatil() {
        System.out.print("Introduce la marca del portátil: ");
        return entrada.nextLine();
    }

    public static int pedirTamanoPantalla() {
        System.out.print("Introduce el tamaño de la pantalla (pulgadas): ");
        if (entrada.hasNextInt()) {
            return entrada.nextInt();
        } else {
            System.out.println("Entrada no válida. Usando 15 pulgadas por defecto.");
            entrada.next(); 
            return 15;
        }
    }
    
    public static double pedirPeso() {
        System.out.print("Introduce el peso (kg): ");
         if (entrada.hasNextDouble()) {
            return entrada.nextDouble();
        } else {
            System.out.println("Entrada no válida. Usando 2.0 kg por defecto.");
            entrada.next(); 
            return 2.0;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Creación de 6 Objetos (Ejercicio 25) ***\n");

        // 1. Creación de 2 objetos Servidor mediante constructor con parámetros [4, 12]
        System.out.println("--- Creando Servidor 1 (Constructor Parametrizado) ---");
        int ram1 = pedirRam();
        int discoDuro1 = pedirDiscoDuro();
        String procesador1 = pedirProcesador();
        String grafica1 = pedirGrafica();
        double precio1 = pedirPrecio();
        int monitor1 = pedirTamanoMonitorServidor();
        String teclado1 = pedirModeloTeclado();
        String raton1 = pedirModeloRaton();
        
        Servidor servidor1 = new Servidor(ram1, discoDuro1, procesador1, grafica1, precio1, 
                                         monitor1, teclado1, raton1);

        System.out.println("\n--- Creando Servidor 2 (Datos manuales por defecto) ---");
        Servidor servidor2 = new Servidor(16, 500, "Intel Xeon", "Integrada", 1500.0, 
                                         20, "Logitech", "HP");

        // 2. Creación de 1 objeto Servidor mediante constructor por defecto y luego setters [4, 12]
        System.out.println("\n--- Creando Servidor 3 (Constructor por defecto + Setters) ---");
        Servidor servidor3 = new Servidor(); // Uso de constructor por defecto
        
        System.out.println("Asignación de atributos para Servidor 3:");
        servidor3.establecerRam(pedirRam());
        servidor3.establecerDiscoDuro(pedirDiscoDuro());
        servidor3.establecerProcesador(pedirProcesador());
        servidor3.establecerGrafica(pedirGrafica());
        servidor3.establecerPrecio(pedirPrecio());
        servidor3.establecerTamanoMonitor(pedirTamanoMonitorServidor());
        servidor3.establecerModeloTeclado(pedirModeloTeclado());
        servidor3.establecerModeloRaton(pedirModeloRaton());
        
        // Limpiamos el buffer si hay entradas pendientes antes de pasar a Portátil
        entrada.nextLine(); 

        // 3. Creación de 2 objetos Portátil mediante constructor con parámetros [4, 12]
        System.out.println("\n--- Creando Portátil 1 (Constructor Parametrizado) ---");
        Portatil portatil1 = new Portatil(8, 250, "Intel i5", "Nvidia 3050", 999.0, 
                                          "Asus", 15, 1.8);
        
        System.out.println("\n--- Creando Portátil 2 (Constructor Parametrizado) ---");
        Portatil portatil2 = new Portatil(16, 500, "AMD Ryzen 7", "Radeon", 1250.0, 
                                          "Dell", 14, 1.5);
        
        // 4. Creación de 1 objeto Portátil mediante constructor por defecto y luego setters [4, 12]
        System.out.println("\n--- Creando Portátil 3 (Constructor por defecto + Setters) ---");
        Portatil portatil3 = new Portatil();
        
        System.out.println("Asignación de atributos para Portátil 3:");
        portatil3.establecerRam(pedirRam());
        portatil3.establecerDiscoDuro(pedirDiscoDuro());
        portatil3.establecerProcesador(pedirProcesador());
        portatil3.establecerGrafica(pedirGrafica());
        portatil3.establecerPrecio(pedirPrecio());
        portatil3.establecerMarcaPortatil(pedirMarcaPortatil());
        portatil3.establecerTamanoPantalla(pedirTamanoPantalla());
        portatil3.establecerPeso(pedirPeso());
        
        // Muestra los datos de los 6 objetos creados [4, 12].
        System.out.println("\n**************************************************");
        System.out.println("****************** ESTADO FINAL ******************");
        System.out.println("**************************************************");

        servidor1.mostrarEstado();
        System.out.println("------------------------------------------");
        servidor2.mostrarEstado();
        System.out.println("------------------------------------------");
        servidor3.mostrarEstado();
        System.out.println("------------------------------------------");
        portatil1.mostrarEstado();
        System.out.println("------------------------------------------");
        portatil2.mostrarEstado();
        System.out.println("------------------------------------------");
        portatil3.mostrarEstado();
        System.out.println("------------------------------------------");
        }
    }
}

