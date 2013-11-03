package observer;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 8:53 PM
 */
// ShapeArchiver.java
import java.util.Observable;
import java.util.Observer;

public class ShapeArchiver implements Observer{

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("ShapeArchiver::update");
        // actual update code elided ...
    }
}


