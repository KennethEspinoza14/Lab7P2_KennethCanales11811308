
package lab7p2_kennethespinoza;

import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class seleccion {
    private String nombre;
    private int partidos_jug;
    private int partidos_ganados;
    private int partidos_perdidos;
    private int partidos_empatados;
    private int goles_favor;
    private int goles_enContra;
    private int diferencia_goles;
    ArrayList <jugador> jugadores = new ArrayList();

    public seleccion(String nombre, int partidos_jug, int partidos_ganados, int partidos_perdidos, int partidos_empatados, int goles_favor, int goles_enContra, int diferencia_goles) {
        this.nombre = nombre;
        this.partidos_jug = partidos_jug;
        this.partidos_ganados = partidos_ganados;
        this.partidos_perdidos = partidos_perdidos;
        this.partidos_empatados = partidos_empatados;
        this.goles_favor = goles_favor;
        this.goles_enContra = goles_enContra;
        this.diferencia_goles = diferencia_goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidos_jug() {
        return partidos_jug;
    }

    public void setPartidos_jug(int partidos_jug) {
        this.partidos_jug = partidos_jug;
    }

    public int getPartidos_ganados() {
        return partidos_ganados;
    }

    public void setPartidos_ganados(int partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }

    public int getPartidos_perdidos() {
        return partidos_perdidos;
    }

    public void setPartidos_perdidos(int partidos_perdidos) {
        this.partidos_perdidos = partidos_perdidos;
    }

    public int getPartidos_empatados() {
        return partidos_empatados;
    }

    public void setPartidos_empatados(int partidos_empatados) {
        this.partidos_empatados = partidos_empatados;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(int goles_favor) {
        this.goles_favor = goles_favor;
    }

    public int getGoles_enContra() {
        return goles_enContra;
    }

    public void setGoles_enContra(int goles_enContra) {
        this.goles_enContra = goles_enContra;
    }

    public int getDiferencia_goles() {
        return diferencia_goles;
    }

    public void setDiferencia_goles(int diferencia_goles) {
        this.diferencia_goles = diferencia_goles;
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "seleccion{" + "nombre=" + nombre + ", partidos_jug=" + partidos_jug + ", partidos_ganados=" + partidos_ganados + ", partidos_perdidos=" + partidos_perdidos + ", partidos_empatados=" + partidos_empatados + ", goles_favor=" + goles_favor + ", goles_enContra=" + goles_enContra + ", diferencia_goles=" + diferencia_goles + ", jugadores=" + jugadores + '}';
    }
       
}
