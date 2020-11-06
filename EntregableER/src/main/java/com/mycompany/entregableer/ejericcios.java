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
             
        Pattern patron = Pattern.compile("(\\+34|0034|34)?[ -]*(8|9)[ -]*([0-9][ -]*){8}",Pattern.CASE_INSENSITIVE); //solo binarios
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };          
    }  
    
    
    public void email(String dato){
             
        Pattern patron = Pattern.compile("[\\w\\._]{5,30}\\+?[\\w]{0,10}@[\\w\\.\\-]{3,}\\.\\w{2,5}",Pattern.CASE_INSENSITIVE); //solo binarios
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };          
    }  
        
    
    public void nombres(String dato){
             
        Pattern patron = Pattern.compile("^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?$",Pattern.CASE_INSENSITIVE); //solo binarios
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };          
    }      
    
    public void celular(String dato){
              
    } 
    
    public void url(String dato){
        Pattern patron = Pattern.compile("^https?:\\/\\/[\\w\\-]+(\\.[\\w\\-]+)+[/#?]?.*$",Pattern.CASE_INSENSITIVE); //solo binarios
                                                                   // \\w?\\s*#\\s*[0-9]+(-)[0-9]+
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };         
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
    
    public void contraena(String dato){
        
        /*La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula, al menos una mayúscula y al menos un caracter no alfanumérico.
        Ejemplo:
        w3Unpo<code>t0d0*/        
        
        Pattern patron = Pattern.compile("^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$",Pattern.CASE_INSENSITIVE);                                                              
        Matcher resultado = patron.matcher(dato);
        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };         
    }  
         
}
