/**
 * User: rafael
 * Date: 10/23/13
 * Time: 8:42 PM
 */
// PrinterFriendlyRectangle.java
public class PrinterFriendlyRectangle implements PrinterFriendlyShape {

    private int length, height;

    public PrinterFriendlyRectangle(int length, int height) {

        this.length = length;
        this.height = height;
        System.out.println("PrinterFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyRectangle draw()");
        // draw() implementation
    }

}

