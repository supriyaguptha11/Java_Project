import java.util.HashMap;
import java.util.Map;

public class Practice {
    public int[] twoSum ( int[] nums, int target){
//        for(int i = 0; i < nums.length; i++)
//        {
//            for(int j = i + 1; j < nums.length; j++)
//            {
//                if(nums[i] + nums[j] == target)
//                {
//                    return new int[]{i , j};
//                }
//            }
//        }
//        return new int[] {};
//    }


        Map<Integer, Integer> compliments = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            Integer complimentIndex= compliments.get(nums[i]);
            if(complimentIndex != null)
            {
                return new int[]{i, complimentIndex};
            }
            compliments.put(target - nums[i], i);
        }
        return new int[]{};

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
