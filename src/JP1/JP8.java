package JP1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class JP8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
// P1
        System.out.println(0.5 * a * (a * sqrt(3) / 2));
// P2
        System.out.println(pow(a, 3));
// P3
        int grade1 = 5;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println(((double) (grade1 + grade2 + grade3)) / 3);
// P4
        System.out.println(a * b);
// P5
        double salary_net = 8000;
        int vat_tax = 23;
        System.out.println(salary_net * (1 + ((double) vat_tax) / 100));
        System.out.printf("%.2fzł \n", salary_net * (1 + ((double) vat_tax) / 100));

    }
}

