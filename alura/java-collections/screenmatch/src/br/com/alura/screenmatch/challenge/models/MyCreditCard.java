package br.com.alura.screenmatch.challenge.models;

public class MyCreditCard {
    private int creditCardLimit, valueItem;
    String descriptionItem;
    boolean limit;

    public void validateLimit(int value){
        boolean aproved = (this.creditCardLimit -= value) > 0;
        
        setLimit(aproved);
        System.out.println((aproved) ? "Purchase done!" : "Sorry you not have enough limit");
    }

    public boolean hasLimit() {
        return this.limit;
    }

    public void setLimit(boolean limit) {
        this.limit = limit;
    }

    public String messageBought(String item){
        return "Insert the item's " + item;
    }

    public MyCreditCard(int limit) {
        this.creditCardLimit = limit;
    }

    public int getCreditCardLimit() {
        return creditCardLimit;
    }

    public int getValueItem() {
        return valueItem;
    }

    public void setValueItem(int valueItem) {

        this.valueItem = valueItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }
}
