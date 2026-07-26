//left rotate the array by 1 place- 
/*
Example- 
     arr[]=[1,2,3,4,5]
     rotate left by 1 place
     arr[]=[2,3,4,5,1]
 */


// public class LeftRotate{
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         int temp=arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i-1]=arr[i];
//         }
//         arr[arr.length-1]=temp;


//         //PRINTING THE ARRAY AFTER LEFT ROTATION
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//BRUTE FORCE APPROACH- rotate by k places
// public class LeftRotate{

//     public static int[] leftR(int[] arr,int k){
//         k=k%(arr.length); //if k is greater than the length of the array
//         int[] temp=new int[arr.length];
//         for(int i=0;i<k;i++){
//             temp[i]=arr[i];
//         }

//         for(int i=k;i<arr.length;i++){
//             arr[i-k]=arr[i];
//         }
//         //copying the temp array to the end of the original array
//         for(int i=0;i<k;i++){
//             arr[arr.length-k+i]=temp[i];
//         }

//         return arr;
//     }


//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         int k=2;
//         int[] result=leftR(arr,k);

//         //PRINTING THE ARRAY AFTER LEFT ROTATION
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }
// }






//OPTIMIZED APPROACH- rotate by k places
public class LeftRotate {

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);

        // Reverse complete array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        leftRotate(arr, 2);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}