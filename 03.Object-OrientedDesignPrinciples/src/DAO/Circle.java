package DAO;

/**
 * User: rafael
 * Date: 10/23/13
 * Time: 9:08 PM
 */
// Circle.java
public class Circle {

    private int xPos, yPos;
    private int radius;

    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public String toString() {
        return "center = (" + xPos + "," + yPos + ") and radius = " + radius;
    }

    public CircleTransfer getCircleTransferObject() {
        CircleTransfer circleTransfer = new CircleTransfer();
        circleTransfer.setRadius(radius);
        circleTransfer.setxPos(xPos);
        circleTransfer.setyPos(yPos);
        return circleTransfer;
    }
    // other members
}
