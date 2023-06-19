package br.com.alura.screenmatch.challenge.main;

import br.com.alura.screenmatch.challenge.models.MyCreditCard;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);
        int option = 1;
        String message = "Insert the item's ";

        System.out.println("Insert a credit card limit:");
        MyCreditCard myCC = new MyCreditCard(insert.nextInt());

        while (option != 0){
            System.out.println(message + "description");
            String description = insert.next();
            myCC.setDescriptionItem(description);

            System.out.println(message + "value");
            int value = insert.nextInt();
            myCC.setValueItem(value);
            myCC.validateLimit(value);

            if (myCC.hasLimit()){
                System.out.println("Please type 1 to continue and 0 to exit");
                option = insert.nextInt();
            } else {
                break;
            }
        }
    }
}
