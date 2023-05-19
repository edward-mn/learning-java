package br.com.alura.screenmatch.challenge.models;

import br.com.alura.screenmatch.challenge.models.Audio;

public class Songs extends Audio {
    private String Album, Singer, musicalGenre;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(String musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    @Override
    public int getClassifications() {
        if (this.getReproductions() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
