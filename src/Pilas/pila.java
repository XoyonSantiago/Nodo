
package Pilas;

import java.util.Stack;

/**
 *
 * @author SANTIAGO
 */
public class pila {
    public static void main(String [] args){
        // clase Stack https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=608:la-estructura-de-datos-pila-en-java-clase-stack-del-api-java-ejemplo-simple-y-ejercicios-resueltos-cu00923c&catid=58&Itemid=180
        // tutorial https://www.youtube.com/watch?v=EzirT6OdNBM&list=PL9DVS5UbF3wn48oNHg3c-tSkAK-ACdWH_&index=4
        // alunoes la clase Alumno que creamos
        Stack<Alumno> pila = new Stack<Alumno>();
        
        // crearemos los alumons
        Alumno a = new Alumno("Santiago", "Mariano Galvez");
        Alumno b = new Alumno("Melissa", "San Carlos de Guatemala");
        
        // agregamos a la pila a los alumnos
        pila.push(a);
        pila.push(b);
        
        // consulta el ultimo elemento
        // System.out.println(pila.peek().getNombre());
        
        // muestra toda la pila
        while(!pila.isEmpty()){
            System.out.println(pila.pop().getNombre());
        }
        
        /*
        
        Stack<Integer> pila = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            pila.push(i); // sirve para agregar datos a la pila
        }*/
        
        // System.out.println(pila);
        // System.out.println(pila.peek()); // .peek() <-- sirve para consultar el ultimo elemento
        
        /*
        pila.pop();                 // .pop()  <---- sirve para quitar el ultimo elemento
        System.out.println(pila);
        */
    }
}
