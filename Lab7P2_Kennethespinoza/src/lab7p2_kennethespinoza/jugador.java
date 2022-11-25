package lab7p2_kennethespinoza;

import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth
 */
public class jugador {

    private String nombre;
    private int dorsal;
    private int goles;
    private int asistencias;
    private int partidos_jugados;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;
    private int faltas_cometidas;
    private int faltas_recibidas;
    private String posición;
    private int porterias_imbatidas;

    public jugador() {
    }
 
    public jugador(String nombre, int dorsal, int goles, int asistencias, int partidos_jugados, int tarjetas_amarillas, int tarjetas_rojas, int faltas_cometidas, int faltas_recibidas, String posición) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencias = asistencias;
        this.partidos_jugados = partidos_jugados;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.faltas_cometidas = faltas_cometidas;
        this.faltas_recibidas = faltas_recibidas;
        this.posición = posición;
    }

    public jugador(String nombre, int dorsal, int goles, int asistencias, int partidos_jugados, int tarjetas_amarillas, int tarjetas_rojas, int faltas_cometidas, int faltas_recibidas, String posición, int porterias_imbatidas) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencias = asistencias;
        this.partidos_jugados = partidos_jugados;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.faltas_cometidas = faltas_cometidas;
        this.faltas_recibidas = faltas_recibidas;
        this.posición = posición;
        this.porterias_imbatidas = porterias_imbatidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal > 26 || dorsal < 1) {
            JOptionPane.showMessageDialog(null, "El numero debe ser menor que 27 y mayor a 1");
        } else {
            this.dorsal = dorsal;
        }
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(int partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public int getFaltas_cometidas() {
        return faltas_cometidas;
    }

    public void setFaltas_cometidas(int faltas_cometidas) {
        this.faltas_cometidas = faltas_cometidas;
    }

    public int getFaltas_recibidas() {
        return faltas_recibidas;
    }

    public void setFaltas_recibidas(int faltas_recibidas) {
        this.faltas_recibidas = faltas_recibidas;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getPorterias_imbatidas() {
        return porterias_imbatidas;
    }

    public void setPorterias_imbatidas(int porterias_imbatidas) {
        this.porterias_imbatidas = porterias_imbatidas;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", goles=" + goles + ", asistencias=" + asistencias + ", partidos_jugados=" + partidos_jugados + ", tarjetas_amarillas=" + tarjetas_amarillas + ", tarjetas_rojas=" + tarjetas_rojas + ", faltas_cometidas=" + faltas_cometidas + ", faltas_recibidas=" + faltas_recibidas + ", posici\u00f3n=" + posición + ", porterias_imbatidas=" + porterias_imbatidas + '}';
    }

    
}
