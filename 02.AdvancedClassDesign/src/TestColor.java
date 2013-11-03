/**
 * User: rafael
 * Date: 10/21/13
 * Time: 7:43 PM
 */
abstract class Shape2 {
    public static class Color {
        int m_red, m_green, m_blue;
        public Color() {
            // call the other overloaded Color constructor by passing default values
            this(0, 0, 0);
        }
        public Color(int red, int green, int blue) {
            m_red = red; m_green = green; m_blue = blue;
        }
        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
        }
        // other color members elided
    }
    // other Shape members elided
}

public class TestColor {
    public static void main(String []args) {
        // since Color is a static nested class,
        // we access it using the name of the outer class, as in Shape.Color
        // note that we do not (and cannot) instantiate Shape class for using Color class
        Shape2.Color white = new Shape2.Color(255, 255, 255);
        System.out.println("White color has values:" + white);
    }
}

