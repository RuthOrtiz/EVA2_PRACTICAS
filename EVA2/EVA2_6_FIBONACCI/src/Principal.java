/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static int iCont =0;
    public static void main(String[] args) {
        // TODO code application logic here
     //   System.out.println("FIBONACCI DE: 9 = " + calFIBONACCI(9));
        for (int i = 0; i < 10; i++) {
            System.out.println("FIBONACCI DE: "+i+" = " + calFIBONACCI(i) );
        }
    }
    public static int calFIBONACCI(int iPos){
       iCont++;
        System.out.println(iCont);
        /*if (iPos==0) 
            return 0;
            else if(iPos ==1)
                return 1;
            else
                return calFIBONACCI(iPos - 1 ) + calFIBONACCI(iPos-2);*/
        
        switch(iPos){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return calFIBONACCI(iPos - 1) + calFIBONACCI(iPos-2);
        }
        
    }
}
 