/**
 * User: rafael
 * Date: 10/23/13
 * Time: 8:41 PM
 */
// DisplayFriendlyRectangle.java
public class DisplayFriendlyRectangle implements DisplayFriendlyShape {

    private int length, height;

    public DisplayFriendlyRectangle(int length, int height) {
        this.length = length;
        this.height = height;
        System.out.println("DisplayFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyRectangle draw()");
        // draw() implementation
    }
}

