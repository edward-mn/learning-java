package entities;

public class Product {
  public String name;
  public Double price;
  public Integer quantity;

  public double totalValueInStock(){
    return price * quantity;
  };

  public void addProducts(Integer quantityProducts){
    this.quantity += quantityProducts;
  };

  public void removeProducts(Integer quantityProducts){
    this.quantity -= quantityProducts;
  };

  public String toString(){
    return "Product data: " + name.toUpperCase()
        + ", $" + String.format("%.2f", price)
        + ", " + quantity
        + ", Total: $" + String.format("%.2f", totalValueInStock()) ;
  };

  public void wantContinue(int addQuantity, int removeQuantity){
    System.out.print("It was Added " + addQuantity + " in stock -> ");
    addProducts(addQuantity);

    System.out.println(toString() + "\n");
    System.out.print("It was Removed " + removeQuantity + " in stock -> ");
    removeProducts(removeQuantity);

    System.out.println(toString() + "\n");
    System.out.print("Deseja repetir (s/n)? ");
  }
}
