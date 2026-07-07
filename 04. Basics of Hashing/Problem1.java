// You are given an array "arr" of length 'n' containing intergers within the range of 1 to x.
// your task is to find the frequency of all the elements.
// you do not need to print anything. return a frequency array as an array in the function such that
// index 0 represents the frequency of 1, index 1 represents the frequency of 2 and so on.


import java.util.Scanner;

public class Problem1{
 public static int[] Integers(){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter length of the input array: ");
    int n=sc.nextInt(); //array length input

    int[] arr=new int[n]; //array declaration

    System.out.print("enter the max range of integers (starting from 1): ");
    int x=sc.nextInt(); //input max index of hash array


    int[] hash=new int[x+1]; // hash array declaration
    // int[] frequency = new int[hash[i]]; //frequency array declaration

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt(); //taking input in array
    }

    for(int i=0;i<n;i++){ //index of hash table
        if(arr[i]>=1 && arr[i]<=x){ //checking that the number lies between 1 and x
            hash[arr[i]]++; //incrementing the frequency of the number in the hash array
        }        
    }
    sc.close();
    return hash; //returning the hash array
 }   

 public static void main(String[] args){
    int[] result = Integers(); //calling the function and returning the frequency array
    for (int i=1;i<result.length;i++){ //printing the frequency of each number from 1 to x
        System.out.println("frequency of " + i + " is : " + result[i]);
    }
 }
}