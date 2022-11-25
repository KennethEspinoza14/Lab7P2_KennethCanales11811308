
package lab7p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class admin extends usuario{
   

    public admin(String nombre, String pass, int id, boolean tipouser) {
        super(nombre, pass, id, tipouser);
    }

    @Override
    public String toString() {
        return "admin{" + '}';
    }
    
    
    
}
