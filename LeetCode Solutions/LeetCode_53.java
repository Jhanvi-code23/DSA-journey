public class LeetCode_53 {
    public int maxSubArray(int[] nums) {
        int maximum=Integer.MIN_VALUE;
        int sum=0;


        int start=0;
        int ansStart=0;
        int ansEnd=0;


        for(int i=0;i<nums.length;i++){
            //to print the subarray with maximum sum
            if (sum==0){
                start=i;
            }
            sum+=nums[i];

            if(sum>maximum){
                maximum=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        return maximum;
    }



    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        LeetCode_53 obj=new LeetCode_53();
        System.out.println(obj.maxSubArray(arr));
    }
}
