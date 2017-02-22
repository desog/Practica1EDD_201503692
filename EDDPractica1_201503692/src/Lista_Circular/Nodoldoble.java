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
public class Nodoldoble {
    
     public String Nombre ;
    //public Object tipo;
    public Nodoldoble siguienteldoble;
    public Nodoldoble anteriorldoble;
    public Nododatos nodoabajo;
    

    public Nodoldoble(String nombre) {
        
        this.Nombre = nombre;
      //  tipo= Tipo;
     

    }

  
     public String Mostrar() {
        String contenido=this.Nombre;
        
        if (this.getSiguienteldoble()!= null) {
            contenido += this.getSiguienteldoble().Mostrar();
        }   
        System.out.println(contenido);
        return contenido;
    }
     
     
    public String datos(){
        return "\n Nombre: "+Nombre;
    
        
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
//
//    public Object getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(Object tipo) {
//        this.tipo = tipo;
//    }

    public Nodoldoble getSiguienteldoble() {
        return siguienteldoble;
    }

    public void setSiguienteldoble(Nodoldoble siguienteldoble) {
        this.siguienteldoble = siguienteldoble;
    }

   


    
    
}
