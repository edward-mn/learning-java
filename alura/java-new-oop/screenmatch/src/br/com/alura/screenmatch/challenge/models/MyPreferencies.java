package br.com.alura.screenmatch.challenge.models;

public class MyPreferencies {
    public void includes(Audio audio){
        String message = audio.getTitle();
        if (audio.getClassifications()>= 9){
            System.out.println(message += " - it's a sucessfull!");
        } else {
            System.out.println(message += " - it's a good one!");
        }
    }
}
