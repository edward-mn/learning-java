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
  }
}
