public class TikTokAdapter implements GerenciadorMidiaSocial {
    private TikTokApiSimulado tikTok;

    public TikTokAdapter(TikTokApiSimulado tikTok) {
        this.tikTok = tikTok;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        
        tikTok.enviarVideo(conteudo.getTexto(), conteudo.getImagem());
    }
}
