package proyectoarbolesbb;

import javax.swing.JOptionPane;

/*
* @author leon.chanci
*/
public class ArbolBB {
	NodoBB raiz;
	int altura = 0;
	NodoGeneral hijosAux[];
	NodoGeneral nodoRaiz;
	NodoGeneralizado raizGeneralizada;
	NodoGeneral anterior;
	NodoGeneral siguiente;

	final static String TITLE_MENU = "**ARBOLBB**";

	// Método Constructor
	public ArbolBB() {
		raiz = null;
		raizGeneralizada = null;
	}

	// Método Recorer IN-ORDEN
	public void recorrerIN_ORDEN(NodoBB R) {
		if (R != null) {
			recorrerIN_ORDEN(R.getLigaIzquierda());
			System.out.println(
					"NOMBRE: " + R.getNombre() + "    " + "CEDULA: " + R.getCedula() + "    " + "EDAD: " + R.getEdad());
			/*
			 * JOptionPane.showMessageDialog(null, "\nNOMBRE: " + R.getNombre()+"   " +
			 * "\nCEDULA: " + R.getCedula()+"   " + "\nEDAD: " + R.getEdad(),
			 * TITLE_MENU,JOptionPane.INFORMATION_MESSAGE);
			 */
			recorrerIN_ORDEN(R.getLigaDerecha());

		}
	}

	// Método Recorer PRE-ORDEN
	public void recorrerPRE_ORDEN(NodoBB R) {
		if (R != null) {
			System.out.println(R.getNombre() + "  " + R.getCedula() + "   " + R.getEdad());
			// JOptionPane.showMessageDialog(null, R.getNombre()+" " + R.getCedula()+" "+
			// R.getEdad());
			recorrerPRE_ORDEN(R.getLigaIzquierda());
			recorrerPRE_ORDEN(R.getLigaDerecha());

		}
	}

	// Método Recorer POST-ORDEN
	public void recorrerPOST_ORDEN(NodoBB R) {
		if (R != null) {
			recorrerPOST_ORDEN(R.getLigaIzquierda());
			recorrerPOST_ORDEN(R.getLigaDerecha());
			System.out.println(R.getNombre() + "  " + R.getCedula() + "   " + R.getEdad());
			// JOptionPane.showMessageDialog(null, R.getNombre()+" " + R.getCedula()+" "+
			// R.getEdad());
		}
	}

