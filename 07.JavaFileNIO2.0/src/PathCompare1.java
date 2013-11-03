/**
 * User: rafael
 * Date: 11/3/13
 * Time: 8:46 AM
 */
import java.nio.file.*;

// illustrates how to use compareTo and equals and also shows the difference between the two methods
class PathCompare1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("../07.JavaFileNIO2.0");
        Path path2 = Paths.get("/home/rafael/Projects/Arena/out/production/07.JavaFileNIO2.0");

        // comparing two paths using compareTo() method
        System.out.println("(path1.compareTo(path2) == 0) is: " + (path1.compareTo(path2) == 0));

        //comparing two paths using equals() method
        System.out.println("path1.equals(path2) is: " + path1.equals(path2));

        // comparing two paths using equals() method with absolute path
        System.out.println("path2.equals(path1.toAbsolutePath()) is " + path2.equals(path1.toAbsolutePath().normalize()));
    }
}

