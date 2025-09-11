/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_ejemplo;

/**
 *
 * @author invitado
 */
public class EVA2_1_EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo miObj= new Ejemplo();
        miObj.valor=100;
        miObj.sig= new Ejemplo();
        miObj.sig.valor=300;
        miObj.sig.sig= new Ejemplo();
        miObj.sig.sig.valor=450;
        System.out.println(miObj.valor);
        System.out.println(miObj.sig.valor);
        System.out.println(miObj.sig.sig.valor);
        
        miObj.sig.sig.sig=new Ejemplo();
         miObj.sig.sig.sig.valor=500;
         miObj.sig.sig.sig.sig= null;
        Ejemplo temp= miObj;
        while(temp!=null){
           
            System.out.println(temp.valor);
             temp=temp.sig;
        }
        
    }
    
}


class Ejemplo{
    int valor;
    Ejemplo sig;
}
