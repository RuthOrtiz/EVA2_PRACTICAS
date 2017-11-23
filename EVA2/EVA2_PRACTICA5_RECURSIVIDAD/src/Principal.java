/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("" + quitarParen("((()))"));             
    }
    public static boolean quitarParen( String cad){        
        if (cad.equals("")) { // El método equals se usa para compara si dos objetos apuntan al mismo objeto. 
                              //Se usa para saber si dos objetos son del mismo tipo y tienen los datos, nos dara el valor de true si son iguales y false si no
            return true;
        } else if (cad.charAt(0)== '(' && cad.charAt(cad.length()-1) == ')'){
            return quitarParen(cad.substring(1,cad.length()-1));
        }else {
        return false;
    }    

    } 
}
