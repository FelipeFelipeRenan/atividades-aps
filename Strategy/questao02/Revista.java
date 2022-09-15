public class Revista implements DescontoStrategy {
    private boolean digital;

    

    public Revista(boolean digital) {
        this.digital = digital;
    }

    @Override
    public double calcularDesconto(double valor) {
        if(this.ehDigital()){
            return valor * 0.15;

        } 
        return valor * 0.30;
    }

    @Override
    public boolean ehDigital() {
        // TODO Auto-generated method stub
        return this.digital;
    }

    
    
    
}
