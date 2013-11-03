/**
 * User: rafael
 * Date: 11/2/13
 * Time: 3:11 PM
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";

        //All words
        System.out.println("Printing all words!");
        Matcher matcher = Pattern.compile("\\w+").matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        //All zip codes (length of 5)
        System.out.println("\nPrinting all zip codes!");
        matcher = Pattern.compile("\\b\\d{5}\\b").matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        //All e-mails
        System.out.println("\nPrinting all emails!");
        matcher = Pattern.compile("\\w+@\\w+\\.com").matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        //Adjusting phone formats
        System.out.println("\nAdjusting phone formats!");
        Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
        matcher = pattern.matcher(str);
        String newStr = matcher.replaceAll("$1$2-$3$4");
        System.out.println(newStr);

    }
}

