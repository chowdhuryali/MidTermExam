package math;

/**
 * Created by mrahman on 04/22/17.
 */

import java.util.*;
import java.util.Arrays;

public class FindMissingNumber {

    public static List<Integer>
    findDisappearedNumbers(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6 };
        System.out.println(findDisappearedNumbers(a));

        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */


        //implementation here...

    }

}
