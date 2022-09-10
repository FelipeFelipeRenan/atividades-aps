import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Banco banco = null;

        System.out.print("Digite o código do banco: ");

        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        sc.close();
        
        BancoNull bancoNull= new BancoNull(banco, code);
        BancoC bancoC = new BancoC(bancoNull, code);
        BancoB bancoB = new BancoB(bancoC, code);
        BancoA bancoA = new BancoA(bancoB, code);

        bancoA.pagar(code);
    }
    
}