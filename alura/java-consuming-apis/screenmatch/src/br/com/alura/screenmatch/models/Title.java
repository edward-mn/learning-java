package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exceptions.ConvertionYearException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    private String name;
    private int yearReleased;
    private boolean includedPlan;
    private double rating;
    private int totalRating;
    private int movieInMinutes;

    public Title(String name, int yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if(myTitleOmdb.year().length() > 4){
            throw new ConvertionYearException("Is no possible to set a year, because year has more than 4 character");
        }
        this.yearReleased = Integer. valueOf(myTitleOmdb.year());
        this.movieInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 2));
    }

    @Override
    public String toString() {
        return "{Name = " + name + ", Year Released = " + yearReleased + ", Movie's duration = " + movieInMinutes + " }";
    }

    @Override
    public int compareTo(Title anoterTitle) {
        return this.getName().compareTo(anoterTitle.getName());
    }

    public void showDatasheet(){
        System.out.println("Movie's info: ");
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.yearReleased);
    }

    public void rateMovie(double score){
        this.rating += score;
        totalRating++;
    }

    public double getAvarege(){
        return this.rating / this.totalRating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public int getMovieInMinutes() {
        return movieInMinutes;
    }

    public void setMovieInMinutes(int movieInMinutes) {
        this.movieInMinutes = movieInMinutes;
    }

}
