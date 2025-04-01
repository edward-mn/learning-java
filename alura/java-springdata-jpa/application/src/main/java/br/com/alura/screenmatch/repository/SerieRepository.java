package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Categoria;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    // derived query
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, Double avaliacao);

    List<Serie> findTop5ByOrderByAvaliacaoDesc();

    List<Serie> findByGenero(Categoria categoria);

    List<Serie> findByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(int quantidadeTemporada, Double avaliacao);

    @Query(
            value = "SELECT * from series WHERE series.total_temporadas <= 5 AND series.avaliacao >= 7.5",
            nativeQuery = true
    )
    List<Serie> seriesPorTemporadaAvaliacao();

    // JPQL
    @Query("SELECT s from Serie s WHERE s.totalTemporadas <= :quantidadeTemporada AND s.avaliacao >= :avaliacao")
    List<Serie> seriesPorTemporadaAvaliacao(int quantidadeTemporada, Double avaliacao);

    @Query("SELECT e from Serie s JOIN s.episodios e WHERE e.titulo ILIKE %:trechoEpisodio%")
    List<Episodio> episodiosPorTrecho(String trechoEpisodio);

    @Query("SELECT e from Serie s JOIN s.episodios e WHERE s = :serie ORDER BY e.avaliacao DESC LIMIT 5")
    List<Episodio> topEpisodiosSerie(Serie serie);

    @Query("SELECT e from Serie s JOIN s.episodios e WHERE s = :serie AND YEAR(e.dataLancamento) >= :anoLancamento")
    List<Episodio> episodiosSerieLancamento(Serie serie, int anoLancamento);
}
