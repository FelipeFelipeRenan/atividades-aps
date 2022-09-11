public class jadlog implements EmpresaStrategy{

    @Override
    public double calcularFrete( double valor) {
        return valor * (1.5);
    }   
}
