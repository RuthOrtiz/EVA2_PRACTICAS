
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Lista miLista=new Lista();
        miLista.imprimirNodos();
        System.out.println("");
       /* miLista.agregarNodo(new Nodo(150));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(120));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(80));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(25));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(130));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.agregarNodo(new Nodo(140));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.vaciarLista();
        miLista.imprimirNodos();*/
        for (int i = 0; i <= 10; i++) {
           int iVal=(int)(Math.random()*10)+1;
           miLista.agregarNodoMejorado(new Nodo(iVal));
        }
        /*miLista.imprimirNodos();*/
        System.out.println("");
        System.out.println(miLista.contarElementos());
        /*miLista.vaciarLista();
        miLista.imprimirNodos();*/
        try {
            System.out.println("El elemento en la posicion 5 ="+miLista.valorEn(5));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.insertarEn(0,new Nodo (9999));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.insertarEn(5,new Nodo (9999));
        miLista.imprimirNodos();
        System.out.println("");
        miLista.borrarUnElemento(4);
        miLista.imprimirNodos();
        System.out.println("");
        System.out.println("Encontrar el numero:" +  miLista.encontrarUnNumero(8));
             
        System.out.println("");
        miLista.estaVacio();
        
        //miLista.hallar(3);
           
    }
    
}
class Nodo{
    public int iValor;
    private Nodo nSig;
    public Nodo(){
        iValor=0;
        nSig=null;
    }
    public Nodo(int iVal){
        iValor=iVal;
        nSig=null;
    }
    public Nodo(int iVal, Nodo nNod){
        iValor=iVal;
        nSig=nNod;
    }

    public int getiValor() {
        return iValor;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
}
class Lista{
    private Nodo nIni;
    private Nodo nFin;
    public Lista(){
        nIni=null;
        nFin=null;
    }
    public Lista(Nodo nNodo){
        nIni=nNodo;
        nFin=nNodo;
    }
    //AGREGAR NODO LOS COLOCA AL FINAL DE LA LISTA  
    public void agregarNodo(Nodo nNodo){ //NO VOLVER A USAR JAMAS!!!!!
        Nodo nTemp=nIni;
        if(nIni==null){
            nIni=nNodo;
        }else{
            while(nTemp.getnSig()!=null){
                nTemp=nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }
    public void agregarNodoMejorado(Nodo nNodo){
        if(nIni==null){
            nIni=nNodo;
            nFin=nNodo;
        }else{
            nFin.setnSig(nNodo);
            nFin=nNodo;
        }
    }
    //IMPRIMIR NODOS
    public void imprimirNodos(){
        Nodo nTemp=nIni;
        if(nIni==null){
            System.out.println("LISTA VACIA");
        }else{
            while(nTemp.getnSig()!=null){
                System.out.print(nTemp.getiValor()+" - ");
                nTemp=nTemp.getnSig();
            }
            
        }
        
    }
    //VACIAR LA LISTA
    public void vaciarLista(){
        nIni=null;
        nFin=null;
    }
    //CONTAR LOS ELEMENTOS DE LA LISTA
    public int contarElementos(){
        Nodo nTemp=nIni;
        if(nIni==null){
            return 0;
        }else{
            int iCon=0;
            while(nTemp.getnSig()!=null){
                iCon++;
                nTemp=nTemp.getnSig();
            }
            return iCon;
        }
    }
    public int valorEn(int iPos) throws Exception{
        //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO      
        int iVal=0;
        if(iPos<contarElementos()&& (iPos>=0)){
            Nodo nTemp=nIni;
            for (int i = 0; i <iPos ; i++) {
                nTemp.getnSig();
            }
            iVal=nTemp.getiValor();
        }else{
            throw new Exception("La posición no es válida");
        }
        return iVal;
    }
        public void insertarEn(int iPos, Nodo nNodo){
        //VERIFICAR IPOS >=0, IPOS < TAMAÑO DE LA LISTA
        
        if (iPos==0) {// INSERTAR AL INICIO DE LA LISTA
            nNodo.setnSig(nIni);
            nIni = nNodo;
            
        }else{ //INSERTAR EN CUALQUIER POSICION DE LA LISTA ( EXCEPTO AL FINAL)
            Nodo nTemp = nIni;
            for (int i = 0; i < (iPos - 1); i++) {
                nTemp = nTemp.getnSig();
                
            }
            nNodo.setnSig (nTemp.getnSig());
            nTemp.setnSig(nNodo);
        }
    }
    
    public void borrarUnElemento(int iPos ){
        if (iPos == 0) {
            nIni = nIni.getnSig();
        }else {
           Nodo nTemp = nIni; 
            for (int i = 0; i < (iPos-1); i++) {
               nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
        }        
    }
    public int encontrarUnNumero(int iVal){  
        int iPos=0,DCont =0;
        Nodo nTemp = nIni;        
        while(nTemp!=null)  {
            if (iVal == nTemp.getiValor()) {
                iPos = DCont;
                break;
            }
              nTemp = nTemp.getnSig();
             DCont++;
            } 
        return iPos;
    }
   
    public void estaVacio(){
     if (nIni == null) {
            System.out.println("Esta vacio"); 
        }else{
            System.out.println("La lista no esta vacia");
        }
}            
            
}




