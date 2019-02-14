package JP7;

public class JP7 {
    public static void main(String[] args) {
        String name = "Marek";
        name = name.toUpperCase();

        System.out.println("Kim jesteś?");
        System.out.println(name.charAt(name.length()-1) == 'A' && !name.equals("KUBA") && !name.equals("BARNABA")? "kobieta" : "mężczyzna");
    }
}