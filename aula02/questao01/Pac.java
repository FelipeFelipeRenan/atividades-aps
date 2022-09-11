public class Pac implements EmpresaStrategy{

    @Override
    public double calcularFrete(double valor) {
        return valor * (1.3);

    }


    
    
}
