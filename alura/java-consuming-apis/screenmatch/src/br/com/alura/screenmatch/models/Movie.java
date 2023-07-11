package br.com.alura.screenmatch.models;

public class Movie extends Title {
    private String director;

    public Movie(String name, int yearReleased) {
        super(name, yearReleased);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getYearReleased() + ")";
    }
}
