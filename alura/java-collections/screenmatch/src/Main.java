import br.com.alura.screenmatch.calculators.RecommendationFilter;
import br.com.alura.screenmatch.calculators.TimeCalculator;
import br.com.alura.screenmatch.models.Chapter;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Game of Thrones", 2013);
                myMovie.setMovieInMinutes(196);

        Movie otherMovie = new Movie("Toy Story", 2001);
        otherMovie.setMovieInMinutes(127);

        myMovie.showDatasheet();
        myMovie.rateMovie(8.0);
        myMovie.rateMovie(5.0);
        myMovie.rateMovie(10.0);
        System.out.println(myMovie.getRating());
        System.out.println(myMovie.getTotalRating());
        System.out.println("Avarege Score Movie: " + myMovie.getAvarege());

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        System.out.println(calculator.getTimeTotal());

        calculator.include(otherMovie);
        System.out.println(calculator.getTimeTotal());

        RecommendationFilter recommendedTitles = new RecommendationFilter();
        recommendedTitles.filter(myMovie);

        Serie lost = new Serie("Lost", 2011);

        Chapter chapter = new Chapter();
        chapter.setNumber(1);
        chapter.setSerie(lost);
        chapter.setViews(300);
        recommendedTitles.filter(chapter);

        var aluraMovie = new Movie("Dog Ville", 2003);
        aluraMovie.setMovieInMinutes(200);
        aluraMovie.setTotalRating(10);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(aluraMovie);
        moviesList.add(myMovie);
        moviesList.add(otherMovie);
        System.out.println("List Length = " + moviesList.size());
        System.out.println("First Movie = " + moviesList.get(0).getName());
        System.out.println(moviesList.toString());
    }
}