/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author oujeffu
 */
public class MyQueue {
    private NODO start, end;
    private int tama;

    public MyQueue(NODO start, NODO end) {
        this.start = start;
        this.end = end;
        tama=0;
    }

    public MyQueue() {
    }
    
    
    
    
    public void agregar(int valor){//agregar nodo
        NODO nuevo= new NODO(valor);
        //conocer el estado de la lista
        //si hay nodos, movernos al final
        //verificar si la lista esta vacia 
        
        if(start== null){//lista vacia
            start= nuevo;
            end=start;
        }else{//hay muchos nodos
            //movernos al final de la lista
           /* NODO temp= start;
            while(temp.getSiguiente()!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);*/
           end.setSiguiente(nuevo);
           nuevo.setPrevio(end);
           end=nuevo;
            
        }
        
        
        tama++;
        
    }
    //O(N)
    public void printInv(){
        NODO temp= end;
            while(temp!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                System.out.print("["+temp.getValor()+"]");
                temp=temp.getPrevio();
            }
    }
    
    
    public void insertarEn(int valor, int position){
        
        //verificar el estado de la lista
        //verificar la posicion
        //no podemos insertar nodos en una lista vacia
        
        if(start==null){
            throw new RuntimeException("Si la lista esta vacia, se node puede insertar un nodo");
        }else{//verificar la posicion
            int tama= size();
            if(position>=0&&position<tama){
                  NODO neww= new NODO(valor);
                if (position==0) {//piece of cake
                    neww.setSiguiente(start);
                    start.setPrevio(neww);
                    start=neww;
                }else{//dificil
                    //mover a temp
                    NODO temp= start;
                    int cont=0;
            while(cont<(position)){//esto nos mueve al nodo final, sin necesidad de caer en el null
                temp=temp.getSiguiente();
                cont++;
            }
            
            neww.setPrevio(temp.getPrevio());
            neww.setSiguiente(temp);
            temp.getPrevio().setSiguiente(neww);
            temp.setPrevio(neww);
            
                }
                tama++;
            }else{
                throw new RuntimeException("Posicion Incorrecta");
            }
            
        }
        
        
        
    }
 
    
    public int size(){
        /*int tama=0;
        NODO temp= start;
            while(temp!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                tama+=1;
                temp=temp.getSiguiente();
            }*/
            return tama;
    }
    
    public void print(){
        NODO temp= start;
            while(temp!=null){//esto nos mueve al nodo final, sin necesidad de caer en el null
                System.out.print("["+temp.getValor()+"]");
                temp=temp.getSiguiente();
            }
    }
    
     public void vaciarLista(){
        start= null;
        end= null;
        tama=0;
    }
     
     
     public  boolean listaVacia(){
            if (start==null){
                return true;
            }else{
                return false;
            }
                
                
        
}
    
    public void borrarEn(int position){
        if(start==null){
            throw new RuntimeException("Si la lista esta vacia, se node puede insertar un nodo");
        }else{//verificar la posicion
            int tama= size();
            if(position>=0&&position<tama){
                 
                if (position==0) {//piece of cake
                    //verificar si es un solo nodo, porque tenemos que mover a fin
                    if(tama==1){
                        vaciarLista();
                    }else{
                         start=start.getSiguiente();
                        start.setPrevio(null);
                        
                        
                        
                    }
                    //start=start.getSiguiente();
                    
                }else{//dificil
                    //mover a temp
                    NODO temp= start;
                    int cont=0;
            while(cont<(position)){//esto nos mueve al nodo final, sin necesidad de caer en el null
                temp=temp.getSiguiente();
                cont++;
            }
           temp.getPrevio().setSiguiente(temp.getSiguiente());
           temp.getSiguiente().setPrevio(temp.getPrevio());
           temp=null;
            if(position==(tama-1)){//verificar que borremos el ultimo nodo de la lista
                end=temp;
            }
            
            
                }
                tama--;
            }else{
                throw new RuntimeException("Posicion Incorrecta");
            }
            
        }
}
    
    
     public int search(int valor){
       NODO temp= start;
       int cont=0;
        while(temp!=null){
            if(temp.getValor()==valor){
                break;
        }else{
            temp=temp.getSiguiente();
            cont++;
            }
        
    }
    return cont;
}
    
     public int searchInt(int posi){
        NODO temp=start;
        int val;
        int cont=0;
    while(temp!=null){
        if(cont==posi){
            break;
    }else{
         temp=temp.getSiguiente();
         cont++;
         if(cont==size()){
             return end.getValor();
         }
        }
            }
    
   val=temp.getValor();
    return val;
    
    
    
}
     
     
     public void push(int valor){
         agregar(valor);
     }
     
     
     public int peek(){//Leer el valor en la posicion inicial
         return searchInt(0);
     }
     
     
     
     public int pop(){
         int valor= searchInt(0);
         borrarEn(0);
         return valor;
     }
         
     
}
