import java.util.Scanner;

public class EscolheSabor {
    public static SaborStrategy sabor(){
        System.out.print("Escolha um sabor: \n [1] Baunilha\n [2] Chocolate\n [3] Laranja\n [4] Limão");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        sc.close();

        switch (opt) {
            case 1:
                
                return new Baunilha();

            case 2:
                return new Chocolate();
            case 3:
                return new Laranja();

            case 4:
                return new Limao();
            default:
                return null;
                
        }
    }
}
