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
        ListaDE IdeMiLista = new ListaDE();
        IdeMiLista.imprimirElemento();
        IdeMiLista.imprimirElementoInv();
        for (int i = 0; i < 10; i++) {
            IdeMiLista.agregarNodo(new Nodo ((int)(Math.random()*100) + 1));
        }
        System.out.println("");
        IdeMiLista.imprimirElemento();
        System.out.println("");
        IdeMiLista.imprimirElementoInv();
        System.out.println("");
        IdeMiLista.borrarUnElemen(4);
        IdeMiLista.imprimirElemento();
        System.out.println("");
        IdeMiLista.estaVacio();
        IdeMiLista.imprimirElemento();
        System.out.println("");
        System.out.println("Encontrar el numero:" +  IdeMiLista.encontrarUnNumero(8));
    }
    
}

class Nodo{
    private int iVal;
    private Nodo nPrev;
    private Nodo nsig;
    public Nodo(){
     iVal = 0;
    nPrev = null;
    nsig = null;   
        
    }
    
    public Nodo(int iNum){
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

class ListaDE{
    Nodo nIni;
    Nodo nFin;
    public ListaDE(){
        nIni = null;
        nFin = null;
    }
    public ListaDE(Nodo nNodo){
        nIni = nNodo;
        nFin = nNodo;
    }
    public void agregarNodo(Nodo nNodo){// AGREGAR UN NODO AL FINAL DE LA LISTA
        if (nIni == null) {
         nIni = nNodo;
        nFin = nNodo;
        }else{
         nFin.setNsig(nNodo);
         nNodo.setnPrev(nFin);
         nFin = nNodo;
        }
    }
    public void imprimirElemento(){
        if (nIni == null) {
            System.out.println("La lista esta vacía");
        }else{
        
        Nodo nTemp = nIni;
        while(nTemp!= null){
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getNsig();
        }
    }
    }
    public void imprimirElementoInv(){
        if (nIni == null) {
            System.out.println("La lista esta vacía");
        }else{
        Nodo nTemp = nFin;
        while(nTemp!= null){
            System.out.print(nTemp.getiVal() + " - ");
            nTemp = nTemp.getnPrev();
        }
        }
    }
     public void insertarEn(int iPos, Nodo nNodo){
    if (iPos==0) {// INSERTAR AL INICIO DE LA LISTA
            nNodo.setNsig(nIni);
            nIni = nNodo;
            
        }else{ 
            Nodo nTemp = nIni;
            for (int i = 0; i < (iPos - 1); i++) {
                nTemp = nTemp.getNsig();
                
            }
            nNodo.setNsig (nTemp.getNsig());
            nTemp.setNsig(nNodo);
        }
    }
    public void borrarUnElemen(int pPos){
        if (pPos== 0) {
          nIni = nIni.getNsig();
        }else{
            Nodo nTemp = nIni;
            for (int i = 0; i < (pPos - 1); i++) {
                    nTemp = nTemp.getNsig();
            }
            nTemp.setNsig(nTemp.getNsig().getNsig());
        }
     
    }
    public void estaVacio(){
        if (nIni == null) {
            System.out.println("Esta vacio"); 
        }else{
            System.out.println("La lista no esta vacia");
        }
    }
     public int encontrarUnNumero(int iVal){  
        int iPos=0,DCont =0;
        Nodo nTemp = nIni;        
        while(nTemp!=null)  {
            if (iVal == nTemp.getiVal()) {
                iPos = DCont;
                break;
            }
              nTemp = nTemp.getNsig();
             DCont++;
            } 
        return iPos;
    }
}
