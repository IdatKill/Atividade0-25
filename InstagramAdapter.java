public class InstagramAdapter implements GerenciadorMidiaSocial {
    private InstagramApiSimulado instagram;

    public InstagramAdapter(InstagramApiSimulado instagram) {
        this.instagram = instagram;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        instagram.postarImagem(conteudo.getTexto(), conteudo.getImagem());
    }
}
