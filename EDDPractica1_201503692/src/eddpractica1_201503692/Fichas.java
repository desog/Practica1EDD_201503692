/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1_201503692;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Fichas {
    public List<String> chars;
    
    public List<String> mostrarfichas(){
     chars = new ArrayList();
        for(int i = 0; i<=12; i++){
        chars.add("A");
        chars.add("E");
}   
        for (int i = 0; i<=9;i++){
        chars.add("O");
        }
        for (int i = 0; i<=6;i++){
        chars.add("I");
        chars.add("S");
        }
        for (int i = 0; i<=5;i++){
        chars.add("N");
        chars.add("R");
        chars.add("U");
        chars.add("D");
        }
         for (int i = 0; i<=4;i++){
        chars.add("L");
        chars.add("T");
        chars.add("C");
        }
         for (int i = 0; i<=2;i++){
        chars.add("G");
        chars.add("B");
        chars.add("M");
        chars.add("P");
        chars.add("H");
        }
         
        chars.add("F");
        chars.add("V");
        chars.add("Y");
        chars.add("Q");
        chars.add("J");
        chars.add("Ñ");
        chars.add("X");
        chars.add("Z");
        
        Collections.shuffle(chars);
        
        return chars;
    }
}
