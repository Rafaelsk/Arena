/**
 * User: rafael
 * Date: 10/16/13
 * Time: 9:03 PM
 */
public abstract class Shape {
    abstract double area();
    static int x;
    private Shape parentShape;
    public void setParentShape(Shape shape){
        parentShape = shape;
    }
    public Shape getParentShape(){
        return parentShape;
    }
}

class Rectangle extends Shape {
    private int length, height;
    public double area() { return length * height; }
    // other members ...

}

