/* LeetCode 283: Move Zeroes 
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

*/

public class LeetCode_283 {
    public void moveZeroes(int[] nums) {
        //there might be a case where no zeroes exist in the given array

        int n=nums.length;

        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            return;
        }


        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                //swap elements of both pointers

                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args){
        int[] arr={0,1,0,3,12};
        LeetCode_283 obj=new LeetCode_283();
        obj.moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}