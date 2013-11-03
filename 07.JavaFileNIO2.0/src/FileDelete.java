/**
 * User: rafael
 * Date: 11/3/13
 * Time: 10:09 AM
 */
import java.io.IOException;
import java.nio.file.*;

public class FileDelete {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("usage: FileDelete <source-path>");
            System.exit(1);
        }
        Path pathSource = Paths.get(args[0]);
        try {
            Files.delete(pathSource);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

