package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Game of Thrones", 2013);
        myMovie.rateMovie(9.0);
        Movie otherMovie = new Movie("Toy Story", 2001);
        otherMovie.rateMovie(5.0);
        var aluraMovie = new Movie("Dog Ville", 2003);
        aluraMovie.rateMovie(10.0);
        Serie lost = new Serie("Lost", 2011);
        lost.rateMovie(7.0);
        var theMovie = new Movie("Avatar", 2010);
        aluraMovie.rateMovie(10.0);

        List<Title> list = new ArrayList<>();
        list.add(aluraMovie);
        list.add(myMovie);
        list.add(otherMovie);
        list.add(lost);
        list.add(theMovie);

//        nomes.forEach(System.out::println);

        for (Title item: list) {
            System.out.println(item);
            if (item instanceof Movie movie) {
                System.out.println("Classification " + movie.getClassification());
            }
        }

        ArrayList<String> artistSearching = new ArrayList<>();
        artistSearching.add("Adan Sandler");
        artistSearching.add("Paulo");
        artistSearching.add("Jacqueline");
        System.out.println("Before!\n" + artistSearching);

        Collections.sort(artistSearching);
        System.out.println("After!\n" + artistSearching);

        System.out.println("Before!\n" + list);
        Collections.sort(list);
        System.out.println("After!\n" + list);
        list.sort(Comparator.comparing(Title::getYearReleased));
        System.out.println("Year!\n" + list);
    }
}
