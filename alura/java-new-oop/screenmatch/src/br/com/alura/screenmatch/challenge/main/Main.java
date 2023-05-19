package br.com.alura.screenmatch.challenge.main;

import br.com.alura.screenmatch.challenge.models.MyPreferencies;
import br.com.alura.screenmatch.challenge.models.Podcast;
import br.com.alura.screenmatch.challenge.models.Songs;

public class Main {
    public static void main(String[] args) {
        Songs mySongs = new Songs();
        mySongs.setTitle("A best day Ever");
        mySongs.setSinger("Mac Miller");

        for (int i = 0; i < 1000; i++) {
            mySongs.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            mySongs.liked();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Mundo Freak");
        myPodcast.setHost("Andrey");

        for (int i = 0; i < 5000; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.liked();
        }

        MyPreferencies myPreferencies = new MyPreferencies();
        myPreferencies.includes(mySongs);
        myPreferencies.includes(myPodcast);
    }
}
