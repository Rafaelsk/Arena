import java.util.Arrays;

/**
 * User: rafael
 * Date: 11/2/13
 * Time: 11:27 AM
 */
// It demonstrates sorting on Arrays
class CollectionsTest {
    public static void main(String []args) {
        String [] strArr = { "21", "1", "111", "12", "123" };
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        int [] intArr = { 21, 1, 111, 12, 123 };
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}

