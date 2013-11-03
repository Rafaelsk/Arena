/**
 * User: rafael
 * Date: 11/3/13
 * Time: 10:03 AM
 */
import java.io.IOException;
import java.nio.file.*;

public class FileMove {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("usage: FileMove <source-path> <destination-path>");
            System.exit(-1);
        }
        Path pathSource = Paths.get(args[0]);
        Path pathDestination = Paths.get(args[1]);
        try {
            Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

