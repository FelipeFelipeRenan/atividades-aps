import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Cargo suc = null;

        System.out.print("Digite o valor desejado: ");

        Scanner sc = new Scanner(System.in);

        double limite = sc.nextDouble();

        Presidente pres = new Presidente(suc, limite);
        Gerente ger = new Gerente(pres, limite);
        Diretor dir = new Diretor(ger, limite);
        Supervisor sup = new Supervisor(dir, limite);

        sup.setCargo(dir);
        dir.setCargo(ger);
        ger.setCargo(pres);

        sup.aprovar(limite);
        
    }
}