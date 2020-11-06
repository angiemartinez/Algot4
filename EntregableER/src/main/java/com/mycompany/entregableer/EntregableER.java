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
            int opcion;
           
            String menu ="****Expresiones Irregulares****"
                + "\n1. Placas de carro el Colombia" /*Listo*/
                + "\n2. Números de teléfonos fijos en Medellín"
                + "\n3. Números de teléfonos celulares en Colombia"
                + "\n4. Direcciones residenciales en Medellín" /*Listo*/
                + "\n5. Direcciones de correos electrónicos" /*Listo*/
                + "\n6. Fecha en formato dd mm aaaa"
                + "\n7. Cedulas en Colombia"
                + "\n8. Una declaracion de variables en java"
                + "\n9. URL"/*Listo*/
                + "\n10. Nombres y apellidos" /*Listo*/
                + "\n11. Contaseña segura"; /*Listo*/
            
            //https://www.regextester.com/97987
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){ 
            
            case 1: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.placa(cadena);
              break;

            case 2: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.fijos(cadena);                
              break;

            case 4: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.direccion(cadena);                
              break;

            case 5: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.email(cadena);                   
              break;

            case 6: 
              break;
              
            case 9: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.url(cadena);                   
              break;                
              
            case 10: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.nombres(cadena);                   
              break;     
              
            case 11: 
                cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);    
                ejercicio.contraena(cadena);                   
              break;                
            }        

        } while(opcion != 0);             
  }
        
            
        
}
