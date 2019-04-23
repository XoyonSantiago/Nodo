package aprendiendonodos;

public class AprendiendoNodos {

    public static void main(String[] args) {
        String persona1 = "Santiago";
        String persona2 = "Marcela";
        String persona3 = "Andrea";
        String persona4 = "Brayan";
        
        // aca mandamos los nodos al metodo nodo
        Nodo n1 = new Nodo(persona1);
        Nodo n2 = new Nodo(persona2);
        Nodo n3 = new Nodo(persona3);
        Nodo n4 = new Nodo(persona4);
        
        // aca recorre los nodos
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);
        
        // el primer nodo que tengamos
        Nodo aux = n1;
        for(int i=0; i<4; i++ ){
            // (String) ========= (casting) es poner el tipo de dato que quiero convertir 
            String aux2 = (String) aux.getContiene();
            // imprimo el nodo que tengo
            System.out.println(aux2);
            // cambiamos de nodo
            aux = aux.getSiguiente();
        }
    }

}
