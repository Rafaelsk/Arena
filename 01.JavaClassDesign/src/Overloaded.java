/**
 * User: rafael
 * Date: 10/10/13
 * Time: 10:05 PM
 */
class Overloaded {
    public static void aMethod(int val) { System.out.println("int"); }
    public static void aMethod(short val) { System.out.println("short"); }
    public static void aMethod(Object val) { System.out.println("Object"); }
    public static void aMethod(String val) { System.out.println("String"); }


    public static void main(String[] args) {
        byte b = 9;
        aMethod(b);
        // first call
        aMethod(9);
        // second call
        Integer i = 9;
        aMethod(i);
        // third call
        aMethod("9");
        // fourth call
    }
}

