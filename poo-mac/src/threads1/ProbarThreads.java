
package threads1;

//Segunda forma de crear thread

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

//Implementando interface Runnable

public class ProbarThreads implements Runnable{
    
    public static void main(String[] args) {
        
        //1. Creamos el thread
        Tareax t1=new Tareax();
        Tareax t2=new Tareax();
        
        
        //***********SEGUNDA FORMA***************
        Runnable r=new ProbarThreads();
        Thread t3=new Thread(r);
        
        //******** TERCERA FORMA ******
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                
            }
        });
        
        
        
               
        //2. Inicializar
        t1.setName("Sparky");
        t2.setName("Betún");
        t1.start();
        t2.start();
        
        t3.start();
        
        
        //3. En ejecucion lo da JVM decide
        
        //4. Pausa no lo vamos a poner, es en caso de que dure un tiempo
        
        
        //5. Su muerte es cuando termina el proceso
        
        
        
    }
    
    //SEGUNDA FORMA THREADS
    @Override
    public void run() {
        
        //Hacemos otra cosa
        
        while(true){
        
        LocalTime tiempo=LocalTime.now();
        int hora=tiempo.getHour();
        int minutos=tiempo.getMinute();
        int segundos=tiempo.getSecond();
        
        System.out.println("La hora es "+hora+":"+minutos+":"+segundos);
        
            try {
                
                //PONEMOS A DORMIR AL THREAD
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
