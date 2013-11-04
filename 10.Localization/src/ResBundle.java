/**
 * User: rafael
 * Date: 11/3/13
 * Time: 6:37 PM
 */
import java.util.*;

// default US English version
public class ResBundle extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {
            { "MovieName", "Avatar" },
            { "GrossRevenue", (Long) 2782275172L }, // in US dollars
            { "Year", (Integer)2009 }
    };
}

