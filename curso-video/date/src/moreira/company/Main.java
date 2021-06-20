package moreira.company;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    Date relogio = new Date();
        System.out.println("A hora do sistema é: " + relogio.toString());

        System.out.println(System.getProperty("user.language").toUpperCase() + " - " + System.getProperty("user.country"));
        // System.out.println(Locale.getDefault().getLanguage() + " - " + Locale.getDefault().getCountry());

        Dimension screenSizeDefault = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSizeDefault);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.print("Resulution " + width + " X " + height);
    }
}
