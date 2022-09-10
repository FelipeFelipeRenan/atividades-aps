public class BancoA extends Banco{

    public BancoA(Banco banco, int code) {
        super(banco, code);
    }

    @Override
    public void pagar(int code) {
        if(code == 789){
            System.out.println("Banco A recebeu o pagamento");
        }
        else{
            banco.pagar(code);
        }
    }


    
    
}
