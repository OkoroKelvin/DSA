package Arrays;

import java.util.Arrays;

public class ThreeSumCloset {

//Two Pointers
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int diff = Integer.MAX_VALUE;
            int sz = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < sz && diff != 0; ++i) {
                int lo = i + 1;
                int hi = sz - 1;
                while (lo < hi) {
                    int sum = nums[i] + nums[lo] + nums[hi];
                    if (Math.abs(target - sum) < Math.abs(diff)) {
                        diff = target - sum;
                    }
                    if (sum < target) {
                        ++lo;
                    } else {
                        --hi;
                    }
                }
            }
            return target - diff;
        }
    }

    //Time Complexity:O(n2)
    //Space Complexity: from O(log n)O(n),depending on the implementation of the sorting algorithm.

    //Binary Search

    class Solution2 {
        public int threeSumClosest(int[] nums, int target) {
            int diff = Integer.MAX_VALUE;
            int sz = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < sz && diff != 0; ++i) {
                for (int j = i + 1; j < sz - 1; ++j) {
                    int complement = target - nums[i] - nums[j];
                    var idx = Arrays.binarySearch(nums, j + 1, sz - 1, complement);
                    int hi = idx >= 0 ? idx : ~idx, lo = hi - 1;
                    if (hi < sz && Math.abs(complement - nums[hi]) < Math.abs(diff))
                        diff = complement - nums[hi];
                    if (lo > j && Math.abs(complement - nums[lo]) < Math.abs(diff))
                        diff = complement - nums[lo];
                }
            }
            return target - diff;
        }
    }

//    Complexity Analysis
//    Time Complexity:O(n2log n)O
//    Binary search takes O(log n), and we do it nn times in the inner loop.
//    Since we are going through n elements in the outer loop, the overall complexity is O(n2 log n)
//    Space Complexity: from O(log n)to O(n), depending on the implementation of the sorting algorithm.

}
