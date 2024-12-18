package Top_DSA_Interview_Questions.Array;

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]

public class Rotate_Array {
    public static void rotate(int[] nums, int k){
        k %= nums.length;  //  if remainder is 0 then we doesn't need rotate a array

        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);
    }
    public  static void swap(int[] nums , int left, int right){

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right++;
    }
}
