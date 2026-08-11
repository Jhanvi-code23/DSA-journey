/*
 * LEETCODE 3005. Count Elements With Maximum Frequency
 *
 * You are given an array of positive integers.
 * Return the number of elements that have the maximum frequency in the array.
 * 
 * Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 */


import java.util.HashMap;
public class LeetCode_3005 {
    public static int maxFrequencyElements(int[] nums){
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }

        int totalCount = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == maxFrequency) {
                totalCount += freq;
            }
        }

        return totalCount;
    }




    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums1)); // Output: 4

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(maxFrequencyElements(nums2)); // Output: 5
    }
}
