// BRUTE FORCE APPROACH- (sort the elements first- the largest element will be th last element of the sorted array)
// public class LargestElement {
//      public static int[] sort(int[] arr, int low, int high){
        
//         if(low<high){

//             int partitionIndex= pivotFunction(arr, low, high);

//             sort(arr,low,partitionIndex-1);
//             sort(arr,partitionIndex+1,high);
//         }
//         return arr;
//      }
     
//      public static int pivotFunction(int[] arr, int low, int high){

//         int pivot=arr[low];
//         int i=low;
//         int j=high;

//         while(i<j){
            
//             while(i<=high && arr[i]<=pivot){
//                 i++; 
//             }

//             while(arr[j]>pivot && j>=low){
//                 j--;
//             }

//             //SWAPPING THE TWO ELEMENTS FOUND AT INDEX of pointer i and j
//             if(i<j){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }

//         //SWAPPING THE PIVOT ELEMENT WITH THE ELEMENT FOUND AT INDEX OF POINTER j
//         int temp=arr[low];
//         arr[low]=arr[j];
//         arr[j]=temp;

//         return j; //returning the index of the pivot element after it reaches it's correct position
// }

//     public static void main(String[] args){
//         int[] arr={89,10,39,385,2003, 100, 1, 0, 1000 };
//         int n=arr.length;
//         sort(arr,0,n-1);
//         System.out.println("The largest element in the array is: "+arr[n-1]);
//     }
// }




//OPTIMAL SOLUTION- (without sorting the array- we will just traverse the array and find the largest element)
public class LargestElement{
    public static int largestEl(int[] arr){
        int n=arr.length;
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr={89,10,39,385,2003, 100, 1, 0, 1000 };
        System.out.println("The largest element in the array is: "+largestEl(arr));
    }
}
