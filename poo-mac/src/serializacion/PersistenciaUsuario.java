/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;

public class PersistenciaUsuario {
    
    Usuario u; //Clase usuario, objeto u
    
    //Generamos un método para seralizar a nuestro usuario
    
    public void guardar(){
    
        //Primer paso para serializar es generar el archivo físico donde estara 
        //nuestro objeto de tipo Usuario
        File file=new File("Archivaldo.yo");
        
        //Despues lo abrimos para escribir sobre él
        try{
        FileOutputStream fos=new FileOutputStream(file); //Estas clases dentro de java.io.*
        //Luego serializamos
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        //Guardamos nuestro usuario
        oos.writeObject(u);
        
        //Ponemos un mensajito
            System.out.println("Objeto Guardado con Éxito");
        
        }catch(Exception e){
                   
            System.out.println(e.getMessage());
        }
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
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
