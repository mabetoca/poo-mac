
package ete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import poo.mac.Usuario;
import serializacion2.Empleado;


public class PersistenciaAlumno {
    
     ArrayList<Alumno> alumnos;
    
    //Constructor de defecto
    public PersistenciaAlumno(){
    
        alumnos=new ArrayList<>();
    }
    
    //Generamos un método para seralizar a nuestro usuario
    
    public void guardar(Alumno e){
        
        
    
        //Primer paso para serializar es generar el archivo físico donde estara 
        //nuestro objeto de tipo Usuario
        File file=new File("Alumno.yo");
        
        if(file.exists()){
        
            alumnos=buscarTodos();
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
    }

    
    
    public ArrayList<Alumno> buscarTodos(){
    
        File file=new File("Alumno.yo");
        
        try{
        
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            alumnos=(ArrayList < Alumno >)ois.readObject();
        }catch(Exception e){
            
            
        }
         return alumnos;       
    }

    
    
    public Alumno recobrarAlumno(){
    
        File file=new File("Alumno.yo");
        Alumno recobrado=null;
        
        //Proceso inverso
        try{
            
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        recobrado=(Alumno) ois.readObject();
        
        }catch(Exception e){
        
        }    
    
    return recobrado;
}
    
}

