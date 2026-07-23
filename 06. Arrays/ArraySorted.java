//Check if the array is sorted or not

public class ArraySorted {

    public static boolean checkSorted(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args){
        int[] arr={1,3,3,5,2,4,2,7,1};
        boolean ans=checkSorted(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } //print the array
        System.out.println(); 
        
        if(ans){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
     }
}
