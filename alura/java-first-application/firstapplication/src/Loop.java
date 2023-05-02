import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double average = 0;
        double note = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your note about movie: ");
            note = reader.nextDouble();
            average += note;
        }

        System.out.println("Avarege notes = " + average/3);
        reader.close();
    }
}
