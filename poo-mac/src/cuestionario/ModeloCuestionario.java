/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.*;

public class ModeloCuestionario {
    
    ArrayList<Pregunta> preguntas;
    
    public ModeloCuestionario(){
    
        //Aquí generaremos el cuestionario
        preguntas=new ArrayList<>();
        
    }
    
    public void agregarPregunta(Pregunta p){
    
        preguntas.add(p);
    }
    
    public ArrayList<Pregunta> obtenerCuestionario(){
    
        return preguntas;
    }
}
