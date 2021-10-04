package others;

import java.util.Locale;

public class TheString {
  public static void main(String[] args) {
    String original = "abcde FGHIJ ABC abc DEFG   ";
    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");

    System.out.println("Original: - " + original + "-");
    System.out.println("toLowerCase: - " + original.toLowerCase() + "-");
    System.out.println("oUpperCase: - " + original.toUpperCase() + "-");
    System.out.println("trim: - " + original.trim() + "-");
    System.out.println("substring(2): - " + original.substring(2) + "-"); // Get all string up to 2 character
    System.out.println("substring(2, 9): - " + original.substring(2, 9) + "-"); // Get all string up to 2 character and rage 9, start at 0 on String
    System.out.println("replace('a', 'x'): - " + original.replace('a', 'x') + "-");
    System.out.println("replace('abc', 'xy'): - " + original.replace("abc", "xy") + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last Index of 'bc': " + j);

    String names = "Potato Apple Lemon Orange Stramberry Grape Wattermelon";
    System.out.println(names);

    String[] vectNames = names.split(" "); // Separete for space

    for (int c = 0; c < vectNames.length; c++){
      System.out.println(vectNames[c]);
    }

  }
}
