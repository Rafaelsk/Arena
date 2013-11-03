/**
 * User: rafael
 * Date: 11/3/13
 * Time: 4:54 PM
 */
// A simple progam to accept an integer from user
import java.util.*;
class ScanInt1 {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    }
}

