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
    
    private long cuenta;
    private String nombre;
    private String paterno;
    private String materno;
    private Examen examen;

    public Alumno(long cuenta, String nombre, String paterno, String materno, Examen examen) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.examen = examen;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
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
