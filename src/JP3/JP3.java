package JP3;

import java.util.jar.Pack200;

public class JP3 {
    public static void main(String[] args) {
        // P1
        String var1, var2, var3, var4;
        // P2
        var1 = "java";
        var2 = "test";
        var3 = var1 + var2;
        // P3
        var4 = var3 + "AAA";
        // P4
        System.out.println("VAR3: " + var3.toUpperCase());
        System.out.println("VAR4: " + var4.toLowerCase());
        // P5
        System.out.println(var4.length());
        // P6
        System.out.println("Index2: " + var3.charAt(2));
        System.out.println("Index5: " + var3.charAt(5));
        System.out.println(var4.charAt(var4.length()-3));
        // P7
        System.out.println("VAR1 substr: " + var4.substring(0,4));
        System.out.println("VAR2 substr: " + var4.substring(4,8));




    }
}
