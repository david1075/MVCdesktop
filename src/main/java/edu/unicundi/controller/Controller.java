/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controller;

import edu.unicundi.modelo.Modelo;
import edu.unicundi.view.Vista;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *clase controller que comunica la vista con el modelo
 * @author david
 */
public class Controller implements ActionListener {

    private Modelo modelo;
    private Vista vista;
    private String nombre; 
    private String buffer,Temp;
/**
 * recibe como parametros la clase modelo y la clase vista, ademas de añadir el actionlistener para el evento del boton
 * @param modelo
 * @param vista 
 */
    public Controller(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btn_buscar.addActionListener(this);
    }
    /*
    metodo que dispara los eventos del boton buscar
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btn_buscar){
           
            modelo.leerArchivo ("C:\\Users\\david\\Documents\\universidad\\Linea I\\MVCPersonas\\nombres.txt");
            nombre = vista.txt_nombre.getText();
            modelo.llenarlista(nombre);
            for(int i=0; i<modelo.getLista1().size(); i++){
                buffer = modelo.getLista1().get(i);
                String salto = "\n";
                Temp = Temp+buffer+salto;
            }
            vista.txt_resultados.setText(Temp);
            Temp = " ";
            
        }
       
    }
   
    
}
