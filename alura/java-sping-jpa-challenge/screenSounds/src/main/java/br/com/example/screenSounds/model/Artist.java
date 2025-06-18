package br.com.example.screenSounds.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "artists")
@Getter
@Setter
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private ArtistType type;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Songs> songs = new java.util.ArrayList<>();

    public Artist() { }

    public Artist(String artistName, ArtistType artistType) {
        this.name = artistName;
        this.type = artistType;
    }

    @Override
    public String toString() {
        return "Artist: '" + name + '\'' +
                ", Type: " + type +
                ", Songs: " + songs;
    }
}
