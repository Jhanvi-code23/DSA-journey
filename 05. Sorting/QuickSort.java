public class QuickSort {

    //the quick sort function
    public static int[] qs(int[] arr, int low, int high){
        
        //make sure that there is more than one elements in the array bcoz one element is always sorted
        if(low<high){

            //we call the function where we store the index of the pivot element after it reaches it's correct position
            int partitionIndex= pivotFunction(arr, low, high);

            qs(arr,low,partitionIndex-1); //recursive call for the array of partition left
            qs(arr,partitionIndex+1,high); //recursive call for the array of partition right
        }
        return arr;
    }


    //the pivot Function
    public static int pivotFunction(int[] arr, int low, int high){

        //consider 1st element of the array as the pivot- i.e, arr at index of low
        int pivot=arr[low];
        int i=low; //make pointer i- assign it as low
        int j=high; //make pointer j- assign it as high

        
        //make sure that i is less than j- THEY SHOULD NOT CROSS
        while(i<j){
            
            // movement of pointer i

            /* the pointer moves towards right- and we look for an element greater than the pivot.
               If found- we stop the pointer at that element. toh jb tk element at index i is less
               than the pivot element in the array- we keep increasing i by 1 so the pointer moves forward. */

               while(i<=high && arr[i]<=pivot){ /* we put = with arr[i]<=pivot so if there are more
                                                     than one elements same as the pivot element then we put it in the left array 
                                                     Also, i<=high is important so that i does not move past the highest pointer of the array-
                                                     SHOULD NOT EXCEED THE LENGTH OF ARRAY */ 
                i++; 
               }

            /* movement of pointer j 
            
               the pointer moves in the left- we look for the first element from right to left which is
               SMALLER than the pivot element. if found- we stop the pointer at that element. toh jb tk element
               at index j is greater than the pivot element, we keep decrementing the j- so the pointer moves backward */

               while(arr[j]>pivot && j>=low){ /* we dont use = with arr[j]>pivot becoz we have already placed the 
                                                      eqaul element in the left array 
                                                      Also, j>=low is important to make sure that j does not move past the
                                                      lowest point of the array. */
                j--;
               }




               //SWAPPING THE TWO ELEMENTS FOUND AT INDEX of pointer i and j

               if(i<j){ // i.e, agar i aur j cross nhi kre

                //swap function
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

               }
        }  // closed the first while loop

        //when i crossed j then we dont swap further- instead we swap the pivot element with the element at index j- 
        // so that pivot reaches it's correct position in the array
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j; // finally you will return the index of the pivot element
    }


    //main function
    public static void main(String[] args){
        int[] arr={4,7,2,6,1,3,5,9};
        System.out.println("Original array: ");
        for(int num : arr){
            System.out.print(num + " "); //print numbers of original array like - 4 7 2 6 1 3 5 9
        }
        System.out.println(); //print a space after the original array

        qs(arr, 0, arr.length - 1); //call the quick sort function with the original array, low and high index of the array

        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " "); //print numbers of sorted array like - 1 2 3 4 5 6 7 9
        }
        System.out.println(); //print a space after the sorted array
    }
}
