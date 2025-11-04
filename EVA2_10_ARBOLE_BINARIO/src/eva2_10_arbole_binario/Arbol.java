/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_arbole_binario;

/**
 *
 * @author oujeffu
 */
public class Arbol {
    private NODO raiz;
    private int cont=0;
    public Arbol() {
        this.raiz=null;
    }
    
    
    public void agregar (int valor){
        if (raiz==null) {
            NODO nuevo = new NODO(valor);
            raiz=nuevo;
            cont++;
        }else{
            agregarRecursivo(valor, raiz);
        }
        
        ;
    }
    
    public void agregarRecursivo(int valor, NODO actual){
        NODO nuevo= new NODO(valor);
        if (valor< actual.getValor()) {
            // va a la izqui
            if (actual.getIzqui()==null) {//vacio
                actual.setIzqui(nuevo);
                cont++;
            }else{//Esta ocupado
                agregarRecursivo(valor, actual.getIzqui());
            }
            
            
            
        }else if(valor>actual.getValor()){
            //va a la dere
            if (actual.getDerecha()==null) {//vacio
                actual.setDerecha(nuevo);
                cont++;
            }else{//Esta ocupado
                agregarRecursivo(valor, actual.getDerecha());
            }
            
            
            
        }else{// es igual
            //no hacer nada
            
        }
        
        
    }
    
    public int size(){
        return cont;
    }
    
    
    public void imprimirPreOrden(){
        printPreOrderRec(raiz);
    }
    
    private void printPreOrderRec(NODO actual){
        
        if (actual!=null) {
            System.out.println(actual.getValor());
            printPreOrderRec(actual.getIzqui());
            printPreOrderRec(actual.getDerecha());
        }
        
    }
    
    
    public void imprimirPostOrden(){
        printPostOrden(raiz);
    }
    
    private void printPostOrden(NODO actual){
        if (actual!=null) {
            
        
            printPreOrderRec(actual.getIzqui());
            
            printPreOrderRec(actual.getDerecha());
            System.out.print(actual.getValor());
        }else{
            printPostOrden(actual);
        }
    }
    
}




