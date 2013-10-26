package observer;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 8:54 PM
 */
// Test.java
public class Test {
    public static void main(String []s) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println(circle);
        circle.addObserver(new Canvas());
        circle.addObserver(new ShapeArchiver());
        circle.setRadius(50);
        System.out.println(circle);
    }
}


