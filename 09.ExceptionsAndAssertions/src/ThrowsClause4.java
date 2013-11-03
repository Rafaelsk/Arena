/**
 * User: rafael
 * Date: 11/3/13
 * Time: 5:33 PM
 */
import java.io.*;
import java.util.*;

// This interface is meant for implemented by classes that would read an integer from a file
interface IntReader {
    int readIntFromFile() throws IOException;
}

class ThrowsClause4 implements IntReader {
    // implement readIntFromFile with the same throws clause
    // or a more general throws clause
    public int readIntFromFile() throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }
    // main method elided in this code since the focus here is to understand
    // issues related to overriding when throws clause is present
}

