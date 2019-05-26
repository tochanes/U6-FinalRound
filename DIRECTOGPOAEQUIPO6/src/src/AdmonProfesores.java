package src;

import java.io.*;
import javax.swing.JOptionPane;

public class AdmonProfesores {
    
    private RandomAccessFile raf;
    private int tamRegistro;

    public AdmonProfesores() {
        raf = null;
        tamRegistro = 114;
    }
    
    public int getCont(){
        int clave, x = 1, cont = 0;
        try{
            raf = new RandomAccessFile("Datos.dat", "rw");
            do{
                raf.seek(x * tamRegistro - tamRegistro);
                clave = raf.readInt();
                
                if(clave != 0)
                    cont++;
                x++;    
            }while(true);
        }catch(EOFException e){}
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try{
                if(raf != null)
                    raf.close();
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
            }
            return cont;
        }
    }
    
    public int getCelda(int clave){
        try {
            raf = new RandomAccessFile("Datos.dat", "rw");
            raf.seek(clave * tamRegistro - tamRegistro);
            int celda = raf.readInt();
            
            if(celda == clave)
                return celda;
        }catch(EOFException e){}
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try{
                if(raf != null)
                    raf.close();
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
            }
        }
        return -1;
    }
    
    public void escribir(Profesor pf){
        try {
            raf = new RandomAccessFile("Datos.dat", "rw");
            raf.seek(pf.getClave() * tamRegistro - tamRegistro);
            raf.writeInt(pf.getClave());
            raf.writeUTF(pf.getNombre());
            raf.writeUTF(pf.getTitulo());
            raf.writeUTF(pf.getDepartamento());
            raf.writeInt(pf.getHoras());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public Profesor getProfesor(int celda){
        Profesor p = null;
        try {
            raf = new RandomAccessFile("Datos.dat", "r");
            raf.seek(celda * tamRegistro - tamRegistro);
            int clave = raf.readInt();
            String nombre = raf.readUTF();
            String titulo = raf.readUTF();
            String departamento = raf.readUTF();
            int horas = raf.readInt();
            p = new Profesor(clave, nombre, titulo, departamento, horas);
        } catch (EOFException e){
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
            }
            return p;
        }    
    }
    
    public void eliminar(Profesor pf){
        try {
            raf = new RandomAccessFile("Datos.dat", "rw");
            raf.seek(pf.getClave() * tamRegistro - tamRegistro);
            raf.writeInt(0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                            "EXCEPCION", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
