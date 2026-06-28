//extraction of digits from a number and counting them

// lets say i have a user input number n and i want to extract all the digits from that number.

// import java.util.Scanner;
// public class CountAllDigits{
//     public static void main(String[] args){
//         int N;
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         N=sc.nextInt();

//         /*
//         Step 0- Counter=0
//         Step 1- while loop to check N>0 
//         Step 2- last digit = N%10 - print
//         Step 3- N=N/10- integer number abstracted and then process continues
//         Step 4- loop continues until N>0

//         NOTE-  step 1 to 4 are EXTRACTION of digits from the number


//         Step 5- counter will keep increasingby 1 after every iteration
//         Step 6- print counter
//         */

//         int count=0;
//         while(N>0){
//          int LastDigit= N%10;
//          System.out.println(LastDigit);
         
//          N=N/10;
//          count++;
//         }
//         System.out.println("\nTotal digits in the number: "+count);
//         sc.close();
//     }   
// }

//another approach by log method- 
import java.util.Scanner;
import java.lang.Math;

public class CountAllDigits{
    public static void main(String[] args){
        int N;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        N=sc.nextInt();

        //basciall log10(n) +1 ka integer part will give the number of digits in the number
        int count= (int)(Math.log10(N)+1);
        System.out.println("Total digits in the number: "+count);
        sc.close();
    }
}