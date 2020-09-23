package proyectoarbolesbb;

/**
 * @author leon.chanci
 */
public class NodoBB {
    
    //Atributo
    String nombre;
    int cedula;
    int edad;
    NodoBB ligaIzquierda;
    NodoBB ligaDerecha;
    
    //Método Constructor
    public NodoBB(String nombre, int cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        ligaIzquierda = null;
        ligaDerecha = null;
    }
    
    //Métodos Geters And Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NodoBB getLigaIzquierda() {
        return ligaIzquierda;
    }

    public void setLigaIzquierda(NodoBB ligaIzquierda) {
        this.ligaIzquierda = ligaIzquierda;
    }

    public NodoBB getLigaDerecha() {
        return ligaDerecha;
    }

    public void setLigaDerecha(NodoBB ligaDerecha) {
        this.ligaDerecha = ligaDerecha;
    }
    
}

