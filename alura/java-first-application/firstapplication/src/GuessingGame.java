import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(100);
        String message = "Sorry, it was not this time!";

        System.out.println("Pleas, enter with number 0 - 100");
        System.out.println(numberToGuess);
        for (int i = 1; i <= 5; i++) {
            System.out.println( i + "° - Trying");
            int number = reader.nextInt();

            if(numberToGuess == number){
                message = "Congrats, you've correct kick!";
                break;
            }
        }

        message += "\nThe number to guess was " + numberToGuess;
        System.out.println(message);

        reader.close();
    }
}
/*
to listen a music or understand a game, because of that I have started study english
move out my parents house before 30 age, but it happened before that I've imagined
snow, it's one's my dream
abroad, but this year cloud change - who knows


 */