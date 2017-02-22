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
public class Nododatos {
    public Object dato;
    public Nododatos siguiente;
    
    
    public Nododatos(Object dato, Nododatos siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
        

    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
}
