public abstract class Cargo {
    protected double salario;
    protected String descricao;
 
    public Cargo(double salario, String descricao) {
        this.salario = salario;
        this.descricao = descricao;
    }
    
    public abstract double calcularSalario();
    
    public abstract String mostrarNome();

}
