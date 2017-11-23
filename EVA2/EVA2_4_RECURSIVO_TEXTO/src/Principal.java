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
        /*for (int i = 0; i <= 10; i++) {
            System.out.println("Cadena: " + cadenaRecursiva(i)); //I CONTROLA LA CANTIDAD DE ASTERISCOS QUE SE IMPRIMEN
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println("Cadena: " + cadenaRecursiva(i)); //I CONTROLA LA CANTIDAD DE ASTERISCOS QUE SE IMPRIMEN
        }*/
         
       int i = 0;
        while (i < 5) {
            System.out.println("Cadena: " + cadenaRecursiva(i + 1));
            i++;
        }
        while (i > 1) {
            System.out.println("Cadena: " + cadenaRecursiva(i - 1));
            i--;
        }
    }

    public static String cadenaRecursiva(int iNum) {
        if (iNum > 1) {
            return "*" + cadenaRecursiva(iNum - 1); // El método cadena recursiva imprimira los asteriscos faltantes con (iNum -1
        } else {
            return "*";
        }
    }
    //ASTERISCOS CON UN SOLO CICLO   
  public static void  metodoRec2(int x, String y, String cad){
    
       
    }  
}
//EL CICLO FOR NO SE TOCA, PARA MODIFICAR SU FLUJO SE USA BREAK Y CONTINUE- SE SALTA ESE CICLO O ITERACIÓN Y CONTINUA CON LAS DEMÁS, LA I NO SE MODIFICA
//FOR - SABER CUANTAS VECES SE NECESITA EJECUTAR LA ACCION
//WHILE - NO SE SABE CUANTAS VECES SE EJECUTA EL CICLO
//DO WHILE -  SE NECESITA EJECUTAR CUANDO MENOS UNA VEZ

//HACER LO MISMO PERO CON UN SOLO CICLO
