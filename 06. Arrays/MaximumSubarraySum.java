public class MaximumSubarraySum{
    // public static int MaxSum(int[] arr){
    //     int maximum=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             int sum=0;
    //             for(int k=i;k<=j;k++){
    //                 sum+=arr[k];
    //                 maximum=Math.max(sum,maximum);
    //             }
    //         }
    //     }
    //     return maximum;
    // }


    //better approach
    // public static int MaxSum(int[] arr){
    //     int maximum=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             sum+=arr[j];
    //             maximum=Math.max(sum,maximum);
    //         }
    //     }
    //     return maximum;
    // }



    //optimal approach
    public static void MaxSumOptimal(int[] arr){
        int maximum=Integer.MIN_VALUE;
        int sum=0;

        //to print subarray
        int start=0;
        int ansStart=0;
        int ansEnd=0;


        for(int i=0;i<arr.length;i++){
            //to print the subarray with maximum sum
            if (sum==0){
                start=i;
            }
            sum+=arr[i];

            if(sum>maximum){
                maximum=sum;
                ansStart=start;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }
        }

        System.out.print("[");
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
            if(i!=ansEnd){
                System.out.print(",");
            }
        }
        System.out.print("] subarray gives the max sum " + maximum);
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        MaxSumOptimal(arr);
        System.out.println();
        int[] arr1={-2,-3,-1};
        MaxSumOptimal(arr1);}
}