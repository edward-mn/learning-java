package br.com.alura.screenmatch.calculators;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int timeTotal;

    public void include(Title title){
        this.timeTotal += title.getMovieInMinutes();
    }
    public int getTimeTotal() {
        return this.timeTotal;
    }
}
