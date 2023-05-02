import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your favorite movie");
        String movie = reader.nextLine();

        System.out.println("Enter year's movie");
        int year = reader.nextInt();

        System.out.println("Enter your note about movie - " + movie);
        double note = reader.nextDouble();

        System.out.println(movie);
        System.out.println(year);
        System.out.println(note);

        reader.close();
    }
}
