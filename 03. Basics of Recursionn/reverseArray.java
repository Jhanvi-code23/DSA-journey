// import java.util.Scanner;

// public class reverseArray {
//     public static void revArr(int arr[], int a, int b){
//         if (a>=b){
//             return;
//         }
        
//         int temp=arr[a];
//         arr[a]=arr[b];
//         arr[b]=temp; //swapping the elements

//         revArr(arr, a+1, b-1); 
//     }

//     public static void main(String[] args){
        
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the length of the array: ");
//         int n=sc.nextInt(); //length of the array

//         System.out.println("Enter the elements of the array: ");
//         int[] arr= new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         revArr(arr,0,n-1);

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }
// }



// USING 1 POINTER- 


public class reverseArray {
    static int n; //length of array
    public static void revArr(int i, int arr[]){
        if(i>=n/2){
            return;
        }

        else{
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;


            revArr(i+1,arr);
        }
    }



    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        n=arr.length;
        revArr(0,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}