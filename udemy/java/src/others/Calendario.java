package others;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
  public static void main(String[] args) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

    Date d = Date.from(Instant.parse("2022-01-17T17:22:08Z")); // UTC = -3 Hours

    System.out.println(sdf.format(d));

    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    cal.add(Calendar.HOUR_OF_DAY, 4); // Update 4 hour
    d = cal.getTime();
    System.out.println("Plus 4 hours: " + d);

    int minutes = cal.get(Calendar.MINUTE);
    System.out.println("Minutes: " + minutes);

    int month = 1+ cal.get(Calendar.MONTH);
    System.out.println("Month: " + month);
  }
}
