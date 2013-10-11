/**
 * User: rafael
 * Date: 10/10/13
 * Time: 10:02 PM
 */
class HappyBirthday {
    // overloaded wish method with String as an argument
    public static void wish(String name) {
        System.out.println("Happy birthday " + name + "!");
    }
    // overloaded wish method with no arguments; this method in turn invokes wish(String) method
    public static void wish() {
        wish("to you");
    }
}

