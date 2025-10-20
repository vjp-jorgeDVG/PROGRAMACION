/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int opcion = 0;

        // Pedir los dos números al usuario
        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        // Bucle del menú
        do {
            System.out.println("\n===== MENÚ DE OPCIONES =====");
            System.out.println("1. Sumar los números");
            System.out.println("2. Restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                        ;
                    case 4:
                        try {
                            if (num2 == 0) {
                                throw new ArithmeticException("Error: división entre cero no permitida.");
                            }
                            System.out.println("Resultado de la división: " + (num1 / num2));
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número válido.");
                sc.next(); // limpiar el buffer
            }

        } while (opcion != 5);

        sc.close();
    }
}

    

