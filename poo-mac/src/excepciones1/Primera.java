/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;


public class Primera {
    
    public static void main(String[] args) {
        
        //VAMOS A CREAR UN ARREGLO
        int[] valores={2,6,-8,5};
        
        for(int i=0; i<=valores.length;i++){
        
            //System.out.println("valor "+valores[i]);
        }
        
        //ESTA EXCEPCION ES MUY TRUCULENTA
        int x=5;
        int y=0;
        //System.out.println(x/y);  //ArithmeticException
        
        float x2=5;
        int y2=0;
        //System.out.println(x2/y2); //Infinity
        
        
        int z=Integer.parseInt("x");
        System.out.println(z*2);  //NumberFormatException
        
        
        
    }
    
}
