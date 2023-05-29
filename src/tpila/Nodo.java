package tpila;

/**
 *
 * @author Isaac
 */
public class Nodo {
    int informacion; //el nodo que contiene un valor
    Nodo siguiente; //el nodo siguiente contiene el valor null *fijarse en el constructor*
    
    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
        
}
