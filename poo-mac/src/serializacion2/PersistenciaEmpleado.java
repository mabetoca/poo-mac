
package serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import poo.mac.Usuario;


public class PersistenciaEmpleado {
    
    ArrayList<Empleado> empleados;
    
    //Constructor de defecto
    public PersistenciaEmpleado(){
    
        empleados=new ArrayList<>();
    }
    
    //Generamos un método para seralizar a nuestro usuario
    
    public void guardar(Empleado e){
        
        
    
        //Primer paso para serializar es generar el archivo físico donde estara 
        //nuestro objeto de tipo Usuario
        File file=new File("Empleados.yo");
        
        if(file.exists()){
        
            empleados=buscarTodos();
        }
        
        //Despues lo abrimos para escribir sobre él
        try{
        FileOutputStream fos=new FileOutputStream(file); //Estas clases dentro de java.io.*
        //Luego serializamos
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        //Guardamos nuestro usuario
        empleados.add(e);
        oos.writeObject(empleados);
        
        //Ponemos un mensajito
            System.out.println("Objeto Guardado con Éxito");
        
        }catch(Exception ex){
                   
            System.out.println(ex.getMessage());
        }
    }

    
    
    public ArrayList<Empleado> buscarTodos(){
    
        File file=new File("Empleados.yo");
        
        try{
        
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            empleados=(ArrayList < Empleado >)ois.readObject();
        }catch(Exception e){
            
            
        }
         return empleados;       
    }

    
    
    public Usuario recobrarUsuario(){
    
        File file=new File("Archivaldo.yo");
        Usuario recobrado=null;
        
        //Proceso inverso
        try{
            
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        recobrado=(Usuario) ois.readObject();
        
        }catch(Exception e){
        
        }    
    
    return recobrado;
}
    
}
