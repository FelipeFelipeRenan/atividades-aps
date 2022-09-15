/**
 * Presidente
 */
public class Presidente extends Cargo {

    public Presidente(Cargo cargo, double limite) {
        super(cargo, limite);
    }

    @Override
    public void aprovar(double valor) {
        if (valor < 12000) {
            System.out.println("Compra aprovada por: Presidente");

        } else {

            cargo.aprovar(valor);

        }

    }
}