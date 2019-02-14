package Start;

public class Variables {
    public static void main(String[] args) {
        //deklaracja i inicjalizacja
    int x = 0;
    System.out.println(x);
    // deklaracja
    int y;
    // modyfikacja
    y = x + 11;
    System.out.println("y = " + y);
    System.out.println("x = " + x);
    // napisy
        System.out.println("KLASA STRING");
        String word = "Lorem ipsum Lorem ipsum";
        // szukanie po indeksie
        System.out.println(word.charAt(8));
        // szukanie po wartości
        System.out.println(word.indexOf("s"));
        System.out.println(word.indexOf("ł"));
        System.out.println(word.length());
        // porównanie
        String word2 = "Header";
        System.out.println(word.equals(word2));
        System.out.println(word.equals("header"));
        System.out.println(word.equals("Header"));
        System.out.println(!word2.equals(word));
        // wydobywanie podciągu
        System.out.println(word.contains("ipsum"));
        System.out.println(word.substring(6,11));
        System.out.println(word.substring(6,11).length());
int myStringLen = word.substring(6,11).length();
System.out.println("myStringLen = " + myStringLen);
// dzielenie
        String words [] = word.split ( " ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);



}
}