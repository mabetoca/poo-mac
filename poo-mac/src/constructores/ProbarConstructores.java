/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;
import javax.swing.*;
/**
 *
 * @author T-102
 */
public class ProbarConstructores {
    
    public static void main(String[] args) {
        
       // Alumno a=new Alumno(); //Alumno(); <--Constructor de defecto
        //System.out.println("Tu edad es: "+a.getEdad());
        
        int x=2;
        System.out.println(x);
        
        JFrame v=new JFrame("HOLA");
        v.setSize(400, 200);
        v.setVisible(true);
        
    }
}
