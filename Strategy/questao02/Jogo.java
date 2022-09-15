public class Jogo implements DescontoStrategy{
    private boolean digital;

    

    public Jogo(boolean digital) {
        this.digital = digital;
    }

    @Override
    public double calcularDesconto(double valor) {
        // TODO Auto-generated method stu
        return valor * 0.30 ;
    }

    @Override
    public boolean ehDigital() {
        // TODO Auto-generated method stub
        return this.digital;
    }

    
    
    
}
