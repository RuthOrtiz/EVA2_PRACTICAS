
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arMiArbol = new Arbol();
        try { // porque agregar nuevo nodo lanza una excepcion
            arMiArbol.agregarNuevoNodo(new Nodo(100));
            arMiArbol.agregarNuevoNodo(new Nodo(101));
            arMiArbol.agregarNuevoNodo(new Nodo(97));
            arMiArbol.agregarNuevoNodo(new Nodo(80));
            arMiArbol.agregarNuevoNodo(new Nodo(115));
            arMiArbol.agregarNuevoNodo(new Nodo(114));
            //arMiArbol.agregarNuevoNodo(new Nodo(97));
            System.out.println("");
            System.out.println("Pre order");
            arMiArbol.imprimirPreOrder();
            System.out.println("");
            System.out.println("In order");
            arMiArbol.imprimirInOrder();
            System.out.println("");
            System.out.println("Pos order");
            arMiArbol.imprimirPosOrder();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

class Nodo {

    private int iVal;
    private Nodo nIzq;
    private Nodo nDer;

    public Nodo() {
        iVal = 0;
        nIzq = null;
        nDer = null;
    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        nIzq = null;
        nDer = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }

}

class Arbol {

    private Nodo nRoot;

    public Arbol() {
        nRoot = null;
    }

    public Arbol(Nodo nNodo) {
        nRoot = nNodo;
    }

    public void agregarNuevoNodo(Nodo nNodo) throws Exception { // o ponerle try catch
        agregarNodo(nRoot, nNodo);
    }

    public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception {
        if (nRoot == null) {
            nRoot = nNodo;
        } else { // El árbol no esta vacío
            if (nNodo.getiVal() < nActual.getiVal()) { //MENOR
                if (nActual.getnIzq() == null) {// POSICION VACIA (NULL) AQUI VA
                    nActual.setnIzq(nNodo);
                } else { //AQUI HAY UN NODO
                    agregarNodo(nActual.getnIzq(), nNodo);
                }
            } else if (nNodo.getiVal() > nActual.getiVal()) {//MAYOR

                if (nActual.getnDer() == null) {// POSICION VACIA (NULL) AQUI VA
                    nActual.setnDer(nNodo);
                } else { //AQUI HAY UN NODO
                    agregarNodo(nActual.getnDer(), nNodo);
                }
            } else {// VALORES IGUALES ( NO CAPTAMOS VALORES REPETIDOS)
                throw new Exception("NO SE ACEPTAN VALORES REPETIDOS");
            }
        }

    }

    public void imprimirPreOrder() {
        impPo(nRoot);
    }

    public void impPo(Nodo nActual) {
        if (nActual != null) {
            System.out.println(nActual.getiVal() + " - ");// visitar el nodo
            impPo(nActual.getnIzq());//recorrer el lado izquierdo
            impPo(nActual.getnDer());//recorrer el lado derecho

        }
    }

    public void imprimirInOrder() {
        impin(nRoot);
    }

    public void impin(Nodo nActual) {
        if (nActual != null) {

            impin(nActual.getnIzq());
            System.out.println(nActual.getiVal() + " - ");
            impin(nActual.getnDer());

        }
    }

    public void imprimirPosOrder() {
        imPost(nRoot);
    }

    public void imPost(Nodo nActual) {
        if (nActual != null) {
            impin(nActual.getnIzq());
            impin(nActual.getnDer());
            System.out.println(nActual.getiVal() + " - ");

        }
    }

}
// En los árboles se necesitan 1 nodo inicial llamado raiz nodos
//Se inserta cuando no hay nada, 
//Pre-order-->Nodo,izq,der   In-orden --> nActgetizq, imprimir, get ac.derecho  iz der nodo  Post-order--> postordergetAActual.sig  der y imprimir el nombre
