/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

//
//class Solution {
//
//
//        public int[] twoSum ( int[] nums, int target){
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        return new int[]{i, j};
//                    }
//
//                }
//            }
//            return new int[] {};
//        }

// to run on IntelliJ
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] result = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
//
//        System.out.println(result[0] + ", " + result[1]);
//    }
//}


// faster solution using HashMap
// map key -> value   pair
/*
{5, 2, 4}
target = 6
key → the number we need to reach the target
value → the index of the number we already saw

HashMap
k -> v
1 -> 0
4 -> 1
{2,1}
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementsIndex = complements.get(nums[i]);
            if (complementsIndex != null) {
                return new int[]{i, complementsIndex};
            }
            complements.put(target - nums[i], i);
        }
return nums;
    }
}


