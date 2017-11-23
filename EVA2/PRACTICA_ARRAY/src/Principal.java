
import java.util.Arrays;

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
       int aiArrayOfIte [] = new int [10000];
        for (int firstItem : aiArrayOfIte) {
            for (int secondItem : aiArrayOfIte) {
                
                int[] orderedPair = new int [] {firstItem, secondItem};
                 System.out.println (Arrays.toString(orderedPair));
                         
            
            }
        }
    }
    
}
