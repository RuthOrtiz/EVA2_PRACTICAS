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
        Stack stackNo = new Stack();
        System.out.println(stackNo.leerUltimoNodo());
        stackNo.agregarNodo(new Nodo(123));
        stackNo.agregarNodo(new Nodo(234));
        stackNo.agregarNodo(new Nodo(300));
        stackNo.agregarNodo(new Nodo(400));
        System.out.println(stackNo.leerUltimoNodo());
        System.out.println(stackNo.removerUltimoNodo());
        System.out.println(stackNo.removerUltimoNodo());
        System.out.println(stackNo.removerUltimoNodo());
        System.out.println(stackNo.removerUltimoNodo());
        
        System.out.println("");
        stackNo.push(200);
        stackNo.push(300);
        stackNo.push(400);
        stackNo.push(500);
        
        System.out.println("");
        stackNo.pop();
        System.out.println("pop: " + stackNo.pop());
        
        System.out.println("");
        stackNo.tamañoPila();
        
        System.out.println("");
        stackNo.estaVacia();
        
    }

}

class Nodo {

    int iVal;
    private Nodo nPrev;
    Nodo nSig;

    public Nodo() {
        iVal = 0;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iNum, Nodo nNod) {
        iVal = iNum;
        nSig = nNod;
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

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
}

class Stack {

    Nodo nIni;
    Nodo nFin;

    public Stack() {
        nIni = null;
        nFin = null;
    }

    public Stack(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) { //AGREGAR NODO AL FINAL
        if (nIni == null) {//LISTA VACIA
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public int leerUltimoNodo() {
        int iVal = 0;
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            iVal = nFin.getiVal();
        }
        return iVal;
    }

    public int removerUltimoNodo() {
        int iVal = 0;
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            iVal = nFin.getiVal();
            if (nFin.getnPrev() == null) {//VERIFICAR CANTIDAD DE NODOS
                nIni = null;
                nFin = null;
            } else {
                nFin = nFin.getnPrev();
                nFin.setnSig(null);
            }
        }
        return iVal;
    }

    public void imprimirElementos() {
        if (nIni == null) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();
            }
        }
    }
    public void push (int iVal){
            int cont =0;
           Nodo nNuevo = new Nodo(iVal);
           nNuevo.nSig = nNuevo;
           System.out.println(nNuevo.iVal);
            if (nIni == null) {
                nIni = nNuevo;
                nFin = nNuevo;
            }else{
              nFin.nSig = nNuevo;
              nFin = nNuevo;
            }
            cont++;
        }
        
        public int pop(){
            int cont =0;
            int nTem = nFin.iVal;
            System.out.println(nFin.iVal);
            if (nIni == nFin ) {
                nIni = null;
                nFin = null;
            }else{
                nIni = nFin.nSig;
            }
            cont--;
            return nTem;
        }
        public int tamañoPila(){
            if (nIni == null) {
                return 0;
            }else{
                int iCon=0;
                Nodo nTemp = nIni;
                while(nTemp!= null){
                    iCon++;
                    nTemp = nTemp.getnSig();
                }
                return iCon;
            }
        }
        public void estaVacia(){
            if (nIni == null) {
                System.out.println("La pila está vacía");
            }else{
                System.out.println("La pila no está vacía");
            }
            
        }
}
