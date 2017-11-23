/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR LOS NUMEROS DEL 5 AL 1
        for (int i = 5; i >=1; i--) {
            System.out.println(" i = " + i ); // se imprimen los numeros al revez 54321
        }
        falsoFor(10);
        System.out.println("");
        falsoForUp(1, 5);
        
    }
    public static void falsoFor(int iVal){
        System.out.print(iVal + " - "); //ACCIÓN
        if (iVal>1) {  // CONDICIÓN PARA TERMINAR LA RECURSIÓN
            falsoFor(iVal-1);// LLMADA RECURSIVA // MÉTODO RECIRSIVO
        }
        
    }
      public static void falsoForUp (int iIni, int iFin){
          System.out.println(iIni + " - ");
          if (iIni < iFin) { // condición que detiene el método recirsivo
              falsoForUp (iIni + 1, iFin);
          }
      }
   
    }
    

