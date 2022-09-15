/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int valor = 123;
        EmpresaStrategy empresa = EscolheEmpresa.empresa();
        System.out.println("O valor da entrega é: " + empresa.calcularFrete(valor) );
    }
}