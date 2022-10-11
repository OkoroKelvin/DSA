package Arrays;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//    [3,4,9,6,4]
//    8
        public static int[] twoSum(int[] nums, int target) {

                Map<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < nums.length; i++) {
                    map.put(nums[i], i);
                }

                for (int i = 0; i < nums.length; i++) {
                    int complement = target - nums[i];
                    if (map.containsKey(complement) && map.get(complement) != i) {
                        return new int[] { i, map.get(complement) };
                    }
                }
                // In case there is no solution, we'll just return null
                return null;
            }

    public static void main(String[] args) {
        int [] numbers ={3,4,9,6,4};
        int [] value = twoSum(numbers,8);

       // System.out.println(value.toString());
    }

//    Complexity Analysis
//
//    Time complexity: O(n). We traverse the list containing nn elements exactly twice. Since the hash table reduces the lookup time to O(1)O(1), the overall time complexity is O(n)O(n).
//
//    Space complexity: O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly nn elements.
}
