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
public class Alumno implements Serializable{
    
    private String cuenta;
    private String nombre;
    private String paterno;
    private String materno;
    private Examen examen;

    @Override
    public String toString() {
        return "Alumno{" + "cuenta=" + cuenta + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", examen=" + examen + '}';
    }

    public Alumno(String cuenta, String nombre, String paterno, String materno, Examen examen) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.examen = examen;
    }

    public Alumno() {
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    
    
}
