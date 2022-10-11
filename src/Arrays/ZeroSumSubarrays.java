package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubarrays {
    public static int solution(int[] arr) {
        // write your code here
        int count  = 0;
        HashMap< Integer, Integer> hmap = new HashMap< >();
        int i = -1;
        int sum = 0;
        hmap.put(sum, i);
        while (i < arr.length - 1) {
            i++;
            sum += arr[i];
            if (hmap.containsKey(sum)) {
                count += hmap.get(sum);
                hmap.put(sum, hmap.get(sum) + 1);
            } else {
                hmap.put(sum, 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(solution(arr));

    }
//    Time Complexity:
//    The time complexity of the above code is O(N) where N is the number of elements in the array. This is because we are traversing the array and just calculating the sum and storing the sum-frequency pair in the hashmap.
//
//    Space Complexity:
//    The space complexity is O(N) as we are traversing the array and storing the sum till every index in the hashmap with the index value.
//
//    So, dear reader, we hope that you have understood the complete procedure and have also understood the time and space complexity of the above code. We recommend you refer to the complete solution video to clear al your doubts. With this, we have completed this problem.
}
