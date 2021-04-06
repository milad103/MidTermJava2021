package math.problems;

import java.awt.*;
import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
// method 1 modified by Milad(added Arrays.sort(...))
        int[] numbers = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        Arrays.sort(numbers);
        for (int i = 1; i <= 10; i++) {
            if (i != numbers[i - 1]) {
                System.out.println(i);
                break;
            }
        }


        //method 2 modified by Milad(added Arrays.sort(...))
        Arrays.sort(numbers);
        int d = 1;
        for (int b : numbers) {
            if (d != b) {
                System.out.println(d);
                break;
            }
            d++;

        }
        // method 3:
        int sum = (10 * 11) / 2; //n(n+1)/2)
        int sum1 = 0;
        for (int i : numbers) {
            sum1 += i;

        }
        System.out.println(sum - sum1);
    }


}
