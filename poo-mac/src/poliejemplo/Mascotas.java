/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

import java.util.*;
/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
        
        Animal animales[]=new Animal[12];
        
        //Primero generamos a los gatos
        animales[0]=new Gato();
        animales[1]=new Gato();
        animales[2]=new Gato();
        
        //Generamos los perros
        animales[3]=new Perro();
        animales[4]=new Perro();
        
        //Generamos los pollos
        animales[5]=new Pollo();
        animales[6]=new Pollo();
        animales[7]=new Pollo();
        animales[8]=new Pollo();
        animales[9]=new Pollo();
        
        //Generamos Ratones
        animales[10]=new Raton();
        animales[11]=new Raton();
        
        ServicioAnimales s=new ServicioAnimales();
        
        //LA MAGIA DEL POLIMORFISMO
        for(Animal a:animales){
        
            s.servicioHacerRuido((ComportamientoAnimal)a);
        }
        
        //VAMOS A GENERAR UN ARRAYLIST Y PONER ALLI ALGUNOS ANIMALES
        ArrayList<Animal> animalitos=new ArrayList<>(); //ARREGLO GENÉRICO
        
        animalitos.add(new Pollo()); //CREACIÓN DE OBJETOS DE FORMA ANÓNIMA
        
        animalitos.add(new Raton());
        
        animalitos.add(new Perro());
        
        animalitos.add(new Gato());
        
        animalitos.add(new Perro());
        
        for(Animal a:animalitos){
        
            s.servicioHacerRuido((ComportamientoAnimal)a);
        }
        
        animalitos.get(0).setEdad(1);
            System.out.println(animalitos.get(0).getEdad());
            
    }
    
}
