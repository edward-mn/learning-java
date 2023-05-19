import br.com.alura.screenmatch.calculators.RecommendationFilter;
import br.com.alura.screenmatch.calculators.TimeCalculator;
import br.com.alura.screenmatch.models.Chapter;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Game of Thrones");
        myMovie.setYearReleased(2013);
        myMovie.setMovieInMinutes(196);

        Movie otherMovie = new Movie();
        otherMovie.setName("Toy Story");
        otherMovie.setYearReleased(2001);
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

        Serie lost = new Serie();

        Chapter chapter = new Chapter();
        chapter.setNumber(1);
        chapter.setSerie(lost);
        chapter.setViews(300);
        recommendedTitles.filter(chapter);
    }
}