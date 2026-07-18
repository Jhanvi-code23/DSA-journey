// // brute force approach- sort the array and return the second last element of the sorted array

// public class SecondLargestElement {
//     public static int[] sort(int[] arr, int low, int high){
//         if(low<high){
//             int partitionIndex=pivotFunction(arr, low, high);
//             sort(arr,low,partitionIndex-1);
//             sort(arr,partitionIndex+1,high);
//         }
//         return arr;
//     }

//     public static int pivotFunction(int[] arr, int low, int high){
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
//     }

//     public static void main(String[] args){
//         int[] arr={89,204,2006,23,11,2004,2006,1000};
//         int n=arr.length;
//         sort(arr,0,n-1);
//         for(int i=n-1;i>=0;i--){
//             if(arr[i]!=arr[n-1]){
//                 System.out.println("The second largest element in the array is: "+arr[i]);
//                 break;
//             }
//         }
//     }
// }
// TIME COMPEXITY HERE IS O(NlogN) (bcoz of sorting) AND SPACE COMPLEXITY IS O(1)




// Better Approach- Traverse the array and find the largest and second largest element in a double pass manner
// public class SecondLargestElement {
//     public static void main(String[] args){
//         int[] arr={89,204,2006,23,11,2004,2006,1000};
//         int n=arr.length;
//         int largest=arr[0];
//         int secondLargest=Integer.MIN_VALUE;
//         // IF THE ARRAY CONTAINS ALL POSITIVE ELEMENTS THEN 2ND LARGEST CAN BE TAKEN AS -1
        
//         //1st PASS
//         for(int i=0;i<n;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }

//         //2nd PASS
//         for(int i=0;i<n;i++){
//             if(arr[i]>secondLargest && arr[i]!=largest){
//                 secondLargest=arr[i];
//             }
//         }
//         System.out.println("The second largest element in the array is: "+secondLargest);
//     }
// }

// TIME COMPEXITY HERE IS O(2N) (bcoz traversed twice) WHICH IS EQUIVALENT TO O(N) AND SPACE COMPLEXITY IS O(1)







// OPTIMAL APPROACH- Traverse the array and find the largest and second largest element in a single pass manner
public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr={89,204,2506,23,11,2004,2006,1000};
        int n=arr.length;
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest; //first update the second largest to the previous largest
                largest=arr[i]; //then update the largest to the current element
            }
            else if(arr[i]<largest && arr[i]<secondLargest){
                continue;
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("The second largest element in the array is: "+secondLargest);
    } 
}

