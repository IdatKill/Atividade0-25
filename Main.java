public class Main {
    public static void main(String[] args) {
        
        GerenciadorMidiaSocial twitter = new TwitterAdapter(new TwitterApiSimulado());
        GerenciadorMidiaSocial instagram = new InstagramAdapter(new InstagramApiSimulado());
        GerenciadorMidiaSocial linkedIn = new LinkedInAdapter(new LinkedInApiSimulado());
        GerenciadorMidiaSocial tiktok = new TikTokAdapter(new TikTokApiSimulado());

        
        Conteudo conteudo = new Conteudo("Lançamento do novo produto! Confira agora.", "https://imagem.com/produto.jpg");

        
        twitter.publicar(conteudo);
        instagram.publicar(conteudo);
        linkedIn.publicar(conteudo);
        tiktok.publicar(conteudo);
    }
}
