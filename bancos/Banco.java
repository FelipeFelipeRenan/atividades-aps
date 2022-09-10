public abstract class Banco {
    protected Banco banco;
    private int code;


    public abstract void pagar(int code);



    
    public Banco(Banco banco, int code) {
        this.banco = banco;
        this.code = code;
    }
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    
}
