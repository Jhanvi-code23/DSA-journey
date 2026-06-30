import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number to check prime: ");
        int N=sc.nextInt();
        //we know factors of a number are always less than or equal to its square root

        int counter=0;
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
                counter++;
                if((N/i)!=i){
                    counter++;
                }
            }
        }

        if(counter==2){
            System.out.println(N+" is a prime number");
        }
        else{
            System.out.println(N+" is not a prime number");
        }
        sc.close();
    }
}
