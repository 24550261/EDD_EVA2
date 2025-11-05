/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author oujeffu
 */
public class EVA2_8_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //int double boolean char
        //LinkedList --> lista doblemente enlazada
        LinkedList<String> miLista = new LinkedList<String>();
        miLista.add("Hola");
        miLista.add("");
        miLista.add("Mundo");
        miLista.add("");
        miLista.add("Cruel");
        miLista.add("!!!!");
        System.out.println(miLista);
        System.out.println(miLista.size());
        miLista.remove(0);
        System.out.println(miLista.size());
        System.out.println(miLista.size());
        //ARRAYLIST 
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(100);
        miArrayList.add(200);
        miArrayList.add(300);
        miArrayList.add(400);
        miArrayList.add(500);
        System.out.println(miArrayList);
        miArrayList.remove(0);
        System.out.println(miArrayList);
        System.out.println(miArrayList.size());
        //CONJUNTOS
        TreeSet<Integer> miConjunto = new TreeSet<Integer>();
        miConjunto.add(100);
        miConjunto.add(200);
        miConjunto.add(300);
        miConjunto.add(300);
        System.out.println(miConjunto);
        System.out.println(miConjunto.size());
    }
    
}
