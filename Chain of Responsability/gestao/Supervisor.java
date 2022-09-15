/**
 * Supervisor
 */
public class Supervisor extends Cargo {


    

    public Supervisor(Cargo cargo, double limite) {
        super(cargo, limite);
    }

    @Override
    public void aprovar(double valor){

        if(valor < 1000){
            System.out.println("Compra aprovada por: Supervisor" );

        }
        else{

            cargo.aprovar(valor);

        }

    }
}