//BRUTE FORCE APPROACH

// public class MissingNumber{
//     public static int missing(int[] arr, int N){
//         for (int i=1; i<=N;i++){
//             int flag = 0;
//             for(int j=0;j<N-1;j++){
//                 if(arr[j]==i){
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0){ //mtlb agar number nahi mila toh flag 0 hi rahega and we'll return i
//                 return i;
//             }
//         }
//         return -1;
//     }


//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,7,8,9,10,11};
//         int N = 11;
//         System.out.println(missing(arr,N));
//     }
// }




//BETTER APPROACH- Hashing

// import java.util.HashSet;
// public class MissingNumber{
//     public static int missing(int[] arr, int n){
//         HashSet<Integer> set= new HashSet<>();
//         for(int i=0;i<n-1;i++){
//             set.add(arr[i]);
//         }
//         for(int i=1;i<=n;i++){
//             if(!set.contains(i)){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,7,8,9,10,11};
//         int N = 11;
//         System.out.println(missing(arr,N));
//     }




//OPTIMAL APPROACH- Using sum formula
public class MissingNumber{
    public static int missing(int[] arr, int n){
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        int totalSum = (n*(n+1))/2;
        return totalSum-sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10,11};
        int N = 11;
        System.out.println(missing(arr,N));
    }
}