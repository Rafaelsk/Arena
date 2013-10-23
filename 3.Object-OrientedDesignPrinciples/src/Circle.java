/**
 * User: rafael
 * Date: 10/22/13
 * Time: 8:28 PM
 */
// Circle.java
public class Circle {
    private Point center;
    // Circle "contains" a Point object
    private int radius;
    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }
    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }

    public static void main(String []s) {
        System.out.println(new Circle(10, 10, 20));
    }
// other members (constructors, area method, etc) are elided ...
}




