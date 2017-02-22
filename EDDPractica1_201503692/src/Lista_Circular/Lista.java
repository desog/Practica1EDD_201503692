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
            Primernodo = Ultimonodo = new Nodoldoble(nombre);
            
        } else {
            Nodoldoble nvo = new Nodoldoble(nombre);
            referencia(Primernodo, nvo);
            Primernodo = nvo;
        }
    }
    public void insertarfinal(String nombre) {
        if (Primernodo == null) {
            Primernodo = Ultimonodo = new Nodoldoble(nombre);
           ;
        } else {
            Nodoldoble nvo = new Nodoldoble(nombre);
            referencia(Ultimonodo, nvo);
            Ultimonodo = nvo;
       
        }
    }
    //ELMINAR DEL FRENTE
    public void pop() {

        if (Primernodo == null) {
            System.out.println("La Lista Esta Vacia");
        }

        if (Primernodo == Ultimonodo) {
            Primernodo = Ultimonodo = null;
         
        } else {
            Nodoldoble temp = Primernodo.siguienteldoble;
            temp.anteriorldoble = null;
            Primernodo = temp;
         
        }

    }
  


    
    //----------------METODOS LISTA SIMPLE------------------------
    
    public void insertarabajofrente(Object buscado, Object dato) {
        Nodoldoble resultado = buscar(buscado);
        if (resultado.nodoabajo == null) {
            resultado.nodoabajo = PrimerNodoAbajo = new Nododatos(dato, null);
          
        } else {
            resultado.nodoabajo = new Nododatos(dato, resultado.nodoabajo);
          
        }

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
          
    

