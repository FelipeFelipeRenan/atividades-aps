public abstract class Cobertura {
    protected String nome;
    protected double valor;

    public Cobertura(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;

    }

    public abstract double calcularValor();

    public abstract String mostrarNome();

}
