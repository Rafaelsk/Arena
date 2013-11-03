package DAO;

/**
 * User: rafael
 * Date: 10/23/13
 * Time: 9:12 PM
 */
// DAOFactory.java
public class DAOFactory {
    public static CircleDAO getCircleDAO(String sourceType) {
        // This is a simple example, so we have listed only "RDBMS" as the only source type
        // In a real-world application, you can provide more source types
        switch(sourceType){
            case "RDBMS":
                return new RDBMSDAO();
        }
        return null;
    }
}

