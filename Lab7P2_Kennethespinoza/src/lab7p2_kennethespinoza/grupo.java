
package lab7p2_kennethespinoza;

import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class grupo {
    private int posicion;
    ArrayList <seleccion> Equipos = new ArrayList();

    public grupo(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<seleccion> getEquipos() {
        return Equipos;
    }

    public void setEquipos(ArrayList<seleccion> Equipos) {
        this.Equipos = Equipos;
    }

    @Override
    public String toString() {
        return "grupo{" + "posicion=" + posicion + ", Equipos=" + Equipos + '}';
    }
    
}
