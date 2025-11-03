/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_stack;

/**
 *
 * @author oujeffu
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack pila= new MyStack();
        pila.push(0);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.peek());
        System.out.println(pila.pop());
        pila.print();
        System.out.println(pila.size());
    }
    
}
