/**
 * User: rafael
 * Date: 10/23/13
 * Time: 8:41 PM
 */
// PrinterFriendlyCircle.java
public class PrinterFriendlyCircle implements PrinterFriendlyShape{

    private int xPos, yPos;
    private int radius;

    public PrinterFriendlyCircle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("PrinterFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyCircle draw()");
        // draw() implementation
    }
}

