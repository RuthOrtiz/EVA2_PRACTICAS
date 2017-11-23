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
        Queue qFilaSuper = new Queue();
        System.out.println(qFilaSuper.leerPrimerNodo());
        qFilaSuper.agregarNodo(new Nodo(100));
        qFilaSuper.agregarNodo(new Nodo(140));
        qFilaSuper.agregarNodo(new Nodo(500));
        qFilaSuper.agregarNodo(new Nodo(600));
        qFilaSuper.imprimirElementos();
        System.out.println("El tamaño es:"+ qFilaSuper.tamañoCola());
        System.out.println(qFilaSuper.leerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.removerPrimerNodo());
        
         
       
        

        

    }
}

class Nodo {

    int iVal;
    private Nodo nPrev;
    Nodo nsig;

    public Nodo() {
        iVal = 0;
        nPrev = null;
        nsig = null;

    }

    public Nodo(int iNum) {
        iVal = iNum;
        nPrev = null;
        nsig = null;

    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getNsig() {
        return nsig;
    }

    public void setNsig(Nodo nsig) {
        this.nsig = nsig;
    }

}

class Queue {

    Nodo nIni;
    Nodo nFin;

    public Queue() {

        nIni = null;
        nFin = null;

    }

    public Queue(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {// AGREGAR UN NODO AL FINAL DE LA LISTA
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setNsig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public int leerPrimerNodo() {
        int iVal = 0;
        if (nIni == null) {
            //lanzar una excepcion
            iVal = 0;//OJO: CERO ES UN ENTERO VÁLIDO, SIEMPRE ES MEJOR LANZAR UNA EXCEPCIÓN
        } else {
            iVal = nIni.getiVal();
        }
        return iVal;
    }

    public int removerPrimerNodo() {
        int iVal;
        if (nIni == null) {
            //lanzar una excepcion
            iVal = 0;//OJO: CERO ES UN ENTERO VÁLIDO, SIEMPRE ES MEJOR LANZAR UNA EXCEPCIÓN
        } else {
            iVal = nIni.getiVal();
            //ELIMINAR EL PRIMER ELEMENTO DE LA LISTA
            //VERIFICAR CANTIDAD DE NODOS
            //SI SOLO HAY UN NODO nIni = null, nFin = null
            if (nIni.getNsig() == null) {
                nIni = null;
                nFin = null;
            } else {
                //SI HAY MAS NODOS, RECONECTAR
                nIni = nIni.getNsig();
                nIni.setnPrev(null);
            }

        }
        return iVal;
    }

    public void imprimirElementos() {
        if (nIni == null) {
            System.out.println("La cola esta vacía");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.println(nTemp.getiVal() + " - ");
                nTemp = nTemp.getNsig();
            }
            System.out.println("");
        }
    }

    public void estaVacia() {
        if (nIni == null) {
            System.out.println("La cola esta vacía");
        } else {
            System.out.println("La cola contiene elementos");
        }
    }
    public int tamañoCola(){
        if (nIni == null) {
            return 0;            
        }else{
          int iCon =0;
          Nodo nTemp = nIni;
          while(nTemp != null){
              iCon++;
              nTemp = nTemp.getNsig();
          }
          return iCon;
        }
    }

}
