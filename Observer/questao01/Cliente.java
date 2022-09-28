public class Cliente implements ConsomeNoticia{
    
    private String nome;
    private String topico;

    public Cliente(String nome, String topico){
        this.nome = nome;
        this.topico = topico;
    }
    


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTopico() {
        return topico;
    }


    public void setTopico(String topico) {
        this.topico = topico;
    }


    @Override
    public String notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
        if(this.topico.equals(topico)){
            System.out.println("\n------------------------------------------------------------------------------------");
            System.out.print("\nNotícia para " + this.nome + ":\n"+ textoNoticia + "\nPostada em: " + dia + "\\" + mes );
        }
        return null;
    }

    
    
}
