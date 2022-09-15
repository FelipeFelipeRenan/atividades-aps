public class BancoB extends Banco{

    public BancoB(Banco banco, int code) {
        super(banco, code);
    }

    @Override
    public void pagar(int code ) {
        if(code == 456){
            System.out.println("Banco B recebeu o pagamento");
        }
        else{
            banco.pagar(code);
        }       
    }
    

    
}
