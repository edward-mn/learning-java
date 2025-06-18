package br.com.example.screenSounds.repository;

import br.com.example.screenSounds.model.Artist;
import br.com.example.screenSounds.model.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByNameContainingIgnoreCase(String songName);

    @Query("SELECT s FROM Artist a JOIN a.songs s WHERE a.name ILIKE %:artistName%")
    List<Songs> searchSongsByArtistName(String artistName);
}
