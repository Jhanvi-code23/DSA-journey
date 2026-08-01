/*
LeetCode 350: Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

 */


import java.util.*;

public class LeetCode_350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n= nums1.length;
        int m= nums2.length;
        int i=0; //pointer in nums1
        int j=0; //pointer in nums2
        ArrayList <Integer> ans= new ArrayList<>();

        while(i<n && j<m){
            if(nums1[i]<nums2[j]){ //if element of nums1 is smaller than that of nums1 then increment i
                i++;
            }

            else if(nums2[j]<nums1[i]){ //if element of nums2 is smaller than that of nums1 then increment j
                j++;
            }

            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] result= new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;
    }


    public static void main(String[] args) {
        LeetCode_350 solution = new LeetCode_350();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = solution.intersect(nums1, nums2);
        System.out.println("Intersection of the two arrays: " + Arrays.toString(result));
    }
    
}
