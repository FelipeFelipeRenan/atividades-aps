/**
 * Diretor
 */
public class Diretor extends Cargo {

    public Diretor(Cargo cargo, double limite) {
        super(cargo, limite);
    }

    @Override
    public void aprovar(double valor) {
        if (valor < 3000) {
            System.out.println("Compra aprovada por: Diretor" );

        } else {

            cargo.aprovar(valor);

        }

    }
}