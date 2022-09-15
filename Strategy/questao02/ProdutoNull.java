public class ProdutoNull implements DescontoStrategy{

    @Override
    public double calcularDesconto(double valor) {
    
        return 0;
    }

    @Override
    public boolean ehDigital() {
        // TODO Auto-generated method stub
        return false;
    }
    
    
    
}
