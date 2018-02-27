
package poo.mac;

public class ValidarCantidades {
    
    public static void validarValorNegativo(float valor) throws NumeroNegativoException{
        
        if(valor < 0) throw new NumeroNegativoException();
    
        
    }
    
}
