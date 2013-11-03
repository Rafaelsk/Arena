/**
 * User: rafael
 * Date: 11/3/13
 * Time: 5:25 PM
 */
import java.io.*;
class UnCheckedExceptionExample2 {
    public static void main(String []args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Error: No arguments passed in the commandline!");
            System.out.println("Pass the name of the file to open as commandline argument");
        }
    }
}

