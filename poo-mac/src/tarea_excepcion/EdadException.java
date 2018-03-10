
package tarea_excepcion;


public class EdadException extends Exception{
    
    public EdadException(){
    
    super("No se pueden ingresar edades menores a 18 años");
}
}

