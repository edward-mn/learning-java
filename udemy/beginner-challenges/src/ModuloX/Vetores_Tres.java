package ModuloX;

import Entities.Hotel;
import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Tres {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Hotel[] rooms = new Hotel[9];

    System.out.print("How many rooms will be rented? ");
    int qtdRooms = sc.nextInt();

    Hotel[] rentedRooms = new Hotel[qtdRooms];
    for(int i = 0; i < rentedRooms.length; i++){
      sc.nextLine();
      System.out.println("\nRent #" + (i+1));

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("E-mail: ");
      String email = sc.nextLine();

      System.out.print("Room: ");
      Integer number = sc.nextInt();

      for(int j = 0; j < rooms.length; j++){
        if (j == number){
          rooms[j] = new Hotel(name, email, number);
        }
      }
    }

    System.out.println("\nBusy rooms:");
    for(Hotel room: rooms){
      if(room != null){
        System.out.println(room.getNumberRoom() + ": " + room.getName() + ", " + room.getEmail());
      }
    }
  }
}
