
package eddpractica1_201503692;

/**
 *
 * @author Diego
 */
public class ListaSimple {
    private String palabra;
    private String nombre;
    private int i=1;
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    
    public ListaSimple(){
        this ("lista");
    }
    public ListaSimple(String nombre){
        this.nombre = nombre;
        primerNodo = ultimoNodo = null;
    }
    public boolean estaVacia(){
        return primerNodo == null;
    }
    public void insertarAlFrente (String palabra){
        if(estaVacia()){
            primerNodo  = ultimoNodo= new Nodo(palabra,null,i);
            i++;
        }
        else{
            primerNodo = new Nodo(palabra, primerNodo,i);
            i++;
        }
    }
    

  
     public int Size (){
    int c=i;
        System.out.println(c);
        return c;
    }
      public Object get(int numero) {
        Nodo buscado = null;
        Nodo iterador = primerNodo;
        while(buscado == null && iterador !=null){
            if(iterador.contador==(numero)){
                buscado = iterador;
                iterador = iterador.getSiguente();
            }   
                if (iterador != null){
                iterador = iterador.getSiguente();
                }
        }
            System.out.println(buscado.getPalabra());
            Object retornado = buscado.getPalabra();
            return retornado;
}
     
    public String eliminarFrente(){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }
            String eliminado = primerNodo.datos();
            if(primerNodo == ultimoNodo){
                primerNodo = ultimoNodo = null;
                i--;
            }else{
                    primerNodo = primerNodo.getSiguente();
                    i--;
                }
            
            return eliminado;          
    }
    public Nodo eliminarBuscado(String nombre){
        if(estaVacia()){
            System.out.println("la lsita esta vacia");
        }
        Nodo anterior = ultimoNodo;
        Nodo buscado = null;
        Nodo iterador = ultimoNodo;
        while(buscado == null && iterador !=null){
            if(iterador.getPalabra()== nombre)
                buscado = iterador;
            iterador = iterador.getSiguente();
        }
        Nodo eliminado = buscado;
        primerNodo = eliminado.getSiguente();
        
        return primerNodo;
    }
    public Nodo buscar(String nombre){
        Nodo buscado = null;
        Nodo iterador = primerNodo;
        while(buscado == null && iterador !=null){
            if(iterador.getPalabra().equals(nombre))
                buscado = iterador;
            iterador = iterador.getSiguente();
        }
        return buscado;
    }
    
    public String mostrarlista() throws NullPointerException {
        String cont="";
        if (this.primerNodo != null) {
            cont = this.primerNodo.Mostrar();
        } else {
            throw new NullPointerException("La lista esta vacia, no hay elementos para mostrar");
        }  
        return cont;
    }
    
    //OBTENER EL NODO i
    
  
    
    
    public void imprimir(){
        if(estaVacia()){
            System.out.println("vacia");
           
        }  
        Nodo actual = primerNodo;
        while(actual!=null){
            
             System.out.println(actual.datos());
             actual = actual.getSiguente();
        }
        System.out.println("\n");
    }
  
    
}
