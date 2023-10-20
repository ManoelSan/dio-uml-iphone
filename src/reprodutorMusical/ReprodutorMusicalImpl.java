package reprodutorMusical;


public class ReprodutorMusicalImpl implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocar Música");
    }

    public void pausar() {
        System.out.println("Pausar Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada");
    }
}
