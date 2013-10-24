package DAO;

/**
 * User: rafael
 * Date: 10/23/13
 * Time: 9:11 PM
 */
// CircleDAO.java
public interface CircleDAO {

    public void insertCircle(CircleTransfer circle);
    public CircleTransfer findCircle(int id);
    public void deleteCircle(int id);
}

