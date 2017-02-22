/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Circular;

/**
 *
 * @author Diego
 */
public class Lista {
    Nodoldoble Primernodo;
    Nodoldoble Ultimonodo;
    Nododatos PrimerNodoAbajo;
    String nombre;
    private int i=1;
    private int j = 1;
    public Lista(String nombrelista) {
        nombre = nombrelista;
        Primernodo = Ultimonodo = null;

    }
    
    public void referencia(Nodoldoble nodo1, Nodoldoble nodo2) {
        nodo1.siguienteldoble=nodo2;
        nodo2.anteriorldoble = nodo1;
    }
         public boolean Estavacia(){
          return Primernodo==null;
}
    
    //INSERTAR AL FRENTE
    public void push(String nombre) {

        if (Estavacia()) {
            Primernodo = Ultimonodo = new Nodoldoble(nombre,i);
            i++;
        } else {
            Nodoldoble nvo = new Nodoldoble(nombre,i);
            referencia(Primernodo, nvo);
            Primernodo = nvo;
            i++;
        }
    }
      public int Size (){
    int c=i;
        System.out.println(c);
        return c;
    }
    public void insertarfinal(String nombre) {
        if (Primernodo == null) {
            Primernodo = Ultimonodo = new Nodoldoble(nombre,i);
            i++;
           ;
        } else {
            Nodoldoble nvo = new Nodoldoble(nombre,i);
            referencia(Ultimonodo, nvo);
            Ultimonodo = nvo;
            i++;
        }
    }
    //ELMINAR DEL FRENTE
    public void pop() {

        if (Primernodo == null) {
            System.out.println("La Lista Esta Vacia");
            i--;
        }

        if (Primernodo == Ultimonodo) {
            Primernodo = Ultimonodo = null;
         
        } else {
            Nodoldoble temp = Primernodo.siguienteldoble;
            temp.anteriorldoble = null;
            Primernodo = temp;
         i--;
        }

    }
  
          public Object get(int numero) {
        Nodoldoble buscado = null;
        Nodoldoble iterador = Primernodo;
        while(buscado == null && iterador !=null){
            if(iterador.contador==(numero)){
                buscado = iterador;
                iterador = iterador.siguienteldoble;
            }   
                if (iterador != null){
                iterador = iterador.anteriorldoble;
                }
        }
            System.out.println(buscado.Nombre);
            Object retornado = buscado.Nombre;
            return retornado;
}


    
    //----------------METODOS LISTA SIMPLE------------------------
    
    public void insertarabajofrente(Object buscado, Object dato,int c) {
        Nodoldoble resultado = buscar(buscado);
        if (resultado.nodoabajo == null) {
            resultado.nodoabajo = PrimerNodoAbajo =  new Nododatos(dato, null,c);
          j++;
        } else {
            resultado.nodoabajo = new Nododatos(dato, resultado.nodoabajo,c);
          j++;
        }

    }
    
        public Object getabajo(int numero) {
        Nododatos buscado = null;
        Nododatos iterador = PrimerNodoAbajo;
        while(buscado == null && iterador !=null){
            if(iterador.conta==(numero)){
                buscado = iterador;
                iterador = iterador.siguiente;
            }   
                if (iterador != null){
                iterador = iterador.siguiente;
                }
        }
            System.out.println(buscado.dato);
            Object retornado = buscado.dato;
            return retornado;
}
    
    
    //GENERALES
      public Nodoldoble buscar(Object info) {
        if (Primernodo == null) {
            System.out.printf("%s Vacia\n ", nombre);
        }

        Nodoldoble actual = Primernodo;
        Nodoldoble retornado = null;

        while (actual != null) {

            if (actual.Nombre.equals(info)) {
                retornado = actual;
            }
            actual = actual.anteriorldoble;
        }
        return retornado;
    }
      public void mostrar() {
        if (Primernodo == null) {
            System.out.printf("%s Vacia\n ", nombre);
        }

        System.out.printf("Las %s encontradas son:", nombre);
        System.out.println();
        Nodoldoble actual = Ultimonodo;
        while (actual != null) {

            System.out.printf(" %s", actual.datos() + "\n");
            actual = actual.siguienteldoble;

        }

        System.out.println();

    }
          public void mostrardatos(Object categoria) {
        Nodoldoble encontrado = buscar(categoria);
        if (encontrado.nodoabajo == null) {
            System.out.println();
            System.out.printf("La Categoria %s esta Vacia\n ", categoria);
        } else {

            System.out.printf("La categoria %s contiene estos datos:\n", categoria);

            Nododatos temp = encontrado.nodoabajo;

            while (temp != null) {
                System.out.printf(" %s", temp.dato);
                temp = temp.siguiente;
       }
                System.out.println();

            }
        }
          public String obtenercat() throws NullPointerException {
        String cont="";
        if (this.Primernodo != null) {
            cont = this.Primernodo.Mostrar();
        } else {
            throw new NullPointerException("La lista esta vacia, no hay elementos para mostrar");
        }  
        return cont;
    }
       

    }
          
    

