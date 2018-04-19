/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etebien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class PersistenciaAlumno {
    
    ArrayList<Alumno> alumnos;
    
    public PersistenciaAlumno(){
    
        alumnos=new ArrayList<>();
    }
    
    public ArrayList<Alumno> leerTodos(){
    
        File file=new File("alumnos");
        
        try{
        
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            //leemos lo guardado
            alumnos=(ArrayList<Alumno>)ois.readObject();
        }catch(Exception e){
        
            System.out.println("Esto ocurrio"+e.getMessage());
        }
        return alumnos;
    }

    //Guardar
    public void guardar(Alumno e){
    
        File file=new File("Alumno.yo");
        
        if(file.exists()){
        
            alumnos=leerTodos();
        }
        
        //Despues lo abrimos para escribir sobre él
        try{
        FileOutputStream fos=new FileOutputStream(file); //Estas clases dentro de java.io.*
        //Luego serializamos
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        //Guardamos nuestro usuario
        alumnos.add(e);
        oos.writeObject(alumnos);
        
        //Ponemos un mensajito
            System.out.println("Alumno Guardado con Éxito");
        
        }catch(Exception ex){
                   
            System.out.println(ex.getMessage());
        }

}}
