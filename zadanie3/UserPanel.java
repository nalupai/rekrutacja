package zadanie3;

import java.io.IOException;
import java.util.Scanner;

public class UserPanel {

    public static void quoteWheel(String address) throws IOException {
        String quote = QuoteManager.grabQuote(address);

        while (quote != quote.intern()) {
            quote = QuoteManager.grabQuote(address);
        }

        System.out.println(quote);

        System.out.println("\nType \"next\" for more: ");
        String userInput;
        Scanner sc = new Scanner(System.in);

        userInput = sc.next();

        if (userInput.equalsIgnoreCase("next")) {
            quoteWheel(address);
        } else {
            sc.close();
            System.out.println("Goodbye!");
        }
    }
}
