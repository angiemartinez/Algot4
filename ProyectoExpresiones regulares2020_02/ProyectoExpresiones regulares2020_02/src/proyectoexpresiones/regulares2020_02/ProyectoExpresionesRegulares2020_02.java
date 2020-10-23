
package proyectoexpresiones.regulares2020_02;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;
public class ProyectoExpresionesRegulares2020_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String cadena="es. 4 eles .pescado 5 .Un, alimento 4 muy "
                + "especial * en ESlovenia y España es 6";
        int cont=0;
        Pattern patron= Pattern.compile("es",Pattern.CASE_INSENSITIVE);
        Matcher m=patron.matcher(cadena);
//        if(m.matches())
//        {
//            JOptionPane.showMessageDialog(null,"cumple");
//        }
//        else
//         {
//            JOptionPane.showMessageDialog(null,"No cumple");
//        }
//        if(m.lookingAt())
//        {
//            JOptionPane.showMessageDialog(null,"cumple");
//        }
//        else
//         {
//            JOptionPane.showMessageDialog(null,"No cumple");
//        }
//        String sal="", palabras[]=patron.split(cadena);
//        for(int k=0;k<palabras.length;k++)
//        {
//            sal+=palabras[k]+"\n";
//        }
//       JOptionPane.showMessageDialog(null,sal);
//       //String cadenareemplaza=m.replaceAll("ZZ");
//       String cadenareemplaza=m.replaceFirst("ZZ");
//       JOptionPane.showMessageDialog(null,"Cadena reemplazada "+cadenareemplaza);
        while(m.find())
        {
           cont++; 
           JOptionPane.showMessageDialog(null,"Desde "+m.start()+" hasta "+m.end()
                   +"\nEl texto que cumple es "+cadena.substring(m.start(),m.end())+"\n");
        
        }
    JOptionPane.showMessageDialog(null,"El patron se encuentra en la cadena "+cont+" veces");
    } 
}
