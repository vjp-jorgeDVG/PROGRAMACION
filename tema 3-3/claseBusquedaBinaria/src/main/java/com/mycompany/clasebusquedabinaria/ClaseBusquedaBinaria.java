/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasebusquedabinaria;

/**
 *
 * @author jorge
 */
public class ClaseBusquedaBinaria {

    private int[] array;

    public ClaseBusquedaBinaria() {
        array = new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    public int busquedaBinaria(int numero) {
        int umbral_inferior = 0;
        int umbral_superior = array.length - 1;
        int respuesta = -1;

        while (umbral_inferior <= umbral_superior) {

            int index = (umbral_inferior + umbral_superior) / 2;

            if (array[index] == numero) {
                respuesta = index;
                break; // termina el ciclo
            }
            else if (array[index] < numero) {
                umbral_inferior = index + 1;
            }
            else {
                umbral_superior = index - 1;
            }
        }

        return respuesta;
    }
}

