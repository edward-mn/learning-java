package moreira.company;

import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainStringBuilder {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");

    Post p1 = new Post(
        sdf.parse("28/03/2022 12:53:04"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country",
        12);

    p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);

    Comment c3 = new Comment("Good night!");
    Comment c4 = new Comment("May the Force be with you!");

    Post p2 = new Post(
        sdf.parse("28/03/2022 13:04:37"),
        "Wishes to have a wonderful good night",
        "See you soon",
        5);

    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p2);
  }
}
