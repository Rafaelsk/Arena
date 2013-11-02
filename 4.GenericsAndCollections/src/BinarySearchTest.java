/**
 * User: rafael
 * Date: 11/2/13
 * Time: 11:28 AM
 */
// This program shows the usage of binary search

import java.util.*;

class BinarySearchTest {
    public static void main(String []args) {
        String [] strArr = { "21", "22", "11", "12", "13" };
        System.out.println("The given strArr is: " + Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println("strArr after sorting is: " + Arrays.toString(strArr));
        int index = Arrays.binarySearch(strArr, "22");
        System.out.println("The index value is: " + index);
    }
}

