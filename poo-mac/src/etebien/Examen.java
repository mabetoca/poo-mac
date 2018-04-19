/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etebien;

import java.io.Serializable;

/**
 *
 * @author T-102
 */
public class Examen implements Serializable{
    
    private String nombre;
    private String calificacion;

    @Override
    public String toString() {
        return "Examen{" + "nombre=" + nombre + ", calificacion=" + calificacion + '}';
    }

    public Examen(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public Examen() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    
   
}
