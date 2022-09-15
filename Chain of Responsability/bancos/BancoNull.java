public class BancoNull extends Banco{

    public BancoNull(Banco banco, int code) {
        super(banco, code);
    }

    @Override
    public void pagar(int code) {
        if(code != 123 || code != 456 || code != 789 ){
            System.out.println("Código de banco inválido!");
        }
        else{
            banco.pagar(code);
        }
        
    }
    

    
}
