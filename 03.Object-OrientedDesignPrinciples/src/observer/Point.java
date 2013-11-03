package observer;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 8:53 PM
 */
// Point.java
class Point {

    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "(" + xPos + "," + yPos + ")";
    }
}

