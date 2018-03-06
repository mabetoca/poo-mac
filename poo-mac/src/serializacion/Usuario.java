
package serializacion;

import java.io.*;

public class Usuario implements Serializable{
    
    private int edad;
    private String nombre;

    public Usuario(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
