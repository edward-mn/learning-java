package br.com.alura.screenmatch.calculators;

public class RecommendationFilter {
    private String recommendation;

    public void filter(Classification classification){
        if (classification.getClassification() >= 4){
            System.out.println("Everyone loved!");
        } else if (classification.getClassification() >= 2){
            System.out.println("Some people liked!");
        } else {
            System.out.println("Watching later");
        }
    }
}
