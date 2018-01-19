/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.mac;

/**
 *
 * @author T-102
 */
public class PooMac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //Tenemos que generar antes los objetos de las clases anteriores
        Usuario x=new Usuario();
        x.altura=1.69f;
        x.peso=60f;
        
        Imc algo=new Imc();
        algo.u=x;
        
        //Calculamos el IMC a través de su objeto
        System.out.println(algo.calcular());
        
    }
    
    
}
