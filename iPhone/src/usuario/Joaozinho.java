package usuario;

import dispositivo.iPhone;

public class Joaozinho {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone();

        System.out.println("Vou demonstrar as novas tecnologias do iPhone");

        System.out.println("Funções de Telefone");
        iPhone.atender();
        iPhone.ligar("3344565677");
        iPhone.iniciarCorreioVoz();

        System.out.println("Funções de Música");
        iPhone.selecionarMusica("MusicaDeTeste1.mp3");
        iPhone.tocar();
        iPhone.pausar();

        System.out.println("Funções de Internet");
        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("www.google.com");
        iPhone.atualizarPagina();
    }
}
