package Entities;

public class Hotel {
  public String name, email;
  public Integer numberRoom;

  public Hotel(String name, String email, Integer numberRoom) {
    this.name = name;
    this.email = email;
    this.numberRoom = numberRoom;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getNumberRoom() {
    return numberRoom;
  }

  public void setNumberRoom(Integer numberRoom) {
    this.numberRoom = numberRoom;
  }
}
