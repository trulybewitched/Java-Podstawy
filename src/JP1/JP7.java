package JP1;

public class JP7 {
    public static void main(String[] args) {
        String name = "Alicja";
        name = name.toUpperCase();

        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A' ? "kobieta" : "mężczyzna");
    }
}