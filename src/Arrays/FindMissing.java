package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FindMissing {
    static int findMissing(List<Integer> input) {
        // calculate sum of all integers
        // in input list
        int actualSum = 0;
        for (Integer x : input) {
            actualSum += x;
        }
        int n = input.size() +1 ;

        // find the sum of first n numbers using the arithmetic series sum formula,
        // i.e.,​ ​(n∗(n+1))/2
        int sumOfN = (n * (n + 1)) / 2;

        // The difference between sumOfN - actualSum, is the missing number in the array
        return sumOfN - actualSum;
    }

    public static void main(String[] args) {
        Integer[][] vLst = {{1,2,3,5}, {3, 7, 1, 2, 0, 4, 5}, {9, 6, 4, 2, 3, 5, 7, 0, 1}};
        for (int i = 0; i < vLst.length; i++) {
            List<Integer> v = Arrays.asList(vLst[i]);
            System.out.println((i + 1) + ". Original: " + v);
            int missingNumber = findMissing(v);
            System.out.println("   The missing number is: " + missingNumber);
            System.out.println(
                    "\n-----------------------------------------------------------------------------------------------------\n");
        }
    }
}
