package br.com.alura.screenmatch.challenge.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit, bankBalance;
    private List<Purchase> purchases;

    public CreditCard(double limit) {
        this.limit = limit;
        this.bankBalance = limit;
        this.purchases = new ArrayList<>();
    }

    public boolean newPurchase(Purchase purchase){
        if(this.bankBalance > purchase.getValueItem()){
            this.bankBalance -= purchase.getValueItem();
            this.purchases.add(purchase);
            return true;
        }

        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }
}
