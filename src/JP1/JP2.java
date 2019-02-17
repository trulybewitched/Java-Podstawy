package JP1;

public class JP2 {
    public static void main(String[] args) {
        //deklaracje
        String name, lastname, possition;
        final String PESEL;
        char gender;
        double salary_net;
        double salary_brut;
        boolean isRetired;
        // przypisanie
        name = "Adam";
        lastname = "Kowalski";
        possition = "developer";
        PESEL = "90110905744";
        gender = 'M';
        salary_net = 10000;
        salary_brut = 12300;
        isRetired = false;
        // prezentacja
        System.out.printf("%10s | %10s | %10s | %12s | %2s | %8.2fzł | %8.2fzł | %b", name, lastname, possition, PESEL, gender, salary_net, salary_brut, isRetired);


    }
}
