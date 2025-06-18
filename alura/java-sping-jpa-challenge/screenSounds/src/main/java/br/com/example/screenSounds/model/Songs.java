package br.com.example.screenSounds.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "songs")
@Getter
@Setter
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String title;

    @ManyToOne
    private Artist artist;

    public Songs() { }

    public Songs(String songTitle) {
        this.title = songTitle;
    }

    @Override
    public String toString() {
        return "Song: '" + title + '\'' +
                ", artist: '" + artist.getName();
    }
}
