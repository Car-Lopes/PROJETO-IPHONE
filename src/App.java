public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
       
        iphone.setModelo("iPhone 15 Pro Max");
        System.out.println("Modelo: " + iphone.getModelo());
        System.out.println("'------------------------'");

        iphone.selecionarMusica("Música 1");
        iphone.tocarMusica();
        iphone.pausarMusica();
        
        System.out.println("'------------------------'");
        iphone.fazerChamada("123456789");
        iphone.atenderChamada();
        iphone.iniciarCorreioDeVoz();

        System.out.println("'------------------------'");
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
