package validation;

import java.rmi.server.ObjID;

public class TestReferencies {
  public static void main(String[] args) {
    Object referencies[] = new Object[2];

    Test test1 = new Test();
    Test test2 = new Test();

    referencies[0] = test1;
    referencies[1] = test2;

    System.out.println(referencies[0]);
  }
}
