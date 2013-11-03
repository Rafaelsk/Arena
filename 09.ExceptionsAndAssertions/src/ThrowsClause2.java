/**
 * User: rafael
 * Date: 11/3/13
 * Time: 5:32 PM
 */
import java.io.*;
import java.util.*;

class ThrowsClause2 {
    public static void main(String []args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    }
}

