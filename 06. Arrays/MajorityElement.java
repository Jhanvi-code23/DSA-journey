//brute force- linear search
public class MajorityElement {
    // public static int majorityElement(int[] nums) {
    //     int n = nums.length;
    //     for(int i=0;i<n;i++){
    //         int count = 0;
    //         for(int j=0;j<n;j++){
    //             if(nums[i]==nums[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>n/2){
    //             return nums[i];
    //         }
    //     }
    //     return -1; // No majority element found
    // }




    //Better approach- using HashMap
    // public static int majorityElement(int[] nums) {
    //     int n = nums.length;
    //     java.util.HashMap<Integer, Integer> countMap = new java.util.HashMap<>();
        
    //     for (int i = 0; i < n; i++) {
    //         countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
    //         if (countMap.get(nums[i]) > n / 2) {
    //             return nums[i]; // Return the majority element
    //         }
    //     }
        
    //     return -1; // No majority element found
    // }


    
    //Moore's Voting Algorithm
    public static int majorityElementMoore(int[] nums) {
        int count = 0;
        int el=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }
        
        for (int j=0;j<nums.length;j++){
            if(nums[j]==el){
                count++;
                if(count>nums.length/2){
                    return el;
                }
            }
        }}
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElementMoore(nums);
        if (result != -1) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
