package functions;

import java.util.Scanner;

public class Chanchito {

    public void callChanchito() {
        char input;
        Scanner leer = new Scanner(System.in);
        System.out.print("\n--¿el chanchito dice oink?\n(y/n) ?: ");
        input = leer.next().charAt(0);
        if (input == 'y' || input == 'Y' || input == 's' || input == 'S') {
            System.out.println("\n\tOink!");
        } else {
            System.out.println("\n\to(TヘTo)");
        }
    }
}
