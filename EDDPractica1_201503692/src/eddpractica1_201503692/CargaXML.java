/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1_201503692;

/**
 *
 * @author Diego
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; 
public class CargaXML {
    
public     ListaSimple lista = new ListaSimple();

  public void cargarXml(File xml)
{
    //Parseo Arhchivo
    
    SAXBuilder builder = new SAXBuilder();
    
    try
    {
        //Se crea el documento a traves del archivo
        Document document = (Document) builder.build( xml );
        List elemento = document.getContent();
        
        //Se obtiene la raiz 'tables'
        Element rootNode = document.getRootElement();
        
        //Se obtiene la lista de hijos de la raiz 'tables'
        List list = rootNode.getChildren( "diccionario" );
        List list1= rootNode.getChildren("dobles");
        
        //Se recorre la lista de hijos de 'tables'
        for ( int i = 0; i < list.size(); i++ )
        {
            //Se obtiene el elemento 'tabla'
            Element tabla = (Element) list.get(i);
 
            //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
            String nombreTabla = tabla.getValue();
 
            System.out.println( "Dimension: " + nombreTabla );
 
            //Se obtiene la lista de hijos del tag 'tabla'
            List lista_campos = tabla.getChildren();
            
            
            
           
            //YA SE INSERTAN VALORES A LA LISTA SIMPLE PARA EL DICCIONARIO
            //Se recorre la lista de campos
            for ( int j = 0; j < lista_campos.size(); j++ )
            {
                //Se obtiene el elemento 'campo'
                Element campo = (Element)lista_campos.get( j );
         
                //Se obtienen los valores que estan entre los tags '<campo></campo>'
                //Se obtiene el valor que esta entre los tags '<nombre></nombre>'
                String nombre = campo.getValue();
                lista.insertarAlFrente(nombre);
                //Se obtiene el valor que esta entre los tags '<tipo></tipo>'
                String tipo = campo.getChildTextTrim("y");
 
                //Se obtiene el valor que esta entre los tags '<valor></valor>'
//                String valor = campo.getChildTextTrim("valor");
                System.out.println("\t"+"x"+"\t\t"+"y");
                System.out.println( "\t"+nombre+"\t\t"+tipo+"\t\t");
                System.out.println(lista.mostrarlista());
            }
          
        }
       
        Palabras();
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    }  
}
  
  public  void Palabras()
    {
       int tmp = lista.Size()-1;
        
        
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            
            fichero = new FileWriter("C:\\Users\\Diego\\Documents\\Estructuras\\prueba.txt");
            pw = new PrintWriter(fichero);
            pw.println("digraph{ rankdir=same");
           while(tmp > 0 ) {
           if(tmp !=1){
       pw.println("\""+lista.get(tmp).toString()+"\""+"->"+"\""+lista.get(tmp-1).toString()+"\"");
       } else {
           pw.println("\""+lista.get(tmp).toString()+"\"");
           }
        tmp--;
        }
                
           pw.println("}");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        Escritura esc = new Escritura();
        esc.graficar();
    }
  }
