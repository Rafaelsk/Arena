package DAO;

import java.io.Serializable;

/**
 * User: rafael
 * Date: 10/23/13
 * Time: 9:13 PM
 */
public class CircleTransfer implements Serializable {

    private int xPos;
    private int yPos;
    private int radius;

    public int getxPos() {
        return xPos;
    }
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }
    public int getyPos() {
        return yPos;
    }
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}

