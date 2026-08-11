/* Problem: Majority Element
   Given an array nums of size n, return the majority element.
   The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

   Example 1:
   Input: nums = [3,2,3]
   Output: 3

   Example 2:
   Input: nums = [2,2,1,1,1,2,2]
   Output: 2

   Constraints:
   n == nums.length
   1 <= n <= 5 * 10^4
   -10^9 <= nums[i] <= 10^9
 */
class LeetCode_169 {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>n/2){
        //         return nums[i];
        //     }
        // }
        // return -1; // No majority element found


        //better approach
        int n = nums.length;
        java.util.HashMap<Integer, Integer> countMap = new java.util.HashMap<>();
        
        for (int i = 0; i < n; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            if (countMap.get(nums[i]) > n / 2) {
                return nums[i]; // Return the majority element
            }
        }
        
        return -1; // No majority element found
    }


    public static void main(String[] args) {
        LeetCode_169 solution = new LeetCode_169();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = solution.majorityElement(nums2);
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
        if (result2 != -1) {
            System.out.println("The majority element is: " + result2);
        } else {
            System.out.println("No majority element found.");
        }
    }
}