package Top_DSA_Interview_Questions.Array;

//  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    public static int[] twosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int element = target - nums[i];

            if (map.containsKey(element)){
                return new int[]{map.get(element),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(twosum(nums,target)));
  //    Used Arrays.toString() to convert the array to a human-readable format.
    }
}
