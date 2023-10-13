public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        System.out.println("Iniciando o reprodutor musical");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
        System.out.println("Fechando o reprodutor musical \n");


        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        System.out.println("Iniciando o aparelho telefonico");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioDeVoz();
        System.out.println("Fechando o telefone \n");

        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();
        System.out.println("Iniciando o navegador de Internet");
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();
        navegadorNaInternet.ExibirPagina();
        System.out.println("Fechando o navegador de Internet");


    }
}
