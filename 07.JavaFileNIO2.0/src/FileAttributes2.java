/**
 * User: rafael
 * Date: 11/3/13
 * Time: 9:51 AM
 */
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

class FileAttributes2 {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        try {
            BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File size: " + fileAttributes.size());
            System.out.println("isDirectory: " + fileAttributes.isDirectory());
            System.out.println("isRegularFile: " + fileAttributes.isRegularFile());
            System.out.println("isSymbolicLink: " + fileAttributes.isSymbolicLink());
            System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
            System.out.println("File last modified time: " + fileAttributes.lastModifiedTime());
            System.out.println("File creation time: " + fileAttributes.creationTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

