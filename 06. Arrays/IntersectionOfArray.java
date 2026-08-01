//Brute force approach
// import java.util.ArrayList;
// public class IntersectionOfArray {
//     public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
//         int n=arr1.length;
//         int m=arr2.length;
//         int[] visited=new int[m]; //by default saare elements 0 honge
//         ArrayList<Integer> result= new ArrayList<>();


//         for(int i=0;i<n;i++){ //for every element of array 1
//             for(int j=0;j<m;j++){ //traverse the entire array 2
//                 if((arr1[i]== arr2[j]) && visited[j]==0){
//                     result.add(arr1[i]);
//                     visited[j]=1;
//                     break;
//                 }


//                 if(arr2[j]>arr1[i]){
//                     break; //bcoz the array is sorted
//                 }
//             }
//         }
//         return result;
//     }



//     public static void main(String[] args){
//         int[] arr1={1,2,3,4,4,5};
//         int[] arr2={4,4,5,6,7,8};

//         ArrayList<Integer> result=intersection(arr1,arr2);
//         System.out.println("Intersection of the two arrays: "+result);
//     }
// }




//Optimized approach- using two pointer technique
import java.util.ArrayList;
public class IntersectionOfArray{
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int i=0; //pointer for arr1
        int j=0; //pointer for arr2

        //empty answer list
        ArrayList<Integer> result = new ArrayList<>();

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){ //if element of arr1 is smaller than that of arr2 then increment i
                i++;
            }

            else if(arr2[j]<arr1[i]){ //if element of arr2 is smaller than that of arr1 then increment j
                j++;
            }

            else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5};
        int[] arr2 = {4, 4, 5, 6, 7, 8};

        ArrayList<Integer> result = intersection(arr1, arr2);
        System.out.println("Intersection of the two arrays: " + result);
    }
}