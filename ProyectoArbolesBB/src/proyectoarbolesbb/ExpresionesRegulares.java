package proyectoarbolesbb;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExpresionesRegulares {

	public void name() {

		String cadena = "as";
		Pattern patron = Pattern.compile("as");
		Matcher resultado = patron.matcher(cadena);
		
		if (resultado.matches()) { //valida cadena completa
			JOptionPane.showMessageDialog(null, "Cumple");
		}else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}
		
		if (resultado.lookingAt()) { //busca dentro de la cadena
			JOptionPane.showMessageDialog(null, "Cumple");
		}else {
			JOptionPane.showMessageDialog(null, "no cumple");
		}

	}

}
