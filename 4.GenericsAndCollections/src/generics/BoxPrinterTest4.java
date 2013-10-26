package generics;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 9:30 PM
 */
// This program demonstrates the type-safety feature of generics
class BoxPrinter4<T> {

    private T val;

    public BoxPrinter4(T arg) {
        val = arg;
    }

    public String toString() {
        return "[" + val + "]";
    }

    public T getValue() {
        return val;
    }
}

class BoxPrinterTest4 {

    public static void main(String []args) {

        BoxPrinter4<Integer> value1 = new BoxPrinter4<>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();

        BoxPrinter4<String> value2 = new BoxPrinter4<>("Hello world");
        System.out.println(value2);
        // OOPs! by mistake, we did put String in an Integer
        //Integer intValue2 = value2.getValue();
    }
}
