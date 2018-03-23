package threads1;

//Primera forma de crear Threads
//Heredando la clase
public class Tareax extends Thread{

    @Override
    public void run() {
        
        System.out.println("Soy un thread muy sencillo"
                + " y me llamo "+Thread.currentThread().getName());
        
    }
      
}
