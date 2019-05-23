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
        }catch(EOFException e){}
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); 
        }
        finally {
            try{
                if(raf != null)
                    raf.close();
            }catch(IOException e){
                System.out.println("Error: " + e.getMessage());
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
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
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
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
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
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(raf != null)
                    raf.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
