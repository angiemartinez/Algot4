/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;

/**
 *
 * @author deisremo
 */
public class ExpresionesRegulares {

    //reconocer numeros binario
    //Reconocer enteros
    final static String TITLE_MENU = "**ARBOLBB**"; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String cadena = null;
        cadena = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);        
        //para consiciones que tengan \ hay que poner \\ 
        //Pattern patron = Pattern.compile("^-?[01]+$",Pattern.CASE_INSENSITIVE); //solo binarios
        //Pattern patron = Pattern.compile("-?[0-9]+",Pattern.CASE_INSENSITIVE); //solo enteros -infinito hasta +infinito
        //Pattern patron = Pattern.compile("[A-Z][]a-z]+(\\s[A-Z][a-z]+)?+(\\s)*",Pattern.CASE_INSENSITIVE);nombres
        
        /*String claro = "310|311|312|313|314|320|321|322|323|";
        String tigo = "300|301|302|304|305|";
        String movistar = "315|316|317|318|";
        String otrosOperadores = "319|350|351|303|304|305";
        StringBuilder operadores = new StringBuilder("");
        operadores.append(claro).append(tigo).append(movistar).append(otrosOperadores);
        String patron = "(\\+57|\\+0057|0057|57)?("+operadores.toString()+")+[0-9]{7}";
        
        Pattern patron = Pattern.compile("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}",Pattern.CASE_INSENSITIVE);//300-301-302-318-319-320*/
       /* Matcher resultado = patron.matcher(cadena);

        if (resultado.matches()) { //valida cadena completa
                JOptionPane.showMessageDialog(null, "Cumple");
        }else {
                JOptionPane.showMessageDialog(null, "no cumple");
        };   */
        
        
        /*placa 
                telefono
                fecha 
                        direccion de correo electronico*/
        
        //int cont = 0;
        //String cadena = "asada";
        //String cadena ="es el pescado un alimento muy especial en Eslovenia y España es";
        //Pattern patron = Pattern.compile("as");
        //Pattern patron = Pattern.compile("es");
        //Pattern patron = Pattern.compile(".es");
        //Pattern patron = Pattern.compile("es$");
        //Pattern patron = Pattern.compile("es*"); //cuando se repite 0 o mas veces
        //Pattern patron = Pattern.compile("es?"); //cuando se repite 0 o 1 vez
        //Pattern patron = Pattern.compile("1");
        //Matcher m = patron.matcher(dato);
        //hace que la cadena cumpla EXACTAMENTE con el patro
        /*if(m.matches()){
            JOptionPane.showMessageDialog(null,"Cumple");
        }else{
            JOptionPane.showMessageDialog(null,"No cumple");
        }*/
        
        //Este metodo permite verificar si un patron esta al inicio de una cadena
        /*if(m.lookingAt()){
            JOptionPane.showMessageDialog(null,"Cumple");
        }else{
            JOptionPane.showMessageDialog(null,"No cumple");
        }        */
        
        /*while(m.find()){
            cont ++;
           JOptionPane.showMessageDialog(null,"Desde "+m.start()+" Hasta"+m.end()
                   +"\nEl texto que cumple es "+ cadena.substring(m.start()));  
           
        }       
        
        JOptionPane.showMessageDialog(null,"El patron se encuentra "+cont+ " veces");*/
    }
    
}
