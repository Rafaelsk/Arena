package generics;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 9:10 PM
 */
import java.util.Vector;

// This program demonstrate the lack of type-safety in containers (based on Object type).
class OldContainerTest {

    public static void main(String []args) {

        Vector floatValues = new Vector();
        floatValues.add(10.0f);
        floatValues.add(100.0);

        for(int i = 0; i < floatValues.size(); i++) {
            Float temp = (Float) floatValues.get(i);
            System.out.println(temp);
        }
    }
}

