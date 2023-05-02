import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double average = 0;
        double note = 0;
        int quantityNotes = 0;

        while (note != -1) {
            System.out.println("Say your note about movie or press -1 to exit");
            note = reader.nextDouble();

            if (note != -1){
                average += note;
                quantityNotes++;
            }
        }

        System.out.println("Avarege notes = " + average / quantityNotes);
        reader.close();
    }
}
