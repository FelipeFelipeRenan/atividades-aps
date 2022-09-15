public class EmpresaNull implements EmpresaStrategy {

    @Override
    public double calcularFrete(double valor) {
        System.out.println("Opção invalida, será enviado pela empresa PAC");
        return valor * (1.3);
    }
    
    
}
