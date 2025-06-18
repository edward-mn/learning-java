package br.com.example.screenSounds.main;

import br.com.example.screenSounds.model.Artist;
import br.com.example.screenSounds.model.ArtistType;
import br.com.example.screenSounds.model.Songs;
import br.com.example.screenSounds.repository.ArtistRepository;
import br.com.example.screenSounds.service.SearchGPT;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private final ArtistRepository repository;
    private Scanner input = new Scanner(System.in);

    public Main(ArtistRepository repository) {
        this.repository = repository;
    }

    public void showMenu() {
        var option = -1;

        while (option!= 9) {
            var menu = """
                    *** Screen Sound Songs ***
                    
                    1- Register artists
                    2- Register songs
                    3- List songs
                    4- Search songs by artist
                    5- Search data about an artist
            
                    9 - Exit
                    """;

            System.out.println(menu);
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    createArtist();
                    break;
                case 2:
                    createMusic();
                    break;
                case 3:
                    listSongs();
                    break;
                case 4:
                    searchSongsByArtist();
                    break;
                case 5:
                    searchDataArtist();
                    break;
                case 9:
                    System.out.println("Closing the application!");
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }

    private void searchDataArtist() {
        System.out.println("Search more about an artist? (Enter the name of the artist): ");
        var artistName = input.nextLine();

        System.out.println(SearchGPT.getInformation(artistName));
    }

    private void searchSongsByArtist() {
        System.out.println("Enter the name of the artist to search for songs: ");
        var artistName = input.nextLine();

        List<Songs> songs = repository.searchSongsByArtistName(artistName);
        songs.forEach(System.out::println);
    }

    private void listSongs() {
        List<Artist> artists = repository.findAll();
        artists.forEach(artist -> artist.getSongs().forEach(song -> {;
            System.out.println("Artist: " + artist.getName() + ", Song: " + song.getTitle());
        }));
    }

    private void createMusic() {
        System.out.println("Enter the artist for the song:");
        var songName = input.nextLine();

        Optional<Artist> artist = repository.findByNameContainingIgnoreCase(songName);

        if (artist.isPresent()) {
            System.out.println("Artist found: " + artist.get());

            System.out.println("Enter the name of the song:");
            var songTitle = input.nextLine();

            Songs songs = new Songs(songTitle);
            songs.setArtist(artist.get());
            artist.get().getSongs().add(songs);

            repository.save(artist.get());
        } else {
            System.out.println("Artist not found. Please register the artist first.");
        }
    }

    private void createArtist() {
        var newUser = "Y";

        while (newUser.equalsIgnoreCase("y")){
            System.out.println("Type the name of the artist: ");
            var artistName = input.nextLine();

            System.out.println("Type the genre of the artist: (solo, duo or band)");
            var artistType = ArtistType.valueOf(input.nextLine());

            Artist artist = new Artist(artistName, artistType);
            repository.save(artist);

            System.out.println("Artist registered successfully!");

            System.out.println("Would you like to register another artist? (Y/N)");
            newUser = input.nextLine().toUpperCase();
        }
    }
}
