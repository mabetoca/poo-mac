
package serializacion;

import java.io.*;

public class Serializar {
    
    public static void main(String[] args) {
        
        //Primero Generamos un Usuario
        
        Usuario u=new Usuario(20,"Alberto");
        
        //Generamos un modelo de serialización de la clase que serializa
        PersistenciaUsuario p=new PersistenciaUsuario();
        
        //Ajustamos su atributo usuario
        p.setU(u);
        
        //Ahora si comprimimos(serializamos)
        p.guardar();
        
        
    }
    
}
