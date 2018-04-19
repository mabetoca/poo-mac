
package ete;


public class Alumno {
    
    private String num_cuenta;
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private String calificacion;

    @Override
    public String toString() {
        return "Alumno{" + "num_cuenta=" + num_cuenta + ", nombre=" + nombre + ", a_paterno=" + a_paterno + ", a_materno=" + a_materno + ", calificacion=" + calificacion + '}';
    }

    public Alumno(String num_cuenta, String nombre, String a_paterno, String a_materno, String calificacion) {
        this.num_cuenta = num_cuenta;
        this.nombre = nombre;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.calificacion = calificacion;
    }

    public Alumno() {
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_paterno() {
        return a_paterno;
    }

    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    public String getA_materno() {
        return a_materno;
    }

    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

   
    
    
}
