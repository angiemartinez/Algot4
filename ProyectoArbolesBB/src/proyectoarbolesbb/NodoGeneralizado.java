package proyectoarbolesbb;

public class NodoGeneralizado {
	
	int sw;
	int dato;
	NodoGeneralizado liga;
	NodoGeneralizado ligaLista;
	
	public NodoGeneralizado(int dato) {
		super();
		this.sw = 0;
		this.dato = dato;
		this.liga = null;
		this.ligaLista = null;
	}

	public int isSw() {
		return sw;
	}

	public void setSw(int sw) {
		this.sw = sw;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoGeneralizado getLiga() {
		return liga;
	}

	public void setLiga(NodoGeneralizado liga) {
		this.liga = liga;
	}

	public NodoGeneralizado getLigaLista() {
		return ligaLista;
	}

	public void setLigaLista(NodoGeneralizado ligaLista) {
		this.ligaLista = ligaLista;
	}	

}
