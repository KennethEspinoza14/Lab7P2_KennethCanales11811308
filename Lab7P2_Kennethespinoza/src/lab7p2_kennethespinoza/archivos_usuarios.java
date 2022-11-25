
package lab7p2_kennethespinoza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kenneth
 */
public class archivos_usuarios {
    
    private ArrayList<usuario> listausuarios = new ArrayList();
    private File archivo = null;

    public archivos_usuarios() {
    }

    public archivos_usuarios(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(ArrayList<usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

 @Override
    public String toString() {
        return "listausuarios=" + listausuarios + '}';
    }    
    
    public void setcelular(usuario u) {
        this.listausuarios.add(u);
    }
    
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
       
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (usuario t : listausuarios) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getPass()+ ";"); 
                bw.write(t.getId()+ ";"); 
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
     
       public void cargarArchivo() {
        Scanner sc = null;
        listausuarios = new ArrayList();
        
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                   listausuarios.add(new usuario(sc.next(), sc.next(),sc.nextInt(), false));                  
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
}
