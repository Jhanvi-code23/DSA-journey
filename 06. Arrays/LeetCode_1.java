/*
1. Two Sum
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.*;
public class LeetCode_1 {
    public int[] twoSum(int[] nums, int target) {
        int elementB;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        } //elements and indexes added 
        for(int i=0;i<nums.length;i++){
            elementB = target - nums[i];
            if(map.containsKey(elementB) && map.get(elementB)!=i){
                return new int[]{i,map.get(elementB)};
            }
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        LeetCode_1 solution = new LeetCode_1();
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Indices for target " + target1 + ": " + Arrays.toString(result1)); // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Indices for target " + target2 + ": " + Arrays.toString(result2)); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Indices for target " + target3 + ": " + Arrays.toString(result3)); // Output: [0, 1]
    }
}