/**
 * User: rafael
 * Date: 11/3/13
 * Time: 9:22 AM
 */
import java.nio.file.*;

class PathExists {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);

        if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");
            // check whether it is a file or a directory
            if(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            }
            else {
                System.out.println(path.getFileName() + " is a file");
            }
        }
        else {
            System.out.println("The file/directory " + path.getFileName() + " does not exist");
        }
    }
}

