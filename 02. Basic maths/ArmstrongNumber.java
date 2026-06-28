//Armstrong number is a number in which the sum of all seperate digits raised to the power of the total no. of digits is equal to the original number.
// for ex- 371= 3^3 + 7^3 + 1^3 = 27+343+1= 371
// for ex- 1634= 1^4 + 6^4 + 3^4 + 4^4= 1634

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main (String[] args){
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int N=sc.nextInt();
        int dup=N;
        int k=String.valueOf(N).length(); //to calculate the number of digits


        while(N>0){
            int lastDig= N%10;
            N=N/10;
            sum= (int) (sum + Math.pow(lastDig,k));
        }

        if (sum == dup){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        sc.close();
    }
}
