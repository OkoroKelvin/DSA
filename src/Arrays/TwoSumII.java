package Arrays;

import java.util.Arrays;

public class TwoSumII {
    static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];

            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        // In case there is no solution, return {-1, -1}.
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int [] numbers = {2,3,4};
        int[] newNum = twoSum(numbers,6);
        System.out.println(Arrays.toString(newNum));
    }
}
