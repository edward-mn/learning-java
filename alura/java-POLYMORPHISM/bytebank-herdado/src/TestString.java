public class TestString {
    public static void main(String[] args) {
        String name = "Alura"; //Literal Object
        String empty = " ";
        String valueEnd = "Edward ";
        // String outro = new String("Alura");

        char c = 'a';
        char d = 'A';

        System.out.println("name " + name);
        System.out.println("charAt(0) " + name.charAt(0));
        System.out.println("indexOf(\"Al\") " + name.indexOf("Al"));
        System.out.println("substring(1) " + name.substring(1));
        System.out.println("length() " + name.length());
        System.out.println("isEmpty() " + name.isEmpty());
        System.out.println("isEmpty() " + empty.isEmpty());
        System.out.println("trim() " + name.trim());
        System.out.println(".replace(c, d) " + name.replace(c, d));
        System.out.println("toUpperCase() " + name.toUpperCase());
        System.out.println("contains() " + name.contains("ura"));
    }
}
