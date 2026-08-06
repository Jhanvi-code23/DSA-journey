import java.util.HashMap;
public class NumberAppearsOnce {

    //brute force approach

    // public static int findNumberAppearOnce(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int count=0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count==1){
    //             return arr[i];
    //         }
    //     }
    //     return -1; //if no number appears only once
    // }




    //better approach- hashing
     //hash method
    //  public static int findNumberAppearOnce(int[] nums) {
    //     int n= nums.length;
    //     int max=nums[0];
    //     for(int i=0;i<n;i++){
    //         max=Math.max(max,nums[i]);
    //     }

    //     int[] hash= new int[max+1];

    //     for(int i=0;i<n;i++){
    //         hash[nums[i]]++;
    //     }

    //     for(int i=0;i<=max;i++){
    //         if(hash[i]==1)
    //         return i;
    //     }
    //     return -1;
    // }




    //Map method

    public static int findNumberAppearOnce(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result = findNumberAppearOnce(arr);
        if(result != -1){
            System.out.println("The number that appears only once is: " + result);
        } 
        else {
            System.out.println("No number appears only once in the array.");
        }
    }


}
