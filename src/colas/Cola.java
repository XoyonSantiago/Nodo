
package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author SANTIAGO
 */
public class Cola {
    
    public static void main (String args []){
    
        // metodo cola https://users.dcc.uchile.cl/~lmateu/CC10A/cc10a-lib/queue.html
        Queue<Integer> cola = new LinkedList();
        
        for (int i = 0; i < 10; i++) {
            cola.offer(i);
        }
        
        // cola.remove(); // quita el primer elemento de la cola
        // cola.remove();
        System.out.println(cola);
        // para mostrar el primer elemento de la cola es el metodo .peek()
        // System.out.println(cola.peek());
    }    
}
