//485. Max Consecutive Ones

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 
 */


public class LeetCode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int cnt=0;

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt++;
                if(cnt>=max){
                    max=cnt;
                }
            }

            else{
                cnt=0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        LeetCode_485 obj= new LeetCode_485();
        int[] arr= {1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}
