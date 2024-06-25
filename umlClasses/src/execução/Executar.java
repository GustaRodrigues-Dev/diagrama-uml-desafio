package execução;

import implementacoes.Iphone;

public class Executar {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testar as funcionalidades de MusicPlayer
        meuIphone.selecionarMusica("Minha música favorita");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testar as funcionalidades de Phone
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testar as funcionalidades de WebBrowser
        meuIphone.exibirPagina("http://www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
