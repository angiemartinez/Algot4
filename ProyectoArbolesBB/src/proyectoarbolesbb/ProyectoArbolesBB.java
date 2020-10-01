package proyectoarbolesbb;

import javax.swing.JOptionPane;

/**
 * @author leon.chanci
 */
public class ProyectoArbolesBB {
    
    final static String TITLE_MENU = "**ARBOLBB**";     
    public static void main(String[] args) {
        ArbolBB arbol = new ArbolBB();
        String menu ="****ARBOL BINARIO DE BUSQUEDA****\n1. Mostrar\n2. Insertar\n3. Buscar\n4. Modificar\n5. Eliminar\n6. Mostrar altura del árbol\n7. Mostrar nodos de un nivel dado\n8. Insertar Lista Generalizada\n0. SALIR";
        int edadInsertar,nivelABuscar,opcion;
        String nombreInsertar;
        String datoArbolGeneralizado = null;
        int validarIngresoDatos = 0; 
        String padre = null;
        
        int cedulaInsertar,buscarConCedula,buscarCedulaModificar,buscarCedulaEliminar;        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                case 1: 
                    if(arbol.getRaiz() != null ){
                        arbol.recorrerIN_ORDEN(arbol.getRaiz()); 
                    }else{
                        JOptionPane.showMessageDialog(null, "¡El Arbol está Vacío!", TITLE_MENU, JOptionPane.ERROR_MESSAGE); 
                    }
                    break;
                case 2:
                    nombreInsertar = JOptionPane.showInputDialog(null, "Ingrese el Nombre", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
                    cedulaInsertar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cedula", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));  
                    edadInsertar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));
                    arbol.insertar2(nombreInsertar, cedulaInsertar, edadInsertar);
                   
                    break;
                case 3: 
                    buscarConCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cedula a buscar", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));  
                    arbol.buscar(buscarConCedula); 
                    break;
                case 4:
                    buscarCedulaModificar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cedula para buscar y modificar", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));  
                    arbol.modificar(buscarCedulaModificar);
                    break;    
                case 5:  
                    buscarCedulaEliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Cedula para buscar y eliminar", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));  
                    arbol.eliminar(buscarCedulaEliminar);
                    break;
                //Altura del arbol
                case 6:
                    if(arbol.getRaiz() != null ){
                        JOptionPane.showMessageDialog(null, "La altura del arbol es: "+arbol.mostrarAltura() , TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "¡El Arbol está Vacío!", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
                    }
                    break;  
                //Nodo de un nivel dado
                case 7:
                    nivelABuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nivel a buscar:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));
                    arbol.mostrarNodo(nivelABuscar);
                    break;                     
                case 8:          
                	
                	datoArbolGeneralizado = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
                	padre = JOptionPane.showInputDialog(null, "Ingrese padre:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
                	arbol.insertarArbolGeneral(datoArbolGeneralizado, null);

                	while (validarIngresoDatos == 0) {
                		validarIngresoDatos = Integer.parseInt(JOptionPane.showInputDialog(null, "Si desea informaci�n hermana marque 0, de lo contrario marque 1", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));
						if (validarIngresoDatos == 0) {
							datoArbolGeneralizado = JOptionPane.showInputDialog(null, "Ingrese dato:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
							padre = JOptionPane.showInputDialog(null, "Ingrese padre:", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
							arbol.insertarArbolGeneral(datoArbolGeneralizado, padre);						
						}
					
					}
                    break;                    
                case 0:
                    System.exit(0);
                    break;
                default:JOptionPane.showMessageDialog(null, "OPCION INCORRECTA!", TITLE_MENU,JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while(opcion != 0);    
        
    }
    
}
