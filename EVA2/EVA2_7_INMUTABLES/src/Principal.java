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
        int[] aiDatos = new int [3];
        aiDatos[0] = 100;
        aiDatos[1] = 300;
        aiDatos[2] = 400;
        
        int[] aiBackUp = new int [3];
        int i = 0;
        for (int aiDato : aiDatos) {  // for (int i =0; i<aiDatos.lenght; i++)
            System.out.println(aiDato);
           aiBackUp[i] = aiDato; // se crea una copia de los datos  mismo tamaño para respaldar
           i++;
        }
        
        aiDatos = new int [4]; // se vuelve a conectar el arreglo en esta parte 0--> se creo un arreglo que vale 0
        //
        for (int j = 0; j < aiBackUp.length; j++) { // datos de respaldo back up
            aiDatos[j] = aiBackUp[j];
        }
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
    }
    
}
 //INMUTABLE NO SE PUDE MDOFIICAR
//Nombre del arreglo referencia los datos se guardan en la memoria,  
// oara no perder los datos se tienen que copiar
// desventaja es muy tardado 