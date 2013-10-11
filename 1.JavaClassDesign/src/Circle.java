/**
 * User: rafael
 * Date: 10/10/13
 * Time: 9:36 PM
 */

// A 2D Circle class with xPos and yPos fields to store the coordinates for center point
// and radius field to store the radius value of the circle
class Circle {
    private int xPos, yPos, radius;
    // default constructor initializing all the three fields
    public Circle() {
        xPos = 20; // assume some default values for xPos and yPos
        yPos = 20;
        radius = 10; // default radius
    }
    // overridden toString method to print info on Circle object in string form
    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }
    public static void main(String[]s) {
        // Passing a object to println automatically invokes the toString method
        System.out.println(new Circle());
    }
}

