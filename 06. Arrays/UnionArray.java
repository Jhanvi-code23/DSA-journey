//Brute force approach- using set

// import java.util.*;
// public class UnionArray {

//     public static int[] unionArrays(int[] arr1, int[] arr2) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int i=0;i<arr1.length;i++){
//             set.add(arr1[i]);
//         }
//         for (int i=0;i<arr2.length;i++){
//         set.add(arr2[i]);
//     }

//     int[] union=new int[set.size()];
//     int index=0;
//     for (int num:set){
//         union[index++]=num;
//     }
//     return union;
// }

// public static void main(String[] args) {
//     int[] arr1 = {1, 2, 3, 4, 5};
//     int[] arr2 = {4, 5, 6, 7, 8};

//     int[] union = unionArrays(arr1, arr2);

//     System.out.println("Union of the two arrays: " + Arrays.toString(union));
// }
// }



//Optimized approach- using two pointer technique
import java.util.ArrayList;
public class UnionArray{
    public static ArrayList<Integer> UnionOfArr(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int i=0; //pointer for arr1
        int j=0; //pointer for arr2

        //make an empty array list for union
        ArrayList<Integer> union = new ArrayList<>();

        //comparing both the arrays
        while(i<n && j<m){

            //if element of arr1 is smaller than element of arr2
            if(arr1[i]<arr2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
            }

            //if element of arr2 is smaller than that of arr1
            else if(arr2[j]<arr1[i]){
                if(union.size()==0 || union.get(union.size()-1)!= arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }


            //if both elements are equal - print any one of the arr1[i] or arr2[j] and increment both i and j
            else{
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }

        }



        //if any of the array is left
        while(i<n){ //if arr1 is still left to be traversed
            if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        while(j<m){ //if arr2 is still left to be traversed
            if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }




    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        ArrayList<Integer> union = UnionOfArr(arr1, arr2);

        System.out.println("Union of the two arrays: " + union);
    }
}