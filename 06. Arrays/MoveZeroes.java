// MOVE ZEROES TO THE END OF THE ARRAY
public class MoveZeroes{

    //BRUTE FORCE APPROACH

    // public static int[] moveZero(int[] arr){
    //     int n=arr.length;

    //     //count number of non zero numbers
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]!=0){
    //             count++;
    //         }
    //     }


    //     //iterate array from 0 to n-1 and add to temp
    //     int[] temp=new int[count];
    //     int j=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]!=0){
    //             temp[j]=arr[i];
    //             j++;
    //         }
    //     }


    //     //iterate temp from 0 to count-1 and add back to original array
    //     for(int i=0;i<count;i++){
    //         arr[i]=temp[i];
    //     }



    //     //fill all the remaining elements of arr with 0
    //     for(int i=count;i<n;i++){
    //         arr[i]=0;
    //     }

    //     return arr;
    // }


    // public static void main(String[] args){
    //     int[] arr={1,0,2,3,2,0,0,4,5,1};
    //     moveZero(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }





    //OPTIMAL SOLUTION

    public static int[] moveZero(int[] arr){
        int n=arr.length;


        //find the first zero as it might not exist in the array
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        
        if(j==-1){
            return arr; //no zeroes in the array
        }


        for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp; //swap values
                    j++;
                }
            }
            return arr;
    }


    public static void main(String[] args){
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
