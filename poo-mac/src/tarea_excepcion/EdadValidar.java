
package tarea_excepcion;


public class EdadValidar {
    
     public static void validarEdad(float valor) throws EdadException{
        
        if(valor < 18) throw new EdadException();
    
        
    }
    
}

