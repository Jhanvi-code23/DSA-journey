//takes an element and places it in its correct order

public class InsertionSort {
    public static int insertionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp; //swap adjacent elements
                j--;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int arr[]={90,57,20,59,100,30,39,200};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
