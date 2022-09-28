import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina extends Noticiario{

    List<ConsomeNoticia> clientes = new ArrayList<ConsomeNoticia>();

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		for (ConsomeNoticia cliente : clientes) {
			cliente.notificaNoticia(textoNoticia, dia, mes, topico);
		}
	}
    
}
