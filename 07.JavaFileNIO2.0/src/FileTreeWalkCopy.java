/**
 * User: rafael
 * Date: 11/3/13
 * Time: 10:40 AM
 */
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

// Our File visitor implementation that performs copy
class MyFileCopyVisitor extends SimpleFileVisitor<Path> {
    private Path source, destination;

    public MyFileCopyVisitor(Path s, Path d) {
        source = s;
        destination = d;
    }
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
        Path newd = destination.resolve(source.relativize(path));
        try {
            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        Path newd = destination.resolve(source.relativize(path));
        try {
            Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }
}

public class FileTreeWalkCopy {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("usage: FileTreeWalkCopy <source-path> <destination-path>");
            System.exit(1);
        }
        Path pathSource = Paths.get(args[0]);
        Path pathDestination = Paths.get(args[1]);
        try {
            Files.walkFileTree(pathSource, new MyFileCopyVisitor(pathSource, pathDestination));
            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

