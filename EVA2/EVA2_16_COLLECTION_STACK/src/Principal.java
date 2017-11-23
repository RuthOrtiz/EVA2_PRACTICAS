
import java.util.Stack;

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
        Stack<Double> stMiPila = new Stack();
        stMiPila.push(10.0);
        stMiPila.push(120.0);
        stMiPila.push(80.0);
        stMiPila.push(70.0);
        stMiPila.push(60.0);
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());
        System.out.println(stMiPila.pop());
        System.out.println(stMiPila.peek());// imprime el vcalor de arriba pero no lo quita solo lo imprime
    }
    
}
//PEEK- POP PERO  NO QUITA EL NODO , lee el ultimo elemento de la pila no elimina el nodo
//pop los quita