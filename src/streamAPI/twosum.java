package streamAPI;

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


        public static void main(String[] args) {
            Solution sol = new Solution();

            int[] nums = {5, 2, 4};
            int target = 6;

            int[] result = sol.twoSum(nums, target);

            System.out.println("Output:");
            System.out.println(result[0] + ", " + result[1]);
        }
    }
