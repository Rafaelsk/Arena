/**
 * User: rafael
 * Date: 11/3/13
 * Time: 9:20 AM
 */
import java.io.IOException;
import java.nio.file.*;

// illustrates how to use File class to compare two paths
public class PathCompare2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("../07.JavaFileNIO2.0");
        Path path2 = Paths.get("/home/rafael/Projects/Arena/out/production/07.JavaFileNIO2.0");

        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
    }
}

