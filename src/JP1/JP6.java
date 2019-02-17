package JP1;

import java.util.Random;

public class JP6 {
    public static void main (String [] args) {
        Random rnd = new Random();
        int varl = rnd.nextInt (10) + 1;
        System.out.println("var1 = " + varl);
        int var2 = rnd.nextInt (10 )+ 1;
        System.out.println("var2 = " + var2);

        System.out.println(varl > var2);
        System.out.println(var2*2 > var2);
        System.out.println(var2 > varl + 3 && var2 > varl - 2);
        System.out.println((varl * var2) % 2 == 0);
    }
}