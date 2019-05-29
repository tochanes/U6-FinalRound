package src;

public class Profesor {
    
    private int clave;
    private String nombre;
    private String titulo;
    private String departamento;
    private int horas;
    
    public Profesor(){}
    
    public Profesor(int clave, String nombre, String titulo, String departamento, int horas) {
        this.clave = clave;
        this.nombre = nombre;
        this.titulo = titulo;
        this.departamento = departamento;
        this.horas = horas;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
}
