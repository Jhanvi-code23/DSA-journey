// to print all the numbers that completely divides a given number n. 
// ex= 36 is completely divisible by 1,2,3,4,6,9,12,18,36


import java.util.Scanner;
public class AllDivisors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int N=sc.nextInt();


        for(int i=1;i<=N;i++){
            if(N%i==0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}