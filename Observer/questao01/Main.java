public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Felipe", "tecnologia");
        Cliente cliente2 = new Cliente("Lilian", "greve");
        Cliente cliente3 = new Cliente("Chalet", "greve");
		Cliente cliente4 = new Cliente("Kelle", "livro");
		Cliente cliente5 = new Cliente("Uesli", "livro");
		Cliente cliente6 = new Cliente("Natalia", "tecnologia");
        Cliente cliente7 = new Cliente("dougras", "inovação");
        Cliente cliente8 = new Cliente("Toin", "inovação");
		// Cliente cliente7 = new Cliente();
		NoticiarioAssina noticiario = new NoticiarioAssina();
		
		noticiario.addCliente(cliente1);
		noticiario.addCliente(cliente2);
		noticiario.addCliente(cliente3);
		noticiario.addCliente(cliente4);
		noticiario.addCliente(cliente5);
		noticiario.addCliente(cliente6);
        noticiario.addCliente(cliente7);
		noticiario.addCliente(cliente8);
		
		noticiario.notificaNoticia("Policia Inicia greve", 23, 5, "greve");
		noticiario.notificaNoticia("Professores nao vao trabalhar", 10, 5, "greve");
		noticiario.notificaNoticia("Vagas disponiveis", 5, 10, "tecnologia");
		noticiario.notificaNoticia("A Biblia 2", 10, 10, "livro");
		noticiario.notificaNoticia("Machado de Assis: uma historia", 1, 1, "livro");
        noticiario.notificaNoticia("Poetas Russos tristes", 22, 9, "livro");
        noticiario.notificaNoticia("Receitas", 2, 2, "livro");

    }
}