
package ArbolBinario;

/**
 *
 * @author SANTIAGO
 */
public class Estructuras {
    public static void main(String [] args){
        // creando el arbol https://www.youtube.com/watch?v=22AE6WklXBg&list=PL9DVS5UbF3wn48oNHg3c-tSkAK-ACdWH_&index=6
        Arbol arbol = new Arbol();
        
        // insertar valor
        arbol.insertar(4, "Naranja"); // recive un valor y un objeto y como es objeto permite una cadena
        arbol.insertar(8, "Manzana");
        arbol.insertar(1, "Uva");
        arbol.insertar(9, "Sandia");
        arbol.insertar(7, "Pera");
        
        // metodo in-order
        arbol.recorer(arbol.raiz);
        
        // metodo que muestra solo los de la derecha no cuenta el 4 proqeu es la raiz
        // arbol.recorer(arbol.raiz.derecha);
        
        // metodo que muestra solo los de la izquierda no cuenta el 4 proqeu es la raiz
        // arbol.recorer(arbol.raiz.izquierda);
    }
}
