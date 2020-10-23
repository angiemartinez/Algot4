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
            
            int opcion;
           
            String menu ="****Expresiones Irregulares****"
                + "\n1. Placas de carro el Colombia"
                + "\n2. Números de teléfonos fijos en Medellín"
                + "\n3. Números de teléfonos celulares en Colombia"
                + "\n4. Direcciones residenciales en Medellín"
                + "\n5. Direcciones de correos electrónicos"
                + "\n6. Fecha en formato dd mm aaaa"
                + "\n7. Cedulas en Colombia"
                + "\n8. Una declaracion de variables en java"
                + "\n9. URL"
                + "\n10. Nombres y apellidos"
                + "\n11. Contaseña segura";
            
            
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){ 
            
            case 1: 
              break;
            }

        } while(opcion != 0);             
  }
        
            
        
}
