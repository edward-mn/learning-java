package others;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
  // Não é necessário repassar o tipo de lista na instanciação do obj ArrayList - Opicional o tamanho ()
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Edward");
    names.add("Roger");
    names.add("Evelym");
    names.add("Vagner");

    names.add(2, "Novo");
    System.out.println(names.size());

    for(String name: names){
      System.out.println(name);
    }

    names.remove("Novo"); // Pode ser valor, index ou predicado (condicional)
    System.out.println("Remove Novo: " + names);

    names.removeIf(name -> name.charAt(0) == 'V');
    System.out.println("Remove V: " + names);

    System.out.println("Index of Edward: " + names.indexOf("Edward")); // Search index with value list
    System.out.println("Index of None: " + names.indexOf("Amanda")); // Search index with no value list

    List<String> newNames = names.stream().filter(name -> name.charAt(0) == 'E').collect(Collectors.toList());
    for(String eNames: newNames){
      System.out.println(eNames);
    }

    String firstName = newNames.stream().filter(name -> name.charAt(0) == 'E').findFirst().orElse(null);
    System.out.println("First E name: " + firstName);
  }
}