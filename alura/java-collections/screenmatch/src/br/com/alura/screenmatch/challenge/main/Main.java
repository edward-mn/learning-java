package br.com.alura.screenmatch.challenge.main;

import br.com.alura.screenmatch.challenge.models.CreditCard;
import br.com.alura.screenmatch.challenge.models.Purchase;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert the card's limit: ");
        double limit = reader.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Insert the item's description: ");
            String description = reader.next();

            System.out.println("Insert the item's value: ");
            double value = reader.nextDouble();

            Purchase myPurchase = new Purchase(description, value);
            boolean purchasedDone = card.newPurchase(myPurchase);

            if (purchasedDone) {
                System.out.println("Purchased Done!");
                System.out.println("Please type 1 to continue and 0 to exit");
                exit = reader.nextInt();
            } else {
                System.out.println("Sorry you not have enough limit");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("Purchased Done:\n");

        Collections.sort(card.getPurchases());

        for (Purchase c : card.getPurchases()) {
            System.out.println(c.getDescription() + " - " +c.getValueItem());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + card.getBankBalance());
    }

}
