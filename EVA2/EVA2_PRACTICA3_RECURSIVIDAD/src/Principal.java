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
        System.out.println("El resultado de la potencia es:" + potenciaN(3, 1) ); 
    }
    public static int potenciaN (int ba, int po){
        if (po ==0) {
            return 1;
        }else{
            return ba * potenciaN(ba, po -1);
        }
    }
}
