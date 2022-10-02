public abstract class Incorporado extends Cargo {
    protected Cargo cargo;

    public Incorporado(double salario, String descricao){
        super(salario, descricao);

    }

    public void setIncorporacao(Cargo cargo){
        this.cargo = cargo;
    }
}
