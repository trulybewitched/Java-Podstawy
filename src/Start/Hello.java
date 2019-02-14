package Start;

// Komentarz
// psvm - public static void main(String[] args}
// sout - System.out.printIn();
// CTRL + SHIFT + F10 - run
// CTRL + / - comment
//CTRL + D - duplicate
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Sprawdzenie JRE
        System.out.println("JRE version: " + System.getProperty("java.runtime.version"));

        int lunchTimer = 123456;
        System.out.println(lunchTimer);
        int endTimer = 123456789;
        System.out.println(endTimer);


        double salary = 2250.99;
        System.out.println(salary);

        char signA = 'A';
        char sign9 = '9';
        char signTab = '\'';
        char signSpace = ' ';
        System.out.println(signA);
        System.out.println(sign9);
        System.out.println(signTab);
        System.out.println(signSpace);


        boolean flag = true;
        boolean isLunch = false;
        System.out.println(true);
        System.out.println(false);
        System.out.println("isLunch = " + isLunch);


    }
}