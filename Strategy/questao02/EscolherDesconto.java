import java.util.InputMismatchException;
import java.util.Scanner;

public class EscolherDesconto {

    public static DescontoStrategy desconto() {
        try {
            System.out.print("Insira o item desejado: ");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            // sc.next();

            boolean digital;
            System.out.print("Insira se o produto é fisico ou digital: ");
            int tipo = sc.nextInt();
            if (tipo >= 1) {
                digital = true;
            } else {
                digital = false;
            }

            sc.close();

            switch (opt) {
                case 1:

                    return new Livro(digital);

                case 2:
                    return new Revista(digital);

                case 3:
                    return new Jogo(digital);

                case 4:
                    return new JogoVideogame(digital);

                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Produto invalido");
        }

        return new ProdutoNull();

    }

}
