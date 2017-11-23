
import java.util.Scanner;

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
       System.out.println("Introduce una cadena");
        Scanner sC = new Scanner(System.in);
        String n =sC.nextLine();
        String res ="";        
         eliminarRep(n, 0, res);     
         // holaaaa
         // 0123456   7-1
       
    }

     public static void eliminarRep (String cad,int Dcont, String res){
         if (Dcont ==0) {                
               eliminarRep(cad,Dcont+1,res = res + cad.charAt(Dcont));               
         }else{
         
           if (Dcont == cad.length()-1){
           if (cad.charAt(Dcont) != cad.charAt(Dcont-1)) {
               res= res + cad.charAt(Dcont);
               System.out.println(res);
           }else{
               System.out.println(res);
        }           
       }else{
           if (cad.charAt(Dcont)!= cad.charAt(Dcont-1)) {
               eliminarRep(cad,Dcont+1,res = res + cad.charAt(Dcont));
           }else{
               eliminarRep(cad,Dcont+1, res);
           }
         }
         
         }
     }
     }
