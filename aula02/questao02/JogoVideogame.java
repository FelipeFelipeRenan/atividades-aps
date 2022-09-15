public class JogoVideogame implements DescontoStrategy{

    private boolean digital;

    

    public JogoVideogame(boolean digital) {
        this.digital = digital;
    }

    @Override
    public double calcularDesconto(double valor) {
        
        return valor;
    }

    @Override
    public boolean ehDigital() {
        
        return this.digital;
    }
    
    
}
