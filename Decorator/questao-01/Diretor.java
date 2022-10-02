public class Diretor extends Incorporado{
    public Diretor(double salario, String descricao) {
        super(salario, descricao);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return this.salario + 2500;
    }

    @Override
    public String mostrarNome() {
        // TODO Auto-generated method stub
        return this.descricao;
    }
}
