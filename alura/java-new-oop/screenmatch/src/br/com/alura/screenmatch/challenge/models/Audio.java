package br.com.alura.screenmatch.challenge.models;

public class Audio {
    private String title;
    private int reproductions, likes, classifications;

    public void liked(){
        this.likes++;
    }

    public void reproduce(){
        this.reproductions++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getReproductions() {
        return reproductions;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassifications() {
        return classifications;
    }
}
