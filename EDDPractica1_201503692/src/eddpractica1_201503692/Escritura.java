/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1_201503692;
import java.io.*;
/**
 *
 * @author Diego
 */
public class Escritura {
  public void graficar(){
  try{
  String dotPath ="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
  
  String fileInputPath = "C:\\Users\\Diego\\Documents\\Estructuras\\prueba.txt";
  String fileOutputPath = "C:\\Users\\Diego\\Documents\\Estructuras\\grafo1.jpg";
  
  String tParam = "-Tjpg";
  String tOParam = "-o";
  
  String[] cmd = new String[5];
  
  cmd[0] = dotPath;
  cmd[1] = tParam;
  cmd[2] = fileInputPath;
  cmd[3] = tOParam;
  cmd[4] = fileOutputPath;
  
  Runtime rt = Runtime.getRuntime();
  rt.exec(cmd);
  
  } catch(Exception ex){
  ex.printStackTrace();
  }
  }

}
