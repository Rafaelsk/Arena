/**
 * User: rafael
 * Date: 11/3/13
 * Time: 6:38 PM
 */
import java.util.*;

// Italian version
public class ResBundle_it_IT extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {
            { "MovieName", "Che Bella Giornata" },
            { "GrossRevenue", (Long) 43000000L }, // in euros
            { "Year", (Integer)2011 }
    };
}

