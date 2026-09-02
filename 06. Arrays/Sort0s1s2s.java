//better solution
public class Sort0s1s2s{
    public static int[] sort012(int[] arr){
        // int count0=0, count1=0, count2=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count0++;
        //     }

        //     else if(arr[i]==1){
        //         count1++;
        //     }
        //     else{
        //         count2++;
        //     }
        // }


        // for(int i=0;i<count0;i++){
        //     arr[i]=0; //printing 0 the number of times it is present in the array
        // }
        // for(int i=count0;i<count0+count1;i++){
        //     arr[i]=1; //printing 1 the number of times it is present in the array
        // }
        // for(int i=count0+count1;i<arr.length;i++){
        //     arr[i]=2; //printing 2 the number of times it is present in the array
        // }
        // return arr;






        //optimal solution
        int low=0, mid=0, high=arr.length-1; //we keep the low and mid pointers at the start of the array and high pointer at the end of the array
        while(mid<=high){
            if(arr[mid]==0){
                //swap arr[low] and arr[mid] and increment low and mid
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++; //if the element is 1 we just increment the mid pointer
            }
            else{
                //swap arr[mid] and arr[high] and decrement high
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,0,1,2};
        int[] ans=sort012(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
