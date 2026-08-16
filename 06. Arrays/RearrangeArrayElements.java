import java.util.*;
public class RearrangeArrayElements{

    //brute force
    // public static int[] rearrange(int[] arr){
    //     int n=arr.length;
    //     ArrayList<Integer> pos=new ArrayList<>();
    //     ArrayList<Integer> neg=new ArrayList<>();

        
    //     //putting positive elements in pos array
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>0){
    //             pos.add(arr[i]);
    //         }
    //         else{
    //             neg.add(arr[i]);
    //         }
    //     }

    //     for(int i=0;i<n/2;i++){
    //         arr[2*i]=pos.get(i);
    //         arr[2*i+1]=neg.get(i);
    //     }
    //     return arr;
    // }



    //optimal approach- two pointer approach
    public static int[] rearrange(int[] arr){
        int n=arr.length;
        int posIndex=0; //positive index pointer
        int negIndex=1; //negative index pointer
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
            else{
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int[] ans=rearrange(arr);
        System.out.println(Arrays.toString(ans));
    }
}