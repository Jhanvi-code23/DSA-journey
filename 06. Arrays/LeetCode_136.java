// Problem 136- Single Number
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 */

import java.util.HashMap;

public class LeetCode_136 {
    public int singleNumber(int[] nums) {

        //map method
        int n=nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0; i<n; i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        LeetCode_136 solution = new LeetCode_136();
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number in [2, 2, 1]: " + solution.singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number in [4, 1, 2, 1, 2]: " + solution.singleNumber(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println("Single number in [1]: " + solution.singleNumber(nums3)); // Output: 1
    }
}
