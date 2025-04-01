package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.*;
import br.com.alura.screenmatch.repository.SerieRepository;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    private SerieRepository repository;

    private List<DadosSerie> dadosSeries = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();
    private Optional<Serie> serieBuscada;

    public Principal(SerieRepository repository) { this.repository = repository; }

    public void exibeMenu() {
        var opcao = -1; //Enter once

        while (opcao != 0){
            var menu = """
                    1 - Buscar séries
                    2 - Buscar episódios
                    3 - Listar séries buscadas
                    4 - Buscar série por título
                    5 - Buscar série por ator
                    6 - Buscar série por categoria
                    7 - Top 5 séries
                    8 - Rápida maratona
                    9 - Episódio por trecho
                    10 - Top episódios por série
                    11 - Data lançamento episódios
                    
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarSerieWeb();
                    break;
                case 2:
                    buscarEpisodioPorSerie();
                    break;
                case 3:
                    listarSeriesBuscadas();
                    break;
                case 4:
                    buscarSerieTitulo();
                    break;
                case 5:
                    buscarSerieAtor();
                    break;
                case 6:
                    buscarSerieCategoia();
                    break;
                case 7:
                    buscarTopSeries();
                    break;
                case 8:
                    buscarToMaratonarDeliveredQuery();
                    buscarToMaratonarNativeQuery();
                    buscarToMaratonarJPQL();
                    break;
                case 9:
                    buscarEpisodioPorTrecho();
                    break;
                case 10:
                    buscarTopEpisodioPorSerie();
                    break;
                case 11:
                    buscarEpisodioPorData();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void listarSeriesBuscadas() {
        List<Serie> series = repository.findAll();;

//        series = dadosSeries.stream()
//                .map(ds -> new Serie(ds)).collect(Collectors.toList());
//        dadosSeries.forEach(System.out::println);

        series.stream()
                .sorted(Comparator.comparing(Serie::getGenero))
                .forEach(System.out::println);
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        dadosSeries.add(dados);

        Serie serie = new Serie(dados);
        try {
            repository.save(serie);
            System.out.println("Série salva com sucesso!");
        } catch (Exception ex){
            System.out.println("Erro ao salvar série!\n" + ex.getMessage());
        }

        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");

        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        return dados;
    }

    private void buscarEpisodioPorSerie(){
        listarSeriesBuscadas();

        System.out.println("Escolha uma série pelo nome");
        var nomeSerie = leitura.nextLine();

        Optional<Serie> serie = repository.findByTituloContainingIgnoreCase(nomeSerie);

        if(serie.isPresent()) {

            var serieEncontrada = serie.get();
            List<DadosTemporada> temporadas = new ArrayList<>();

            for (int i = 1; i <= serieEncontrada.getTotalTemporadas(); i++) {
                var json = consumo.obterDados(ENDERECO + serieEncontrada.getTitulo().replace(" ", "+") + "&season=" + i + API_KEY);
                DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
                temporadas.add(dadosTemporada);
            }
            temporadas.forEach(System.out::println);

            List<Episodio> episodios = temporadas.stream()
                    .flatMap(d -> d.episodios().stream()
                            .map(e -> new Episodio(d.numero(), e)))
                    .collect(Collectors.toList());

            serieEncontrada.setEpisodios(episodios);
            repository.save(serieEncontrada);
        } else {
            System.out.println("Série não encontrada!");
        }

//        DadosSerie dadosSerie = getDadosSerie();
//        List<DadosTemporada> temporadas = new ArrayList<>();
//
//        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
//            var json = consumo.obterDados(ENDERECO + dadosSerie.titulo().replace(" ", "+") + "&season=" + i + API_KEY);
//            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//            temporadas.add(dadosTemporada);
//        }
//        temporadas.forEach(System.out::println);
    }

    private void buscarSerieTitulo() {
        System.out.println("Escolha uma série pelo nome: ");

        var nomeSerie = leitura.nextLine();
        serieBuscada = repository.findByTituloContainingIgnoreCase(nomeSerie);

        if (serieBuscada.isPresent()){
            listarSeriesBuscadas();
            System.out.println("Dados da série: " + serieBuscada.get());
        } else {
            System.out.println("Série não encontrada");
        }
    }

    private void buscarSerieAtor() {
        System.out.println("Qual o nome para busca?");
        var nomeAtor = leitura.nextLine();

        System.out.println("Qual a nota de corte para busca?");
        var notaAvaliacao = leitura.nextDouble();

        List<Serie> seriesEncontradas = repository.
                findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(nomeAtor, notaAvaliacao);

        System.out.println("Series em que " + nomeAtor + " Trabalhou: ");
        findList(seriesEncontradas);
    }

    private void buscarSerieCategoia() {
        System.out.println("De qual genêro & categoria quer efetuar a busca?");
        var nomeGenero = leitura.nextLine();

        Categoria categoria = Categoria.fromPortuges(nomeGenero);

        List<Serie> seriesCategoria = repository.findByGenero(categoria);

        System.out.println("Genêro & Categoria " + categoria + " da série");

        seriesCategoria.forEach(System.out::println);
    }

    private void buscarTopSeries() {
        List<Serie> topSeries = repository.findTop5ByOrderByAvaliacaoDesc();
        findList(topSeries);
    }

    private static void findList(List<Serie> series) {
        series.forEach(seriesEncontrada ->
                System.out.println(seriesEncontrada.getTitulo()
                        + " | Avaliação: " + seriesEncontrada.getAvaliacao()
                        + " | Temporadas: " + seriesEncontrada.getTotalTemporadas())
        );
    }

    // quantidade temporadas & avaliação 8.5

    private void buscarToMaratonarDeliveredQuery() {
        System.out.println("\n - Delivered Query -");
        System.out.println("Series de quantas temporadas você busca?");
        var quantidadeTemporada = leitura.nextInt();

        System.out.printf("Filter | Temporadas <= %d & Avaliacao >= 8.5\n", quantidadeTemporada);
        List<Serie> seriesMaratonar = repository.
                findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(quantidadeTemporada, 8.5);

        findList(seriesMaratonar);
    }

    private void buscarToMaratonarNativeQuery() {
        System.out.println("\n - Native Query -");
        System.out.println("Filter | Temporadas <= 5 & Avaliacao >= 7.5");
        List<Serie> seriesMaratonar = repository.seriesPorTemporadaAvaliacao();

        findList(seriesMaratonar);
    }

    private void buscarToMaratonarJPQL() {
        System.out.println("\n - JPQL -");
        System.out.println("Series de quantas temporadas você busca?");
        var quantidadeTemporada = leitura.nextInt();

        System.out.println("Qual sua nota de corte para busca por avaliação?");
        var notaAvaliacao = leitura.nextDouble();

        List<Serie> seriesMaratonar = repository.
                findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(quantidadeTemporada, notaAvaliacao);

        findList(seriesMaratonar);
    }

    private void buscarEpisodioPorTrecho() {
        System.out.println("Digite o trecho para efetuar a busca?");
        var trechoEpisodio = leitura.nextLine();

        List<Episodio> episodiosEncontrados = repository.episodiosPorTrecho(trechoEpisodio);

        episodiosEncontrados.forEach(episodio -> {
            System.out.printf("Série: %s | Temporada: %s - Episódio: %s - %s\n",
                    episodio.getSerie().getTitulo(), episodio.getTemporada(),
                    episodio.getNumeroEpisodio(), episodio.getTitulo());
        });
    }

    private void buscarTopEpisodioPorSerie() {
        listarSeriesBuscadas();
        buscarSerieTitulo();

        if (serieBuscada.isPresent()){
            Serie serie = serieBuscada.get();
            List<Episodio> topEpisodios = repository.topEpisodiosSerie(serie);

            topEpisodios.forEach(episodio -> {
                System.out.printf("Série: %s | Temporada: %s - Episódio: %s - %s\n",
                        episodio.getSerie().getTitulo(), episodio.getTemporada(),
                        episodio.getNumeroEpisodio(), episodio.getTitulo());
            });
        };
    }

    private void buscarEpisodioPorData() {
        listarSeriesBuscadas();
        buscarSerieTitulo();

        if (serieBuscada.isPresent()){
            System.out.println("Digite o ano limite de lançamento?");
            var anoLancamento = leitura.nextInt();
            leitura.nextLine();

            Serie serie = serieBuscada.get();
            List<Episodio> episodiosData = repository.episodiosSerieLancamento(serie, anoLancamento);

            episodiosData.forEach(episodio -> {
                System.out.printf("Série: %s | Temporada: %s - Episódio: %s - %s\n",
                        episodio.getSerie().getTitulo(), episodio.getTemporada(),
                        episodio.getNumeroEpisodio(), episodio.getTitulo());
            });
        };
    }
}