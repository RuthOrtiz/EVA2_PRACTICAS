
import java.util.Scanner;
import sun.security.mscapi.SunMSCAPI;

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
        System.out.println("Introduce una cadena");
        Scanner sCap = new Scanner(System.in);
        String n =sCap.nextLine();
        String res ="";        
         quitarX(n, 0, res); 
    } 
   
    public static void quitarX (String cad,int Dcont, String res){ 
       if (Dcont == cad.length()-1){
           if (cad.charAt(Dcont) != 'x') {
               res= res + cad.charAt(Dcont);
               System.out.println(res);
           }else{
               System.out.println(res);
        }
       }else{
           if (cad.charAt(Dcont)!= 'x') {
               quitarX(cad,Dcont+1,res = res + cad.charAt(Dcont));
           }else{
               quitarX(cad, Dcont +1, res);
           }
   
        }
          
    }
        
    }