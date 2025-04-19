public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        System.out.println("Música selecionada: " + nomeDaMusica);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
}
