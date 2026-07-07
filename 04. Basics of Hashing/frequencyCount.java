import java.util.*;

public class frequencyCount{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] Arr= new int[n];

        //assuming the range of numbers is from 0 to 100
        int[] hash=new int[101]; //bcoz if max is 100 thne index would be 100+1 (starting form 0)
        

        for(int i=0;i<n;i++){
            Arr[i]=sc.nextInt(); //taking input in array
            hash[Arr[i]]++; //increment the counter of hash array as index Arr[i] (mtlb Arr[i] is the number and we are counting its frequency)
        }

        int q=sc.nextInt(); //taking number of queries i.e, no. of numbers whose frequency we want to find
        while (q-->0){ //q arrow 0 means q will be decremented after each iteration and loop will run until q is greater than 0
            int x=sc.nextInt(); //taking input of number whose frequency we want to find
            System.out.println("frequency of " + x + " is : " + hash[x]); //printing the frequency of number x
        }
        sc.close();
    }
}