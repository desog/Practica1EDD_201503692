
package eddpractica1_201503692;

public class Nodo {

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    private String palabra;
    private Nodo siguente;
    public int contador;
    public Nodo(String palabra, Nodo siguiente, int contador) {
        this.palabra = palabra;
        this.siguente = siguiente;
        this.contador = contador;
    }
    
    public String datos(){
        return "Palabra:"+getPalabra();
    }
    public Nodo getSiguente() {
        return siguente;
    }

    public String Mostrar() {
        String contenido="Palabra: "+this.getPalabra()+"\n\n";
        
        if (this.getSiguente() != null) {
            contenido += this.getSiguente().Mostrar();
        }   
        return contenido;
    }
}
