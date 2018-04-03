
package threads1;


public class TerceraForma {
    
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable(){  //Runnable Contiene una implementación abstracta del método run()
            
        //*********ESTO ES LA CLASE INTERNA ANÓNIMA************
            public void run(){
            
                System.out.println("Yo soy un Thread Bueno");
            } //Se cierra el método Run
        }   //Se cierra la clase interna anónima
        );  //Se cierra el constructor
        
        //Aqui estamos en el main()
    
        t1.start();
    }
    
}
