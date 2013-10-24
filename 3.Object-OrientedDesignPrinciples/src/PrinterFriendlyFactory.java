/**
 * User: rafael
 * Date: 10/23/13
 * Time: 8:45 PM
 */
// PrinterFriendlyFactory.java
public class PrinterFriendlyFactory implements ShapeFactory {

    @Override
    public Shape getShape(String sourceType) {

        switch(sourceType) {
            case "Circle":
                return new PrinterFriendlyCircle(10, 10, 20);
            case "Rectangle":
                return new PrinterFriendlyRectangle(10, 20);
        }
        return null;
    }
}

