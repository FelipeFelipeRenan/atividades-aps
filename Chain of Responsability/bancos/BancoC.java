public class BancoC extends Banco{

    public BancoC(Banco banco, int code) {
        super(banco, code);
    }

    @Override
    public void pagar(int code) {
        
        if(code == 123){
            System.out.println("Banco C recebeu o pagamento");
        }
        else{
            banco.pagar(code);
        }
        
    }
    


    
}
