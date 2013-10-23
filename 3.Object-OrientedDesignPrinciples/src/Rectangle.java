/**
 * User: rafael
 * Date: 10/22/13
 * Time: 8:30 PM
 */
// Rectangle.java
// Rectangle is a concrete class and is-a Shape; it can be rotated and hence implements Rotatable
public class Rectangle extends Shape implements Rotatable {

    private int length, height;

    public Rectangle(int l, int h) {
        length = l;
        height = h;
    }
    public double area() {
        return length * height;
    }

    @Override
    public void rotate(float degree) {
        // implement rotating functionality here
    }
}

