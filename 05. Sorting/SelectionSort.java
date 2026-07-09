//Selection sort in java means- FIND THE INDEX OF MINIMUM AND SWAP!
public class SelectionSort {
    public static int selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
             int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp; //swap the first index of the arraywith the minimum value's index
        }
        return 0;
    }


    public static void main(String[] args){
        int[] arr={90,57,20,59,100,30,39,200};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}