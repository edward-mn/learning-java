package Challenge;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);

        Account myAccount = new Account("Edward Moreira", "Current Account", 2500.00);
        int option = 0;
        double value = 0.0;

        String info = """
                Operations
                                
                1- Check Amount
                2- Receive Cash
                3- Transfer Cash
                4- Exit
                """;

        System.out.println(myAccount.toString());

        while (option != 4){
            System.out.println(info);

            option = reader.nextInt();

            switch (option){
                case 1:
                    System.out.println("R$ " + myAccount.checkAmount().toString());
                    break;
                case 2:
                    System.out.println("Please insert a value to receive!\n");
                    value = reader.nextDouble();
                    System.out.println(myAccount.receiveCash(value));
                    break;
                case 3:
                    System.out.println("Please insert a value to transfer!\n");
                    value = reader.nextDouble();
                    System.out.println(myAccount.transferCash(value));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please insert a valid option!\n");
            }
        }

        System.out.println("We're closing your account details\n" + myAccount.toString());
        reader.close();



    }
}
