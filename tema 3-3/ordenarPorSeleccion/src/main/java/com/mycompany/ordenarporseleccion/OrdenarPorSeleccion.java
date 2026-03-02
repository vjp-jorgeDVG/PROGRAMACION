/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenarporseleccion;

/**
 *
 * @author alumno
 */
public class OrdenarPorSeleccion {

    public boolean ordenarPorSeleccion(int[] listaNumeros) {

        int temporal;
        boolean listaOrdenada = true;                                   //nodo 1

        for (int i = 0; i < listaNumeros.length - 1; i++) {             //nodo 2
            for (int j = i + 1; j < listaNumeros.length; j++) {         //nodo 3
                if (listaNumeros[i] > listaNumeros[j]) {                //nodo 4
                    temporal = listaNumeros[i];                         //nodo 5
                    listaNumeros[i] = listaNumeros[j];                  //nodo 5
                    listaNumeros[j] = temporal;                         //nodo 5

                    listaOrdenada = false;                              //nodo 5
                }
            }
        }
        
        return listaOrdenada;                                           //nodo 6
    }
}