	// Método Insertar Nodo en el árbol
	public void insertar(String nombre, int cedula, int edad) {
		NodoBB p = raiz, anterior = null;
		boolean bandera = false;
		while (p != null && bandera == false) {
			anterior = p;
			if (cedula > p.getCedula()) {
				p = p.getLigaDerecha();

			} else {
				if (cedula < p.getCedula()) {
					p = p.getLigaIzquierda();
				} else {
					bandera = true;
				}
			}
		}
		if (bandera == true) {
			JOptionPane.showMessageDialog(null, "La cédula ya EXISTE", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
		} else {
			p = new NodoBB(nombre, cedula, edad);
			if (raiz == null) {
				raiz = p;
			} else {
				if (cedula < p.getCedula()) {
					anterior.setLigaIzquierda(p);
				} else {
					anterior.setLigaDerecha(p);
				}
			}
		}

	}

	public void insertar2(String nombre, int cedula, int edad) {
		raiz = insertarNodo(raiz, nombre, cedula, edad);
	}

	public NodoBB insertarNodo(NodoBB p, String nombre, int cedula, int edad) {
		if (p == null) {
			p = new NodoBB(nombre, cedula, edad);
		} else if (cedula < p.getCedula()) {
			NodoBB iz = insertarNodo(p.getLigaIzquierda(), nombre, cedula, edad);
			p.setLigaIzquierda(iz);
		} else if (cedula > p.getCedula()) {
			NodoBB de = insertarNodo(p.getLigaDerecha(), nombre, cedula, edad);
			p.setLigaDerecha(de);
		} else {
			JOptionPane.showMessageDialog(null, "Dato duplicado", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
		}

		return p;
	}

	// Metodo Buscar Dato
	public void buscar(int cedula) {
		NodoBB p = raiz;
		boolean bandera = false;
		while (p != null & bandera == false) {
			if (cedula > p.getCedula()) {
				p = p.getLigaDerecha();
			} else {
				if (cedula < p.getCedula()) {
					p = p.getLigaIzquierda();
				} else {
					bandera = true;
				}
			}
		}
		if (bandera == true) {
			JOptionPane
					.showMessageDialog(null,
							"La Cédula buscada existe. Los datos son:" + "\nNombre: " + p.getNombre() + "\nCédula: "
									+ p.getCedula() + "\nEdad: " + p.getEdad(),
							TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "La Cédula buscada " + cedula + " NO se encontró ", TITLE_MENU,
					JOptionPane.ERROR_MESSAGE);
		}
	}

	// Método para modificar
	public void modificar(int cedula) {
		NodoBB p = raiz;
		boolean bandera = false;
		while (p != null & bandera == false) {
			if (cedula > p.getCedula()) {
				p = p.getLigaDerecha();
			} else {
				if (cedula < p.getCedula()) {
					p = p.getLigaIzquierda();
				} else {
					bandera = true;
				}
			}
		}
		if (bandera == true) {
			int datoAmodificar;
			boolean cambio = false;
			do {
				datoAmodificar = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Ingrese el dato a Modificar: \n1. Modificar Nombre\n2. Modificar Cédula\n3. Modificar Edad\n4. Ver Datos Actualizados\n0. Atrás",
						TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));
				switch (datoAmodificar) {
				case 1:
					String newNombre;
					newNombre = JOptionPane.showInputDialog(null, "Ingrese el NOMBRE", TITLE_MENU,
							JOptionPane.INFORMATION_MESSAGE);
					if (newNombre != null) {
						p.setNombre(newNombre);
						cambio = true;
					}
					break;
				case 2:
					int newCedula;
					newCedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva CEDULA",
							TITLE_MENU, JOptionPane.INFORMATION_MESSAGE));
					if (newCedula != 0) {
						eliminar(p.getCedula());
						insertar2(p.getNombre(), newCedula, p.getEdad());
						cambio = true;
					}
					break;
				case 3:
					int newEdad;
					newEdad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva EDAD", TITLE_MENU,
							JOptionPane.INFORMATION_MESSAGE));
					if (newEdad != 0) {
						p.setEdad(newEdad);
						cambio = true;
					}
					break;
				case 4:
					if (cambio == true) {
						JOptionPane.showMessageDialog(
								null, "Actualización exitosa:" + "\nNombre: " + p.getNombre() + "\nCédula: "
										+ p.getCedula() + "\nEdad: " + p.getEdad(),
								TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "No se han actualizado datos", TITLE_MENU,
								JOptionPane.ERROR);
					}
					break;

				}
			} while (datoAmodificar != 0);
		} else {
			JOptionPane.showMessageDialog(null, "La Cédula buscada " + cedula + " NO se encontró ", TITLE_MENU,
					JOptionPane.ERROR_MESSAGE);
		}
	}

	// Método para eliminar
	public void eliminar(int cedula) {
		raiz = eliminar(raiz, cedula);
	}

	// Método para eliminar NODO los tres flujos
	public NodoBB eliminar(NodoBB p, int cedula) {
		if (p == null) {
			JOptionPane.showMessageDialog(null, "La Cédula buscada " + cedula + " NO se encontró ", TITLE_MENU,
					JOptionPane.ERROR_MESSAGE);
		} else if (cedula < p.getCedula()) {
			NodoBB iz = eliminar(p.getLigaIzquierda(), cedula);
			p.setLigaIzquierda(iz);
		} else if (cedula > p.getCedula()) {
			NodoBB de = eliminar(p.getLigaDerecha(), cedula);
			p.setLigaDerecha(de);
		} else {
			NodoBB s = p;
			if (s.getLigaDerecha() == null) {
				p = s.getLigaIzquierda();
			} else if (p.getLigaIzquierda() == null) {
				p = s.getLigaDerecha();
			} else {
				s = cambiar(s);
			}
			s = null;

		}
		return p;
	}

	public NodoBB cambiar(NodoBB aux) {
		NodoBB p = aux;
		NodoBB a = aux.getLigaIzquierda();
		while (a.getLigaDerecha() != null) {
			p = a;
			a = a.getLigaDerecha();
		}
		aux.setCedula(a.getCedula());
		if (p == aux)
			p.setLigaIzquierda(a.getLigaIzquierda());
		else
			p.setLigaDerecha(a.getLigaDerecha());
		return a;
	}

	// Método para reordenar el arbol cuando se elimine
	public NodoBB ordenar(NodoBB nodoAEliminar) {
		if (nodoAEliminar.ligaIzquierda == null && nodoAEliminar.ligaDerecha == null) {
			raiz = null;
			return null;
		}
		if (nodoAEliminar.ligaIzquierda == null) {
			NodoBB hijosDelNodoEliminar = nodoAEliminar.getLigaDerecha();
			/*
			 * while (hijosDelNodoEliminar.ligaIzquierda != null) { hijosDelNodoEliminar =
			 * hijosDelNodoEliminar.getLigaIzquierda(); }
			 */
			return hijosDelNodoEliminar;
		}

		NodoBB hijosDelNodoEliminar = nodoAEliminar.getLigaIzquierda();
		while (hijosDelNodoEliminar.ligaDerecha != null) {
			hijosDelNodoEliminar = hijosDelNodoEliminar.getLigaDerecha();
		}
		return hijosDelNodoEliminar;
	}

	// Método para mostrar la altura del árbol
	public int mostrarAltura() {
		// Cuando la raiz es diferente de null es porque hay 1 nivel
		mostrarAltura(raiz, 1);
		return altura;
	}

	private void mostrarAltura(NodoBB p, int nivel) {
		if (p != null) {
			mostrarAltura(p.getLigaIzquierda(), nivel + 1);
			if (nivel > altura) {
				altura = nivel;
			}
			mostrarAltura(p.getLigaDerecha(), nivel + 1);
		}
	}

	// Método para mostrar los Nodo de un nivel dado
	public void mostrarNodo(int nivelDado) {
		if (raiz != null) {
			if (nivelDado > mostrarAltura()) {
				JOptionPane.showMessageDialog(null, "¡El Arbol NO tiene ese nivel!", TITLE_MENU,
						JOptionPane.ERROR_MESSAGE);
			} else {
				NodoBB resultado = mostrarNodo(raiz, nivelDado, 1);
				System.out.println("Los datos en el nivel " + nivelDado + ", son los siguientes: " + "\nNOMBRE: "
						+ resultado.getNombre() + "    " + "\nCEDULA: " + resultado.getCedula() + "    " + "\nEDAD: "
						+ resultado.getEdad());
			}
		} else {
			JOptionPane.showMessageDialog(null, "¡El Arbol está Vacío!", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
		}

	}

	private NodoBB mostrarNodo(NodoBB p, int nivelDado, int nivel) {
		if (nivelDado == 1) {
			return p;
		}
		while (p != null) {
			if (p.getLigaIzquierda() != null) {
				p = p.getLigaIzquierda();
				nivel++;
			}
			if (nivelDado == nivel) {
				return p;
			}
			if (p.getLigaDerecha() != null) {
				p = p.getLigaDerecha();
				nivel++;
			}
		}
		return p;
	}

	// Metodo para obtener la raiz del arbol
	public NodoBB getRaiz() {
		return (raiz);
	}

	public void mostrarListaGeneralizada(NodoGeneral p) {
		if (p != null) {
			System.out.println("Dato" + p.getDato());
			if (p.noHijos > 0) {
				for (int i = 0; i < p.noHijos; i++) {
					mostrarListaGeneralizada(p.hijos[i]);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "La lista se encuentra vacia", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
		}

	}

	public void mostrarRaiz() {
		System.out.println("La raiz es:" + nodoRaiz.getDato());
	}

	public void buscarDato(String dato) {
		buscarDato(nodoRaiz, dato);
	}

	public void buscarDato(NodoGeneral p, String dato) {

		if (p != null) {
			if (p.getDato().equals(dato)) {
				System.out.println("Dato esta en la raiz");
			} else {
				if (p.noHijos > 0) {
					for (int i = 0; i < p.noHijos; i++) {
						if (p.hijos[i].getDato().equals(dato)) {
							System.out.println("El dato existe!");
							return;
						} else {
							buscarDato(p.hijos[i], dato);
						}

					}
				}
			}

		} else {
			JOptionPane.showMessageDialog(null, "La lista se encuentra vacia", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
		}

	}

	public void eliminarDatoGeneralizado() {
		eliminarDatosGeneralizado(nodoRaiz,"1");

	}

	public void eliminarDatosGeneralizado(NodoGeneral p,String dato) {

		if (p.getDato().equals(dato)) {
			nodoRaiz = cambiarNodo(p);
		} else {
			///
		}

	}
	
	public NodoGeneral cambiarNodo(NodoGeneral p) {
		NodoGeneral aux = null;
		aux =  p.hijos[0];
		NodoGeneral auxHijos[] = new NodoGeneral[aux.noHijos];		
		if (aux.noHijos > 0) {
			for (int j = 0; j < aux.noHijos; j++) {
				auxHijos[j] = aux.hijos[j];
			}
		}
		
		aux.hijos = new NodoGeneral[p.noHijos-1];
		for (int i = 0; i < p.noHijos-1; i++) {
			aux.hijos[i] = p.hijos[i+1];	
		}
		
		if (auxHijos.length >= 0) {
			int contarSubhijos = 0;
			if (aux.hijos[0].hijos == null) {				
				aux.hijos[0].hijos = new NodoGeneral[auxHijos.length];
			}else {
				contarSubhijos = aux.hijos[0].hijos.length;
			}
			
			for (int i = 0; i < auxHijos.length; i++) {
				aux.hijos[0].hijos[i + contarSubhijos] = auxHijos[i];		
			}
		}	
		
		aux.noHijos = aux.hijos.length;
		
		return aux;
		
	}
	
	public void insertarArbolGeneral(String dato, String padre) {
		nodoRaiz = insertarArbolGeneralizado(nodoRaiz, dato, padre);
	}

	public NodoGeneral insertarArbolGeneralizado(NodoGeneral nodo, String dato, String padre) {

		if (nodo == null) {
			nodo = new NodoGeneral(dato);
		} else {
			NodoGeneral nuevoNodo = new NodoGeneral(dato);

			if (nodo.getDato().equals(padre)) {
				nodo.ingresarHijo(nuevoNodo);
			} else {
				for (int i = 0; i < nodo.noHijos; i++) {
					if (nodo.hijos[i].getDato().equals(padre)) {
						nodo.hijos[i].ingresarHijo(nuevoNodo);
					} else {
						insertarArbolGeneralizado(nodo.hijos[i], dato, padre);
					}
				}

			}

		}
		return nodo;
	}

	public void mostrarListaGeneralizada(NodoGeneralizado p) {

		NodoGeneralizado q = p;
		while (q != null) {
			if (q.isSw() == 0) {

				JOptionPane.showMessageDialog(null, "El dato es" + q.getDato(), TITLE_MENU, JOptionPane.ERROR_MESSAGE);
			} else {
				mostrarListaGeneralizada(q.getLigaLista());
			}
			q = q.getLiga();
		}

		JOptionPane.showMessageDialog(null, "La lista se encuentra vacia", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarGrado(NodoGeneralizado p, int dato) {

		NodoGeneralizado q = p, aux;
		int cont = 0;

		while (q != null) {
			if (q.isSw() == 0) {
				if (q.getDato() == dato) {
					if (q == p) {
						aux = q.getLiga();
						while (aux != null) {
							cont = cont + 1;
							aux = aux.getLiga();
						}
					}
					JOptionPane.showMessageDialog(null, "El grado del dato " + dato + "es " + cont, TITLE_MENU,
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				mostrarGrado(q.getLigaLista(), dato);
			}
			q = q.getLiga();
		}
		if (cont == 0) {
			JOptionPane.showMessageDialog(null, "El dato no existe ", TITLE_MENU, JOptionPane.ERROR_MESSAGE);
		}
	}

	// Metodo Buscar Dato
	public void buscarDatoG(int dato) {
		NodoGeneralizado p = raizGeneralizada;
		boolean bandera = false;

		while (p != null & bandera == false) {
			if (p.isSw() == 0) {
				if (dato == p.getDato()) {
					bandera = true;
				} else {
					mostrarGrado(p.getLigaLista(), dato);
				}
			} else {
				p = p.getLiga();
			}
		}
		if (bandera == true) {

			JOptionPane.showMessageDialog(null, "El dato buscado existe", TITLE_MENU, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "El dato buscado " + dato + " NO se encontró ", TITLE_MENU,
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
