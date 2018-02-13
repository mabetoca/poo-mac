/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliejemplo;

/**
 *
 * @author T-102
 */
public class Mascotas {
    public static void main(String[] args) {
        
        ComportamientoAnimal animales[]=new [10];
        
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
        
        //LA MAGIA DEL POLIMORFISMO
        for(ComportamientoAnimal animal:animales){
        
            System.out.println(animal.hacerRuido());
        }
    }
    
}
