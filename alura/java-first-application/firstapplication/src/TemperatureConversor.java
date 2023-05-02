public class TemperatureConversor {
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Conversor!");
        double celsius = 32.5;
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.format(" -> %.2f° Celsius degrees to Fahrenheit is %.2fF", celsius ,fahrenheit);
        String message = String.format("\n -> A temperatura em Fahrenheit inteira é: " + (int) fahrenheit);
        System.out.println(message);
    }
}
