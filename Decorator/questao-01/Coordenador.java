public class Coordenador extends Incorporado{

    public Coordenador(double salario, String descricao) {
        super(salario, descricao);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return this.salario + 2000;
    }

    @Override
    public String mostrarNome() {
        // TODO Auto-generated method stub
        return this.descricao;
    }
    
    
}
