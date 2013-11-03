/**
 * User: rafael
 * Date: 10/23/13
 * Time: 8:23 PM
 */
// Canvas.java
import java.util.ArrayList;
import java.util.List;

public class Canvas {

    private List<Shape> shapeList = new ArrayList<>();
    private ShapeFactory displayFriendlyFactory = new DisplayFriendlyFactory();
    private ShapeFactory printerFriendlyFactory = new PrinterFriendlyFactory();


    public void addNewShape(String shapeType, String factory) {

        Shape shape = null;

        switch(factory) {
            case "DisplayFriendly": shape = displayFriendlyFactory.getShape(shapeType); break;
            case "PrinterFriendly": shape = printerFriendlyFactory.getShape(shapeType); break;
        }

        shapeList.add(shape);
    }

    public void redraw() {

        for(Shape shape : shapeList) {
            shape.draw();
        }
    }
}

