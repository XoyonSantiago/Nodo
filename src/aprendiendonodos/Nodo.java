// creando el nodo
package aprendiendonodos;

// la variable nodo se llama igual a la clase
public class Nodo {

    private Nodo siguiente; // siguiente es el apuntador del siguiente nodo
    private String contiene;// en todo esto se puede crear una matriz una pila o cualquier datos para el nodo

    // metodo por si no contiena nada el nodo
    public Nodo() {
        setSiguiente(null);
        setContiene(null);
    }

    // recibe informacion pero no un puntero
    public Nodo(String c) {
        setSiguiente(null);
        setContiene(c);
    }

    // constructor que reciba tambin un nodo
    public Nodo(String c, Nodo n) {
        setSiguiente(n);
        setContiene(c);
    }
    
    
    /*------------------metodos get and seter ------------*/

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getContiene() {
        return contiene;
    }

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }

}
