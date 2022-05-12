/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasentrelazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class ListasEntrelazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Listas listita=new Listas();
        int opcion=0, vl;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un valor al inicio de la lista\n2. Agregar un valor al final de la lista\n"
                                + "3. Mostrar los valores de la lista\n"
                                + "4. Eliminar un valor al inicio de la lista\n"
                                + "5. Salir", "Menu de opciones"));
                switch(opcion){
                    case 1:
                        try{
                            vl = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor: ",
                                    "Insertando al incio", 3));
                            //Agregando al NODO
                            listita.agregarInicio(vl);
                        }catch(NumberFormatException n){        
                            JOptionPane.showInputDialog(null, "ERROR " + n.getMessage());
                        }
                        break;
                    case 2:
                        try{
                            vl = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor: ",
                                    "Insertando al final", 3));
                            //Agregando al NODO pero al final
                            listita.agregarFin(vl);
                        }catch(NumberFormatException n){        
                            JOptionPane.showInputDialog(null, "ERROR " + n.getMessage());
                        }
                    case 3:
                        listita.mostrarLista();
                        break;
                    case 4:
                        vl=listita.borrar();
                        JOptionPane.showInputDialog(null, "El valor eliminado es " + vl,
                                "Eliminando Nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
                    case 5:
                        JOptionPane.showInputDialog(null, "Programa finalizado");
                    default:
                        JOptionPane.showInputDialog(null, "Opcion invalida ");
                }
            }catch(Exception e){
                JOptionPane.showInputDialog(null, "ERROR " + e.getMessage());
            }
        }while(opcion!=5);
    }
    
}
