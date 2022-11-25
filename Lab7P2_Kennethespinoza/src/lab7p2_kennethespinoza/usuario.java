
package lab7p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class usuario {
    private String nombre;
    private String pass;
    private int id;
    private boolean login;

    public usuario(String nombre, String pass, int id, boolean login) {
        this.nombre = nombre;
        this.pass = pass;
        this.id = id;
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", pass=" + pass + ", id=" + id + ", login=" + login + '}';
    }
    
           
    
}
