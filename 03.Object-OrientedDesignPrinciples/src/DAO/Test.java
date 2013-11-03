package DAO;

/**
 * User: rafael
 * Date: 10/23/13
 * Time: 9:14 PM
 */
// Test.java
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println(circle);
        CircleTransfer circleTransfer = circle.getCircleTransferObject();
        CircleDAO circleDAO = DAOFactory.getCircleDAO("RDBMS");
        circleDAO.insertCircle(circleTransfer);
    }
}

