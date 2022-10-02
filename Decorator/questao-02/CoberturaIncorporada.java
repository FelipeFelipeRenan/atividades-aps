public abstract class CoberturaIncorporada extends Cobertura {

    protected Cobertura cobertura;

    public CoberturaIncorporada(String nome, double valor) {
        super(nome, valor);
    }


    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    

}
