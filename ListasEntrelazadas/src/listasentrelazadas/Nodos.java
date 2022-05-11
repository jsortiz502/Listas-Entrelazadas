/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasentrelazadas;

/**
 *
 * @author Acer
 */
public class Nodos {
    public int dato;
    public Nodos siguiente;//Este es un puntero de enlace
    //Constructor para insertar al final
    public Nodos (int d){
        this.dato = d;
        this.siguiente = null;

    }
    //Constructor para insertar al inicio
    public Nodos(int d, Nodos n){
        dato=d;
        siguiente=n;
    }
}
