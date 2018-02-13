/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

/**
 *
 * @author MarioAlberto
 */
public class MallardDuck extends Duck{
    
      public MallardDuck() { 
          
          quackBehavior = new Quack(); 
          ﬂyBehavior = new FlyWithWings();
      }
   public void display() { 
       System.out.println("I'm a real Mallard duck");
   } 
}
