/**
 * Gerente
 */
public class Gerente extends Cargo {

    public Gerente(Cargo cargo, double limite) {
        super(cargo, limite);
    }

    @Override
    public void aprovar(double valor) {
        if (valor < 6000) {
            System.out.println("Compra aprovada por: Gerente" );

        } else {

            cargo.aprovar(valor);

        }

    }
}