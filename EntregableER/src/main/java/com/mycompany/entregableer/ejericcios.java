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

	public void placa(String dato) {
		Pattern patron = Pattern.compile("^[A-Z]{1,3}[0-9]{3,4}", Pattern.CASE_INSENSITIVE); // solo binarios
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}

	public void celular(String dato) {
		Pattern patron = Pattern.compile(
				"(^(300|301|302|303|304|305|310|311|312|313|314|315|316|317|318|319|320|321|322|323|350)*)[-][0-9]{3}[-][0-9]{2}[-][0-9]{2}",
				Pattern.CASE_INSENSITIVE); // solo binarios
		Matcher resultado = patron.matcher(dato);
		int cont = 0;
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}

	}

	public void fijos(String dato) {

		Pattern patron = Pattern.compile("(^(2|4|5|6)*)[0-9]{2}[-][0-9]{2}[-][0-9]{2}", Pattern.CASE_INSENSITIVE); // solo
																													// binarios
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}

	public void cedula(int dato) {

		Pattern patron = Pattern.compile("(^1[2-9]*)[0-9]{6,10}", Pattern.CASE_INSENSITIVE); // solo binarios
		Matcher resultado = patron.matcher(String.valueOf(dato));
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		
	}

	public void email(String dato, boolean validarCadena) {

		Pattern patron = Pattern.compile("[a-zA-Z\\d]{5,30}\\+?[\\w]{0,10}@[\\w\\.\\-]{3,}\\.\\w{2,5}",
				Pattern.CASE_INSENSITIVE);
		Matcher resultado = patron.matcher(dato);
		
		if (validarCadena) {
			if (resultado.matches()) { // valida cadena completa
				JOptionPane.showMessageDialog(null, "Cumple");
			} else {
				JOptionPane.showMessageDialog(null, "no cumple");
			}
		}else {
			int cont = 0;
		    while(resultado.find()){
		       cont ++;
		       JOptionPane.showMessageDialog(null,"Desde "+resultado.start()+" Hasta"+resultado.end()
		               +"\nEl texto que cumple es "+ dato.substring(resultado.start()));  
		       
		    }       
		    
		    JOptionPane.showMessageDialog(null,"El patron se encuentra "+cont+ " veces");
		}

		
	}

	public void nombres(String dato) {

		Pattern patron = Pattern.compile(
				"^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?$",
				Pattern.CASE_INSENSITIVE); // solo binarios
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}

	public void url(String dato) {
		Pattern patron = Pattern.compile("^https?:\\/\\/[\\w\\-]+(\\.[\\w\\-]+)+[/#?]?.*$", Pattern.CASE_INSENSITIVE); // solo
																														// binarios
		// \\w?\\s*#\\s*[0-9]+(-)[0-9]+
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}

	public void direccion(String dato) {
		Pattern patron = Pattern.compile("^((calle|carrera|diagonal|transversal)\\s*[0-9]{1,3})\\w?\\s*#\\s*[0-9]{1,3}",
				Pattern.CASE_INSENSITIVE); // solo binarios
		// \\w?\\s*#\\s*[0-9]+(-)[0-9]+
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}

	public void contrasena(String dato) {

		/*
		 * La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al
		 * menos una letra y al menos un caracter especial. Ejemplo: w3Unpo<code>t0d0
		 */

		Pattern patron = Pattern.compile(
				"^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$",
				Pattern.CASE_INSENSITIVE);
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}

	public void fecha(String dato) {

		// Fecha evaluada del 1900 hasta 2999 dd-mm-yyyy
		Pattern patron = Pattern.compile(
				"^(0[1-9]|1\\d|2[0-8]|29(?=-\\d\\d-(?!1[01345789]00|2[1235679]00)\\d\\d(?:[02468][048]|[13579][26]))|30(?!-02)|31(?=-0[13578]|-1[02]))-(0[1-9]|1[0-2])-([12]\\d{3})(\\s([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d))?",
				Pattern.CASE_INSENSITIVE);
		Matcher resultado = patron.matcher(dato);
		if (resultado.matches()) { // valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		} else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		;
	}
}
