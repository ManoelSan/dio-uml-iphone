//package org.iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import aparelhoTelefonico.AparelhoTelefonicoImpl;
import navegadorNaInternet.Navegador;
import navegadorNaInternet.NavegadorInternetImpl;
import reprodutorMusical.ReprodutorMusical;
import reprodutorMusical.ReprodutorMusicalImpl;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        Navegador navegador = new NavegadorInternetImpl();

        // Exemplos
        reprodutor.tocar();
        telefone.ligar();
        navegador.exibirPagina();
    }
}