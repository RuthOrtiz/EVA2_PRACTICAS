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
      System.out.println("La suma de los números es: " + sumaRec(123456789));
    }
     
    public static int sumaRec(int iVal){
        int Dres = 0, r;
        if (iVal%10 == 0) {
            return 0;
        }else{            
           return((iVal%10 + sumaRec(iVal/10)));         
        }
    }

}
