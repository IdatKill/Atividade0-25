# Sistema Unificado de Mídias Sociais (Adapter)

Este projeto integra diferentes redes sociais através de uma interface unificada utilizando o **padrão Adapter**.  
As plataformas simuladas são: Instagram, Twitter, LinkedIn e TikTok.

## Objetivo
Criar um sistema capaz de publicar conteúdo, listar postagens e obter estatísticas de várias redes sociais usando sempre o mesmo formato, independente da API de cada plataforma.

## Arquitetura
- **APIs Simuladas:** representam as plataformas com métodos diferentes.  
- **Adapters:** convertem cada API para a interface comum `AdapterMidiaSocial`.  
- **GerenciadorMidiaSocial:** usa qualquer adapter para realizar operações unificadas.  
- **Modelos:** `Conteudo`, `Publicacao`, `Estatisticas`.

## Padrão Utilizado
### ➤ Adapter  
Permite integrar APIs heterogêneas em uma interface única e reutilizável.

## Diagrama de Classes
```mermaid
classDiagram
    class AdapterMidiaSocial {
        <<interface>>
        +publicar(Conteudo)
        +listarPublicacoes()
        +obterEstatisticas(id)
    }

    class GerenciadorMidiaSocial {
        -AdapterMidiaSocial adapter
        +publicar()
        +listarPublicacoes()
        +obterEstatisticas()
    }

    AdapterMidiaSocial <|.. InstagramAdapter
    AdapterMidiaSocial <|.. TwitterAdapter
    AdapterMidiaSocial <|.. LinkedInAdapter
    AdapterMidiaSocial <|.. TikTokAdapter
