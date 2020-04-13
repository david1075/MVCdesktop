/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.modelo;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;

/**
 *clase que lee un archivo tipo .txt y compara si algun nombre digitado coincide con el archivo,
 para luego almacenarlo en una lista
 * @author david
 */
public class Modelo {
    
    private String texto;
    private ArrayList <String> lista1 = new ArrayList<>();
  
    /**
     * funcion que recibe la direccion de ubicacion del archivo .txt y luego lo almacena en una variable de tipo
     String donde esta sera retornada
     * @param direccion
     * @return texto
     */
    public String leerArchivo(String direccion){
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader (direccion));
            String Temp = " ";
            String bfRead;
            while((bfRead = bf.readLine())!=null){
                Temp = Temp+bfRead;
            }
            
            texto = Temp;
        }catch(Exception e){
            System.err.println("no se encontro archivo");
        }
        
        return texto;
    }
    /**
     * funcion que recibe un nombre para ser comparado con una cadena de caracteres, si se encuentra se añade a una
      lista que sera retornada por la funcion
     * @param nombre
     * @return lista1
     */
    public ArrayList llenarlista(String nombre){
        String buffer []= texto.split(",");
        for (String buffer1 : buffer) {
            if (buffer1.equals(nombre)) {
                lista1.add(nombre);
            }
        }
        
        return lista1;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<String> getLista1() {
        return lista1;
    }

    public void setLista1(ArrayList<String> lista1) {
        this.lista1 = lista1;
    }
    
   
    
    
}
