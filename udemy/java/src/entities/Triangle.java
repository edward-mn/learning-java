package entities;

public class Triangle {

  public double a, b, c;

  public double area(){
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public String bigger(double first, double second){
    return (first > second) ? "Larger area: X" : "Larger area: Y";
  }
}
