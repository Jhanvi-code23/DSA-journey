//SET METHOD- BRUTE FORCE APPROACH 
// basically count the number of unique elements in the array and store them in a set.
// import java.util.*;
// public class RemoveDuplicates {
//     public static int removeDuplicates(int[] arr) {
//         int n = arr.length;
//         Set<Integer> set = new TreeSet<>();
        
//         for (int i = 0; i < n; i++) {
//             set.add(arr[i]);
//         }

//         //copy unique elements back to the original array
//         int index=0;
//         for (int num : set) {
//             arr[index++] = num;
//         }
//         return index; // return the count of unique elements
//     }


//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 4, 5};
//         int newLength = removeDuplicates(arr);
        
//         System.out.println("Array after removing duplicates:");
//         for (int i = 0; i < newLength; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }





//TWO POINTER METHOD- OPTIMIZED APPROACH
public class RemoveDuplicates{
    public static int removeDup(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDup(arr);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}