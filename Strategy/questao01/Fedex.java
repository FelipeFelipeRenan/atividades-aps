public class Fedex implements EmpresaStrategy{

    @Override
    public double calcularFrete( double valor) {
        
        return valor * (1.2);
    }
    
}
