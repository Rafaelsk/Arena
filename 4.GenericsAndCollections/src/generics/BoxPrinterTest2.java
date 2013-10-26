package generics;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 9:20 PM
 */
// The program demonstrates "Object" based implementation and associated lack of type safety
class BoxPrinter2 {
    private Object val;
    public BoxPrinter2(Object arg) {
        val = arg;
    }
    public String toString() {
        return "[" + val + "]";
    }
    public Object getValue() {
        return val;
    }
}

public class BoxPrinterTest2 {

    public static void main(String []args) {

        BoxPrinter2 value1 = new BoxPrinter2(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();

        BoxPrinter2 value2 = new BoxPrinter2("Hello world");
        System.out.println(value2);
        // OOPs! by mistake, we did (Integer) cast instead of (String)
        Integer intValue2 = (Integer) value2.getValue();
    }
}

