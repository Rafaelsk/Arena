import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * User: rafael
 * Date: 11/3/13
 * Time: 4:54 PM
 */
class ScanInt2 {
    public static void main(String [] args) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        try {

            System.out.println("You typed the integer value: " + consoleScanner.nextInt());

        } catch(InputMismatchException ime) {
            // nextInt() throws InputMismatchException in case anything other than an integer
            // is typed in the console; so handle it
            System.out.println("Error: You typed some text that is not an integer value...");
        }
    }
}

