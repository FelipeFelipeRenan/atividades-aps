
public class Reitor extends Incorporado {
    public Reitor(double salario, String descricao) {
        super(salario, descricao);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return this.salario + 3000;
    }

    @Override
    public String mostrarNome() {
        // TODO Auto-generated method stub
        return this.descricao;
    }
}
