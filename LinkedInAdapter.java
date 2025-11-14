public class LinkedInAdapter implements GerenciadorMidiaSocial {
    private LinkedInApiSimulado linkedIn;

    public LinkedInAdapter(LinkedInApiSimulado linkedIn) {
        this.linkedIn = linkedIn;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        
        String titulo = conteudo.getTexto().split("\\.")[0];
        linkedIn.criarPost(titulo, conteudo.getTexto());
    }
}
