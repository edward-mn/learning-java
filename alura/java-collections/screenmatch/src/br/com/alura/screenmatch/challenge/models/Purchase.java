package br.com.alura.screenmatch.challenge.models;

public class Purchase implements Comparable<Purchase> {
    private String description;
    private double valueItem;

    public Purchase(String description, double valueItem) {
        this.description = description;
        this.valueItem = valueItem;
    }

    @Override
    public String toString() {
        return "Purchase\ndescription: " + description +
                "\nValue Item:" + valueItem;
    }

    public String getDescription() {
        return description;
    }

    public double getValueItem() {
        return valueItem;
    }

    @Override
    public int compareTo(Purchase anotherPurchase) {
        return Double.valueOf(this.valueItem).compareTo(Double.valueOf(anotherPurchase.valueItem));
    }
}
