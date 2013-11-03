/**
 * User: rafael
 * Date: 11/3/13
 * Time: 8:33 AM
 */
import java.io.IOException;
import java.nio.file.*;

// To illustrate important methods such as normalize(), toAbsolutePath(), and toReativePath()
class PathInfo2 {
    public static void main(String[] args) throws IOException {
        //get a path object with relative path
        Path testFilePath = Paths.get("./PathInfo1.class");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("It's URI is: " + testFilePath.toUri());
        System.out.println("It's absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("It's normalized path is: " + testFilePath.normalize());

        // get another path object with normalized relative path
        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("It's normalized absolute path is: " + testPathNormalized.toAbsolutePath());
        System.out.println("It's normalized real path is: " + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
}
