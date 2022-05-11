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
public class Listas {
    protected Nodos inicio,fin;//Punteros buscan donde se ubica el iniicio y fin
    public Listas(){
        inicio = null;
        fin = null;
    }
    //Metodo para saber si la lista esta vacia
    public boolean Vacio(){
        if (inicio==null){
            return true;
        }else{
            return false;
        }
    }
    //Metodo para gregar un nodo al inicio de la lista
    public void agregarInicio(int valor){
        //Crear Nodo
        inicio = new Nodos(valor, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    //Metodo para insertar al final de la lista
    public void agregarFin(int Valor){
        //Metodo para mostrar los datos
        if(!Vacio()){
            fin.siguiente = new Nodos (Valor);
            fin=fin.siguiente;
        }else{
            inicio=fin=new Nodos (Valor);
        }
    }
    public void mostrarLista(){
        Nodos recorrer=inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
        }
    }
}
