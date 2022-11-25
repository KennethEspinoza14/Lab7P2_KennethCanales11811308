
package lab7p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class partido {
    
    private String equipo_local;
    private String equipo_visita;
    private int goles_loc;
    private int goles_vi;
    private int posesion_loc;
    private int posesion_vi;
    private int tiros_tot;
    private int tiros_meta;

    public partido(String equipo_local, String equipo_visita, int goles_loc, int goles_vi, int posesion_loc, int posesion_vi, int tiros_tot, int tiros_meta) {
        this.equipo_local = equipo_local;
        this.equipo_visita = equipo_visita;
        this.goles_loc = goles_loc;
        this.goles_vi = goles_vi;
        this.posesion_loc = posesion_loc;
        this.posesion_vi = posesion_vi;
        this.tiros_tot = tiros_tot;
        this.tiros_meta = tiros_meta;
    }

    public String getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(String equipo_local) {
        this.equipo_local = equipo_local;
    }

    public String getEquipo_visita() {
        return equipo_visita;
    }

    public void setEquipo_visita(String equipo_visita) {
        this.equipo_visita = equipo_visita;
    }

    public int getGoles_loc() {
        return goles_loc;
    }

    public void setGoles_loc(int goles_loc) {
        this.goles_loc = goles_loc;
    }

    public int getGoles_vi() {
        return goles_vi;
    }

    public void setGoles_vi(int goles_vi) {
        this.goles_vi = goles_vi;
    }

    public int getPosesion_loc() {
        return posesion_loc;
    }

    public void setPosesion_loc(int posesion_loc) {
        this.posesion_loc = posesion_loc;
    }

    public int getPosesion_vi() {
        return posesion_vi;
    }

    public void setPosesion_vi(int posesion_vi) {
        this.posesion_vi = posesion_vi;
    }

    public int getTiros_tot() {
        return tiros_tot;
    }

    public void setTiros_tot(int tiros_tot) {
        this.tiros_tot = tiros_tot;
    }

    public int getTiros_meta() {
        return tiros_meta;
    }

    public void setTiros_meta(int tiros_meta) {
        this.tiros_meta = tiros_meta;
    }

    @Override
    public String toString() {
        return "partido{" + "equipo_local=" + equipo_local + ", equipo_visita=" + equipo_visita + ", goles_loc=" + goles_loc + ", goles_vi=" + goles_vi + ", posesion_loc=" + posesion_loc + ", posesion_vi=" + posesion_vi + ", tiros_tot=" + tiros_tot + ", tiros_meta=" + tiros_meta + '}';
    }
    
    
}
