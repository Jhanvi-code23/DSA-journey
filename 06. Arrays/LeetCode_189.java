/*
 PROBLEM: 189. Rotate Array
 Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 
*/

public class LeetCode_189 {

    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        

        //Brute force approach

        // int n=nums.length;
        // k=k%n;

        // int[] temp= new int[k]; //stores the last elements that will rotate from right
        // for(int i=0;i<k;i++){
        //     temp[i]=nums[n-k+i]; //inputs all the rotating elements in one seperate array
        // }

        // // Shift remaining elements
        // for(int i=n-k-1;i>=0;i--){
        //     nums[k+i]=nums[i];
        // }

        // // Copy temp elements to front
        // for(int i=0;i<k;i++){
        //     nums[i]=temp[i];
        // }


        //OPTIMAL SOLUTION
        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }

    public static void main(String[] args) {
        LeetCode_189 solution = new LeetCode_189();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);

        // Printing the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}