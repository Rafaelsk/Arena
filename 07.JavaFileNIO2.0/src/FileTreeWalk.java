/**
 * User: rafael
 * Date: 11/3/13
 * Time: 10:19 AM
 */
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;


class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes){
        System.out.println("file name:" + path.getFileName());
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes){
        System.out.println("----------Directory name:" + path + "----------");
        return FileVisitResult.CONTINUE;
    }
}
public class FileTreeWalk {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage: FileWalkTree <source-path>");
            System.exit(-1);
        }
        Path pathSource = Paths.get(args[0]);
        try {
            Files.walkFileTree(pathSource, new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

