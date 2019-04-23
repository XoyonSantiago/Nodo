
package ArbolBinario;

/**
 *
 * @author SANTIAGO
 */
public class Arbol {
    // variable global nodo
    Nodo raiz;
    
    // este metodo inicializa la raiz a null
    public Arbol(){
        raiz=null;
    }
    
    // metodo para insertar un nodo     (el object puede ser: Integer, String, Doble etc)
    public void insertar(int i, Object fruta){
        Nodo n = new Nodo(i);
        n.contenido = fruta;
        
        if(raiz == null){
            raiz=n;
        }else{
            Nodo aux = raiz;
            while(aux!=null) {                
               n.padre = aux;
               if (n.llave >= aux.llave) {
                   aux = aux.derecha;
               }else {
                   aux = aux.izquierda;
               }
            }
            
            if( n.llave < n.padre.llave){
                n.padre.izquierda = n;
            }else {
                n.padre.derecha = n;
            }
        }
    }
    
    // ordenando los datos
    public void recorer(Nodo n){
     if(n!=null){
         //  recursividad cuando un metodo se llama a si mismo
         recorer(n.izquierda);
         System.out.println("Indice "+ n.llave+" Fruta "+n.contenido);
         recorer(n.derecha);
     }
    }
    
    // clase privada para los nodos o hojas del arbol
    public class Nodo{
        // partes que tiene un arbol
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave; // atributo o indice que identifica al nodo
        public Object contenido;
        
        // creamos constructor recibira un parametro o indice del nodo
        public Nodo(int indice){
            // inicializamos los valores del arbol
            llave = indice;
            derecha = null;
            izquierda = null;
            padre = null;
            contenido = null;
            
        }
  
    }
}
