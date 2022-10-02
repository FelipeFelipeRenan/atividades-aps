/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cargo aux1 = new Auxiliar(3000, "Auxiliar");
		System.out.println(aux1.mostrarNome() + " R$" + aux1.calcularSalario());
		Cargo adj1 = new Adjunto(5000, "Adjunto");
		System.out.println(adj1.mostrarNome() + " R$" + adj1.calcularSalario());
		
		Incorporado coo1 = new Coordenador(0, "Coordenador");
		coo1.setIncorporacao(aux1);
		System.out.println(coo1.mostrarNome() + " R$" + coo1.calcularSalario());
		
		Incorporado dir1 = new Diretor(0, "Diretor");
		dir1.setIncorporacao(adj1);
		System.out.println(dir1.mostrarNome() + " R$" + dir1.calcularSalario());
		
		Incorporado rei1 = new Reitor(0, "Reitor");
		rei1.setIncorporacao(dir1);
		System.out.println(rei1.mostrarNome() + " R$" + rei1.calcularSalario());
    }
}