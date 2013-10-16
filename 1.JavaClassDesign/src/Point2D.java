/**
 * User: rafael
 * Date: 10/15/13
 * Time: 8:37 PM
 */
class Point2D {
    private int xPos, yPos;
    public Point2D(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "x = " + xPos + ", y = " + yPos;
    }

    public static void main(String []args) {
        System.out.println(new Point2D(10, 20));
    }
}

