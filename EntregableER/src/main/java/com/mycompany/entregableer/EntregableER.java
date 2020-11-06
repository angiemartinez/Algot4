/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entregableer;

import javax.swing.JOptionPane;

/**
 *
 * @author deisremo
 */
public class EntregableER {
    
    final static String TITLE_MENU = "**ARBOLBB**";  
        public static void main(String[] args) {
            
            ejericcios ejercicio = new ejericcios();
            String cadena = null;
            int cadenaNumero;
            int opcion;
           
            String menu ="****Expresiones Irregulares****"
                + "\n1. Placas de carro el Colombia" /*Listo*/
                + "\n2. Números de teléfonos fijos en Medellín" /* Listo*/
                + "\n3. Números de teléfonos celulares en Colombia" /* Listo */
                + "\n4. Direcciones residenciales en Medellín" /*Listo*/
                + "\n5. Direcciones de correos electrónicos" /*Listo*/
                + "\n6. Fecha en formato dd-mm-aaaa" // Listo
                + "\n7. Cedulas en Colombia"  //Listo               
                + "\n9. URL"/*Listo*/
                + "\n10. Nombres y apellidos" /*Listo*/
                + "\n11. Contraseña segura" /*Listo*/
            	+ "\n12. Validar frase"; /*Listo*/
            
            
            //https://www.regextester.com/97987
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){ 
            
            case 1: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese la placa:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.placa(cadena);
              break;

            case 2: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese el numero fijo:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.fijos(cadena);                
              break;
              
            case 3: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese el numero celular:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.celular(cadena);                
              break;

            case 4: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese ingrese la direccion:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.direccion(cadena);                
              break;

            case 5: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese el email:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.email(cadena);                   
              break;

            case 6: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese la fecha:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.fecha(cadena);  
              break;
              
            case 7: 
                cadenaNumero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cedula:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));    
                ejercicio.cedula(cadenaNumero);  
              break;
              
            case 8: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese la url:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.url(cadena);                   
              break;                
              
            case 9: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese los nombres:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.nombres(cadena);                   
              break;     
              
            case 10: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese la clave:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.contrasena(cadena);                   
              break;                
            }        

        } while(opcion != 0);             
  }
        
            
        
}
