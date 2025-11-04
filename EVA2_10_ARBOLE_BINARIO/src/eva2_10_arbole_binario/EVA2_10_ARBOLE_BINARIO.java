/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_arbole_binario;

/**
 *
 * @author oujeffu
 */
public class EVA2_10_ARBOLE_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol tree =new Arbol();
        tree.agregar(13);
        tree.agregar(10);
        tree.agregar(18);
        tree.agregar(2);
        tree.agregar(11);
        tree.agregar(17);
        tree.agregar(20);
        tree.agregar(16);
        
        System.out.println("Cantidad de Nodos:"+ tree.size());
        tree.imprimirPreOrden();
        System.out.println("    ");
        System.out.println("    ");
        tree.imprimirPostOrden();
    }
    
}
