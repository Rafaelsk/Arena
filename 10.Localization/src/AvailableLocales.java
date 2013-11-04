/**
 * User: rafael
 * Date: 11/3/13
 * Time: 6:23 PM
 */
import java.util.Locale;

class AvailableLocales {
    public static void main(String []args) {
        System.out.println("The default locale is: " + Locale.getDefault());
        Locale [] locales = Locale.getAvailableLocales();
        System.out.printf("No. of other available locales is: %d, and they are: %n", locales.length);
        for(Locale locale : locales) {
            System.out.printf("Locale code: %s and it stands for %s %n", locale, locale.getDisplayName());
        }

        for(Locale locale : locales) {
            // filter and display only Spanish locales
            if(locale.getLanguage().equals("es")) {
                System.out.printf("Locale code: %s and it stands for %s %n", locale, locale.getDisplayName());
            }
        }

    }
}

