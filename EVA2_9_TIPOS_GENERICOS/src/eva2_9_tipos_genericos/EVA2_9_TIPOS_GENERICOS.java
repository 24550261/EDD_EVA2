/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_tipos_genericos;

/**
 *
 * @author oujeffu
 */
public class EVA2_9_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Nodo <String> nodo = new Nodo <String> ();
        nodo.setValor("Javier Bernal");
    }
    
    
    
   
}

 class Nodo <T> {
    private T valor;
    private Nodo siguiente;
    private Nodo previo;
    
    public Nodo(){
        siguiente = null;
        previo = null;
        
    }

    public T getValor() {
        return valor;
    }

    public void setValor(String T) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

    
    
}
