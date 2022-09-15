import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do produto: ");

        double valor = sc.nextDouble();

        DescontoStrategy desconto = EscolherDesconto.desconto();
        System.out.println("O desconto do seu produto será de: " + desconto.calcularDesconto(valor));
        
        sc.close();
    }
}