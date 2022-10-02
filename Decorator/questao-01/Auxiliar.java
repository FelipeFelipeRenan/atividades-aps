public class Auxiliar extends Cargo{

    public Auxiliar(double salario, String descricao) {
        super(salario, descricao);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return this.salario;
    }

    @Override
    public String mostrarNome() {
        // TODO Auto-generated method stub
        return this.descricao;
    }
    
    
}
