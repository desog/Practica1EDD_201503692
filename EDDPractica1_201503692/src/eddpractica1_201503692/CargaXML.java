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
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; 
public class CargaXML {
    

  public void cargarXml(File xml)
{
    //Parseo Arhchivo
    
    SAXBuilder builder = new SAXBuilder();
    
    try
    {
        //Se crea el documento a traves del archivo
        Document document = (Document) builder.build( xml );
 
        //Se obtiene la raiz 'tables'
        Element rootNode = document.getRootElement();
 
        //Se obtiene la lista de hijos de la raiz 'tables'
        List list = rootNode.getChildren( "casilla" );
 
        //Se recorre la lista de hijos de 'tables'
        for ( int i = 0; i < list.size(); i++ )
        {
            //Se obtiene el elemento 'tabla'
            Element tabla = (Element) list.get(i);
 
            //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
            String nombreTabla = tabla.getAttributeValue("casilla");
 
            System.out.println( "Tabla: " + nombreTabla );
 
            //Se obtiene la lista de hijos del tag 'tabla'
            List lista_campos = tabla.getChildren();
 
            System.out.println( "\tNombre\t\tTipo\t\tValor" );
 
            //Se recorre la lista de campos
            for ( int j = 0; j < lista_campos.size(); j++ )
            {
                //Se obtiene el elemento 'campo'
                Element campo = (Element)lista_campos.get( j );
         
                //Se obtienen los valores que estan entre los tags '<campo></campo>'
                //Se obtiene el valor que esta entre los tags '<nombre></nombre>'
                String nombre = campo.getChildTextTrim("x");
 
                //Se obtiene el valor que esta entre los tags '<tipo></tipo>'
                String tipo = campo.getChildTextTrim("y");
 
                //Se obtiene el valor que esta entre los tags '<valor></valor>'
//                String valor = campo.getChildTextTrim("valor");
 
                System.out.println( "\t"+nombre+"\t\t"+tipo+"\t\t");
            }
        }
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    }  
}
  }
