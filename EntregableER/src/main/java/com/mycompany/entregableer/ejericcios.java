/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entregableer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author deisremo
 */
public class ejericcios {
    
    public void placa(String dato){
        Pattern patron = Pattern.compile("^[A-Z]{3}[0-9]{3}º",Pattern.CASE_INSENSITIVE); //solo binarios
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };         
    }
    
    public void fijos(String dato){
              
    }  
    
    public void celular(String dato){
              
    } 
    
    public void direccion(String dato){
        Pattern patron = Pattern.compile("((calle|carrera|diagonal|transversal)\\s*[0-9]{1,3})\\w?\\s*#\\s*[0-9]{1,3}",Pattern.CASE_INSENSITIVE); //solo binarios
                                                                   // \\w?\\s*#\\s*[0-9]+(-)[0-9]+
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };         
    }    
}
