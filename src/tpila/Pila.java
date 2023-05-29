package tpila;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public class Pila {

    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        tamano = 0;
    }

    //metodo para saber si la pila esta vacia (el metodo viene siendo como un if).
    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }

    //metodo para insertar un nuevo nodo a la pila
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }

    //metodo para eliminar un nodo de la pila
    public int EliminarNodo() {
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }

    //metodo para retornar el ultimo nodo ingresado
    public int MostrarUltimoNodo() {
        return UltimoValorIngresado.informacion;
    }
    
    //metodo para conocer el tamano de la pila
    public int TamanoPila(){
        return tamano;
    }
    
    //metodo para vaciar pila
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    //metodo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
