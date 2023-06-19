package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculators.Classification;

public class Chapter implements Classification {
    private int number;
    private String name;
    private Serie serie;
    private int views;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (this.views > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
