package JP1;

import java.util.Scanner;
public class JP9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String a= sc.nextLine();
        int h = a.length();

        int kk=2;
        int k=(h-1);
        for(int i=0;i<h ;i++){

            if(a.charAt(i) != a.charAt(k))
            {
                kk=1;
            }
            else
            {
                kk=0;
            }

            k--;

        }

        if(kk==0)
            System.out.println("Jest palindromem");
        if(kk==1)
            System.out.println("Nie jest palindromem");

    }
}
