/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_double_linked_list;

/**
 *
 * @author oujeffu
 */
public class EVA2_3_DOUBLE_LINKED_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista list= new Lista();
        
        list.agregar(1);
        list.agregar(2);
        list.agregar(3);
        list.agregar(4);
        //list.printInv();
        list.insertarEn(5, 3);
        list.printInv();
        list.print();
        list.borrarEn(3);
        list.print();
        
                
        
    }
    
}
