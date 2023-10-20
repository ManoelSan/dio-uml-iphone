package navegadorNaInternet;

public class NavegadorInternetImpl implements Navegador {

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Nova Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}