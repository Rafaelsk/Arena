package generics;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 9:23 PM
 */

// This program shows container implementation using generics
class BoxPrinter3<T> {

    private T val;

    public BoxPrinter3(T arg) {
        val = arg;
    }

    public String toString() {
        return "[" + val + "]";
    }
}

public class BoxPrinterTest3 {

    public static void main(String []args) {

        BoxPrinter3<Integer> value1 = new BoxPrinter3<>(new Integer(10));
        System.out.println(value1);

        BoxPrinter3<String> value2 = new BoxPrinter3<>("Hello world");
        System.out.println(value2);
    }
}

