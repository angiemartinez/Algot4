package proyectoarbolesbb;

class NodoGeneral {

	String dato;
	int noHijos;
	NodoGeneral hijos[];
	

	public NodoGeneral(String datos) {
		dato = datos;
		this.noHijos = 0;
	}

	public void ingresarHijo(NodoGeneral nodo) {
		
		NodoGeneral hijosAux[];
		
		hijosAux = new NodoGeneral[noHijos + 1];
		
		for (int i = 0; i < this.noHijos; i++) {
			hijosAux[i] = hijos[i];
		}

		hijosAux[this.noHijos] = nodo;
		hijos = hijosAux;
		this.noHijos++;
	}
	
	

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

}
