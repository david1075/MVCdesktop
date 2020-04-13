/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.principal;

import edu.unicundi.controller.Controller;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.view.Vista;


/**
 * clase main por donde inicia el programa
 * @author david
 */
public class Main {
    
     private String text;
     
    public static void main(String[] args) {
       
        Vista ventana = new Vista();
        Modelo modelo = new Modelo();
        Controller controlador = new Controller(modelo,ventana);
        
      
    
    }
}
