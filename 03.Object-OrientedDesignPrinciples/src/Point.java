/**
 * User: rafael
 * Date: 10/22/13
 * Time: 9:45 PM
 */
// Point is an independent class and here we are using it with Circle class
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

