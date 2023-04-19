public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for (var i = 0; i < args.length; i++) {
            System.out.println(args[i]); // Configuration way
        }
    }

    // cmd way -> folder bin - java App 1 2 oi edward
}
