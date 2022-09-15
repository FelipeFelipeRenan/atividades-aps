import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * EscolheEmpresa
 */
public class EscolheEmpresa {
    public static EmpresaStrategy empresa() {
        try {
            System.out.print("Insira o código da empresa: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            EmpresaStrategy empresa;

            switch (option) {
                case 1:
                    sc.close();
                    return new Pac();

                case 2:
                    sc.close();
                    return new Fedex();

                case 3:
                    sc.close();
                    return new Sedex();

                case 4:
                    sc.close();
                    return new Jadlog();

                default:
                    sc.close();
                    System.out.println("Codigo invalido");
                    break;
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.err.println("Entrada invalida");
        }
        return new EmpresaNull();

    }

}