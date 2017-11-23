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
        int dividendo  = 180;
        int divisor = 48;
        System.out.println("El máximo común divisor es : " + calcularMCD(dividendo,divisor));
        /// OTRA MANERA System.out.println("El máximo común divisor es : " + calcularMCD(180,48));
        
    }
    public static int calcularMCD (int dividendo , int divisor){
        int rResiduo; // Variable que guardara el residuo
        if (divisor == 0) { //Se igual a 0 porque cuando sea 0 se mostrara el resultado
            return dividendo; // regresara a diviendo y mostrara el resultado
            
        }else{
            rResiduo = dividendo % divisor; // se divide dividendo entre divisor para obtener el residuo diferente a 0
            return calcularMCD(divisor, rResiduo); //el método toma los dos valores y procede a mostrar el residuo && ahora el divisior seria el residuo
            
            
        }
    }
    
}

