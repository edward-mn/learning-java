package entities;

public class Student {
  public String name;
  public Double n1, n2, n3;

  public float finalGrade(){
    return (float) (n1 + n2 + n3);
  };

  public String resultInfo(){
    String info = name + " - Final Grade = " + finalGrade() + "\n";

    if(finalGrade() > 60.0){
      info += "PASS !!";
    } else {
      info += "FAILED!! \nMISSING " + Math.abs(finalGrade() - 60.0) + " POINTS!";
    }

    return info;
  }
}
