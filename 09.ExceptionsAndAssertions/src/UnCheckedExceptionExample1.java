/**
 * User: rafael
 * Date: 11/3/13
 * Time: 5:23 PM
 */
import java.io.*;
class UnCheckedExceptionExample1 {
    public static void main(String []args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(args[0]);
    }
}

