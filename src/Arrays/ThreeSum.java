package Arrays;

import java.util.*;

public class ThreeSum {
    //twoPointer
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
            }
        return res;
    }
    void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                ++lo;
            } else if (sum > 0) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while (lo < hi && nums[lo] == nums[lo - 1])
                    ++lo;
            }
        }
    }
//    Time complex:O(n2)
//twoSumII is O(n), and we call it n times.
//Space Complexity: from O(logn) to O(n);



   //Hashset

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
                if (i == 0 || nums[i - 1] != nums[i]) {
                    twoSum(nums, i, res);
                }
            return res;
        }
        void twoSum(int[] nums, int i, List<List<Integer>> res) {
            var seen = new HashSet<Integer>();
            for (int j = i + 1; j < nums.length; ++j) {
                int complement = -nums[i] - nums[j];
                if (seen.contains(complement)) {
                    res.add(Arrays.asList(nums[i], nums[j], complement));
                    while (j + 1 < nums.length && nums[j] == nums[j + 1])
                        ++j;
                }
                seen.add(nums[j]);
            }
        }
    }
    //Time Complexity: {On2)
    //Space Complexity:(O)n for the hashset.



    //No-Sort

    class Solution2 {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> res = new HashSet<>();
            Set<Integer> dups = new HashSet<>();
            Map<Integer, Integer> seen = new HashMap<>();
            for (int i = 0; i < nums.length; ++i)
                if (dups.add(nums[i])) {
                    for (int j = i + 1; j < nums.length; ++j) {
                        int complement = -nums[i] - nums[j];
                        if (seen.containsKey(complement) && seen.get(complement) == i) {
                            List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                            Collections.sort(triplet);
                            res.add(triplet);
                        }
                        seen.put(nums[j], i);
                    }
                }
            return new ArrayList(res);
        }
    }

    //Time Complexity: {On2)
    //Space Complexity:(O)n for the hashset.
}
