/**
 * User: rafael
 * Date: 11/3/13
 * Time: 6:33 PM
 */
import java.util.*;

public class LocalizedHello {
    public static void main(String args[]) {
        Locale.setDefault(Locale.ITALY);
        Locale currentLocale = Locale.getDefault();
        ResourceBundle resBundle =  ResourceBundle.getBundle("ResourceBundle", currentLocale);
        System.out.printf(resBundle.getString("Greeting"));
    }
}
