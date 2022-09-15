public abstract class Cargo {
   
   
    protected Cargo cargo;
    private double limite;
 
    public Cargo(Cargo cargo, double limite) {
        this.limite = limite;
    }

    public abstract void aprovar(double valor);

    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    

}
