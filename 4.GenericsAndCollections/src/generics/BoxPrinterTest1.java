package generics;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 9:17 PM
 */
// The program demonstrates "Object" based implementation and associated lack of type safety
class BoxPrinter1 {

    private Object val;

    public BoxPrinter1(Object arg) {
        val = arg;
    }

    public String toString() {
        return "[" + val + "]";
    }
}

public class BoxPrinterTest1 {
    public static void main(String []args) {
        BoxPrinter1 value1 = new BoxPrinter1(new Integer(10));
        System.out.println(value1);
        BoxPrinter1 value2 = new BoxPrinter1("Hello world");
        System.out.println(value2);
    }
}


