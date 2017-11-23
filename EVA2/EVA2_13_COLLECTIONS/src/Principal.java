
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> a1MiArrayList = new ArrayList(); 
        a1MiArrayList.add(100);//0
        a1MiArrayList.add(200);//1
        a1MiArrayList.add(300);//2
        a1MiArrayList.add(400);//3
        a1MiArrayList.add(500);//4
        for (Integer a1MiArrayList1 : a1MiArrayList) { //Manera de recorrer los collections
            System.out.print(a1MiArrayList1 + " - ");
        }
        a1MiArrayList.add(2,999);
        System.out.println("");
         for (Integer a1MiArrayList1 : a1MiArrayList) {
            System.out.print(a1MiArrayList1 + " - ");
        }
         //RECORRER UN COLLECTION CON ITERADORES
         Iterator itRecorreArray = a1MiArrayList.iterator();// para movernos en la lista
         System.out.println("\nITERADOR");
         while (itRecorreArray.hasNext()){ // HAS NEXT TE DICE SI HAY UN NODO SIGUIENTE O NO 
             System.out.print(itRecorreArray.next() + " - "); // next para el siguiente nodo
         }
        
    }
    
}
