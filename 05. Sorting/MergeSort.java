//merge sort in java follows divide and merge approach.
// try to understand this from another teacher also

import java.util.ArrayList;
public class MergeSort{
    
    public static void mergeSort(int[] arr, int low, int high){

        if(low < high){
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){

    ArrayList<Integer> temp = new ArrayList<>();

    int left = low;
    int right = mid + 1;

    while(left <= mid && right <= high){

        if(arr[left] <= arr[right]){
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
    }

    while(left <= mid){
        temp.add(arr[left]);
        left++;
    }

    while(right <= high){
        temp.add(arr[right]);
        right++;
    }

    for(int i = low; i <= high; i++){
        arr[i] = temp.get(i - low);
    }
}


public static void main(String[] args) {
    int[] arr = {38, 27, 43, 3, 9, 82, 10};
    System.out.println("Original array: ");
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();

    mergeSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array: ");
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();
}
}
