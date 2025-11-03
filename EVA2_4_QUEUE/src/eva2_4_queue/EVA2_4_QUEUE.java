/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author oujeffu
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyQueue cola= new MyQueue();
        cola.push(0);
        cola.push(1);
        cola.push(2);
        cola.push(3);
        System.out.println(cola.peek());
        System.out.println(cola.pop());
        cola.print();
    }
    
}
