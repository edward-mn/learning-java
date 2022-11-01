public class BonificationControll {
  private double values;

  public void register(Employee em) {
    double bonification = em.getBonification();
    this.values += bonification;
  }

  public double getValues() {
    return values;
  }

}
