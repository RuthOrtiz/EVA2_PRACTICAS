
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("HOLA");
        llMiLista.add(" ");
        llMiLista.add("MUNDO");
        llMiLista.add(" ");
        llMiLista.add("CRUEL!!");
        llMiLista.add(" ");
        llMiLista.add("COLLECTIONS");
        for (String llMiLista1 : llMiLista) {
            System.out.print(llMiLista1);
        }
        System.out.println("");
        llMiLista.remove(4);
        System.out.println("");
        System.out.println(llMiLista);
        System.out.println("");
        llMiLista.add(4, "BONDOSO");
        System.out.println(llMiLista);
                
    }
    
}
