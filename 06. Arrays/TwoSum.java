//brute force approach
import java.util.HashMap;
public class TwoSum {
    // public static void twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 System.out.println("Two sum solution found: " + nums[i] + " + " + nums[j] + " = " + target);
    //                 System.out.println("Indices: " + i + ", " + j);
    //                 return;
    //             }
    //         }
    //     }
    //     System.out.println("No two sum solution found.");
    // }  


    

    //HashMap approach- better approach
    // public static int[] twoSum(int[] nums, int target) {
    //     int elementB;
    //     HashMap<Integer, Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         map.put(nums[i],i);
    //     } //elements and indexes added 
    //     for(int i=0;i<nums.length;i++){
    //         elementB = target - nums[i];
    //         if(map.containsKey(elementB)){
    //             return new int[]{i,map.get(elementB)};
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }




    //optimized approach- two pointer approach
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if no solution is found
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}