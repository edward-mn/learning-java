package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculators.Classification;

public class Movie extends Title implements Classification {
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
    public int getClassification() {
        return (int) getAvarege() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getYearReleased() + ")";
    }
}
