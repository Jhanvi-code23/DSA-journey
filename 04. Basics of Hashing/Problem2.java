/* You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.*/
import java.util.HashMap;
public class Problem2 {
    public static int maxFrequencyElements(int[] nums){
        
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each element in the array
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }

        // Count the total frequencies of elements with maximum frequency
        int totalCount = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == maxFrequency) {
                totalCount += freq;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        int result = maxFrequencyElements(nums);
        System.out.println("Total frequencies of elements with maximum frequency: " + result);
    }
}
