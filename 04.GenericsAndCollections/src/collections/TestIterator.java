package collections;

/**
 * User: rafael
 * Date: 10/25/13
 * Time: 10:02 PM
 */
// This program shows the usage of Iterator

import java.util.*;

class TestIterator {

    public static void main(String []args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 1; i < 10; i++)
            nums.add(i);

        System.out.println("Original list " + nums);
        Iterator<Integer> numsIter = nums.iterator();

        while(numsIter.hasNext()) {
            numsIter.next();
            numsIter.remove();
        }

        System.out.println("List after removing all elements" + nums);
    }
}

