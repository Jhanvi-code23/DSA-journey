//Problem 75
// You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]

// Output: [0,0,1,1,2,2]

// Explanation:

// The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

// Example 2:

// Input: nums = [2,0,1]

// Output: [0,1,2]

// Explanation:

// The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

public class LeetCode_75 {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1; //we keep the low and mid pointers at the start of the array and high pointer at the end of the array
        while(mid<=high){
            if(nums[mid]==0){
                //swap arr[low] and arr[mid] and increment low and mid
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++; //if the element is 1 we just increment the mid pointer
            }
            else{
                //swap arr[mid] and arr[high] and decrement high
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        LeetCode_75 solution = new LeetCode_75();
        solution.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}