package src;

import java.io.*;
import javax.swing.JOptionPane;

public class AdmonProfesores {
    
    private RandomAccessFile raf;
    private int tamRegistro;

    public AdmonProfesores() {
        raf = null;
        tamRegistro = 50;
    }
    
    public int getCelda(int clave){
        try {
            raf = new RandomAccessFile("Datos.dat", "rw");
            raf.seek(clave * tamRegistro - tamRegistro);
            int celda = raf.readInt();
            
            if(celda == clave)
                return celda;
        } 
        catch(EOFException e){}
        catch (IOException e) {
            
        }
        finally {
            try{
                if(raf != null)
                    raf.close();
            }
            catch(IOException e){
                
            }
        }
        return -1;
    }
    
    public void altas(Profesor pf){
        try {
            raf = new RandomAccessFile("Datos.dat", "rw");
            raf.seek(pf.getClave() * tamRegistro - tamRegistro);
            raf.writeInt(pf.getClave());
            raf.writeUTF(pf.getNombre());
            raf.writeUTF(pf.getTitulo());
            raf.writeUTF(pf.getDepartamento());
            raf.writeInt(pf.getHoras());
        } catch (IOException e) {
            ///////////////////
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
                
            } catch (IOException e) {
                /////////////
            }
        }
    }
    
}
