package zadanie3;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class QuoteManager {

   public static String grabQuote(String address) throws IOException {
        URL url = new URL(address);
        Scanner sc = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();

        while (sc.hasNext()) {
            sb.append(sc.next() + " ");
        }

        sc.close();
        String result =  sb.substring(9, sb.length() - 2);
        return result;
    }
}
