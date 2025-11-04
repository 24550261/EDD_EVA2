/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_arbole_binario;

/**
 *
 * @author oujeffu
 */
public class NODO {
    private int valor;
    private NODO izqu;
    private NODO derecha;

    public NODO(int valor) {// facilitar poner valores en la lista
        this.valor = valor;
        this.izqu = null;
        this.derecha=null;
    }

    public NODO() {
        izqu=null;//final de la lista
        derecha=null;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NODO getIzqui() {
        return izqu;
    }

    public void setIzqui(NODO siguiente) {
        this.izqu = siguiente;
    
        
        
    
    
}

    public NODO getDerecha() {
        return derecha;
    }

    public void setDerecha(NODO previo) {
        this.derecha = previo;
    }
}
