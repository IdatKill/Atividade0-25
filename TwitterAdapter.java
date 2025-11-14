public class TwitterAdapter implements GerenciadorMidiaSocial {
    private TwitterApiSimulado twitter;

    public TwitterAdapter(TwitterApiSimulado twitter) {
        this.twitter = twitter;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        twitter.postarTweet(conteudo.getTexto());
    }
}
